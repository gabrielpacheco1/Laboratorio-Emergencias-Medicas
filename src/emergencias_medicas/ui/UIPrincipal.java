/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emergencias_medicas.ui;

import java.awt.Dimension;
import java.awt.Frame;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import emergencias_medicas.Movil;
import emergencias_medicas.Gestor;
import emergencias_medicas.Tarifa;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;

/**
 *
 * @author Carlos Mansilla
 */
public class UIPrincipal extends javax.swing.JFrame {
    
    private Gestor gestor;
    private Tarifa pago;

    /**
     * Creates new form UI_Principal
     */
    public UIPrincipal(Gestor gestor) {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        altaAfiliado = new javax.swing.JMenuItem();
        altaFamilia = new javax.swing.JMenuItem();
        altaMovil = new javax.swing.JMenuItem();
        altaEmpleado = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        bajaAfiliado = new javax.swing.JMenuItem();
        bajaMovil = new javax.swing.JMenuItem();
        bajaEmpleado = new javax.swing.JMenuItem();
        mItmAltaSolicitud = new javax.swing.JMenu();
        Solicitud = new javax.swing.JMenuItem();
        finSolicitud = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Pago = new javax.swing.JMenuItem();
        mItmPagoOriginal = new javax.swing.JMenuItem();
        mItmPagos = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        listaMoviles = new javax.swing.JMenuItem();
        listaSolicitud = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 719, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );

        jMenu1.setText("Administraccion");

        jMenu4.setText("Alta");

