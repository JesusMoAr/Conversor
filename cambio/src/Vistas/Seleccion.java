/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

/**
 *
 * @author Jesus
 */
public class Seleccion extends javax.swing.JFrame {

    /**
     * Creates new form Seleccion
     */
    public Seleccion() {
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
        Dolar = new javax.swing.JButton();
        Yen = new javax.swing.JButton();
        Euro = new javax.swing.JButton();
        Libra = new javax.swing.JButton();
        DolarC = new javax.swing.JButton();
        Historial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Selecciones tipo de cambio peso a..");

        Dolar.setText("Dolar");
        Dolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DolarActionPerformed(evt);
            }
        });

        Yen.setText("Yen");
        Yen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YenActionPerformed(evt);
            }
        });

        Euro.setText("Euro");
        Euro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EuroActionPerformed(evt);
            }
        });

        Libra.setText("Libra");
        Libra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LibraActionPerformed(evt);
            }
        });

        DolarC.setText("Dolar canadinece");
        DolarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DolarCActionPerformed(evt);
            }
        });

        Historial.setText("Historial");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Dolar)
                            .addComponent(Libra)
                            .addComponent(Yen)
                            .addComponent(Euro)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(DolarC))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(Historial)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(Dolar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(Euro)
                .addGap(18, 18, 18)
                .addComponent(Yen)
                .addGap(18, 18, 18)
                .addComponent(Libra)
                .addGap(18, 18, 18)
                .addComponent(DolarC)
                .addGap(18, 18, 18)
                .addComponent(Historial)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DolarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DolarCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DolarCActionPerformed

    private void LibraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LibraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LibraActionPerformed

    private void YenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YenActionPerformed

    private void EuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EuroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EuroActionPerformed

    private void DolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DolarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DolarActionPerformed

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
            java.util.logging.Logger.getLogger(Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Seleccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Dolar;
    public javax.swing.JButton DolarC;
    public javax.swing.JButton Euro;
    public javax.swing.JButton Historial;
    public javax.swing.JButton Libra;
    public javax.swing.JButton Yen;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
