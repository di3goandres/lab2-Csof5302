/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ $Id$
 * CatalogoBean.java Universidad de los Andes (Bogotá - Colombia) Departamento
 * de Ingeniería de Sistemas y Computación Licenciado bajo el esquema Academic
 * Free License version 3.0
 *
 * Ejercicio: Muebles de los Alpes
 *
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package com.losalpes.beans;

import com.losalpes.bos.Departamentos;
import com.losalpes.bos.Paises;
import com.losalpes.bos.TipoMueble;
import com.losalpes.bos.TipoPersona;
import com.losalpes.bos.TipoUsuario;
import com.losalpes.bos.TiposDocumentos;
import com.losalpes.bos.Usuario;
import com.losalpes.servicios.IServicioSeguridad;
import com.losalpes.servicios.IServicioUsuario;
import com.losalpes.servicios.ServicioSeguridadMock;
import com.losalpes.servicios.ServicioUsuarioMock;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.faces.validator.ValidatorException;
import org.primefaces.context.RequestContext;

/**
 * Managed bean encargado del catálogo de muebles en el sistema
 *
 */
@ManagedBean
@SessionScoped
public class CatalogoBeanUser {

    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------
    /**
     * Representa un nuevo mueble a ingresar
     */
    private Usuario usuario;

    /**
     * Relación con la interfaz que provee los servicios necesarios del
     * catálogo.
     */
    private IServicioSeguridad catalogo;

    //-----------------------------------------------------------
    // Constructor
    //-----------------------------------------------------------
    /**
     * Constructor de la clase principal
     */
    public CatalogoBeanUser() {
        usuario = new Usuario();
        catalogo = new ServicioSeguridadMock();
    }

    //-----------------------------------------------------------
    // Getters y setters
    //-----------------------------------------------------------
    /**
     * Devuelve el objeto mueble
     *
     * @return mueble Objeto mueble
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Modifica el objeto mueble
     *
     * @param mueble Nuevo mueble
     */
    public void setUsuario(Usuario mueble) {
        this.usuario = mueble;
    }

    /**
     * Devuelve una lista con todos los muebles del sistema
     *
     * @return muebles Muebles del sistema
     */
    public List<Usuario> getUsuarios() {

        return catalogo.darUsuarios();
    }

    //-----------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------
    /**
     * Agrega un nuevo mueble al sistema
     */
    public void validate(FacesContext arg0, UIComponent arg1, Object arg2)
            throws ValidatorException {
        if (((String) arg2).length() > 5) {

            String nombre = (String) arg2.toString();
            //throw new ValidatorException(new FacesMessage(nombre));

            List<Usuario> consulta = getUsuarios();

            for (Usuario consulta1 : consulta) {
                System.out.println("entre a consulta1: " + consulta1.getNumerodocumento());
                if (consulta1.getNumerodocumento().contains(nombre)) {
                    throw new ValidatorException(new FacesMessage("Identificación ya existe"));
                }
            }

        } else {
            throw new ValidatorException(new FacesMessage("Identificacion debe ser mayor a 5 caracteres"));

        }
    }

    public void agregarUsuarios() {
        usuario.setTipo(TipoUsuario.CLIENTE);
        catalogo.agregarUsuario(usuario);
        usuario = new Usuario();
        
       

    }

    /**
     * Elimina la información del mueble
     */
    public void limpiar() {
        usuario = new Usuario();

    }

    public void Eliminar(Usuario m) {
        System.out.println("Entre a eliminar");
        catalogo.removerUsuario(m);

    }

    /**
     * Devuelve los tipos de muebles
     *
     * @return sitems Tipos de muebles en el sistema
     */
    public SelectItem[] getTiposUsuario() {
        TipoUsuario[] tipos = TipoUsuario.values();
        SelectItem[] sitems = new SelectItem[tipos.length];

        for (int i = 0; i < sitems.length; i++) {
            sitems[i] = new SelectItem(tipos[i]);
        }
        return sitems;
    }

    public SelectItem[] getTiposPaises() {
        Paises[] tipos = Paises.values();
        SelectItem[] sitems = new SelectItem[tipos.length];

        for (int i = 0; i < sitems.length; i++) {
            sitems[i] = new SelectItem(tipos[i]);
        }
        return sitems;
    }

    public SelectItem[] getTiposDepartamentos() {
        Departamentos[] tipos = Departamentos.values();
        SelectItem[] sitems = new SelectItem[tipos.length];

        for (int i = 0; i < sitems.length; i++) {
            sitems[i] = new SelectItem(tipos[i]);
        }
        return sitems;
    }

    public SelectItem[] getTiposPersona() {
        TipoPersona[] tipos = TipoPersona.values();
        SelectItem[] sitems = new SelectItem[tipos.length];

        for (int i = 0; i < sitems.length; i++) {
            sitems[i] = new SelectItem(tipos[i]);
        }
        return sitems;
    }
    
     public SelectItem[] getTiposDocumentos() {
        TiposDocumentos[] tipos = TiposDocumentos.values();
        SelectItem[] sitems = new SelectItem[tipos.length];

        for (int i = 0; i < sitems.length; i++) {
            sitems[i] = new SelectItem(tipos[i]);
        }
        return sitems;
    }

}
