
package emergencias_medicas.arrays;

import java.util.ArrayList;
import emergencias_medicas.Afiliado;
import excepciones.ObjExistenteExcepcion;
import java.util.Collection;

public class ArrayAfiliados {
    
    
    private final ArrayList afiliados = new ArrayList();
    
    
    public void deleteAfiliado(String dni) {
        Afiliado existe = buscarDocumento(dni);
        if (existe != null) {
            afiliados.remove(existe);            
            return;
        }        
        //throw new CuentaInexistenteException("Cuenta inexistente: " + patente);
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
            throw new ObjExistenteExcepcion("Afiliado existente " + existe);
        }
        afiliados.add(insertRecord);
    }

    
    public void update(Afiliado updateRecord) /*throws DataAccessException*/ {
    } 
    
}
