
package emergencias_medicas.arrays;

import emergencias_medicas.Solicitud_Asistencia;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.ArrayList;
import emergencias_medicas.arrays.ArraySolicitudes;

public class TMSolicitud implements TableModel{
    
    
    
    private ArrayList solicitud;
    
    
    public TMSolicitud(ArrayList solicitud){
        this.solicitud=solicitud;
    }
    
    

    @Override
    public int getRowCount() {
        return solicitud.size();
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String titulo=null;
        
        switch(columnIndex){
            
            case 0:{
                titulo="Paciente";
                break;
            }
            case 1:{
                titulo="Familiar";
                break;
            }
            case 2:{
                titulo="Movil";
                break;
            }
            case 3:{
                titulo="Chofer";
                break;
            }
            case 4:{
                titulo="Doctor";
                break;
            }
            case 5:{
                titulo="Enfermero";
                break;
            }
            case 6:{
                titulo="Diagnostico";
                break;
            }
            case 7:{
                titulo="Fecha";
                break;
            }
            case 8:{
                titulo="Numero de Orden";
                break;
            }
            
        }
        
        return titulo;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        Class clase=String.class;
        //clase=Object.class;
        switch(columnIndex){
            
            case 0:{
                clase=Object.class;
                break;
                
            }
            case 1:{
                clase=Object.class;
                break;
            }
            case 2:{
                clase=Object.class;
                break;
            }
            case 3:{
                clase=Object.class;
                break;
            }
            case 4:{
                clase=Object.class;
                break;
            }
            case 5:{
                clase=Object.class;
                break;
            }
            case 6:{
                clase=String.class;
                break;
            }
            case 7:{
                clase=Object.class;
                break;
            }
            case 8:{
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
        Solicitud_Asistencia m = (Solicitud_Asistencia) solicitud.get(rowIndex);
        Object valor=null;
        
        switch(columnIndex){
            
            case 0:{
                valor = m.getPaciente();
                break;
                
            }
            case 1:{
                valor = m.getGfPaciente();
                break;
            }
            case 2:{
                valor = m.getMovil();
                break;
            }
            case 3:{
                valor = m.getChofer();
                break;
            }
            case 4:{
                valor = m.getDoctor();
                break;
            }
            case 5:{
                valor = m.getEnfermero();
                break;
            }
            case 6:{
                valor = m.getResultado();
                break;
            }
            case 7:{
                valor = m.getFecha();
                break;
            }
            case 8:{
                valor = m.getNroOrden();
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
