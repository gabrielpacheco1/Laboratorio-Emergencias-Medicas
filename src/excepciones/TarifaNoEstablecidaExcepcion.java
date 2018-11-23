
package excepciones;

public class TarifaNoEstablecidaExcepcion extends RuntimeException {
    public TarifaNoEstablecidaExcepcion (String mensaje){
        super(mensaje);
    }
}
