
package emergencias_medicas;

import emergencias_medicas.arrays.ArrayMovil;
import emergencias_medicas.arrays.ArrayPersonas;
import emergencias_medicas.arrays.ArraySolicitudes;
import excepciones.ObjInexistenteExcepcion;
import excepciones.TarifaNoEstablecidaExcepcion;
import java.util.ArrayList;

public class Gestor {
    
    private ArrayMovil arraymovil;
    private ArrayPersonas arrayPersonas;
    private ArraySolicitudes arraySolicitudes;
    private Gestor gestor;
    private Tarifa tarifa;

    public Gestor(ArrayMovil arraymovil, ArrayPersonas arrayPersonas, ArraySolicitudes arraySolicitudes,Tarifa tarifa) {
        this.arraymovil = arraymovil;
        this.arrayPersonas= arrayPersonas;
        this.arraySolicitudes= arraySolicitudes;
        this.tarifa=tarifa;
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
    
    
    
    ///////////////////////////////////////////////////////////////
    
    public Float calcularPagoDeAltaAfiliado(){
        return tarifa.getBonoAfi();
    }
    
    public Float calcularPagoDeAltaFamilia(){
        return tarifa.getBonoFamilia();
    }
    
    public Float calcularPago(Afiliado afi) throws TarifaNoEstablecidaExcepcion{
        Float pago;
        int nroGrupoF = afi.getCantidadGrupoFamiliar();
        if(tarifa.getBonoAfi()==0f || tarifa.getBonoFamilia()==0f){
            throw new TarifaNoEstablecidaExcepcion("Tarifa no establecida");
        }
        pago=(tarifa.getBonoAfi()+(tarifa.getBonoFamilia()*nroGrupoF));
        return pago;
    }
    
    public void setBonoAfi(Float bonoAfi) {
        tarifa.setBonoAfi(bonoAfi);
        
    }
    
    public void setBonoFamilia(Float bonoFamilia) {
        tarifa.setBonoFamilia(bonoFamilia);
    }
    
}
