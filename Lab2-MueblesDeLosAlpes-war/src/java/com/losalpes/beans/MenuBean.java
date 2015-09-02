/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;

/**
 *
 * @author Diego Andres Montealegre Garcia
 */
@ManagedBean
@RequestScoped
public class MenuBean {

    private MenuModel model;

    /**
     * Creates a new instance of MenuBean
     */
    public MenuBean() {
        model = new DefaultMenuModel();
      
       
        DefaultMenuItem menu1 = new DefaultMenuItem("Clientes Consultar");
        menu1.setUrl("catalogoUsuarios.xhtml");
        menu1.setIcon("ui-icon-person");
      
        model.addElement(menu1);
        
         DefaultMenuItem menu4 = new DefaultMenuItem("Crear Clientes");
        menu4.setUrl("CrearUsuario.xhtml");
        menu4.setIcon("ui-icon-person");
      
        model.addElement(menu4);

        DefaultMenuItem menu2 = new DefaultMenuItem("Muebles");
        menu2.setUrl("catalogo.xhtml");
        menu2.setIcon("ui-icon-contact");
        model.addElement(menu2);

        DefaultMenuItem menu3 = new DefaultMenuItem("Salir");
        menu3.setUrl("index.xhtml");
        menu3.setIcon("ui-icon-close");
        model.addElement(menu3);
        
      

    }

    public MenuModel getModel() {
        return model;
    }

}
