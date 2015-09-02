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
     * Nombre del usuario con el cual accede al sistema
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

    /**
     * Numero de documento del cliente este debe ser unico en el sistema
     */
    private String numerodocumento;

    /**
     * Nombre completo de la persona ya sea natural o juridica
     */
    private String nombreCompletoCliente;

    /**
     * Telefono de residencia del usuario tipo cliente
     */
    private String telefonoResidencia;

    /**
     * telefono celular del cliente
     */
    private String telefonoCelular;

    /**
     * Direccion del cliente
     */
    private String direccion;

    /**
     * profesion del cliente
     */
    private String profesion;

    /**
     * email del cliente
     */
    private String email;

    /**
     * tipo de documento del cliente
     */
    private TiposDocumentos tipoDocumento;

    /**
     * tipo de persona
     */
    private TipoPersona tipoPersona;

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
     * @param identP numero de identificacion del usuario
     * @param tipoDocumento Tipo de documento del usuario
     * @param nombreCompleto Nombre completo del usuario
     * @param telefonoResidenciaP Telefono de residencia del usuario
     * @param celularP Numero del celular del usuario
     * @param direccionP Direccion de residencia del usuario
     * @param profesionP Profesion del usuario
     * @param emailP Email del usuario
     */
    public Usuario(String nombre, String contraseña,
            TipoUsuario tipo, Paises pais, Departamentos depart, String identP,
            TiposDocumentos tipoDocumento, String nombreCompleto, String telefonoResidenciaP,
            String celularP, String direccionP, String profesionP, String emailP, TipoPersona tipoPersona) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.tipo = tipo;
        this.pais = pais;
        this.departamento = depart;
        this.numerodocumento = identP;
        this.tipoDocumento = tipoDocumento;
        this.nombreCompletoCliente = nombreCompleto;
        this.telefonoResidencia = telefonoResidenciaP;
        this.telefonoCelular = celularP;
        this.direccion = direccionP;
        this.profesion = profesionP;
        this.email = emailP;
        this.tipoPersona = tipoPersona;

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

    /**
     * devuelve el departamento del usuario
     *
     * @return departamento asociado al usuario
     */
    public Departamentos getDepartamento() {
        return departamento;
    }

    /**
     * Modifica el departamento asociado del usuario
     *
     * @param departamento
     */
    public void setDepartamento(Departamentos departamento) {
        this.departamento = departamento;
    }

    /**
     * Retorna el numero de documento del usuario
     *
     * @return numero de documento asociado al usuario
     */
    public String getNumerodocumento() {
        return numerodocumento;
    }

    /**
     * Modifica el numero de documento del usuario
     *
     * @param numerodocumentoP numero de documento del usuario
     */
    public void setNumerodocumento(String numerodocumentoP) {
        this.numerodocumento = numerodocumentoP;
    }

    /**
     * Retorna el nombre completo del cliente
     *
     * @return nombre completo del cliente
     */
    public String getNombreCompletoCliente() {
        return nombreCompletoCliente;
    }

    /**
     * Modifica el nombre completo del cliente
     *
     * @param nombreCompletoCliente
     */
    public void setNombreCompletoCliente(String nombreCompletoCliente) {
        this.nombreCompletoCliente = nombreCompletoCliente;
    }

    /**
     * Retorna el telefono de residencia del cliente
     *
     * @return telefonoResidencia del cliente
     */
    public String getTelefonoResidencia() {
        return telefonoResidencia;
    }

    /**
     * Modifca el telefono de residencia del cliente
     *
     * @param telefonoResidencia
     */
    public void setTelefonoResidencia(String telefonoResidencia) {
        this.telefonoResidencia = telefonoResidencia;
    }

    /**
     * Retorna el valor del telefono celular del cliente
     *
     * @return
     */
    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    /**
     * Modifica el telefono celular del cliente
     *
     * @param telefonoCelular
     */
    public void setTelefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    /**
     * Retorna la direccion del cliente
     *
     * @return direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Modifica la direccion del cliente
     *
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Retorna la profesion del cliente
     *
     * @return profesion
     */
    public String getProfesion() {
        return profesion;
    }

    /**
     * Modifica la profesion del cliente
     *
     * @param profesion
     */
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    /**
     * Metodo para retornar el email del usuario
     *
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Metodo para modificar el email del usario
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Metodo para obtener el paise el cual esta asociado el usuario.
     *
     * @return
     */
    public Paises getPais() {
        return pais;
    }

    /**
     * metodo para modificar el pais del usuario
     *
     * @param pais
     */
    public void setPais(Paises pais) {
        this.pais = pais;
    }

    /**
     * Retorna el tipo de documento el cual esta asociado el cliente
     *
     * @return tipoDocumento
     */
    public TiposDocumentos getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Modifica el tipo de documento del cliente
     *
     * @param tipoDocumento
     */
    public void setTipoDocumento(TiposDocumentos tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    /**
     * Retorna el tipo de persona que es el cliente
     *
     * @return
     */
    public TipoPersona getTipoPersona() {
        return tipoPersona;
    }

    /**
     * Modifica el tipo de persona del cliente
     *
     * @param tipoPersona
     */
    public void setTipoPersona(TipoPersona tipoPersona) {
        this.tipoPersona = tipoPersona;
    }
}
