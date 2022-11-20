
import javax.swing.ImageIcon;

public class HOMEE extends javax.swing.JFrame {

    public HOMEE() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gametitle = new javax.swing.JLabel();
        playername = new javax.swing.JLabel();
        selectlevel_bt = new javax.swing.JLabel();
        bghome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(gametitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 700, 130));

        playername.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        playername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/x.png"))); // NOI18N
        playername.setText("|Nombre");
        playername.setToolTipText("");
        playername.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        playername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playernameMouseClicked(evt);
            }
        });
        getContentPane().add(playername, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 250, 340, 80));

        selectlevel_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/selectlevel_bt.png"))); // NOI18N
        selectlevel_bt.setToolTipText("");
        selectlevel_bt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        getContentPane().add(bghome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectlevel_btMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectlevel_btMouseClicked
        USUARIO abrir = new USUARIO();
        this.setVisible(false);
        abrir.setVisible(true);
    }//GEN-LAST:event_selectlevel_btMouseClicked

    private void playernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playernameMouseClicked

    }//GEN-LAST:event_playernameMouseClicked

    private void selectlevel_btMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectlevel_btMouseEntered
        ImageIcon im = new ImageIcon(getClass().getResource("/pfmedia/selectlevel_btpressed.png"));
        selectlevel_bt.setIcon(im);
    }//GEN-LAST:event_selectlevel_btMouseEntered

    private void selectlevel_btMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectlevel_btMouseExited
        ImageIcon im = new ImageIcon(getClass().getResource("/pfmedia/selectlevel_bt.png"));
        selectlevel_bt.setIcon(im);
    }//GEN-LAST:event_selectlevel_btMouseExited

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HOMEE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bghome;
    private javax.swing.JLabel gametitle;
    private javax.swing.JLabel playername;
    private javax.swing.JLabel selectlevel_bt;
    // End of variables declaration//GEN-END:variables
}
