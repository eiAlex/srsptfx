
package com.srsuporte.srsptfx.controller;

import com.srsuporte.srsptfx.servico.ConstrutorDeTelas;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;

/**
 *
 * @author Alex
 */
public class FXMLPaneAcessoRemotoController implements Initializable{
    
    private  Pane paneMidEsquerdo;
    ConstrutorDeTelas construtorDeTelas  = new ConstrutorDeTelas();
    
     @FXML
    public void ClickButtonConectar()  {

        System.out.println("Click em Conectar!");
        //buttonAbrirChamado.setDisable(true);
       // construtorDeTelas.contruirPane("/view/FXMLPaneNovoChamado.fxml", paneMidEsquerdo);

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
   //  construtorDeTelas.contruirPane("/view/FXMLPaneAcessoRemoto.fxml", paneMidEsquerdo);
    
    }
}
