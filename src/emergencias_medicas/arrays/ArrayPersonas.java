
package emergencias_medicas.arrays;

import emergencias_medicas.Persona;
import excepciones.ObjExistenteExcepcion;
import excepciones.ObjInexistenteExcepcion;
import java.util.ArrayList;
import java.util.Collection;

public class ArrayPersonas {
    
    private final ArrayList personas = new ArrayList();
    
    
    public void delete(String dni) {
        Persona existe = buscarDocumento(dni);
        if (existe != null) {
            personas.remove(existe);            
            return;
        }
        throw new ObjInexistenteExcepcion("La persona con el dni "+dni+" no se encuentra registrada.");       
        
    }
    
    
    public Persona buscarDocumento(String vdni)  {
        Persona resultado = null;
         for (Object persona : personas) {
            Persona c = (Persona)persona;
            if (c.getDni().equals(vdni)==true){
                resultado=c;
            }
        }
        return resultado;
    }
    
    
    public Collection findAll(){       
        return personas;
    }        
    
    
    public void insert(Persona insertRecord) {
        Persona existe = buscarDocumento(insertRecord.getDni());
        if (existe != null) {
            throw new ObjExistenteExcepcion("Persona existente " + existe);
        }
        personas.add(insertRecord);
    }

    
    public void update(Persona updateRecord) /*throws DataAccessException*/ {
    } 
}
