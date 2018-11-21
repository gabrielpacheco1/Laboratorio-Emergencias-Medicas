
package emergencias_medicas;

public class Doctor extends Empleados{
    
    private String especialidad;
    private static String tipo= "Doctor";
    
    public Doctor(String nombre, String apellido, String dni, String direccion, Integer telefono, String sexo, Integer codigo) {
        super(nombre, apellido, dni, direccion, telefono, sexo, codigo);
    }

    public String toString(){
        
        return ("Nombre: "+getNombre()+" "+getApellido()+". DNI: "+getDni()+". Direccion: "+getDireccion()+
                ". Telefono: "+getTelefono());
    }
    
    /**
     * @return the tipo
     */
    public static String getTipo() {
        return tipo;
    }
    
    
}
