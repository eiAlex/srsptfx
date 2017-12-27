package com.srsuporte.srsptfx.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * FXML Controller class
 *
 * @author Alex
 */
public class FXMLVBoxMainController implements Initializable {

    @FXML
    private Pane paneMidEsquerdo;

    @FXML
    private Button buttonAbrirChamado;
    

    ConstrutorDeTelas construtorDeTelas = new ConstrutorDeTelas();
   

    
    

    @FXML
    private void ClickButtonAbrirChamado(ActionEvent event) throws IOException {

        System.out.println("Click em Abrir Chamado!");
        //buttonAbrirChamado.setDisable(true);
        construtorDeTelas.contruirPane("/view/FXMLPaneNovoChamado.fxml", paneMidEsquerdo);

       
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        //constri pane relativo ao acesso remoto
        
        construtorDeTelas.contruirPane("/view/FXMLPaneAcessoRemoto.fxml", paneMidEsquerdo);

    }

}
