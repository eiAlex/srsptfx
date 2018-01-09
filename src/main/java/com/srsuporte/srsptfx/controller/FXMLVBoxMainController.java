package com.srsuporte.srsptfx.controller;

import com.srsuporte.srsptfx.servico.ConstrutorDeTelas;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import javafx.scene.web.WebView;

/**
 * FXML Controller class
 *
 * @author Alex
 */
public class FXMLVBoxMainController implements Initializable {

    @FXML
    private Pane paneMidEsquerdo;
    @FXML
    private WebView webViewPaneDireito;

    ConstrutorDeTelas construtorDeTelas = new ConstrutorDeTelas();
    

     @FXML
    public void ClickButtonConexaoRemota() {

        System.out.println("Click em Configurações!");
        //buttonAbrirChamado.setDisable(true);
         construtorDeTelas.contruirPane("/view/FXMLPaneAcessoRemoto.fxml", paneMidEsquerdo);

    } 
     
    @FXML
    public void ClickButtonConfiguracoes() {

        System.out.println("Click em Configurações!");
        //buttonAbrirChamado.setDisable(true);
         construtorDeTelas.contruirPane("/view/FXMLPaneConfiguracoes.fxml", paneMidEsquerdo);

    }

    @FXML
    public void ClickButtonInfoSistema() {

        System.out.println("Click em Info Sistema!");
        //buttonAbrirChamado.setDisable(true);
        construtorDeTelas.contruirPane("/view/FXMLPaneInfoSistema.fxml", paneMidEsquerdo);

    }

    @FXML
    public void ClickButtonSobre() {

        System.out.println("Click em Sobre!");
        //buttonAbrirChamado.setDisable(true);
         construtorDeTelas.contruirPane("/view/FXMLPaneSobre.fxml", paneMidEsquerdo);

    }

    @FXML
    public void ClickButtonAbrirChamado() {

        System.out.println("Click em Abrir Chamado!");
        //buttonAbrirChamado.setDisable(true);
        construtorDeTelas.contruirPane("/view/FXMLPaneNovoChamado.fxml", paneMidEsquerdo);

    }

    @FXML
    public void ClickButtonMeusChamados() {

        System.out.println("Click em Meus Chamados!");
        //buttonAbrirChamado.setDisable(true);
         construtorDeTelas.contruirPane("/view/FXMLPaneMeusChamados.fxml", paneMidEsquerdo);

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        //constri pane relativo ao acesso remoto
        construtorDeTelas.contruirPane("/view/FXMLPaneAcessoRemoto.fxml", paneMidEsquerdo);
        construtorDeTelas.construirWebWiew(webViewPaneDireito);
      
          
       
    }

}
