
package emergencias_medicas.arrays;

import java.util.ArrayList;
import emergencias_medicas.Movil;
import excepciones.ObjExistenteExcepcion;
import java.util.Collection;

public class ArrayMovil {
    
    private final ArrayList movil = new ArrayList();
    
    
    public void deleteMovil(String patente) {
        Movil existe = buscarPatente(patente);
        if (existe != null) {
            movil.remove(existe);            
            return;
        }        
        //throw new CuentaInexistenteException("Cuenta inexistente: " + patente);
    }
    
    
    public Movil buscarPatente(String vpatente)  {
        Movil resultado = null;
         for (Object movil : movil) {
            Movil c = (Movil)movil;
            if (c.getPatente().equals(vpatente)==true){
                resultado=c;
            }
        }
        return resultado;
    }
    
    
    public Collection findAllMoviles(){       
        return movil;
    }        
    
    
    public void insertMovil(Movil insertRecord) {
        Movil existe = buscarPatente(insertRecord.getPatente());
        if (existe != null) {
            throw new ObjExistenteExcepcion("Movil existente " + existe);
        }
        movil.add(insertRecord);
        
    }

    
    public void update(Movil updateRecord) /*throws DataAccessException*/ {
    }   
    
    
    
}
