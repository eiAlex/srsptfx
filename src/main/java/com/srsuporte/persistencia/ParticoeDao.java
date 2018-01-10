/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srsuporte.persistencia;

import com.srsuporte.srsptfx.model.Particao;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Suporte
 */
public class ParticoeDao {
    private final String comando = "wmic diskdrive get index /format:csv | find /c /v \"\"";

    public Map<Integer, List> recuperarDados() throws IOException {
        LeitorDiskPart diskPart = new LeitorDiskPart();
        return diskPart.executarProcesso(comando);
    }
}
