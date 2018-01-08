/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srsuporte.srsptfx.servico;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Pane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Alex
 */
public class ConstrutorDeTelas implements ChangeListener {

    public void contruirPane(String CaminhoPane, Pane pane) {

        Pane newLoadedPane = null;
        try {
            newLoadedPane = FXMLLoader.load(getClass().getResource(CaminhoPane));
        } catch (IOException ex) {
            Logger.getLogger(ConstrutorDeTelas.class.getName()).log(Level.SEVERE, null, ex);
        }
        pane.getChildren().add(newLoadedPane);

    }

    public void construirWebWiew(WebView webView) {

        try {
            webView.autosize();
            webView.getEngine().load("https://www.google.com");
            
        } catch (Exception e) {
        }

    }

    @Override
    public void stateChanged(ChangeEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
