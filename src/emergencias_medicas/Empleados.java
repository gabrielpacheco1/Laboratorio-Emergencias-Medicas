
package emergencias_medicas;


public abstract class Empleados extends Persona {
    
    private Integer codigo;
    
    
    public Empleados(String nombre,String apellido,String dni,/*Integer dia,Integer mes,Integer año,*/String direccion,Integer telefono,String sexo,Integer codigo){
        super(nombre,apellido,dni,direccion,telefono,sexo);

        this.codigo=codigo;
           
    }


    /**
     * @return the codigo
     */
    public Integer getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    
    
}
