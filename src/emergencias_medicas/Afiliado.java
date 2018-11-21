
package emergencias_medicas;


import java.util.ArrayList;
import java.util.Calendar;


public class Afiliado extends Persona {
    
    private Calendar fechaUltPago;
    private int cantidadGrupoFamiliar;
    //private ArrayList <Persona> grupoFamiliar;
    private static String tipo= "Afiliado";
    private static final Float tarifa= 1000f;
    private static final Float tarifaGF= 500f;
    
    public Afiliado(){}
    
    public Afiliado(String nombre,String apellido,String dni,/*,Integer dia,Integer mes,Integer año*/
            String sexo,Integer telefono,String direccion,Calendar fechaUltPago){
        super(nombre,apellido,dni,direccion,telefono,sexo);
        this.fechaUltPago=fechaUltPago;
    }

    public Float pagarTarifa(){
        Float tarifaFinal;
        tarifaFinal=this.getTarifa()+(this.cantidadGrupoFamiliar*this.getTarifaGF());
        return tarifaFinal;
    }

    /**
     * @return the fechaUltPago
     */
    public Calendar getFechaUltPago() {
        return fechaUltPago;
    }

    /**
     * @param fechaUltPago the fechaUltPago to set
     */
    public void setFechaUltPago(Calendar fechaUltPago) {
        this.fechaUltPago = fechaUltPago;

    }
    
    public String toString(){

        if(fechaUltPago!=null){
            Integer mes= fechaUltPago.get(Calendar.MONTH);
            mes=mes+1; //Porque los meses se enumeran del 0 al 11
            return ("Nombre: "+this.getNombre()+" "+this.getApellido()+". Documento: "+this.getDni()+". Grupo familiar: "+this.cantidadGrupoFamiliar+". Fecha de pago: "+fechaUltPago.get(Calendar.DAY_OF_MONTH)+"/"+mes+"/"+fechaUltPago.get(Calendar.YEAR));
        }
            return ("Nombre: "+this.getNombre()+" "+this.getApellido()+". Documento: "+this.getDni()+". Grupo familiar: "+this.cantidadGrupoFamiliar+". Fecha de pago: No realizo pago");
        
    }

    /**
     * @return the tipo
     */
    public static String getTipo() {
        return tipo;
    }

    /**
     * @return the cantidadGrupoFamiliar
     */
    public int getCantidadGrupoFamiliar() {
        return cantidadGrupoFamiliar;
    }

    /**
     * @param cantidadGrupoFamiliar the cantidadGrupoFamiliar to set
     */
    public void setCantidadGrupoFamiliar(int cantidadGrupoFamiliar) {
        this.cantidadGrupoFamiliar = cantidadGrupoFamiliar;
    }

    /**
     * @return the tarifa
     */
    public static Float getTarifa() {
        return tarifa;
    }

    /**
     * @return the tarifaGF
     */
    public static Float getTarifaGF() {
        return tarifaGF;
    }
}
