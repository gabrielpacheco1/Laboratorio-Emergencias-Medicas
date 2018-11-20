/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emergencias_medicas.ui;

import emergencias_medicas.Afiliado;
import emergencias_medicas.GrupoFamiliar;
import emergencias_medicas.Gestor;
import emergencias_medicas.Persona;
import emergencias_medicas.ui.BuscarAfiliado;
import excepciones.CamposIncompletosExcepcion;
import excepciones.ObjExistenteExcepcion;
import javax.swing.JOptionPane;
import java.awt.Frame;

/**
 *
 * @author Carlos Mansilla
 */
public class AltaFamilia extends javax.swing.JInternalFrame {

    private Gestor gestor;
    private Frame principal;
    
    /**
     * Creates new form AltaFamilia
     */
    public AltaFamilia() {
        initComponents();
    }

    public AltaFamilia(Frame principal,Gestor gestor) {
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
        botonBuscar = new javax.swing.JButton();
        txtAfiliado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        botonAceptar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Afiliado");

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        txtAfiliado.setEnabled(false);

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("DNI");

        jLabel5.setText("Sexo");

        jLabel6.setText("Telefono");

        jLabel7.setText("Direccion");

        botonAceptar.setText("Aceptar");
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonAceptar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(txtAfiliado, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addComponent(botonBuscar)
                        .addGap(51, 51, 51))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre)
                            .addComponent(txtApellido)
                            .addComponent(txtDNI)
                            .addComponent(txtSexo)
                            .addComponent(txtTelefono)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtAfiliado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botonAceptar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        BuscarAfiliado buscar = new BuscarAfiliado(principal, true, this.txtAfiliado, gestor);
        buscar.setVisible(true);
        this.setNombreFamilia();
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        String documento=txtAfiliado.getText();
        
        try{
            for (int i = 0; i < gestor.getPersonas().size(); i++)
            {
                Persona persona=(Persona) gestor.getPersonas().get(i);
               // if(persona instanceof Afiliado){   
                if(persona.getDni().equals(documento)){
                    Afiliado afi=(Afiliado) gestor.getPersonas().get(i);
                    GrupoFamiliar familia = new GrupoFamiliar(txtNombre.getText(),txtApellido.getText(),txtDNI.getText(),
                    txtDireccion.getText(),Integer.decode(txtTelefono.getText()), txtSexo.getText(),afi);
                    gestor.agregarPersona (familia);
                    afi.setCantidadGrupoFamiliar(afi.getCantidadGrupoFamiliar()+1);
                    JOptionPane.showMessageDialog(rootPane, "Se agregó correctamente");
                }
                if(documento.equals(""))
                    JOptionPane.showMessageDialog(rootPane, "No seleccionó afiliado");
                this.dispose();
            } 
            //this.dispose();
            //gestor.agregarPersona (familia);
        }catch(CamposIncompletosExcepcion e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "Alerta",0);
        }catch(ObjExistenteExcepcion ex){
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Alerta",0);
        }catch (java.lang.NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Error en el formato del telefono\n\nIngrese un telefono válido", "Alerta",0);            
        }
        
    }//GEN-LAST:event_botonAceptarActionPerformed

    private void setNombreFamilia() {
        Afiliado familia=null;
        //try {
            familia = (Afiliado)gestor.getPersona(this.txtAfiliado.getText().trim());
        /*} catch (InexistenteExcepcion ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Alerta", 0);
        } catch (DataAccessException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Alerta", 0);
        } finally {
            this.jLabel2.setText((cuenta!=null)?cuenta.getNombre():"Cuenta Inexistente");
        }*/
        //this.jLabel2.setText(String.valueOf(familia.getDni()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtAfiliado;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
