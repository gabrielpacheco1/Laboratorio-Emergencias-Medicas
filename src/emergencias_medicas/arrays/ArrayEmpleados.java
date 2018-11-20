
package emergencias_medicas.arrays;

import java.util.ArrayList;
import emergencias_medicas.Empleados;
import excepciones.ObjExistenteExcepcion;
import excepciones.ObjInexistenteExcepcion;
import java.util.Collection;

public class ArrayEmpleados {
    
    private final ArrayList empleados = new ArrayList();
    
    
    public void delete(String dni) {
        Empleados existe = findByPK(dni);
        if (existe != null) {
            empleados.remove(existe);            
            return;
        }        
        throw new ObjInexistenteExcepcion("La persona con el dni "+dni+" no se encuentra registrada.");
    }
    
    
        public Empleados findByPK(String vdni)  {
        Empleados resultado = null;
         for (Object empleado : empleados) {
            Empleados c = (Empleados)empleado;
            if (c.getDni().equals(vdni)==true){
                resultado=c;
            }
        }
        return resultado;
    }
    
    
    public Collection findAll(){       
        return empleados;
    }        
    
    
    public void insert(Empleados insertRecord) {
        Empleados existe = findByPK(insertRecord.getDni());
        if (existe != null) {
            throw new ObjExistenteExcepcion("El DNI ya está registrado. " + existe);
        }
        empleados.add(insertRecord);
    }

    
    public void update(Empleados updateRecord) /*throws DataAccessException*/ {
    } 
    
    
}
