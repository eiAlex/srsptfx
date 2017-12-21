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
    

   

    public void CarregaPaneNovoChamado(ActionEvent event) throws IOException {
        Pane newLoadedPane = FXMLLoader.load(getClass().getResource("/view/FXMLPaneNovoChamado.fxml"));
        paneMidEsquerdo.getChildren().add(newLoadedPane);
    }
     
     public void CarregaPaneAcessoRemoto(ActionEvent event) throws IOException {
        Pane newLoadedPane = FXMLLoader.load(getClass().getResource("/view/FXMLPaneAcessoRemoto.fxml"));
        paneMidEsquerdo.getChildren().add(newLoadedPane);
    }
     
     public void CarregaPaneMenuChamados(ActionEvent event) throws IOException {
        Pane newLoadedPane = FXMLLoader.load(getClass().getResource("/view/FXMLPaneMenuChamados.fxml"));
        paneMidEsquerdo.getChildren().add(newLoadedPane);
    }
     
    

    @FXML
    private void ClickButtonAbrirChamado(ActionEvent event) throws IOException {

        System.out.println("Click em Abrir Chamado!");
        //buttonAbrirChamado.setDisable(true);

        CarregaPaneAcessoRemoto(event);
       
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }

}
