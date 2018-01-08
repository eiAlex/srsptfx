/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srsuporte.srsptfx.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Alex
 */
public class FXMLPaneNovoChamadoController implements Initializable {

    @FXML
    public void ClickButtonAbrirChamado() {

        System.out.println("Click em Abri Chamado!");
        //buttonAbrirChamado.setDisable(true);
        // construtorDeTelas.contruirPane("/view/FXMLPaneNovoChamado.fxml", paneMidEsquerdo);

    }

    @FXML
    public void ClickButtonCancelarChamado() {

        System.out.println("Click em Cancelar Chamado!");
        //buttonAbrirChamado.setDisable(true);
        // construtorDeTelas.contruirPane("/view/FXMLPaneNovoChamado.fxml", paneMidEsquerdo);

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
