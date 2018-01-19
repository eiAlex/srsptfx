/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srsuporte.persistencia;

import com.srsuporte.srsptfx.model.SistemaOperacional;
import com.srsuporte.srsptfx.servico.ConversorData;
import com.srsuporte.srsptfx.servico.FormatoDataInvalidaException;
import java.io.IOException;

/**
 *
 * @author Sr computador
 */
public class SistemaOperacionalDao {

    // wmic os get
    private final String comando = "wmic os get BuildType, Caption, InstallDate, OSArchitecture, Version, WindowsDirectory, SerialNumber /format:csv";

    private final LeitorWmic leitorWmic;
    private final ConversorData conversorData;

    public SistemaOperacionalDao(LeitorWmic leitorWmic, ConversorData conversorData) {
        this.leitorWmic = leitorWmic;
        this.conversorData = conversorData;
    }

    public SistemaOperacional recuperarDados() throws IOException, FormatoDataInvalidaException {
        String texto = this.leitorWmic.executarProcesso(this.comando, "Node");
        String[] vetor = texto.split(",");
        SistemaOperacional so = new SistemaOperacional();
        so.setDescricaoNucleo(vetor[1] + " - " + vetor[4]);
        so.setIdioma(System.getProperty("user.language")+ " - " + System.getProperty("user.country"));
        so.setDataInstalacao(this.conversorData.converterDataCompleta(vetor[3].substring(0, 14)));
        so.setNome(vetor[2]);
        so.setVersao(vetor[5]);
        so.setPathPastaRaiz(vetor[6]);
        so.setSerialNumber(vetor[7]);
        return so;
    }

}
