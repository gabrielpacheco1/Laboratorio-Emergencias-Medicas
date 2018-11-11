
package emergencias_medicas;


public class Chofer extends Empleados{
    
    private Movil movil;
    
    public Chofer(String nombre, String apellido, Integer dni, Integer dia, Integer mes, Integer año, String direccion, Integer telefono, String sexo, Integer codigo,Movil movil) {
        super(nombre, apellido, dni, dia, mes, año, direccion, telefono, sexo, codigo);
        this.movil=movil;
    }
    
}
