/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ $Id$
 * Usuario.java Universidad de los Andes (Bogotá - Colombia) Departamento de
 * Ingeniería de Sistemas y Computación Licenciado bajo el esquema Academic Free
 * License version 3.0
 *
 * Ejercicio: Muebles de los Alpes
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package com.losalpes.bos;

/**
 * Clase que representa un usuario del sistema
 */
public class Usuario {

    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------
    /**
     * Nombre del usuario
     */
    private String nombre;

    /**
     * Contraseña del usuario
     */
    private String contraseña;

    /**
     * Tipo de usuario
     */
    private TipoUsuario tipo;

    /**
     * Pais del usuario
     */
    private Paises pais;
    
    /**
     * Departamento del usuario
     */
    private Departamentos departamento;

    
    private String ident;

    
    

    //-----------------------------------------------------------
    // Constructores
    //-----------------------------------------------------------

    /**
     * Constructor de la clase sin argumentos
     */
    public Usuario() {

    }

    /**
     * Constructor de la clase con argumentos
     *
     * @param nombre Nombre del usuario
     * @param contraseña Constraseña del usuario
     * @param tipo Tipo de usuario
     * @param pais Pais proveniente 
     * @param depart departamento del usuario
     */
    public Usuario(String nombre, String contraseña, TipoUsuario tipo, Paises pais, Departamentos depart, String identP) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.tipo = tipo;
        this.pais = pais;
        this.departamento = depart;
        this.ident = identP;
    }

    public Paises getPais() {
        return pais;
    }

    public void setPais(Paises pais) {
        this.pais = pais;
    }
    //-----------------------------------------------------------
    // Getters y setters
    //-----------------------------------------------------------

    /**
     * Devuelve la contraseña del usuario
     *
     * @return contraseña Contraseña del usuario
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * Modifica la contraseña del usuario
     *
     * @param contraseña Nueva contraseña
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * Devuelve el nombre de usuario
     *
     * @return nombre Nombre del usuario
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del usuario
     *
     * @param nombre Nuevo nombre de usuario
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el tipo de usuario
     *
     * @return tipo Tipo de usuario
     */
    public TipoUsuario getTipo() {
        return tipo;
    }

    /**
     * Modifica el tipo de usuario
     *
     * @param tipo Nuevo tipo de usuario
     */
    public void setTipo(TipoUsuario tipo) {
        this.tipo = tipo;
    }
    
    public Departamentos getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamentos departamento) {
        this.departamento = departamento;
    }
    
    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }
    
   

}
