public class NEXTLEVEL extends javax.swing.JFrame {
    public NEXTLEVEL() {
        initComponents();
        lev_2.setVisible(false);
        lev_3.setVisible(false);
        this.setLocationRelativeTo(null);
        advertencia.setVisible(false);
        score.setText(String.valueOf(HOMEE.Ranking[HOMEE.jugadores][0]));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dsddsd = new javax.swing.JLabel();
        score = new javax.swing.JLabel();
        lev_1 = new javax.swing.JLabel();
        lev_2 = new javax.swing.JLabel();
        lev_3 = new javax.swing.JLabel();
        advertencia = new javax.swing.JLabel();
        bgnextlevel = new javax.swing.JLabel();
        bgbgbgbg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 400));
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dsddsd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/pasarnivel.png"))); // NOI18N
        getContentPane().add(dsddsd, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 161, 620, 80));

        score.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        score.setForeground(new java.awt.Color(31, 39, 27));
        score.setText("000");
        getContentPane().add(score, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, -1, -1));

        lev_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/level1bt.png"))); // NOI18N
        lev_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lev_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lev_1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lev_1MouseExited(evt);
            }
        });
        getContentPane().add(lev_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 90, 90));

        lev_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/level2bt.png"))); // NOI18N
        lev_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lev_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lev_2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lev_2MouseExited(evt);
            }
        });
        getContentPane().add(lev_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 90, 90));

        lev_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/level3bt.png"))); // NOI18N
        lev_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lev_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lev_3MouseClicked(evt);
            }
        });
        getContentPane().add(lev_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, 90, 90));

        advertencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/advertencianivel.png"))); // NOI18N
        getContentPane().add(advertencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 460, 460, 30));

        bgnextlevel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/nextlevelbg.png"))); // NOI18N
        bgnextlevel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                bgnextlevelMouseMoved(evt);
            }
        });
        getContentPane().add(bgnextlevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 701, 401));

        bgbgbgbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/homebg.png"))); // NOI18N
        getContentPane().add(bgbgbgbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved

    }//GEN-LAST:event_formMouseMoved

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if (NIVEL1.nivel1 == true) {
            lev_2.setVisible(true);
        }

        if (NIVEL2.nivel2 == true) {
            lev_3.setVisible(true);
            lev_2.setVisible(true);
        }
    }//GEN-LAST:event_formWindowActivated

    private void bgnextlevelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgnextlevelMouseMoved

    }//GEN-LAST:event_bgnextlevelMouseMoved

    private void lev_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lev_2MouseClicked
        if (NIVEL2.nivel2 == false) {
            NIVEL2 abrir = new NIVEL2();
            abrir.setVisible(true);

            NIVEL1 cerrar = new NIVEL1();
            cerrar.setVisible(false);

            NIVEL3 cerrar1 = new NIVEL3();
            cerrar1.setVisible(false);

            this.setVisible(false);
        } else {
            advertencia.setVisible(true);
        }

    }//GEN-LAST:event_lev_2MouseClicked

    private void lev_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lev_3MouseClicked

        NIVEL2 cerrar1 = new NIVEL2();
        cerrar1.setVisible(false);

        NIVEL1 cerrar = new NIVEL1();
        cerrar.setVisible(false);
        NIVEL3 abrir = new NIVEL3();
        abrir.setVisible(true);

        this.setVisible(false);
    }//GEN-LAST:event_lev_3MouseClicked

    private void lev_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lev_1MouseClicked
        advertencia.setVisible(true);
    }//GEN-LAST:event_lev_1MouseClicked

    private void lev_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lev_2MouseExited
        advertencia.setVisible(false);
    }//GEN-LAST:event_lev_2MouseExited

    private void lev_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lev_1MouseExited
        advertencia.setVisible(false);
    }//GEN-LAST:event_lev_1MouseExited

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NEXTLEVEL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel advertencia;
    private javax.swing.JLabel bgbgbgbg;
    private javax.swing.JLabel bgnextlevel;
    private javax.swing.JLabel dsddsd;
    private javax.swing.JLabel lev_1;
    private javax.swing.JLabel lev_2;
    private javax.swing.JLabel lev_3;
    private javax.swing.JLabel score;
    // End of variables declaration//GEN-END:variables
}
