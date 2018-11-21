
package emergencias_medicas;


public class Pago {
    
    private Integer bonoAfi;
    private Integer bonoFamilia;
    
    
    public Pago(int bonoAfi,int bonoFamilia){
        
        this.bonoAfi=bonoAfi;
        this.bonoFamilia=bonoFamilia;
    }

    /**
     * @return the bonoAfi
     */
    public Integer getBonoAfi() {
        return bonoAfi;
    }

    /**
     * @param bonoAfi the bonoAfi to set
     */
    public void setBonoAfi(Integer bonoAfi) {
        this.bonoAfi = bonoAfi;
    }

    /**
     * @return the bonoFamilia
     */
    public Integer getBonoFamilia() {
        return bonoFamilia;
    }

    /**
     * @param bonoFamilia the bonoFamilia to set
     */
    public void setBonoFamilia(Integer bonoFamilia) {
        this.bonoFamilia = bonoFamilia;
    }

    
    
    
    
}
