
package emergencias_medicas.arrays;

import emergencias_medicas.Gestor;
import emergencias_medicas.Movil;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.ArrayList;
import emergencias_medicas.arrays.ArrayMovil;


public class TMMoviles implements TableModel{
    
    
    private ArrayList moviles;
    
    
    public TMMoviles(ArrayList moviles){
        this.moviles=moviles;
    }

    

    @Override
    public int getRowCount() {
        return moviles.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String titulo=null;
        
        switch(columnIndex){
            
            case 0:{
                titulo="Marca";
                break;
            }
            case 1:{
                titulo="Modelo";
                break;
            }
            case 2:{
                titulo="Año";
                break;
            }
            case 3:{
                titulo="Patente";
                break;
            }
            
        }
        
        return titulo;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        
        
        Class clase=String.class;
        switch(columnIndex){
            
            case 0:{
                clase=String.class;
                break;
                
            }
            case 1:{
                clase=String.class;
                break;
            }
            case 2:{
                clase=Integer.class;
                break;
            }
            case 3:{
                clase=String.class;
                break;
            }
            
        }
        
        return clase;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Movil m = (Movil) moviles.get(rowIndex);
        Object valor=null;
        
        switch(columnIndex){
            
            case 0:{
                valor = m.getMarca();
                break;
                
            }
            case 1:{
                valor = m.getModelo();
                break;
            }
            case 2:{
                valor = m.getAño();
                break;
            }
            case 3:{
                valor = m.getPatente();
                break;
            }
            
        }
        
        return valor;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        //
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        //
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        //
    }
    
    
    
}
