
package emergencias_medicas;


import excepciones.TarifaNoEstablecidaExcepcion;
import java.util.ArrayList;
import java.util.Calendar;


public class Afiliado extends Persona {
    
    public ArrayList <Pago> pagos= new ArrayList();
    private Calendar fechaAlta;
    private int cantidadGrupoFamiliar;
    private static String tipo= "Afiliado";
    
    
    public Afiliado(){}
    
    public Afiliado(String nombre,String apellido,String dni,/*,Integer dia,Integer mes,Integer año*/
            String sexo,Integer telefono,String direccion,Calendar fechaAlta, Pago pago){
        super(nombre,apellido,dni,direccion,telefono,sexo);
        
        if(pago.getMonto()==0.0f){
            throw new TarifaNoEstablecidaExcepcion("Tarifa no establecida.");
        }
        
        this.fechaAlta=fechaAlta;
        pagos.add(pago);
    }


    public int CalcularDeuda(Afiliado afi){   //Calcula si adeuda más de dos meses
        Calendar cal= Calendar.getInstance();
        Integer año= cal.get(Calendar.YEAR);
        int resultado=0;
        int tam= afi.pagos.size()-1;
        int mesAlta= afi.getFechaAlta().get(Calendar.MONTH);
        
        if(año==afi.fechaAlta.get(Calendar.YEAR)){
            int difMeses= cal.get(Calendar.MONTH)-mesAlta;
            if((difMeses-tam)>2){
                resultado=1;   //adeuda
            }else
                resultado=0;

        }else{
            int calculoMeses= 11-mesAlta;
            int difMeses=calculoMeses+cal.get(Calendar.MONTH)+1;

            if((difMeses-tam)>2){
                resultado=1;    //adeuda
            }else
                resultado=0;
        }
        
        return resultado;
    }
   
    /**
     * @return the fechaAlta
     */
    public Calendar getFechaAlta() {
        return fechaAlta;
    }

    /**
     * @param fechaAlta the fechaUltPago to set
     */
    public void setFechaAlta(Calendar fechaAlta) {
        this.fechaAlta= fechaAlta;

    }
    
    public String toString(){

        if(fechaAlta!=null){
            Integer mes= fechaAlta.get(Calendar.MONTH);
            mes=mes+1; //Porque los meses se enumeran del 0 al 11
            return ("Nombre: "+this.getNombre()+" "+this.getApellido()+". DNI: "+this.getDni()+
                    ". Grupo familiar: "+this.cantidadGrupoFamiliar+". Direccion: "+getDireccion()+". Telefono: "+getTelefono()
                    +". Fecha de alta: "+fechaAlta.get(Calendar.DAY_OF_MONTH)+"/"+mes+"/"+fechaAlta.get(Calendar.YEAR));
        }
            return ("Nombre: "+this.getNombre()+" "+this.getApellido()+". Documento: "+this.getDni()+". Grupo familiar: "+this.cantidadGrupoFamiliar+". Fecha de alta: No realizo pago");
        
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

   
}
