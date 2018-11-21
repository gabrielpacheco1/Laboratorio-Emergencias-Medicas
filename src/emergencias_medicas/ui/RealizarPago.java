
package emergencias_medicas.ui;

import emergencias_medicas.Afiliado;
import emergencias_medicas.Gestor;
import emergencias_medicas.Pago;
import emergencias_medicas.Persona;
import java.awt.Frame;
import java.util.Calendar;


public class RealizarPago extends javax.swing.JInternalFrame {

    private Gestor gestor;
    private Frame principal;
    private Afiliado afiliado;
    private Pago pago;
    /**
     * Creates new form EstablecerPago
     */
    public RealizarPago(Gestor gestor) {
        this.gestor=gestor;
        initComponents();
                                                    
//        Integer dia= Integer.decode(this.txtDia.getText());
//        Integer mes= Integer.decode(this.txtMes.getText());
//        Integer año= Integer.decode(this.txtAño.getText());
//        
//        this.afiliado.setNombre(this.jTextField1.getText()); 
//        
//        if(dia>31){
//            JOptionPane.showMessageDialog(rootPane, "Error en el numero ingresado");
//        }    
//        else if ((dia>30&&(mes==4||mes==6||mes==9||mes==11))||(dia>28&&mes==2)){
//            JOptionPane.showMessageDialog(rootPane, "Error en el numero ingresado");
//        }
//        else{
            //Calendar cal = Calendar.getInstance();
        
            //DateFormat formato= new SimpleDateFormat("yyyy-MM-dd");
        
            //String fecha = formato.format(cal.getTime());
        
//            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        
//
//        try{
//            Date fechaPago= dateFormat.parse(this.txtAño.getText()+"-"+this.txtMes.getText()+"_"+this.txtDia.getText());
//            this.afiliado.setFechaUltPago(fechaPago);
//            
//            
//        }catch(ParseException e){
//            JOptionPane.showMessageDialog(rootPane, "Fecha no establecida");
//        };
        

        //this.afiliado.setNombre(this.jTextField1.getText());
      //  Calendar cal = Calendar.getInstance();
        //this.afiliado.setFechaUltPago(cal);
        //this.dispose();
        
//        DateFormat formato= new SimpleDateFormat("yyyy-MM-dd");
//        
//        String fecha = formato.format(cal.getTime());
//        
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        
//        System.out.println("Dia elegido :" + cal.get(Calendar.DAY_OF_MONTH));
        
        
            
//        }
        
    
  }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        botonAceptar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        botonVer = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setText("Documento");

        txtDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocumentoActionPerformed(evt);
            }
        });

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        botonAceptar.setText("Aceptar");
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });

        jLabel3.setText("Total a pagar:");

        botonVer.setText("Ver");
        botonVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonAceptar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(61, 61, 61)
                                .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonVer)
                    .addComponent(botonBuscar))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar))
                .addGap(34, 34, 34)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonVer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(botonAceptar)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocumentoActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        BuscarAfiliado buscar = new BuscarAfiliado(principal, true, this.txtDocumento, gestor);
        buscar.setVisible(true);
        this.setNombreAfiliado();
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        String documento= txtDocumento.getText();
        Calendar cal = Calendar.getInstance();
        for (int i = 0; i < gestor.getPersonas().size(); i++)
        {
            Persona persona=(Persona) gestor.getPersonas().get(i);
            if(persona instanceof Afiliado){
                if(persona.getDni().equals(documento)){
                    Afiliado afi=(Afiliado) gestor.getPersonas().get(i);
                    afi.setFechaUltPago(cal);
                }
            }
        }    
        this.dispose();

    }//GEN-LAST:event_botonAceptarActionPerformed

    private void botonVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerActionPerformed
        String documento= txtDocumento.getText();
        for (int i = 0; i < gestor.getPersonas().size(); i++)
        {
            Persona persona=(Persona) gestor.getPersonas().get(i);
            if(persona instanceof Afiliado){
                if(persona.getDni().equals(documento)){
                    Afiliado afi=(Afiliado) gestor.getPersonas().get(i);
                    int bono=gestor.pago(pago.getBonoAfi(), pago.getBonoFamilia(), documento);
                    this.jLabel3.setText(String.valueOf(bono));
                }
            }
        }    
        
    }//GEN-LAST:event_botonVerActionPerformed

    
    private void setNombreAfiliado() {
        Afiliado afiliado=null;
        //try {
            afiliado = (Afiliado)gestor.getPersona(this.txtDocumento.getText().trim());
        /*} catch (InexistenteExcepcion ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Alerta", 0);
        } catch (DataAccessException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Alerta", 0);
        } finally {
            this.jLabel2.setText((cuenta!=null)?cuenta.getNombre():"Cuenta Inexistente");
        }*/
        this.jLabel2.setText(String.valueOf(afiliado.getDni()));
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonVer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtDocumento;
    // End of variables declaration//GEN-END:variables
}
