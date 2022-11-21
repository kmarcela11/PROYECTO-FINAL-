
import java.io.IOException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;

public class HOMEE extends javax.swing.JFrame {

    public HOMEE() {
        initComponents();
        this.setLocationRelativeTo(null);
        tf_nombre.setOpaque(false);

    }
    
      public Clip clip;
    /*sonido*/
    public String link = "/sonido/";

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

        b_musica = new javax.swing.JButton();
        b_nomusica = new javax.swing.JButton();
        tf_nombre = new javax.swing.JTextField();
        ayudabt = new javax.swing.JLabel();
        rankingbt = new javax.swing.JLabel();
        salirbt = new javax.swing.JLabel();
        gametitle = new javax.swing.JLabel();
        selectlevel_bt = new javax.swing.JLabel();
        bghome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b_musica.setText("MUSIC ON");
        b_musica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_musicaActionPerformed(evt);
            }
        });
        getContentPane().add(b_musica, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        b_nomusica.setText("MUSIC OFF");
        b_nomusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_nomusicaActionPerformed(evt);
            }
        });
        getContentPane().add(b_nomusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        tf_nombre.setBackground(new java.awt.Color(102, 102, 102));
        tf_nombre.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        tf_nombre.setForeground(new java.awt.Color(255, 255, 255));
        tf_nombre.setText("| JUGADOR");
        tf_nombre.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        tf_nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_nombreMouseClicked(evt);
            }
        });
        tf_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nombreActionPerformed(evt);
            }
        });
        tf_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_nombreKeyTyped(evt);
            }
        });
        getContentPane().add(tf_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 280, 320, -1));

        ayudabt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/ayudabt.png"))); // NOI18N
        ayudabt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ayudabt.setDisabledIcon(null);
        ayudabt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ayudabtMouseClicked(evt);
            }
        });
        getContentPane().add(ayudabt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 610, 180, 50));

        rankingbt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/rankingbt.png"))); // NOI18N
        rankingbt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rankingbt.setDisabledIcon(null);
        rankingbt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rankingbtMouseClicked(evt);
            }
        });
        getContentPane().add(rankingbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 620, 180, 50));

        salirbt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/salirbt.png"))); // NOI18N
        salirbt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        salirbt.setDisabledIcon(null);
        salirbt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirbtMouseClicked(evt);
            }
        });
        getContentPane().add(salirbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 180, 50));
        getContentPane().add(gametitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 700, 130));

        selectlevel_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/selectlevel_bt.png"))); // NOI18N
        selectlevel_bt.setToolTipText("");
        selectlevel_bt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        selectlevel_bt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectlevel_btMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                selectlevel_btMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                selectlevel_btMouseExited(evt);
            }
        });
        getContentPane().add(selectlevel_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 310, -1, 80));

        bghome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/homebg.png"))); // NOI18N
        getContentPane().add(bghome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static String nombre;
    public static int jugadores = 0;
    public static String nulo = "PLAYER";
    public static String Jugadores[] = new String[100];
    public static int Ranking[][] = new int[100][2]; //Columna 0 para vidas, columna 1 para puntuación;

    private void selectlevel_btMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectlevel_btMouseClicked
        nombre = tf_nombre.getText();
        if (nombre.equals("")){
            nombre = nulo;
        }
        jugadores++;
        Jugadores[jugadores] = nombre;
        Ranking[jugadores][0] = 0;
        Ranking[jugadores][1] = 0;
        FILCOL abrir = new FILCOL();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_selectlevel_btMouseClicked

    private void selectlevel_btMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectlevel_btMouseEntered
        ImageIcon im = new ImageIcon(getClass().getResource("/pfmedia/selectlevel_btpressed.png"));
        selectlevel_bt.setIcon(im);
    }//GEN-LAST:event_selectlevel_btMouseEntered

    private void selectlevel_btMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectlevel_btMouseExited
        ImageIcon im = new ImageIcon(getClass().getResource("/pfmedia/selectlevel_bt.png"));
        selectlevel_bt.setIcon(im);
    }//GEN-LAST:event_selectlevel_btMouseExited

    private void tf_nombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_nombreMouseClicked
        tf_nombre.setText("");
    }//GEN-LAST:event_tf_nombreMouseClicked

    private void tf_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_nombreKeyTyped

    }//GEN-LAST:event_tf_nombreKeyTyped

    private void tf_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nombreActionPerformed

    private void rankingbtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rankingbtMouseClicked
        RANKINGG abrir = new RANKINGG();
        abrir.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_rankingbtMouseClicked

    private void ayudabtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ayudabtMouseClicked
        AYUDAA abrir = new AYUDAA();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ayudabtMouseClicked

    private void salirbtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirbtMouseClicked
        dispose();
    }//GEN-LAST:event_salirbtMouseClicked

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
        }
    }//GEN-LAST:event_b_nomusicaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HOMEE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ayudabt;
    private javax.swing.JButton b_musica;
    private javax.swing.JButton b_nomusica;
    private javax.swing.JLabel bghome;
    private javax.swing.JLabel gametitle;
    private javax.swing.JLabel rankingbt;
    private javax.swing.JLabel salirbt;
    private javax.swing.JLabel selectlevel_bt;
    private javax.swing.JTextField tf_nombre;
    // End of variables declaration//GEN-END:variables
}
