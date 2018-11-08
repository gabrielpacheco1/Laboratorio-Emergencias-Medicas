
package excepciones;

public class CamposIncompletosExcepcion extends RuntimeException {
    public CamposIncompletosExcepcion(String mensaje){
        super(mensaje);
    }
}
