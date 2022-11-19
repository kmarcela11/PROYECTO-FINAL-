
import java.awt.event.KeyEvent;
import java.io.IOException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
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
        lbl_digitar = new javax.swing.JLabel();
        lbl_n = new javax.swing.JLabel();
        lbl_m = new javax.swing.JLabel();
        b_enviar = new javax.swing.JButton();
        b_ayuda = new javax.swing.JButton();
        b_musica = new javax.swing.JButton();
        b_nomusica = new javax.swing.JButton();
        tf_nombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tf_filas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_filasKeyTyped(evt);
            }
        });

        tf_columnas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_columnasKeyTyped(evt);
            }
        });

        lbl_digitar.setText("DIGITA N Y M ");

        lbl_n.setText("n");

        lbl_m.setText("m");

        b_enviar.setText("JUGARRRRRRRRRRRR");
        b_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_enviarActionPerformed(evt);
            }
        });

        b_ayuda.setText("AYUDA");
        b_ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ayudaActionPerformed(evt);
            }
        });

        b_musica.setText("MUSIC ON");
        b_musica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_musicaActionPerformed(evt);
            }
        });

        b_nomusica.setText("MUSIC OFF");
        b_nomusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_nomusicaActionPerformed(evt);
            }
        });

        tf_nombre.setEditable(false);

        jLabel1.setText("HOLAAAAAAAA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(lbl_digitar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(77, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_m)
                            .addComponent(lbl_n))
                        .addGap(160, 160, 160)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_columnas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_filas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(117, 117, 117))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(b_ayuda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_nomusica))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_musica)))
                .addGap(75, 75, 75))
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(b_enviar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_digitar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_n)
                    .addComponent(tf_filas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_m)
                    .addComponent(tf_columnas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(b_enviar)
                .addGap(18, 18, 18)
                .addComponent(b_musica)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(b_ayuda))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(b_nomusica)))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void b_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_enviarActionPerformed
        if (tf_filas.getText().equals("") || tf_columnas.getText().equals("")) { //validación texto vacio 
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR LOS DOS DATOS (N y M )");
        }else{
            n = Integer.parseInt(tf_filas.getText()); /*toma cantidad de filas del textfield*/
            m = Integer.parseInt(tf_columnas.getText()); /*toma cantidad de columnas del textfield*/
            if (((n >= 8) && (n <= 100)) && ((m >= 16) && (m <= 100))){
                        NIVEL1 abrir = new NIVEL1();
                        this.setVisible(false);
                        abrir.setVisible(true);

            }else{
                 JOptionPane.showMessageDialog(null, "el número de filas debe ser mayor o igual a 8 y menor o igual a 100. \n"
                + "el número de columnas debe ser mayor o igual a 16 y menor o igual a 100");  
                
            }
        }
    }//GEN-LAST:event_b_enviarActionPerformed

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

    private void b_ayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ayudaActionPerformed
        AYUDA abrir = new AYUDA();
        this.setVisible(false);
        abrir.setVisible(true);
    }//GEN-LAST:event_b_ayudaActionPerformed

    private void b_musicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_musicaActionPerformed
        reproducir = true; 
        if (reproducir == true){
            mus("musica");
        }
    }//GEN-LAST:event_b_musicaActionPerformed

    private void b_nomusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_nomusicaActionPerformed
    }//GEN-LAST:event_b_nomusicaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FILCOL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_ayuda;
    private javax.swing.JButton b_enviar;
    private javax.swing.JButton b_musica;
    private javax.swing.JButton b_nomusica;
    private javax.swing.ButtonGroup bg_niveles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_digitar;
    private javax.swing.JLabel lbl_m;
    private javax.swing.JLabel lbl_n;
    private javax.swing.JTextField tf_columnas;
    private javax.swing.JTextField tf_filas;
    private javax.swing.JTextField tf_nombre;
    // End of variables declaration//GEN-END:variables
}
