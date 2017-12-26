/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srsuporte.srsptfx.controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

/**
 *
 * @author Alex
 */
public class ConstrutorDeTelas {
    
    
    
    
    
    
    public  void contruirPane(String CaminhoPane, Pane pane) {
        
         Pane newLoadedPane = null;
        try {
            newLoadedPane = FXMLLoader.load(getClass().getResource(CaminhoPane));
        } catch (IOException ex) {
            Logger.getLogger(ConstrutorDeTelas.class.getName()).log(Level.SEVERE, null, ex);
        }
        pane.getChildren().add(newLoadedPane);
        
    }
    
    
}