        altaAfiliado.setText("Afiliado");
        altaAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaAfiliadoActionPerformed(evt);
            }
        });
        jMenu4.add(altaAfiliado);

        altaFamilia.setText("Familia de Afiliados");
        altaFamilia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaFamiliaActionPerformed(evt);
            }
        });
        jMenu4.add(altaFamilia);

        altaMovil.setText("Movil");
        altaMovil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaMovilActionPerformed(evt);
            }
        });
        jMenu4.add(altaMovil);

        altaEmpleado.setText("Empleado");
        altaEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaEmpleadoActionPerformed(evt);
            }
        });
        jMenu4.add(altaEmpleado);

        jMenu1.add(jMenu4);

        jMenu5.setText("Baja");

        bajaAfiliado.setText("Afiliado");
        bajaAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajaAfiliadoActionPerformed(evt);
            }
        });
        jMenu5.add(bajaAfiliado);

        bajaMovil.setText("Movil");
        bajaMovil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajaMovilActionPerformed(evt);
            }
        });
        jMenu5.add(bajaMovil);

        bajaEmpleado.setText("Empleado");
        bajaEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajaEmpleadoActionPerformed(evt);
            }
        });
        jMenu5.add(bajaEmpleado);

        jMenu1.add(jMenu5);

        jMenuBar1.add(jMenu1);

        mItmAltaSolicitud.setText("Solicitud de Asistencia");
        mItmAltaSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItmAltaSolicitudActionPerformed(evt);
            }
        });

        Solicitud.setText("Nueva");
        Solicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SolicitudActionPerformed(evt);
            }
        });
        mItmAltaSolicitud.add(Solicitud);

        finSolicitud.setText("Pendientes");
        finSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finSolicitudActionPerformed(evt);
            }
        });
        mItmAltaSolicitud.add(finSolicitud);

        jMenuBar1.add(mItmAltaSolicitud);

        jMenu2.setText("Pagos");

        Pago.setText("Establecer tarifa");
        Pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagoActionPerformed(evt);
            }
        });
        jMenu2.add(Pago);

        mItmPagoOriginal.setText("Realizar pago");
        mItmPagoOriginal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItmPagoOriginalActionPerformed(evt);
            }
        });
        jMenu2.add(mItmPagoOriginal);

        mItmPagos.setText("Lista de pagos");
        mItmPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItmPagosActionPerformed(evt);
            }
        });
        jMenu2.add(mItmPagos);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Lista");

        listaMoviles.setText("Moviles");
        listaMoviles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaMovilesActionPerformed(evt);
            }
        });
        jMenu3.add(listaMoviles);

        listaSolicitud.setText("Solicitudes");
        listaSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaSolicitudActionPerformed(evt);
            }
        });
        jMenu3.add(listaSolicitud);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void altaMovilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaMovilActionPerformed
        AltaMovil ventana = new AltaMovil(gestor);
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);              
        ventana.show();
    }//GEN-LAST:event_altaMovilActionPerformed

    private void PagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagoActionPerformed
        EstablecerBono ventana = new EstablecerBono(gestor);
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);              
        ventana.show();
    }//GEN-LAST:event_PagoActionPerformed

    private void altaAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaAfiliadoActionPerformed
        AltaAfiliado ventana= new AltaAfiliado(gestor);
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);              
        ventana.show();
    }//GEN-LAST:event_altaAfiliadoActionPerformed

    private void bajaMovilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajaMovilActionPerformed
        BajaMovil ventana= new BajaMovil(this,gestor);
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);              
        ventana.show();
    }//GEN-LAST:event_bajaMovilActionPerformed

    private void altaEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaEmpleadoActionPerformed
        AltaEmpleado ventana= new AltaEmpleado(gestor);
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);              
        ventana.show();
    }//GEN-LAST:event_altaEmpleadoActionPerformed

    private void bajaAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajaAfiliadoActionPerformed
        BajaAfiliado ventana= new BajaAfiliado(this,gestor);
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);              
        ventana.show();
    }//GEN-LAST:event_bajaAfiliadoActionPerformed

    private void mItmAltaSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItmAltaSolicitudActionPerformed
        
    }//GEN-LAST:event_mItmAltaSolicitudActionPerformed

    private void SolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SolicitudActionPerformed
        AltaSolicitud ventana= new AltaSolicitud(this,gestor);
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);              
        ventana.show();
    }//GEN-LAST:event_SolicitudActionPerformed

    private void listaMovilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaMovilesActionPerformed
        ListaMoviles ventana= new ListaMoviles(gestor);
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        ventana.show();
    }//GEN-LAST:event_listaMovilesActionPerformed

    private void altaFamiliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaFamiliaActionPerformed
        AltaFamilia ventana= new AltaFamilia(this,gestor);
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        ventana.show();
    }//GEN-LAST:event_altaFamiliaActionPerformed

    private void bajaEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajaEmpleadoActionPerformed
        BajaEmpleado ventana= new BajaEmpleado(this,gestor);
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        ventana.show();
    }//GEN-LAST:event_bajaEmpleadoActionPerformed

    private void finSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finSolicitudActionPerformed
        FinSolicitud ventana= new FinSolicitud(this,gestor);
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        ventana.show();
    }//GEN-LAST:event_finSolicitudActionPerformed

    private void listaSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaSolicitudActionPerformed
        ListaSolicitud ventana= new ListaSolicitud(gestor);
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        ventana.show();
    }//GEN-LAST:event_listaSolicitudActionPerformed

    private void mItmPagoOriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItmPagoOriginalActionPerformed
        EstablecerPago ventana = new EstablecerPago(gestor);
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);              
        ventana.show();
    }//GEN-LAST:event_mItmPagoOriginalActionPerformed

    private void mItmPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItmPagosActionPerformed
        MostrarPagos ventana = new MostrarPagos(this, gestor);
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);              
        ventana.show();
    }//GEN-LAST:event_mItmPagosActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Pago;
    private javax.swing.JMenuItem Solicitud;
    private javax.swing.JMenuItem altaAfiliado;
    private javax.swing.JMenuItem altaEmpleado;
    private javax.swing.JMenuItem altaFamilia;
    private javax.swing.JMenuItem altaMovil;
    private javax.swing.JMenuItem bajaAfiliado;
    private javax.swing.JMenuItem bajaEmpleado;
    private javax.swing.JMenuItem bajaMovil;
    private javax.swing.JMenuItem finSolicitud;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem listaMoviles;
    private javax.swing.JMenuItem listaSolicitud;
    private javax.swing.JMenu mItmAltaSolicitud;
    private javax.swing.JMenuItem mItmPagoOriginal;
    private javax.swing.JMenuItem mItmPagos;
    // End of variables declaration//GEN-END:variables

    public JDesktopPane getJDesktopPane1() {
        return jDesktopPane1;
    }


}
