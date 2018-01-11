package com.srsuporte.persistencia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.srsuporte.srsptfx.model.Particao;
import com.srsuporte.srsptfx.model.UnidadeFisica;
import com.srsuporte.srsptfx.model.UnidadeLogica;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leandro
 */
public class UnidadesDeArmazenamentoDao {

    private final String comando = "wmic diskdrive get Description, DeviceID, Index, Model, Partitions, PNPDeviceID, Size, Status /format:csv";
    /**
     *
     * @return @throws IOException
     */
    public List<UnidadeFisica> recuperarDados() throws IOException {
        List<String> lines = new LeitorWmic().executarProcessoMuitasLinhas(this.comando, "Node");
        String vetor[];
        UnidadeFisica unidadeFisica;
        List<UnidadeFisica> unidadeFisicas = new ArrayList<>();
        UnidadesLogicasDao unidadesLogicasDao = new UnidadesLogicasDao();
        List<UnidadeLogica> unidadesLogicas = unidadesLogicasDao.recuperarDados();
        List<Particao> particoes = new ParticaoDao().recuperarDados();
        setDiskIndexParaLogica(unidadesLogicas, particoes);
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
    /**
     * Associa o index da unidade fisica as partições (exemplo partição disco 0)
     *
     * @param unidadesLogicas
     * @param particoes
     */
    private void setDiskIndexParaLogica(List<UnidadeLogica> unidadesLogicas, List<Particao> particoes) {
        for (Particao p : particoes) {
            for (UnidadeLogica u : unidadesLogicas) {
                if (u.getDeviceID().replace(":", "").equals(p.getLetra())) {
                    u.setIndex(p.getDiskIndex());
                }
            }
        }
    }
    /**
     * Pega as unidades logicas que tenha o indice indicado
     *
     * @param us
     * @param index
     * @return
     */
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
