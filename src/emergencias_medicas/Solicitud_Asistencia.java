
package emergencias_medicas;

import excepciones.CamposIncompletosExcepcion;
import java.util.Calendar;

public class Solicitud_Asistencia {
    private Afiliado aPaciente;
    private GrupoFamiliar gfPaciente;
    private Movil movil;
    private Chofer chofer;
    private Doctor doctor;
    private Enfermero enfermero;
    private String resultado;
    private Calendar fecha;
    private String nroOrden;
    private String estado;
    
    //para un afiliado
    public Solicitud_Asistencia(Afiliado paciente, Doctor doctor, Enfermero enfermero, Chofer chofer, 
            Movil movil,String nroOrden, Calendar fecha){
        if(/*paciente==null||doctor==null||enfermero==null||chofer==null||movil==null||*/nroOrden.equals("")){
            throw new CamposIncompletosExcepcion ("No rellenó todos los campos");
        }
        aPaciente=paciente;
        this.movil=movil;
        this.chofer=chofer;
        this.doctor=doctor;
        this.enfermero=enfermero;
        this.nroOrden=nroOrden;
        this.fecha=fecha;
        this.estado="Pendiente";
        this.resultado= "Resultado pendiente";
    }
    
    //Para personas del grupo familiar de un afiliado
    public Solicitud_Asistencia(GrupoFamiliar paciente, Doctor doctor, Enfermero enfermero, Chofer chofer, 
            Movil movil,String nroOrden, Calendar fecha){
        if(/*paciente==null||doctor==null||enfermero==null||chofer==null||movil==null||*/nroOrden.equals("")){
            throw new CamposIncompletosExcepcion ("No rellenó todos los campos");
        }
        gfPaciente=paciente;
        this.movil=movil;
        this.chofer=chofer;
        this.doctor=doctor;
        this.enfermero=enfermero;
        this.nroOrden=nroOrden;
        this.fecha=fecha;
        this.estado="Pendiente";
        this.resultado= "Resultado pendiente";
    }
    

    public String toString(){
        Integer mes= (fecha.get(Calendar.MONTH))+1;
        return (nroOrden+". DOCTOR: "+doctor+". ENFERMERO:"+enfermero+". CHOFER: "+chofer+". MOVIL: "+movil+
                ". FECHA: "+fecha.get(Calendar.DAY_OF_MONTH)+"/"+mes+"/"+fecha.get(Calendar.YEAR));
        
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
    public String getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    /**
     * @return the paciente
     */
    public Afiliado getPaciente() {
        return getaPaciente();
    }

    /**
     * @param paciente the paciente to set
     */
    public void setPaciente(Afiliado paciente) {
        this.setaPaciente(paciente);
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

    /**
     * @return the gfPaciente
     */
    public GrupoFamiliar getGfPaciente() {
        return gfPaciente;
    }

    /**
     * @param gfPaciente the gfPaciente to set
     */
    public void setGfPaciente(GrupoFamiliar gfPaciente) {
        this.gfPaciente = gfPaciente;
    }

    /**
     * @return the aPaciente
     */
    public Afiliado getaPaciente() {
        return aPaciente;
    }

    /**
     * @param aPaciente the aPaciente to set
     */
    public void setaPaciente(Afiliado aPaciente) {
        this.aPaciente = aPaciente;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    
}
