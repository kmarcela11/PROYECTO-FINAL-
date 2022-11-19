
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;



public class inicio extends javax.swing.JFrame {

    public inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
public static int n, m;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        filas = new javax.swing.JTextField();
        columnas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        datos = new javax.swing.JButton();
        rb_nivel1 = new javax.swing.JRadioButton();
        rb_nivel2 = new javax.swing.JRadioButton();
        rb_nivel3 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        filas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                filasKeyTyped(evt);
            }
        });

        columnas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                columnasKeyTyped(evt);
            }
        });

        jLabel1.setText("digite n y m ");

        jLabel2.setText("n");

        jLabel3.setText("m");

        datos.setText("ENVIAR");
        datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datosActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb_nivel1);
        rb_nivel1.setText("NIVEL 1");
        rb_nivel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_nivel1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb_nivel2);
        rb_nivel2.setText("NIVEL 2");
        rb_nivel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_nivel2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb_nivel3);
        rb_nivel3.setText("NIVEL 3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rb_nivel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(datos)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                        .addComponent(jLabel2)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(filas, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(columnas)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rb_nivel2)
                            .addComponent(rb_nivel1))))
                .addGap(117, 117, 117))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(columnas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(rb_nivel1)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_nivel2)
                    .addComponent(datos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rb_nivel3)
                .addGap(113, 113, 113))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void datosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datosActionPerformed
             
        if (filas.getText().equals("") || columnas.getText().equals("")) { //validación texto vacio 

            JOptionPane.showMessageDialog(null, "DEBE INGRESAR LOS DOS DATOS (N y M )");
        }else{
            n = Integer.parseInt(filas.getText());
            /*toma cantidad de filas del textfield*/

            m = Integer.parseInt(columnas.getText());
            /*toma cantidad de columnas del textfield*/

        }
         if (rb_nivel1.isSelected()==true){
            
            nuevonivel nvl1 = new nuevonivel();
            this.setVisible(false);
            nvl1.setVisible(true);
        }
        
        if (rb_nivel2.isSelected()==true){
            
            TableroFacil SelectScreen = new TableroFacil();
            this.setVisible(false);
            SelectScreen.setVisible(true);
        }
        
         if (rb_nivel3.isSelected()==true){
            
            dificil lvl3 = new dificil();
            this.setVisible(false);
            lvl3.setVisible(true);
        }

    }//GEN-LAST:event_datosActionPerformed

    private void columnasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_columnasKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c != KeyEvent.VK_BACK_SPACE) && (c != '.' || columnas.getText().contains(".")))
            evt.consume();
    }//GEN-LAST:event_columnasKeyTyped

    private void filasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filasKeyTyped
        char f = evt.getKeyChar();
        if ((f < '0' || f > '9') && (f != KeyEvent.VK_BACK_SPACE) && (f != '.' || filas.getText().contains(".")))
            evt.consume();
    }//GEN-LAST:event_filasKeyTyped

    private void rb_nivel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_nivel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_nivel1ActionPerformed

    private void rb_nivel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_nivel2ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_rb_nivel2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField columnas;
    private javax.swing.JButton datos;
    private javax.swing.JTextField filas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton rb_nivel1;
    private javax.swing.JRadioButton rb_nivel2;
    private javax.swing.JRadioButton rb_nivel3;
    // End of variables declaration//GEN-END:variables
}
