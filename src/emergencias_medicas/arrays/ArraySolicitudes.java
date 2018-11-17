
package emergencias_medicas.arrays;

import emergencias_medicas.Solicitud_Asistencia;
import excepciones.ObjExistenteExcepcion;
import java.util.ArrayList;
import java.util.Collection;


public class ArraySolicitudes {
    
    private final ArrayList solicitudes= new ArrayList();
    
    public void delete(String nroOrden) {
        Solicitud_Asistencia existe = buscarNroOrden(nroOrden);
        if (existe != null) {
            solicitudes.remove(existe);            
            return;
        }        
        //throw new CuentaInexistenteException("Cuenta inexistente: " + patente);
    }
    
    
    public Solicitud_Asistencia buscarNroOrden(String nroOrden)  {
        Solicitud_Asistencia resultado = null;
         for (Object persona : solicitudes) {
            Solicitud_Asistencia c = (Solicitud_Asistencia)persona;
            if (c.getNroOrden().equals(nroOrden)==true){
                resultado=c;
            }
        }
        return resultado;
    }
    
    
    public Collection findAll(){       
        return solicitudes;
    }        
    
    
    public void insert(Solicitud_Asistencia insertRecord) {
        Solicitud_Asistencia existe = buscarNroOrden(insertRecord.getNroOrden());
        if (existe != null) {
            throw new ObjExistenteExcepcion("Persona existente " + existe);
        }
        solicitudes.add(insertRecord);
    }

    
    public void update(Solicitud_Asistencia updateRecord) /*throws DataAccessException*/ {
    } 
}
