/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.bos;

/**
 *
 * @author Diego Andres Montealegre Garcia
 */
public class Identificacion {

    private String numeroIdentificacion;

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    /**
     * Devuelve el numero de identificacion
     * @return 
     */
    public String toString() {

        StringBuffer elNumero = new StringBuffer();

        elNumero.append(numeroIdentificacion);

        return elNumero.toString();

    }
}
