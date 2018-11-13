
package emergencias_medicas;


import java.util.Calendar;


public class Afiliado {
    
    private String nombre;
    private String apellido;
    private String dni;   //cambio de Integer
//    private Integer dia;
//    private Integer mes;
//    private Integer año;
    private String direccion;
    private Integer telefono;
    private String sexo;
    private Calendar fechaUltPago;
    
    
    public Afiliado(String nombre,String apellido,String dni,/*,Integer dia,Integer mes,Integer año*/
            String direccion,Integer telefono,String sexo){
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
//        this.dia=dia;
//        this.mes=mes;
//        this.año=año;
        this.direccion=direccion;
        this.telefono=telefono;
        this.sexo=sexo;
        
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

//    /**
//     * @return the dia
//     */
//    public Integer getDia() {
//        return dia;
//    }
//
//    /**
//     * @param dia the dia to set
//     */
//    public void setDia(Integer dia) {
//        this.dia = dia;
//    }
//
//    /**
//     * @return the mes
//     */
//    public Integer getMes() {
//        return mes;
//    }
//
//    /**
//     * @param mes the mes to set
//     */
//    public void setMes(Integer mes) {
//        this.mes = mes;
//    }
//
//    /**
//     * @return the año
//     */
//    public Integer getAño() {
//        return año;
//    }
//
//    /**
//     * @param año the año to set
//     */
//    public void setAño(Integer año) {
//        this.año = año;
//    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public Integer getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
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
        
        return ("Nombre: "+this.getNombre()+" "+this.getApellido()+". Documento: "+this.getDni()+". Fecha de pago: "+this.getFechaUltPago());
    }
}
