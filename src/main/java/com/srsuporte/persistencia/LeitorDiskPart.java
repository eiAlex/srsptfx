/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srsuporte.persistencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Suporte
 */
public class LeitorDiskPart {

    public Map<Integer, List> executarProcesso(String comando) throws IOException {
        List<String> lines = new ArrayList<>();
        Map<Integer, List> particoes = new HashMap<>();
        atualizarQtdParticoes();
        Process exec = Runtime.getRuntime().exec(comando);
        BufferedReader br = new BufferedReader(new InputStreamReader(exec.getInputStream()));
        String line = br.readLine();
        Integer key = 0;
        while ((line = br.readLine()) != null) {
            if (line.contains("Volume No")) {
                br.readLine();
                while (true) {
                    if ((line = br.readLine()) == null || !line.contains("Volume")) {
                        particoes.put(key++, lines);
                        lines = new ArrayList<>();
                        break;
                    }
                    lines.add(line.split("\\s+")[3]);
                }
            }
        }
        return particoes;
    }

    private int atualizarQtdParticoes() throws IOException {
        Process exec = Runtime.getRuntime().exec("scripts/qtd_particoes.bat");
        BufferedReader br = new BufferedReader(new InputStreamReader(exec.getInputStream()));
        String line;
        String lastValue = null;
        while ((line = br.readLine()) != null) {
            if (!line.isEmpty()) {
                lastValue = line;
            }
        }
        br.close();
        File file = new File("scripts/qtd_partcoes.txt");
        java.io.FileWriter fileWriter = new FileWriter(file);
        int count = (Integer.valueOf(lastValue) - 2);
        for (int i = 0; i < count; i++) {
            fileWriter.append("select disk=" + i + "\n");
            fileWriter.append("detail disk\n");
        }
        fileWriter.close();
        return Integer.valueOf(lastValue);
    }
}
