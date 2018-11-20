
package emergencias_medicas.arrays;

import java.util.ArrayList;
import emergencias_medicas.Afiliado;
import excepciones.ObjExistenteExcepcion;
import excepciones.ObjInexistenteExcepcion;
import java.util.Collection;

public class ArrayAfiliados {
    
    
    private final ArrayList afiliados = new ArrayList();
    
    
    public void deleteAfiliado(String dni) {
        Afiliado existe = buscarDocumento(dni);
        if (existe != null) {
            afiliados.remove(existe);            
            return;
        }        
        else
            throw new ObjInexistenteExcepcion("La persona con el dni "+dni+" no se encuentra registrada.");
    }
    
    
    public Afiliado buscarDocumento(String vdni)  {
        Afiliado resultado = null;
         for (Object afiliado : afiliados) {
            Afiliado c = (Afiliado)afiliado;
            if (c.getDni().equals(vdni)==true){
                resultado=c;
            }
        }
        return resultado;
    }
    
    
    public Collection findAllAfiliados(){       
        return afiliados;
    }        
    
    
    public void insertAfiliado(Afiliado insertRecord) {
        Afiliado existe = buscarDocumento(insertRecord.getDni());
        if (existe != null) {
            throw new ObjExistenteExcepcion("El DNI ya está registrado. " + existe);
        }
        afiliados.add(insertRecord);
    }

    
    public void update(Afiliado updateRecord) /*throws DataAccessException*/ {
    } 
    
}
