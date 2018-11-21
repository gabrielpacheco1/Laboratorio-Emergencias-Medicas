
package emergencias_medicas;

import excepciones.CamposIncompletosExcepcion;

public class GrupoFamiliar extends Persona{
    
    private Afiliado afiliado;
    private static String tipo= "Familia";
    
    public GrupoFamiliar(String nombre, String apellido, String documento, String direccion, Integer telefono,
            String sexo, Afiliado afiliado){
        super(nombre,apellido,documento,direccion,telefono,sexo);
        if(afiliado==null){ 
            throw new CamposIncompletosExcepcion("No rellenó todos los campos");
        }
            this.afiliado=afiliado;
    }
    
    public String toString(){
        
        return ("Nombre: "+getNombre()+" "+getApellido()+". DNI: "+getDni()+". Direccion: "+getDireccion()+
                ". Telefono: "+getTelefono());
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

    /**
     * @return the tipo
     */
    public static String getTipo() {
        return tipo;
    }

    /**
     * @param aTipo the tipo to set
     */
    public static void setTipo(String aTipo) {
        tipo = aTipo;
    }
    
}
