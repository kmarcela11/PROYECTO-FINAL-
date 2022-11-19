public class USUARIO extends javax.swing.JFrame {
    public USUARIO() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_bienvenida = new javax.swing.JPanel();
        lbl_nombre = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        lbl_iconusuario = new javax.swing.JLabel();
        b_enviar = new javax.swing.JButton();
        b_omitir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_nombre.setForeground(new java.awt.Color(204, 0, 115));
        lbl_nombre.setText("digite el nombre");

        b_enviar.setForeground(new java.awt.Color(204, 0, 115));
        b_enviar.setText("ENVIAR");
        b_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_enviarActionPerformed(evt);
            }
        });

        b_omitir.setForeground(new java.awt.Color(204, 0, 115));
        b_omitir.setText("OMITIR");
        b_omitir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_omitirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p_bienvenidaLayout = new javax.swing.GroupLayout(p_bienvenida);
        p_bienvenida.setLayout(p_bienvenidaLayout);
        p_bienvenidaLayout.setHorizontalGroup(
            p_bienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_bienvenidaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbl_nombre)
                .addContainerGap(381, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_bienvenidaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(p_bienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_iconusuario)
                    .addComponent(b_omitir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(p_bienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_bienvenidaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(136, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_bienvenidaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))))
        );
        p_bienvenidaLayout.setVerticalGroup(
            p_bienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_bienvenidaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_nombre)
                .addGroup(p_bienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_bienvenidaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbl_iconusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(p_bienvenidaLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                        .addGroup(p_bienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_bienvenidaLayout.createSequentialGroup()
                                .addComponent(b_omitir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_bienvenidaLayout.createSequentialGroup()
                                .addComponent(b_enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_bienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_bienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static String nombre; 
    String nulo = "PLAYER";
    private void b_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_enviarActionPerformed

        nombre = tf_nombre.getText();
        if (nombre.equals("")){
            nombre = nulo;
        }
        FILCOL abrir = new FILCOL();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_b_enviarActionPerformed

    private void b_omitirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_omitirActionPerformed
        nombre = nulo;
        FILCOL abrir = new FILCOL();
        abrir.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_b_omitirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(USUARIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(USUARIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(USUARIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(USUARIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new USUARIO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_enviar;
    private javax.swing.JButton b_omitir;
    private javax.swing.JLabel lbl_iconusuario;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JPanel p_bienvenida;
    private javax.swing.JTextField tf_nombre;
    // End of variables declaration//GEN-END:variables
}
