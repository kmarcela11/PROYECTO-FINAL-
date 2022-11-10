
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Valentina Bustamante
 */
public class TableroPrueba extends javax.swing.JFrame {
    public TableroPrueba() {
        initComponents();
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tablero = new javax.swing.JPanel();
        GenerarTablero = new javax.swing.JButton();
        dificultad = new javax.swing.JTextField();
        filas = new javax.swing.JTextField();
        columnas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tablero.setBackground(new java.awt.Color(204, 204, 204));
        Tablero.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Tablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 800, 500));

        GenerarTablero.setText("Pintar ");
        GenerarTablero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarTableroActionPerformed(evt);
            }
        });
        getContentPane().add(GenerarTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, -1));

        dificultad.setText("jTextField1");
        dificultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dificultadActionPerformed(evt);
            }
        });
        getContentPane().add(dificultad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, 50));

        filas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filasActionPerformed(evt);
            }
        });
        getContentPane().add(filas, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, 100, -1));

        columnas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                columnasActionPerformed(evt);
            }
        });
        getContentPane().add(columnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, 100, -1));

        jLabel1.setText("n");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, -1, -1));

        jLabel2.setText("m");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GenerarTableroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarTableroActionPerformed
        Graphics t = Tablero.getGraphics();

        int n = Integer.parseInt(filas.getText());
        int m = Integer.parseInt(columnas.getText());
        int ancho = 800/m;
        int alto = 500/n;

        int mt[][] = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) { 
                Random r = new Random();
                mt[i][j] = r.nextInt(2) + 1; // Genera el número aleatorio de 0 a 4 (en este caso, el límite varía según la dificultad).

                if (mt[i][j] == 1) {
                    t.setColor(Color.black); //Si se bloquea
                } else {
                    t.setColor(Color.white); // Ta libre :p
                }
                t.fillRect(ancho * j, alto * i, ancho, alto); //Se va moviendo por el código pintando cuadrito x cuadrito.

                t.setColor(Color.black);
                t.drawLine(j * ancho, 0, j * ancho, alto * ancho);
                t.drawLine(0, i*alto, m*ancho, i*alto);
            }
        }
    }//GEN-LAST:event_GenerarTableroActionPerformed

    private void dificultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dificultadActionPerformed

    }//GEN-LAST:event_dificultadActionPerformed

    private void columnasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_columnasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_columnasActionPerformed

    private void filasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filasActionPerformed

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
            java.util.logging.Logger.getLogger(TableroPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableroPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableroPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableroPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableroPrueba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GenerarTablero;
    private javax.swing.JPanel Tablero;
    private javax.swing.JTextField columnas;
    private javax.swing.JTextField dificultad;
    private javax.swing.JTextField filas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
