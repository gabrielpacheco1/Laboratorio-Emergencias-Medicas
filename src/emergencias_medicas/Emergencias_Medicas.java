
package emergencias_medicas;


import emergencias_medicas.arrays.ArrayMovil;
import emergencias_medicas.arrays.ArrayPersonas;
import emergencias_medicas.arrays.ArraySolicitudes;
import emergencias_medicas.ui.UIPrincipal;
/**
 *
 * @author Gabriel
 */
public class Emergencias_Medicas {

    public static void main(String[] args) {
        
        ArrayMovil movil = new ArrayMovil();
        ArrayPersonas persona= new ArrayPersonas();
        ArraySolicitudes solicitud= new ArraySolicitudes();
        Tarifa tarifa= new Tarifa();
        
        Gestor gestor= new Gestor(movil, persona,solicitud, tarifa);
        
        UIPrincipal principal = new UIPrincipal(gestor);
        principal.setVisible(true);
        

    }
    
}
