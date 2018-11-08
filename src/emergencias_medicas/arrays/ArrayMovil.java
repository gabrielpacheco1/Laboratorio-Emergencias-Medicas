
package emergencias_medicas.arrays;

import java.util.ArrayList;
import emergencias_medicas.Movil;
import java.util.Collection;

public class ArrayMovil {
    
    private final ArrayList movil = new ArrayList();
    
    
    public void delete(String patente) {
        Movil existe = findByPK(patente);
        if (existe != null) {
            movil.remove(existe);            
            return;
        }        
        //throw new CuentaInexistenteException("Cuenta inexistente: " + patente);
    }
    
    
    public Movil findByPK(String vpatente)  {
        Movil resultado = null;
         for (Object movil : movil) {
            Movil c = (Movil)movil;
            if (c.getPatente().equals(vpatente)==true){
                resultado=c;
            }
        }
        return resultado;
    }
    
    
    public Collection findAll(){       
        return movil;
    }        
    
    
    public void insert(Movil insertRecord) {
        Movil existe = findByPK(insertRecord.getPatente());
        if (existe != null) {
            //throw new CuentaExistenteException("Cuenta existente " + existe);
        }
        movil.add(insertRecord);
        
    }

    
    public void update(Movil updateRecord) /*throws DataAccessException*/ {
    }   
    
    
    
}
