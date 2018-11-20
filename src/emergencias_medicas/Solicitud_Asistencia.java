
package emergencias_medicas;

import excepciones.CamposIncompletosExcepcion;
import java.util.Calendar;

public class Solicitud_Asistencia {
    private Afiliado paciente;
    private Movil movil;
    private Chofer chofer;
    private Doctor doctor;
    private Enfermero enfermero;
    private Resultado resultado;
   // private String fecha;
    //private String hora;
    private Calendar fecha;
    private String nroOrden;
    
    
    public Solicitud_Asistencia(Afiliado paciente, Doctor doctor, Enfermero enfermero, Chofer chofer, Movil movil){
        if(paciente==null||doctor==null||enfermero==null||chofer==null||movil==null){
            throw new CamposIncompletosExcepcion ("No rellenó todos los campos");
        }
        this.paciente=paciente;
        this.movil=movil;
        this.chofer=chofer;
        this.doctor=doctor;
        this.enfermero=enfermero;
        
    }
    

    /**
     * @return the movil
     */
    public Movil getMovil() {
        return movil;
    }

    /**
     * @param movil the movil to set
     */
    public void setMovil(Movil movil) {
        this.movil = movil;
    }

    /**
     * @return the resultado
     */
    public Resultado getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }

    /**
     * @return the paciente
     */
    public Afiliado getPaciente() {
        return paciente;
    }

    /**
     * @param paciente the paciente to set
     */
    public void setPaciente(Afiliado paciente) {
        this.paciente = paciente;
    }

    /**
     * @return the chofer
     */
    public Chofer getChofer() {
        return chofer;
    }

    /**
     * @param chofer the chofer to set
     */
    public void setChofer(Chofer chofer) {
        this.chofer = chofer;
    }

    /**
     * @return the doctor
     */
    public Doctor getDoctor() {
        return doctor;
    }

    /**
     * @param doctor the doctor to set
     */
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    /**
     * @return the enfermero
     */
    public Enfermero getEnfermero() {
        return enfermero;
    }

    /**
     * @param enfermero the enfermero to set
     */
    public void setEnfermero(Enfermero enfermero) {
        this.enfermero = enfermero;
    }

    /**
     * @return the fecha
     */
    public Calendar getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the nroOrden
     */
    public String getNroOrden() {
        return nroOrden;
    }

    /**
     * @param nroOrden the nroOrden to set
     */
    public void setNroOrden(String nroOrden) {
        this.nroOrden = nroOrden;
    }

    
}
