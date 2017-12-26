/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srsuporte.srsptfx.servico;

/**
 *
 * @author Sr computador
 */
public class FormatoDataInvalidaException extends Exception{

    private final String message;

    public FormatoDataInvalidaException(){
        this.message = "Erro ao tentar converter a data";
    }
    
    public FormatoDataInvalidaException(String mensagem) {
        this.message = mensagem;
    }
    
    @Override
    public String getMessage() {
        return message;
    }
    
    
}
