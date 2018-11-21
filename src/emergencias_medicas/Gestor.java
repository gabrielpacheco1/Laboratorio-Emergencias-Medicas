
package emergencias_medicas;

import emergencias_medicas.arrays.ArrayMovil;
import emergencias_medicas.arrays.ArrayPersonas;
import emergencias_medicas.arrays.ArraySolicitudes;
import excepciones.ObjInexistenteExcepcion;
import java.util.ArrayList;

public class Gestor {
    
    private ArrayMovil arraymovil;
    private ArrayPersonas arrayPersonas;
    private ArraySolicitudes arraySolicitudes;
    private Gestor gestor;

    public Gestor(ArrayMovil arraymovil, ArrayPersonas arrayPersonas, ArraySolicitudes arraySolicitudes) {
        this.arraymovil = arraymovil;
        this.arrayPersonas= arrayPersonas;
        this.arraySolicitudes= arraySolicitudes;
        
    }
    
    

    public ArrayList getMoviles() {
        return (ArrayList) arraymovil.findAllMoviles();
    }

    public Movil getMovil(String patente) {
        Movil movil = arraymovil.buscarPatente(patente);
        if (movil!=null){
            return movil;
        }
        throw new ObjInexistenteExcepcion("Movil Inexistente: "+patente);
        
    }

    public void agregarMovil(Movil movil) {
        arraymovil.insertMovil(movil);        
    }
    
    public void eliminarMovil(String patente) {
        arraymovil.deleteMovil(patente);
    }
    
    
    public ArrayList getPersonas() {
        return (ArrayList) arrayPersonas.findAll();
    }
    
    public Persona getPersona(String docu) {
        Persona persona = arrayPersonas.buscarDocumento(docu);
        if (persona!=null){
            return persona;
        }
        throw new ObjInexistenteExcepcion("Persona Inexistente: "+docu);
        
    }
    
    public void agregarPersona(Persona persona) {
        arrayPersonas.insert(persona);        
    }
    
    public void eliminarPersona(String docu) {
        arrayPersonas.delete(docu);
    }
    
    //////////////////////////////////////////////////////////
    
    public ArrayList getSolicitudes() {
        return (ArrayList) arraySolicitudes.findAll();
    }
    
    public Solicitud_Asistencia getSolicitud(String orden) {
        Solicitud_Asistencia solicitud = arraySolicitudes.buscarNroOrden(orden);
        if (solicitud!=null){
            return solicitud;
        }
        //throw new CuentaInexistenteException("Cuenta Inexistente: "+numero);
        return null;
    }
    
    public void agregarSolicitud(Solicitud_Asistencia solicitud) {
        arraySolicitudes.insert(solicitud);        
    }
    
    public void eliminarSolicitud(String orden) {
        arraySolicitudes.delete(orden);
    }
    
    public int pago(Integer bonoAfi,Integer bonoFami,String documento){
        int cant=0,pago;
        
        for (int i = 0; i < gestor.getPersonas().size(); i++)
        {
            Persona persona=(Persona) gestor.getPersonas().get(i);//obtiene todos los elementos del arraylist, uno x uno
            if(persona instanceof Afiliado && persona.getDni().equals(documento)){   //si pertence a la clase Afiliado
                Afiliado afi=(Afiliado) gestor.getPersonas().get(i);
                cant= afi.getCantidadGrupoFamiliar();
        
            }
        }
        
        
        
        pago= bonoAfi + (cant*bonoFami);
        
        return pago;
        
    }
    
}
