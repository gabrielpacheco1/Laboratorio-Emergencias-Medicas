
package emergencias_medicas;

public class Solicitud_Asistencia {
    private Paciente paciente;
    private Movil movil;
    private Chofer chofer;
    private Doctor doctor;
    private Enfermero enfermero;
    private Resultado resultado;
    private String fecha;
    private String hora;

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
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(String hora) {
        this.hora = hora;
    }
}
