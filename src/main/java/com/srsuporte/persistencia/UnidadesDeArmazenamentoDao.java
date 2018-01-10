package com.srsuporte.persistencia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.srsuporte.srsptfx.model.UnidadeFisica;
import com.srsuporte.srsptfx.model.UnidadeLogica;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Leandro
 */
public class UnidadesDeArmazenamentoDao {

    private final String comando = "wmic diskdrive get Description, DeviceID, Index, Model, Partitions, PNPDeviceID, Size, Status /format:csv";

    public List<UnidadeFisica> recuperarDados() throws IOException {
        List<String> lines = new LeitorWmic().executarProcessoMuitasLinhas(this.comando, "Node");
        String vetor[];
        UnidadeFisica unidadeFisica;
        List<UnidadeFisica> unidadeFisicas = new ArrayList<>();
        Collections.sort(unidadeFisicas, new Comparator<UnidadeFisica>() {
            @Override
            public int compare(UnidadeFisica o1, UnidadeFisica o2) {
                return o1.getIndex().compareTo(o2.getIndex());
            }
        });

        UnidadesLogicasDao unidadesLogicasDao = new UnidadesLogicasDao();
        List<UnidadeLogica> unidadesLogicas = unidadesLogicasDao.recuperarDados();
        LeitorDiskPart leitorDiskPart = new LeitorDiskPart();
        Map<Integer, List> parts = leitorDiskPart.executarProcesso("diskpart /s scripts/qtd_partcoes.txt");
        ///// associar partiçoes
        /**
         * **********************************************
         */
        for (int i = 0; i < parts.size(); i++) {
            ArrayList<String> strs = (ArrayList<String>) parts.get(i);
            setIndex(unidadesLogicas, strs.toArray(new String[]{}), i);
        }
        /**
         * ***********************************************
         */
        int index = 0;
        for (String line : lines) {
            vetor = line.split(",");
            if (vetor.length == 1) {
                continue;
            }
            List<UnidadeLogica> us = getUnidadesByIndex(unidadesLogicas, index++);
            unidadeFisica = new UnidadeFisica(vetor[1], vetor[2], vetor[3], vetor[4], vetor[5], vetor[6], vetor[7], vetor[8], us);
            unidadeFisicas.add(unidadeFisica);
        }
        return unidadeFisicas;
    }

    private void setIndex(List<UnidadeLogica> us, String letters[], int index) {
        for (String letter : letters) {
            for (UnidadeLogica u : us) {
                String devId = u.getDeviceID().substring(0, 1);
                if (devId.equals(letter)) {
                    u.setIndex(index);
                }
            }
        }
    }

    private List<UnidadeLogica> getUnidadesByIndex(List<UnidadeLogica> us, int index) {
        ArrayList<UnidadeLogica> unidades = new ArrayList<>();
        for (UnidadeLogica u : us) {
            if (index == u.getIndex()) {
                unidades.add(u);
            }
        }
        return unidades;
    }
}
