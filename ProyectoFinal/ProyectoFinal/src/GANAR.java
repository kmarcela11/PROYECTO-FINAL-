public class GANAR extends javax.swing.JFrame {
    public GANAR() {
        initComponents();
        score.setText(String.valueOf(HOMEE.Ranking[HOMEE.jugadores][0]));
        user.setText(HOMEE.Jugadores[HOMEE.jugadores]);
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scorelabel = new javax.swing.JLabel();
        score = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        wonbg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scorelabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/scorelabel.png"))); // NOI18N
        getContentPane().add(scorelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 300, 100));

        score.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        score.setForeground(new java.awt.Color(243, 252, 240));
        score.setText("000");
        getContentPane().add(score, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 480, -1, -1));

        user.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        user.setForeground(new java.awt.Color(243, 252, 240));
        user.setText("Player");
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, -1, -1));

        wonbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/wonbg.png"))); // NOI18N
        getContentPane().add(wonbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
     HOMEE salir = new HOMEE();
     salir.setVisible(true);
     this.setVisible(false);
    }//GEN-LAST:event_formKeyPressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GANAR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel score;
    private javax.swing.JLabel scorelabel;
    private javax.swing.JLabel user;
    private javax.swing.JLabel wonbg;
    // End of variables declaration//GEN-END:variables
}
