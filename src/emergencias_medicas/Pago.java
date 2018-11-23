
package emergencias_medicas;

import java.util.Calendar;

public class Pago {
    private Calendar fecha;
    private Float monto;
    
    public Pago (Calendar fecha, Float monto){
        this.fecha=fecha;
        this.monto=monto;
    }

    public String toString(){
        Integer mes= (fecha.get(Calendar.MONTH))+1;
        return ("Fecha de pago: "+fecha.get(Calendar.DAY_OF_MONTH)+"/"+mes+"/"+fecha.get(Calendar.YEAR)+
                ". Monto: "+monto);
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
     * @return the monto
     */
    public Float getMonto() {
        return monto;
    }

    /**
     * @param monto the monto to set
     */
    public void setMonto(Float monto) {
        this.monto = monto;
    }
}
