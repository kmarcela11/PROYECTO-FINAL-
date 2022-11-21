
import java.awt.event.KeyEvent;
import java.io.IOException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class FILCOL extends javax.swing.JFrame {

    public Clip clip;
    /*sonido*/
    public String link = "/sonido/";

    /*paquete en donde se encuentra la música*/
    public FILCOL() {
        initComponents();
        this.setLocationRelativeTo(null);
        tf_filas.setOpaque(false);
        tf_columnas.setOpaque(false);
    }

    public void mus(String archivo) {
        /*código para la pista musical*/
        try {
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(link + archivo + ".wav")));
            clip.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {

        }
    }
    public static int n, m;
    boolean reproducir = false;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_niveles = new javax.swing.ButtonGroup();
        tf_filas = new javax.swing.JTextField();
        tf_columnas = new javax.swing.JTextField();
        b_musica = new javax.swing.JButton();
        b_nomusica = new javax.swing.JButton();
        level_bt1 = new javax.swing.JLabel();
        level_bt2 = new javax.swing.JLabel();
        levelsbg = new javax.swing.JLabel();
        level_bt3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_filas.setBackground(new java.awt.Color(102, 102, 102));
        tf_filas.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        tf_filas.setForeground(new java.awt.Color(255, 255, 255));
        tf_filas.setText("Llenar aquí");
        tf_filas.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        tf_filas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_filasMouseClicked(evt);
            }
        });
        tf_filas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_filasKeyTyped(evt);
            }
        });
        getContentPane().add(tf_filas, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 150, -1));

        tf_columnas.setBackground(new java.awt.Color(102, 102, 102));
        tf_columnas.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        tf_columnas.setForeground(new java.awt.Color(255, 255, 255));
        tf_columnas.setText("Llenar aquí");
        tf_columnas.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        tf_columnas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_columnasMouseClicked(evt);
            }
        });
        tf_columnas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_columnasActionPerformed(evt);
            }
        });
        tf_columnas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_columnasKeyTyped(evt);
            }
        });
        getContentPane().add(tf_columnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, 150, -1));

        b_musica.setText("MUSIC ON");
        b_musica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_musicaActionPerformed(evt);
            }
        });
        getContentPane().add(b_musica, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        b_nomusica.setText("MUSIC OFF");
        b_nomusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_nomusicaActionPerformed(evt);
            }
        });
        getContentPane().add(b_nomusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        level_bt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/level1_selbt.png"))); // NOI18N
        level_bt1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        level_bt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                level_bt1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                level_bt1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                level_bt1MouseExited(evt);
            }
        });
        getContentPane().add(level_bt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 310, 70));

        level_bt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/level2_selbt.png"))); // NOI18N
        level_bt2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        level_bt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                level_bt2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                level_bt2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                level_bt2MouseExited(evt);
            }
        });
        getContentPane().add(level_bt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 310, 70));

        levelsbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/levelsbg.png"))); // NOI18N
        levelsbg.setText("v");
        getContentPane().add(levelsbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 720));

        level_bt3.setText("nivel3");
        level_bt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                level_bt3MouseClicked(evt);
            }
        });
        getContentPane().add(level_bt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, 260, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_columnasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_columnasKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c != KeyEvent.VK_BACK_SPACE) && (c != '.' || tf_columnas.getText().contains(".")))
            evt.consume();
    }//GEN-LAST:event_tf_columnasKeyTyped

    private void tf_filasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_filasKeyTyped
        char f = evt.getKeyChar();
        if ((f < '0' || f > '9') && (f != KeyEvent.VK_BACK_SPACE) && (f != '.' || tf_filas.getText().contains(".")))
            evt.consume();
    }//GEN-LAST:event_tf_filasKeyTyped

    private void b_musicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_musicaActionPerformed
        reproducir = true;
        if (reproducir == true) {
            mus("Musica");
        }
    }//GEN-LAST:event_b_musicaActionPerformed

    private void b_nomusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_nomusicaActionPerformed
        reproducir = false;

        if (reproducir == false) {
            clip.stop();
        }    }//GEN-LAST:event_b_nomusicaActionPerformed

    private void level_bt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_level_bt1MouseClicked
     if (tf_filas.getText().equals("") || tf_columnas.getText().equals("")) { //validación texto vacio 
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR LOS DOS DATOS (N y M )");
        } else {
            n = Integer.parseInt(tf_filas.getText());
            /*toma cantidad de filas del textfield*/
            m = Integer.parseInt(tf_columnas.getText());
            /*toma cantidad de columnas del textfield*/
            if (((n >= 8) && (n <= 100)) && ((m >= 16) && (m <= 100))) {
                NIVEL1 abrir = new NIVEL1();
                this.setVisible(false);
                abrir.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "el número de filas debe ser mayor o igual a 8 y menor o igual a 100. \n"
                        + "el número de columnas debe ser mayor o igual a 16 y menor o igual a 100");

            }
        }
    }//GEN-LAST:event_level_bt1MouseClicked

    private void level_bt1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_level_bt1MouseEntered
        ImageIcon im = new ImageIcon(getClass().getResource("/pfmedia/level1_selbtmouse.png"));
        level_bt1.setIcon(im);
    }//GEN-LAST:event_level_bt1MouseEntered

    private void level_bt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_level_bt1MouseExited
        ImageIcon im = new ImageIcon(getClass().getResource("/pfmedia/level1_selbt.png"));
        level_bt1.setIcon(im);
    }//GEN-LAST:event_level_bt1MouseExited

    private void tf_columnasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_columnasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_columnasActionPerformed

    private void tf_filasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_filasMouseClicked
        tf_filas.setText("");
    }//GEN-LAST:event_tf_filasMouseClicked

    private void tf_columnasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_columnasMouseClicked
        tf_columnas.setText("");
    }//GEN-LAST:event_tf_columnasMouseClicked

    private void level_bt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_level_bt2MouseClicked

        if (tf_filas.getText().equals("") || tf_columnas.getText().equals("")) { //validación texto vacio 
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR LOS DOS DATOS (N y M )");
        } else {
            n = Integer.parseInt(tf_filas.getText());
            /*toma cantidad de filas del textfield*/
            m = Integer.parseInt(tf_columnas.getText());
            /*toma cantidad de columnas del textfield*/
            if (((n >= 8) && (n <= 100)) && ((m >= 16) && (m <= 100))) {
                NIVEL2 abrir = new NIVEL2();
                this.setVisible(false);
                abrir.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "el número de filas debe ser mayor o igual a 8 y menor o igual a 100. \n"
                        + "el número de columnas debe ser mayor o igual a 16 y menor o igual a 100");

            }
        }
    }//GEN-LAST:event_level_bt2MouseClicked

    private void level_bt2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_level_bt2MouseEntered
        ImageIcon im = new ImageIcon(getClass().getResource("/pfmedia/level2_selbtmouse.png"));
        level_bt2.setIcon(im);
    }//GEN-LAST:event_level_bt2MouseEntered

    private void level_bt2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_level_bt2MouseExited
        ImageIcon im = new ImageIcon(getClass().getResource("/pfmedia/level2_selbt.png"));
        level_bt2.setIcon(im);
    }//GEN-LAST:event_level_bt2MouseExited

    private void level_bt3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_level_bt3MouseClicked
         // TODO add your handling code here:
        if (tf_filas.getText().equals("") || tf_columnas.getText().equals("")) { //validación texto vacio 
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR LOS DOS DATOS (N y M )");
        } else {
            n = Integer.parseInt(tf_filas.getText());
            /*toma cantidad de filas del textfield*/
            m = Integer.parseInt(tf_columnas.getText());
            /*toma cantidad de columnas del textfield*/
            if (((n >= 8) && (n <= 100)) && ((m >= 16) && (m <= 100))) {
                NIVEL3 abrir = new NIVEL3();
                this.setVisible(false);
                abrir.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "el número de filas debe ser mayor o igual a 8 y menor o igual a 100. \n"
                        + "el número de columnas debe ser mayor o igual a 16 y menor o igual a 100");

            }
        }
    }//GEN-LAST:event_level_bt3MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FILCOL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_musica;
    private javax.swing.JButton b_nomusica;
    private javax.swing.ButtonGroup bg_niveles;
    private javax.swing.JLabel level_bt1;
    private javax.swing.JLabel level_bt2;
    private javax.swing.JLabel level_bt3;
    private javax.swing.JLabel levelsbg;
    private javax.swing.JTextField tf_columnas;
    private javax.swing.JTextField tf_filas;
    // End of variables declaration//GEN-END:variables
}
