
package emergencias_medicas;

import excepciones.CamposIncompletosExcepcion;

public class Persona {
    private String nombre;
    private String apellido;
    private String dni;   //cambio de Integer
    private String direccion;
    private Integer telefono;
    private String sexo;
    private static String tipo;
    private String estado;
    
    public Persona(){}
    
    public Persona(String nombre,String apellido,String dni,String direccion,Integer telefono,String sexo)throws CamposIncompletosExcepcion{
        
        if(nombre.equals("")||apellido.equals("")||dni.equals("")||direccion.equals("")||sexo.equals("")){
            throw new CamposIncompletosExcepcion("No rellenó todos los campos");
        }
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.direccion=direccion;
        this.telefono=telefono;
        this.sexo=sexo;
        this.estado="Libre";
    }
    
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public Integer getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
     
     /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
