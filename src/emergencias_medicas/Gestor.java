
package emergencias_medicas;

import emergencias_medicas.arrays.ArrayMovil;
import java.util.ArrayList;

public class Gestor {
    
    
    private  ArrayMovil arraymovil;

    public Gestor(ArrayMovil arraymovil) {
        this.arraymovil = arraymovil;
    }

    public ArrayList getMovil() {
        return (ArrayList) arraymovil.findAll();
    }

    public Movil getCuenta(String patente) {
        Movil movil = arraymovil.findByPK(patente);
        if (movil!=null){
            return movil;
        }
        //throw new CuentaInexistenteException("Cuenta Inexistente: "+numero);
        return null;
    }

    public void agregarCuenta(Movil movil) {
        arraymovil.insert(movil);        
    }
    
    public void eliminarCuenta(String patente) {
        arraymovil.delete(patente);        
    }
}
