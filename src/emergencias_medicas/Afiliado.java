
package emergencias_medicas;


import java.util.ArrayList;
import java.util.Calendar;


public class Afiliado extends Persona {
    
    private Calendar fechaUltPago;
    private ArrayList <Persona> grupoFamiliar;
    private static String tipo= "Afiliado";
    
    
    public Afiliado(String nombre,String apellido,String dni,/*,Integer dia,Integer mes,Integer año*/
            String direccion,Integer telefono,String sexo){
        super(nombre,apellido,dni,direccion,telefono,sexo);
       
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
        
        return ("Nombre: "+this.getNombre()+" "+this.getApellido()+". Documento: "+this.getDni()/*+". Fecha de pago: "+this.getFechaUltPago()*/);
    }

    /**
     * @return the tipo
     */
    public static String getTipo() {
        return tipo;
    }
}
