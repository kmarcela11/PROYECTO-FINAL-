import java.awt.event.KeyEvent;
import java.io.IOException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;

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
        advertencia.setVisible(false);
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

        advertencia = new javax.swing.JLabel();
        salirbt = new javax.swing.JLabel();
        tf_filas = new javax.swing.JTextField();
        tf_columnas = new javax.swing.JTextField();
        level_bt1 = new javax.swing.JLabel();
        level_bt2 = new javax.swing.JLabel();
        level_bt3 = new javax.swing.JLabel();
        levelsbg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        advertencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/advertenciacampo.png"))); // NOI18N
        getContentPane().add(advertencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 460, 30));

        salirbt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/salirbt.png"))); // NOI18N
        salirbt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        salirbt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirbtMouseClicked(evt);
            }
        });
        getContentPane().add(salirbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 650, 180, 50));

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
        getContentPane().add(tf_filas, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 230, -1));

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
        tf_columnas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_columnasKeyTyped(evt);
            }
        });
        getContentPane().add(tf_columnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, 230, -1));

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

        level_bt3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/level3_selbt.png"))); // NOI18N
        level_bt3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        level_bt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                level_bt3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                level_bt3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                level_bt3MouseExited(evt);
            }
        });
        getContentPane().add(level_bt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, 350, 70));

        levelsbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/levelsbg.png"))); // NOI18N
        levelsbg.setText("v");
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

    private void level_bt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_level_bt1MouseClicked
        try{
            n = Integer.parseInt(tf_filas.getText());
            /*toma cantidad de filas del textfield*/
            m = Integer.parseInt(tf_columnas.getText());
            /*toma cantidad de columnas del textfield*/
            if (((n >= 8) && (n <= 100)) && ((m >= 16) && (m <= 100))) {
                NIVEL1 abrir = new NIVEL1();
                this.setVisible(false);
                abrir.setVisible(true);

            } else {
                tf_filas.setText("Mayor que 8");
                tf_columnas.setText("Mayor que 16");
            }
        }catch(Exception e){
            advertencia.setVisible(true);
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

    private void tf_filasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_filasMouseClicked
        tf_filas.setText("");
    }//GEN-LAST:event_tf_filasMouseClicked

    private void tf_columnasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_columnasMouseClicked
        tf_columnas.setText("");
    }//GEN-LAST:event_tf_columnasMouseClicked

    private void level_bt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_level_bt2MouseClicked

        try{
            n = Integer.parseInt(tf_filas.getText());
            /*toma cantidad de filas del textfield*/
            m = Integer.parseInt(tf_columnas.getText());
            /*toma cantidad de columnas del textfield*/
            if (((n >= 8) && (n <= 100)) && ((m >= 16) && (m <= 100))) {
                NIVEL1 abrir = new NIVEL1();
                this.setVisible(false);
                abrir.setVisible(true);

            } else {
                tf_filas.setText("Mayor que 8");
                tf_columnas.setText("Mayor que 16");
            }
        }catch(Exception e){
            advertencia.setVisible(true);  
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
         try{
            n = Integer.parseInt(tf_filas.getText());
            /*toma cantidad de filas del textfield*/
            m = Integer.parseInt(tf_columnas.getText());
            /*toma cantidad de columnas del textfield*/
            if (((n >= 8) && (n <= 100)) && ((m >= 16) && (m <= 100))) {
                NIVEL1 abrir = new NIVEL1();
                this.setVisible(false);
                abrir.setVisible(true);

            } else {
                tf_filas.setText("Mayor que 8");
                tf_columnas.setText("Mayor que 16");
            }
        }catch(Exception e){
            advertencia.setVisible(true);
        }
    }//GEN-LAST:event_level_bt3MouseClicked

    private void level_bt3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_level_bt3MouseEntered
        ImageIcon im = new ImageIcon(getClass().getResource("/pfmedia/level3_selbtmouse.png"));
        level_bt3.setIcon(im);  
    }//GEN-LAST:event_level_bt3MouseEntered

    private void level_bt3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_level_bt3MouseExited
        ImageIcon im = new ImageIcon(getClass().getResource("/pfmedia/level3_selbt.png"));
        level_bt3.setIcon(im);
    }//GEN-LAST:event_level_bt3MouseExited

    private void salirbtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirbtMouseClicked
        HOMEE atras = new HOMEE();
        atras.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_salirbtMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FILCOL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel advertencia;
    private javax.swing.JLabel level_bt1;
    private javax.swing.JLabel level_bt2;
    private javax.swing.JLabel level_bt3;
    private javax.swing.JLabel levelsbg;
    private javax.swing.JLabel salirbt;
    private javax.swing.JTextField tf_columnas;
    private javax.swing.JTextField tf_filas;
    // End of variables declaration//GEN-END:variables
}
