
package emergencias_medicas;

import emergencias_medicas.arrays.ArrayMovil;
import emergencias_medicas.ui.UIPrincipal;
/**
 *
 * @author Gabriel
 */
public class Emergencias_Medicas {

    public static void main(String[] args) {
        
        ArrayMovil movil = new ArrayMovil();
        Gestor gestor= new Gestor(movil);
        UIPrincipal principal = new UIPrincipal(gestor);
        principal.setVisible(true);
        

    }
    
}
