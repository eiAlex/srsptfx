/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srsuporte.srsptfx.controller;

import com.srsuporte.persistencia.LeitorWmic;
import com.srsuporte.persistencia.SessaoUsuarioDao;
import com.srsuporte.persistencia.SistemaOperacionalDao;
import com.srsuporte.srsptfx.model.SessaoUsuario;
import com.srsuporte.srsptfx.model.SistemaOperacional;
import com.srsuporte.srsptfx.servico.ConversorData;
import com.srsuporte.srsptfx.servico.FormatoDataInvalidaException;
import com.srsuporte.srsptfx.servico.OperacaoData;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Alex
 */
public class FXMLPaneInfoSistemaController implements Initializable {

  
    @FXML
    private Label labelUsuarioConectado ;
    @FXML 
    private Label labelSistemaOperacional;
    @FXML
    private Label  labelServicePack;
    @FXML
    private Label  labelNomeComputador;
    @FXML
    private Label  labelSOLisenca;
    @FXML
    private Label  labelMemoriaRam;
    @FXML
    private Label  labelDiscoRigido;
    @FXML
    private Label  labelProcessador;
    @FXML
    private Label  labelDominio;
    @FXML
    private Label  labelAgente;
    @FXML
    private Label  labelIPLocal;
    
    private SessaoUsuario sessaoUsuario;
    private SistemaOperacional sistemaOperacional;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
               
            
            this.sessaoUsuario = new SessaoUsuarioDao(new ConversorData(), new OperacaoData()).recuperarDados();
            this.sistemaOperacional = new SistemaOperacionalDao(new LeitorWmic(), new ConversorData()).recuperarDados();
            
            labelUsuarioConectado.setText(this.sessaoUsuario.getNomeUsuario() );
            labelSistemaOperacional.setText(this.sistemaOperacional.getNome());
            labelServicePack.setText("A fazer");
            labelNomeComputador.setText(this.sessaoUsuario.getNomeComputador());
            labelSOLisenca.setText("A fazer");
            labelDiscoRigido.setText("A fazer");
            labelMemoriaRam.setText("A fazer");
            labelProcessador.setText("A fazer");
            labelDominio.setText(this.sessaoUsuario.getNomeDominio());
            labelAgente.setText("A fazer");
            labelIPLocal.setText("A fazer");
            
            
             
        } catch (IOException ex) {
            Logger.getLogger(FXMLPaneInfoSistemaController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FormatoDataInvalidaException ex) {
            Logger.getLogger(FXMLPaneInfoSistemaController.class.getName()).log(Level.SEVERE, null, ex);
        }


    }    
    
}
