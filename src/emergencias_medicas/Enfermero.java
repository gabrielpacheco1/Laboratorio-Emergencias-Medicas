
package emergencias_medicas;


public class Enfermero extends Empleados {
    
    private static String tipo= "Enfermero";
    
    public Enfermero(String nombre, String apellido, String dni, /*Integer dia, Integer mes, Integer año,*/ String direccion, Integer telefono, String sexo, Integer codigo) {
        super(nombre, apellido, dni,/* dia, mes, año, */direccion, telefono, sexo, codigo);
    }

    /**
     * @return the tipo
     */
    public static String getTipo() {
        return tipo;
    }
    
}
