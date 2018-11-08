
package emergencias_medicas;

import emergencias_medicas.arrays.ArrayMovil;
import java.util.ArrayList;

public class Gestor {
    
    
    private  ArrayMovil arraymovil;

    public Gestor(ArrayMovil arraymovil) {
        this.arraymovil = arraymovil;
    }

    public ArrayList getMoviles() {
        return (ArrayList) arraymovil.findAllMoviles();
    }

    public Movil getMovil(String patente) {
        Movil movil = arraymovil.buscarPatente(patente);
        if (movil!=null){
            return movil;
        }
        //throw new CuentaInexistenteException("Cuenta Inexistente: "+numero);
        return null;
    }

    public void agregarMovil(Movil movil) {
        arraymovil.insertMovil(movil);        
    }
    
    public void eliminarMovil(String patente) {
        arraymovil.deleteMovil(patente);
    }
}
