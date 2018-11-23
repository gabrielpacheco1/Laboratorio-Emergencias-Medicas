
package emergencias_medicas;

import excepciones.TarifaNoEstablecidaExcepcion;


public class Tarifa {
    
    private Float bonoAfi=0f;
    private Float bonoFamilia=0f;
    
    public Tarifa(){} 
    
    public Tarifa(Float bonoAfi,Float bonoFamilia){
        
        this.bonoAfi=bonoAfi;
        this.bonoFamilia=bonoFamilia;
    }

    public Float calcularPagoDeAltaAfiliado(){
        return bonoAfi;
    }
    
    public Float calcularPagoDeAltaFamilia(){
        return bonoFamilia;
    }
    
    public Float calcularPago(Afiliado afi) throws TarifaNoEstablecidaExcepcion{
        Float pago;
        int nroGrupoF = afi.getCantidadGrupoFamiliar();
        if(bonoAfi==0f || bonoFamilia==0f){
            throw new TarifaNoEstablecidaExcepcion("Tarifa no establecida");
        }
 
        pago=(bonoAfi+(bonoFamilia*nroGrupoF));
        return pago;
    }
    
    /**
     * @return the bonoAfi
     */
    public Float getBonoAfi() {
        return bonoAfi;
    }

    /**
     * @param bonoAfi the bonoAfi to set
     */
    public void setBonoAfi(Float bonoAfi) {
        this.bonoAfi = bonoAfi;
    }

    /**
     * @return the bonoFamilia
     */
    public Float getBonoFamilia() {
        return bonoFamilia;
    }

    /**
     * @param bonoFamilia the bonoFamilia to set
     */
    public void setBonoFamilia(Float bonoFamilia) {
        this.bonoFamilia = bonoFamilia;
    }
    
}
