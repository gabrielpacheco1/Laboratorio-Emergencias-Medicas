
package emergencias_medicas;

import emergencias_medicas.arrays.ArrayAfiliados;
import emergencias_medicas.arrays.ArrayMovil;
import emergencias_medicas.arrays.ArrayPersonas;
import emergencias_medicas.ui.UIPrincipal;
/**
 *
 * @author Gabriel
 */
public class Emergencias_Medicas {

    public static void main(String[] args) {
        
        ArrayMovil movil = new ArrayMovil();
        ArrayAfiliados afiliado= new ArrayAfiliados();
        ArrayPersonas persona= new ArrayPersonas();
        
        Gestor gestor= new Gestor(movil, persona);
        
        UIPrincipal principal = new UIPrincipal(gestor);
        principal.setVisible(true);
        

    }
    
}
