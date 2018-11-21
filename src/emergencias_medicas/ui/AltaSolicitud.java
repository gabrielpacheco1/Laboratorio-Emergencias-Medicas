/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emergencias_medicas.ui;

import emergencias_medicas.Afiliado;
import emergencias_medicas.Chofer;
import emergencias_medicas.Doctor;
import emergencias_medicas.Enfermero;
import emergencias_medicas.Gestor;
import emergencias_medicas.GrupoFamiliar;
import emergencias_medicas.Movil;
import emergencias_medicas.Solicitud_Asistencia;
import excepciones.CamposIncompletosExcepcion;
import excepciones.ObjInexistenteExcepcion;
import java.awt.Frame;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class AltaSolicitud extends javax.swing.JInternalFrame {

    private Frame principal;
    private Gestor gestor;
    /**
     * Creates new form AltaSolicitud
     */
    public AltaSolicitud(Frame principal,Gestor gestor) {
        this.principal=principal;
        this.gestor=gestor;
        initComponents();
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
        jTextField1 = new javax.swing.JTextField();
        btnBuscarAfiliado = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnBuscarEmpleados = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        btnBuscarMovil = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtFamilia = new javax.swing.JTextField();
        btnBuscarGrupoFamiliar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtOrden = new javax.swing.JTextField();

        setClosable(true);

        jLabel1.setText("Afiliado DNI");

        btnBuscarAfiliado.setText("Buscar");
        btnBuscarAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAfiliadoActionPerformed(evt);
            }
        });

        jLabel2.setText("Doctor");

        jLabel3.setText("Enfermero");

        jLabel4.setText("Chofer");

        btnBuscarEmpleados.setText("Buscar");
        btnBuscarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEmpleadosActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel5.setText("Movil");

        btnBuscarMovil.setText("Buscar");
        btnBuscarMovil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarMovilActionPerformed(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jLabel6.setText("Grupo familiar");

        btnBuscarGrupoFamiliar.setText("Buscar");
        btnBuscarGrupoFamiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarGrupoFamiliarActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afiliado", "Grupo familiar" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Paciente");

        jLabel8.setText("Nro. Orden");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(btnAceptar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(71, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(55, 55, 55)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtOrden, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFamilia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBuscarEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscarMovil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscarAfiliado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscarGrupoFamiliar))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarAfiliado))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtFamilia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarGrupoFamiliar))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarEmpleados))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarMovil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(btnAceptar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        Calendar cal = Calendar.getInstance();
        Integer año= cal.get(Calendar.YEAR);
        Integer mes= cal.get(Calendar.MONTH);
        try{
            if(this.jComboBox1.getSelectedItem().equals("Afiliado")){
                Afiliado afi=(Afiliado)gestor.getPersona(this.jTextField1.getText());
                Doctor doc=(Doctor)gestor.getPersona(this.jTextField2.getText());
                Enfermero enf=(Enfermero)gestor.getPersona(this.jTextField3.getText());
                Chofer cho=(Chofer)gestor.getPersona(this.jTextField4.getText());
                Movil mov=(Movil)gestor.getMovil(this.jTextField5.getText());
                
                if(((año-afi.getFechaUltPago().get(Calendar.YEAR))==0) && ((mes - afi.getFechaUltPago().get(Calendar.MONTH))<=2)){
                    Solicitud_Asistencia solicitud= new Solicitud_Asistencia(afi,doc,enf,cho,mov,this.txtOrden.getText(),cal);
                    gestor.agregarSolicitud(solicitud);
                    doc.setEstado("Ocupado");
                    enf.setEstado("Ocupado");
                    cho.setEstado("Ocupado");
                    mov.setEstado("Ocupado");
                    this.dispose();
                }
                else
                    JOptionPane.showMessageDialog(rootPane, "Tiene una demora de mas de 2 meses en el pago", "Alerta",0);
            }
            else if(this.jComboBox1.getSelectedItem().equals("Grupo familiar")){
                GrupoFamiliar grupo=(GrupoFamiliar)gestor.getPersona(this.txtFamilia.getText());
                Doctor doc=(Doctor)gestor.getPersona(this.jTextField2.getText());
                Enfermero enf=(Enfermero)gestor.getPersona(this.jTextField3.getText());
                Chofer cho=(Chofer)gestor.getPersona(this.jTextField4.getText());
                Movil mov=(Movil)gestor.getMovil(this.jTextField5.getText());
                
                
                if(((año-grupo.getAfiliado().getFechaUltPago().get(Calendar.YEAR))==0) && ((mes - grupo.getAfiliado().getFechaUltPago().get(Calendar.MONTH))<=2)){
                    Solicitud_Asistencia solicitud= new Solicitud_Asistencia(grupo,doc,enf,cho,mov,this.txtOrden.getText(),cal);
                    gestor.agregarSolicitud(solicitud);
                    doc.setEstado("Ocupado");
                    enf.setEstado("Ocupado");
                    cho.setEstado("Ocupado");
                    mov.setEstado("Ocupado");
                    this.dispose();
                }
                else
                    JOptionPane.showMessageDialog(rootPane, "Tiene una demora de mas de 2 meses en el pago", "Alerta",0);
            }
        }catch (CamposIncompletosExcepcion e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "Alerta",0);
        }catch (ObjInexistenteExcepcion e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "Alerta",0);
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnBuscarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEmpleadosActionPerformed
        BuscarEmpleado buscar = new BuscarEmpleado(principal, true, this.jTextField2,this.jTextField3,this.jTextField4, gestor);
        buscar.setVisible(true);
        this.setNombreEmpleado();
    }//GEN-LAST:event_btnBuscarEmpleadosActionPerformed

    private void btnBuscarAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAfiliadoActionPerformed
        BuscarAfiliado buscar = new BuscarAfiliado(principal, true, this.jTextField1, gestor);
        buscar.setVisible(true);
        this.setNombreAfiliado();
    }//GEN-LAST:event_btnBuscarAfiliadoActionPerformed

    private void btnBuscarMovilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarMovilActionPerformed
        BuscarMovil buscar = new BuscarMovil(principal, true, this.jTextField5, gestor);
        buscar.setVisible(true);
        this.setNombrePatente();
    }//GEN-LAST:event_btnBuscarMovilActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void btnBuscarGrupoFamiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarGrupoFamiliarActionPerformed
       BuscarFamiliar buscar = new BuscarFamiliar(principal, true, this.txtFamilia, gestor);
       buscar.setVisible(true);
       this.setNombreFamiliar(); 
    }//GEN-LAST:event_btnBuscarGrupoFamiliarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

     private void setNombreEmpleado() {
        Doctor doc=null;
        try {
            doc = (Doctor)gestor.getPersona(this.jTextField2.getText().trim());
        }  catch (ObjInexistenteExcepcion ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Alerta", 0);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(rootPane, "No realizó selección", "Alerta", 0);
        }
        
        Enfermero enf=null;
        try {
            enf = (Enfermero)gestor.getPersona(this.jTextField3.getText().trim());
        }  catch (ObjInexistenteExcepcion ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Alerta", 0);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(rootPane, "No realizó selección", "Alerta", 0);
        }
        
        Chofer cho=null;
        try {
            cho = (Chofer)gestor.getPersona(this.jTextField4.getText().trim());
        }  catch (ObjInexistenteExcepcion ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Alerta", 0);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(rootPane, "No realizó selección", "Alerta", 0);
        }
    }
    
    private void setNombreAfiliado() {
        Afiliado afiliado=null;
        try {
            afiliado = (Afiliado)gestor.getPersona(this.jTextField1.getText().trim());
        }  catch (ObjInexistenteExcepcion ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Alerta", 0);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(rootPane, "No realizó selección", "Alerta", 0);
        }
    } 

    private void setNombrePatente(){
        Movil movil=null;
        try {
            movil = gestor.getMovil(this.jTextField5.getText().trim());
        }  catch (ObjInexistenteExcepcion ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Alerta", 0);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(rootPane, "No realizó selección", "Alerta", 0);
        }
    }
    
    private void setNombreFamiliar(){
        GrupoFamiliar familia=null;
        try {
            familia = (GrupoFamiliar) gestor.getPersona(this.txtFamilia.getText().trim());
        }  catch (ObjInexistenteExcepcion ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Alerta", 0);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(rootPane, "No realizó selección", "Alerta", 0);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBuscarAfiliado;
    private javax.swing.JButton btnBuscarEmpleados;
    private javax.swing.JButton btnBuscarGrupoFamiliar;
    private javax.swing.JButton btnBuscarMovil;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField txtFamilia;
    private javax.swing.JTextField txtOrden;
    // End of variables declaration//GEN-END:variables
}
