
package emergencias_medicas;

import excepciones.CamposIncompletosExcepcion;

public class Movil {
    private String marca;
    private String modelo;
    private Integer año;
    private String patente;
    private String estado;
    
    
    public Movil(String marca,String modelo,Integer año,String patente)throws CamposIncompletosExcepcion{
        if(marca.equals("")||modelo.equals("")||patente.equals("")){
            throw new CamposIncompletosExcepcion("No rellenó todos los campos");
        }
        
        this.marca=marca;
        this.modelo=modelo;
        this.año=año;
        this.patente=patente;
        this.estado="Libre";        
    }
    

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the año
     */
    public int getAño() {
        return año;
    }

    /**
     * @param año the año to set
     */
    public void setAño(Integer año) {
        this.año = año;
    }

    /**
     * @return the patente
     */
    public String getPatente() {
        return patente;
    }

    /**
     * @param patente the patente to set
     */
    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String toString(){
        
        return (marca+" "+modelo+". Patente: "+patente);
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
