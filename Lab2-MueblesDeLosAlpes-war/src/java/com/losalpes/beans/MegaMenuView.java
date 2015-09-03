/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.NoneScoped;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.MenuModel;

/**
 *
 * @author Diego Andres Montealegre Garcia
 */
@ManagedBean
public class MegaMenuView {

    /**
     * Creates a new instance of MegaMenuView
     */
    public MegaMenuView() {
        
        
    }
    
    /**
     * String el cual contendra la orientacion
     */
    private String orientation = "horizontal";
 
    /**
     * Metodo que retorna la orientacion del menu
     * @return orientation
     */
    public String getOrientation() {
        return orientation;
    }
 
    /**
     * metodo que modifica la orientacion del menu
     * @param orientation 
     */
    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }
    
    
     private MenuModel simpleMenuModel = new DefaultMenuModel();
   
   
    
    public MenuModel getSimpleMenuModel() {
        return simpleMenuModel;
    }
    
    
    
}
