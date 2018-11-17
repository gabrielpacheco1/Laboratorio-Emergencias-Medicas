
package emergencias_medicas;

import emergencias_medicas.arrays.ArrayAfiliados;
import emergencias_medicas.arrays.ArrayMovil;
import emergencias_medicas.arrays.ArrayPersonas;
import emergencias_medicas.arrays.ArraySolicitudes;
import java.util.ArrayList;

public class Gestor {
    
    private ArrayMovil arraymovil;
    private ArrayAfiliados arrayAfiliados;
    private ArrayPersonas arrayPersonas;
    private ArraySolicitudes arraySolicitudes;

    public Gestor(ArrayMovil arraymovil, ArrayPersonas arrayPersonas, ArraySolicitudes arraySolicitudes) {
        this.arraymovil = arraymovil;
        this.arrayPersonas= arrayPersonas;
        this.arraySolicitudes= arraySolicitudes;
        
    }
    
    public Gestor(ArrayMovil arraymovil) {
        this.arraymovil = arraymovil;
    }
    
//    public Gestor(ArrayAfiliados arrayAfiliados) {
//        this.arrayAfiliados = arrayAfiliados;
//    }

    public ArrayList getMoviles() {
        return (ArrayList) arraymovil.findAllMoviles();
    }

    public Movil getMovil(String patente) {
        Movil movil = arraymovil.buscarPatente(patente);
        if (movil!=null){
            return movil;
        }
        //throw new CuentaInexistenteException("Cuenta Inexistente: "+numero);
        return null;
    }

    public void agregarMovil(Movil movil) {
        arraymovil.insertMovil(movil);        
    }
    
    public void eliminarMovil(String patente) {
        arraymovil.deleteMovil(patente);
    }
    
    public ArrayList getAfiliados() {
        return (ArrayList) arrayAfiliados.findAllAfiliados();
    }
    
    public Afiliado getAfiliado(String docu) {
        Afiliado afiliado = arrayAfiliados.buscarDocumento(docu);
        if (afiliado!=null){
            return afiliado;
        }
        //throw new CuentaInexistenteException("Cuenta Inexistente: "+numero);
        return null;
    }
    
    public void agregarAfiliado(Afiliado afiliado) {
        arrayAfiliados.insertAfiliado(afiliado);        
    }
    
    public void eliminarAfiliado(String docu) {
        arrayAfiliados.deleteAfiliado(docu);
    }
    
    public ArrayList getPersonas() {
        return (ArrayList) arrayPersonas.findAll();
    }
    
    public Persona getPersona(String docu) {
        Persona persona = arrayPersonas.buscarDocumento(docu);
        if (persona!=null){
            return persona;
        }
        //throw new CuentaInexistenteException("Cuenta Inexistente: "+numero);
        return null;
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
    
}
