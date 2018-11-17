
package emergencias_medicas;

public class GrupoFamiliar extends Persona{
    
    private Afiliado afiliado;
    
    public GrupoFamiliar(String nombre, String apellido, String documento, String direccion, Integer telefono,String sexo){
        super(nombre,apellido,documento,direccion,telefono,sexo);
        
    }

    /**
     * @return the afiliado
     */
    public Afiliado getAfiliado() {
        return afiliado;
    }

    /**
     * @param afiliado the afiliado to set
     */
    public void setAfiliado(Afiliado afiliado) {
        this.afiliado = afiliado;
    }
    
}
