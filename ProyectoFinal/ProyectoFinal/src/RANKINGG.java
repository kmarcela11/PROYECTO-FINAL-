public class RANKINGG extends javax.swing.JFrame {
    public RANKINGG() {
        initComponents();
        this.setLocationRelativeTo(null);
        ta_points.setOpaque(false);
        ta_hearts.setOpaque(false);
        ta_players.setOpaque(false);

        String auxname = HOMEE.Jugadores[HOMEE.jugadores];
        int auxpuntaje = HOMEE.Ranking[HOMEE.jugadores][0];
        int cantvidas = NIVEL1.vd1 + NIVEL2.vd2 + NIVEL3.vd3;
        int k = HOMEE.jugadores;
        while (k > 1 && HOMEE.Ranking[k - 1][0] < auxpuntaje) {
            HOMEE.Ranking[k][0] = HOMEE.Ranking[k - 1][0];
            HOMEE.Ranking[k][1] = HOMEE.Ranking[k - 1][1];
            HOMEE.Jugadores[k] = HOMEE.Jugadores[k - 1];
            k--;
        }

        HOMEE.Ranking[k][0] = auxpuntaje;//Puntaje obtenido por jugador.
        HOMEE.Ranking[k][1] = cantvidas;
        HOMEE.Jugadores[k] = auxname;//Nombre del jugador.

        for (int i = 1; i <= HOMEE.jugadores; i++) {
            ta_points.append(String.valueOf(HOMEE.Ranking[i][0]) + "\n");
            ta_players.append(HOMEE.Jugadores[i] + "\n");
            ta_hearts.append(String.valueOf(HOMEE.Ranking[i][1]) + "\n");
        }

    }
    public static int totalvida = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salirbt = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ta_points = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_hearts = new javax.swing.JTextArea();
        sp = new javax.swing.JScrollPane();
        ta_players = new javax.swing.JTextArea();
        rkgbg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salirbt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/salirbt.png"))); // NOI18N
        salirbt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        salirbt.setDisabledIcon(null);
        salirbt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirbtMouseClicked(evt);
            }
        });
        getContentPane().add(salirbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 180, 50));

        ta_points.setEditable(false);
        ta_points.setBackground(new java.awt.Color(243, 252, 240));
        ta_points.setColumns(20);
        ta_points.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        ta_points.setForeground(new java.awt.Color(31, 39, 27));
        ta_points.setRows(5);
        jScrollPane3.setViewportView(ta_points);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 180, 160, 430));

        ta_hearts.setEditable(false);
        ta_hearts.setBackground(new java.awt.Color(243, 252, 240));
        ta_hearts.setColumns(20);
        ta_hearts.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        ta_hearts.setForeground(new java.awt.Color(31, 39, 27));
        ta_hearts.setRows(5);
        jScrollPane2.setViewportView(ta_hearts);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, 70, 430));

        ta_players.setEditable(false);
        ta_players.setBackground(new java.awt.Color(243, 252, 240));
        ta_players.setColumns(20);
        ta_players.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        ta_players.setForeground(new java.awt.Color(31, 39, 27));
        ta_players.setRows(5);
        sp.setViewportView(ta_players);

        getContentPane().add(sp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 300, 430));

        rkgbg.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        rkgbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/rankingbg.png"))); // NOI18N
        getContentPane().add(rkgbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirbtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirbtMouseClicked
        HOMEE atras = new HOMEE();
        atras.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_salirbtMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RANKINGG().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel rkgbg;
    private javax.swing.JLabel salirbt;
    private javax.swing.JScrollPane sp;
    private javax.swing.JTextArea ta_hearts;
    private javax.swing.JTextArea ta_players;
    private javax.swing.JTextArea ta_points;
    // End of variables declaration//GEN-END:variables
}
