public class RANKINGG extends javax.swing.JFrame {
    public RANKINGG() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
    public static int totalvida = 0;    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rkgbg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setSize(new java.awt.Dimension(1200, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rkgbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/homebg.png"))); // NOI18N
        getContentPane().add(rkgbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RANKINGG().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel rkgbg;
    // End of variables declaration//GEN-END:variables
}
