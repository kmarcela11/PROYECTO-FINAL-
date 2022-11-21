
import javax.swing.ImageIcon;

public class AYUDAA extends javax.swing.JFrame {

    public AYUDAA() {
        initComponents();
        this.setLocationRelativeTo(null);
        clic = 0;
    }

    int clic = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CONTENIDO = new javax.swing.JLabel();
        salirbt = new javax.swing.JLabel();
        advertencia = new javax.swing.JLabel();
        ayuda_bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 700));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CONTENIDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/ayuda1.png"))); // NOI18N
        getContentPane().add(CONTENIDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 855, 486));

        salirbt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/salirbt.png"))); // NOI18N
        salirbt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        salirbt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirbtMouseClicked(evt);
            }
        });
        getContentPane().add(salirbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 640, 180, 50));

        advertencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/ayuda_ps.png"))); // NOI18N
        getContentPane().add(advertencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 440, 40));

        ayuda_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/ayudabg.png"))); // NOI18N
        getContentPane().add(ayuda_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirbtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirbtMouseClicked
        HOMEE atras = new HOMEE();
        atras.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_salirbtMouseClicked

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        clic++;
        if (clic == 4){
            clic = 1;
        }
        if (clic == 1){
            ImageIcon im = new ImageIcon(getClass().getResource("/pfmedia/ayuda1.png"));
            CONTENIDO.setIcon(im);
        }
        if (clic == 2){
            ImageIcon im = new ImageIcon(getClass().getResource("/pfmedia/ayuda2.png"));
            CONTENIDO.setIcon(im);
        }
        if (clic == 3){
            ImageIcon im = new ImageIcon(getClass().getResource("/pfmedia/ayuda3.png"));
            CONTENIDO.setIcon(im);
        }
    }//GEN-LAST:event_formKeyPressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AYUDAA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CONTENIDO;
    private javax.swing.JLabel advertencia;
    private javax.swing.JLabel ayuda_bg;
    private javax.swing.JLabel salirbt;
    // End of variables declaration//GEN-END:variables
}
