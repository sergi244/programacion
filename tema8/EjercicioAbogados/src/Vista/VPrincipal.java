/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import ejercicioabogados.Controlador;

/**
 *
 * @author 1gdaw03
 */
public class VPrincipal extends javax.swing.JDialog {

    /**
     * Creates new form VPrincipal
     */
    public VPrincipal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public VPrincipal() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miAltaCliente = new javax.swing.JMenuItem();
        miBajaCliente = new javax.swing.JMenuItem();
        miModCliente = new javax.swing.JMenuItem();
        miConsultaCliente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        miAltaAbogado = new javax.swing.JMenuItem();
        miBajaAbogado = new javax.swing.JMenuItem();
        miModAbogado = new javax.swing.JMenuItem();
        miConsultaAbogado = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        miAltaCaso = new javax.swing.JMenuItem();
        miBajaCaso = new javax.swing.JMenuItem();
        miModCaso = new javax.swing.JMenuItem();
        miConsultaCaso = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        miSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jMenu1.setText("Cliente");

        miAltaCliente.setText("Alta");
        miAltaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAltaClienteActionPerformed(evt);
            }
        });
        jMenu1.add(miAltaCliente);

        miBajaCliente.setText("Baja");
        miBajaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBajaClienteActionPerformed(evt);
            }
        });
        jMenu1.add(miBajaCliente);

        miModCliente.setText("Modificacion");
        jMenu1.add(miModCliente);

        miConsultaCliente.setText("Consulta");
        jMenu1.add(miConsultaCliente);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Abogado");

        miAltaAbogado.setText("Alta");
        miAltaAbogado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAltaAbogadoActionPerformed(evt);
            }
        });
        jMenu2.add(miAltaAbogado);

        miBajaAbogado.setText("Baja");
        miBajaAbogado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBajaAbogadoActionPerformed(evt);
            }
        });
        jMenu2.add(miBajaAbogado);

        miModAbogado.setText("Modificacion");
        jMenu2.add(miModAbogado);

        miConsultaAbogado.setText("Consulta");
        jMenu2.add(miConsultaAbogado);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Caso");

        miAltaCaso.setText("Alta");
        jMenu3.add(miAltaCaso);

        miBajaCaso.setText("Baja");
        jMenu3.add(miBajaCaso);

        miModCaso.setText("Modificacion");
        jMenu3.add(miModCaso);

        miConsultaCaso.setText("consulta");
        jMenu3.add(miConsultaCaso);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Salir");

        miSalir.setText("Salir");
        miSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSalirActionPerformed(evt);
            }
        });
        jMenu4.add(miSalir);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 773, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 692, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSalirActionPerformed
        Controlador.Salir();
    }//GEN-LAST:event_miSalirActionPerformed

    private void miAltaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAltaClienteActionPerformed
        Controlador.AltaCliente();
    }//GEN-LAST:event_miAltaClienteActionPerformed

    private void miAltaAbogadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAltaAbogadoActionPerformed
        Controlador.AltaAbogado();
    }//GEN-LAST:event_miAltaAbogadoActionPerformed

    private void miBajaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBajaClienteActionPerformed
        Controlador.BajaCliente();
    }//GEN-LAST:event_miBajaClienteActionPerformed

    private void miBajaAbogadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBajaAbogadoActionPerformed
        Controlador.BajaAbogado();
    }//GEN-LAST:event_miBajaAbogadoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VPrincipal dialog = new VPrincipal(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem miAltaAbogado;
    private javax.swing.JMenuItem miAltaCaso;
    private javax.swing.JMenuItem miAltaCliente;
    private javax.swing.JMenuItem miBajaAbogado;
    private javax.swing.JMenuItem miBajaCaso;
    private javax.swing.JMenuItem miBajaCliente;
    private javax.swing.JMenuItem miConsultaAbogado;
    private javax.swing.JMenuItem miConsultaCaso;
    private javax.swing.JMenuItem miConsultaCliente;
    private javax.swing.JMenuItem miModAbogado;
    private javax.swing.JMenuItem miModCaso;
    private javax.swing.JMenuItem miModCliente;
    private javax.swing.JMenuItem miSalir;
    // End of variables declaration//GEN-END:variables
}
