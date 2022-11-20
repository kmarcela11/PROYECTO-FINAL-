
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
        USUARIO enviar = new USUARIO();
        tf_nombre.setText(enviar.nombre);
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
        tf_nombre = new javax.swing.JTextField();
        level1_bt = new javax.swing.JLabel();
        levelsbg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_filas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tf_filas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_filasKeyTyped(evt);
            }
        });
        getContentPane().add(tf_filas, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, 140, -1));

        tf_columnas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tf_columnas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_columnasKeyTyped(evt);
            }
        });
        getContentPane().add(tf_columnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 230, 140, -1));

        b_musica.setText("MUSIC ON");
        b_musica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_musicaActionPerformed(evt);
            }
        });
        getContentPane().add(b_musica, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 220, -1, -1));

        b_nomusica.setText("MUSIC OFF");
        b_nomusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_nomusicaActionPerformed(evt);
            }
        });
        getContentPane().add(b_nomusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 310, -1, -1));

        tf_nombre.setEditable(false);
        getContentPane().add(tf_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 90, 170, 34));

        level1_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/level1_selbt.png"))); // NOI18N
        level1_bt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        level1_bt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                level1_btMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                level1_btMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                level1_btMouseExited(evt);
            }
        });
        getContentPane().add(level1_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 310, 70));

        levelsbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/levelsbg.png"))); // NOI18N
        getContentPane().add(levelsbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 720));

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
            mus("musica");
        }
    }//GEN-LAST:event_b_musicaActionPerformed

    private void b_nomusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_nomusicaActionPerformed
        reproducir = false;

        if (reproducir == false) {
            clip.stop();
        }    }//GEN-LAST:event_b_nomusicaActionPerformed

    private void level1_btMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_level1_btMouseClicked
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
    }//GEN-LAST:event_level1_btMouseClicked

    private void level1_btMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_level1_btMouseEntered
        ImageIcon im = new ImageIcon(getClass().getResource("/pfmedia/level1_selbtmouse.png"));
        level1_bt.setIcon(im);
    }//GEN-LAST:event_level1_btMouseEntered

    private void level1_btMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_level1_btMouseExited
        ImageIcon im = new ImageIcon(getClass().getResource("/pfmedia/level1_selbt.png"));
        level1_bt.setIcon(im);
    }//GEN-LAST:event_level1_btMouseExited

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
    private javax.swing.JLabel level1_bt;
    private javax.swing.JLabel levelsbg;
    private javax.swing.JTextField tf_columnas;
    private javax.swing.JTextField tf_filas;
    private javax.swing.JTextField tf_nombre;
    // End of variables declaration//GEN-END:variables
}
