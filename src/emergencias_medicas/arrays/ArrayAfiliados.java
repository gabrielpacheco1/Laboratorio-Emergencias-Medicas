
package emergencias_medicas.arrays;

import java.util.ArrayList;
import emergencias_medicas.Afiliado;
import java.util.Collection;

public class ArrayAfiliados {
    
    
    private final ArrayList afiliados = new ArrayList();
    
    
    public void delete(Integer dni) {
        Afiliado existe = findByPK(dni);
        if (existe != null) {
            afiliados.remove(existe);            
            return;
        }        
        //throw new CuentaInexistenteException("Cuenta inexistente: " + patente);
    }
    
    
    public Afiliado findByPK(Integer vdni)  {
        Afiliado resultado = null;
         for (Object afiliado : afiliados) {
            Afiliado c = (Afiliado)afiliado;
            if (c.getDni().equals(vdni)==true){
                resultado=c;
            }
        }
        return resultado;
    }
    
    
    public Collection findAll(){       
        return afiliados;
    }        
    
    
    public void insert(Afiliado insertRecord) {
        Afiliado existe = findByPK(insertRecord.getDni());
        if (existe != null) {
            //throw new CuentaExistenteException("Cuenta existente " + existe);
        }
        afiliados.add(insertRecord);
    }

    
    public void update(Afiliado updateRecord) /*throws DataAccessException*/ {
    } 
    
}
