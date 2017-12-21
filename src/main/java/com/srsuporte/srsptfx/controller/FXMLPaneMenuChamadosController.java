/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srsuporte.srsptfx.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Alex
 */
public class FXMLPaneMenuChamadosController implements Initializable {

   
    
      @FXML
    private void ClickButtonAbrirChamado(ActionEvent event) throws IOException {

        System.out.println("Click em Abrir Chamado!");
        //buttonAbrirChamado.setDisable(true);

     
    }
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
