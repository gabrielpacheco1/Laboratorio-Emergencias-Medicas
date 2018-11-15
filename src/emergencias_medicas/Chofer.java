
package emergencias_medicas;

public class Chofer extends Empleados{
    
    private Movil movil;
    private static String tipo= "Chofer";
    
    public Chofer(String nombre, String apellido, String dni, /*Integer dia, Integer mes, Integer año,*/ String direccion, Integer telefono, String sexo, Integer codigo) {
        super(nombre, apellido, dni,/* dia, mes, año,*/ direccion, telefono, sexo, codigo);

    }

    /**
     * @return the tipo
     */
    public static String getTipo() {
        return tipo;
    }
    
}
