
import java.awt.Color;
import java.awt.Graphics;
import static java.awt.MouseInfo.getPointerInfo;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.Random;
import java.awt.Dimension;
import java.awt.Toolkit;

public class TableroPrueba extends javax.swing.JFrame {

    public TableroPrueba() {
        initComponents();

    }

    int xpos = 0;
    int ypos = 0;
    int n;
    int m;
    int ancho;
    int alto;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tablero = new javax.swing.JPanel();
        GenerarTablero = new javax.swing.JButton();
        dificultad = new javax.swing.JTextField();
        filas = new javax.swing.JTextField();
        columnas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        right = new javax.swing.JLabel();
        left = new javax.swing.JLabel();
        down = new javax.swing.JLabel();
        up = new javax.swing.JLabel();
        joystick = new javax.swing.JLabel();
        xtab = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        borde = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tablero.setBackground(new java.awt.Color(204, 204, 204));
        Tablero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableroMouseClicked(evt);
            }
        });
        Tablero.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Tablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 187, 800, 500));

        GenerarTablero.setText("Pintar ");
        GenerarTablero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarTableroActionPerformed(evt);
            }
        });
        getContentPane().add(GenerarTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, -1));

        dificultad.setText("jTextField1");
        dificultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dificultadActionPerformed(evt);
            }
        });
        getContentPane().add(dificultad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, 50));

        filas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filasActionPerformed(evt);
            }
        });
        getContentPane().add(filas, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, 100, -1));

        columnas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                columnasActionPerformed(evt);
            }
        });
        getContentPane().add(columnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, 100, -1));

        jLabel1.setText("n");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, -1, -1));

        jLabel2.setText("m");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, -1, -1));

        right.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        right.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rightMouseClicked(evt);
            }
        });
        getContentPane().add(right, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 550, 40, 20));

        left.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        left.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leftMouseClicked(evt);
            }
        });
        getContentPane().add(left, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 550, 40, 20));

        down.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        down.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                downMouseClicked(evt);
            }
        });
        getContentPane().add(down, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 570, 20, 30));

        up.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        up.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                upMouseClicked(evt);
            }
        });
        up.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                upKeyPressed(evt);
            }
        });
        getContentPane().add(up, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 520, 20, 30));

        joystick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/joystick.png"))); // NOI18N
        getContentPane().add(joystick, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 510, 108, 106));

        xtab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/joystick.png"))); // NOI18N
        getContentPane().add(xtab, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, 90));

        jPanel1.setBackground(new java.awt.Color(153, 204, 0));

        borde.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout bordeLayout = new javax.swing.GroupLayout(borde);
        borde.setLayout(bordeLayout);
        bordeLayout.setHorizontalGroup(
            bordeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );
        bordeLayout.setVerticalGroup(
            bordeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 185, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(830, Short.MAX_VALUE)
                .addComponent(borde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(borde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(353, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GenerarTableroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarTableroActionPerformed
        Graphics t = Tablero.getGraphics();

        n = Integer.parseInt(filas.getText());
        m = Integer.parseInt(columnas.getText());
        ancho = 800 / m;
        alto = 500 / n;

        Random r = new Random();

        int xr = r.nextInt(n); // Posición aleatoria de fila.
        int yr = r.nextInt(m); // Posición aleatoria de columnas.

        int xfr = r.nextInt(n); // Posición aleatoria de fila.
        int yfr = r.nextInt(m); // Posición aleatoria de columnas.
        while (xr == xfr && yfr == yr) {
            xfr = r.nextInt(n); // Posición aleatoria de fila.
            yfr = r.nextInt(m); // Posición aleatoria de columnas.
        }

        int mt[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mt[i][j] = r.nextInt(4) + 1; // Genera el número aleatorio de 0 a 4 (en este caso, el límite varía según la dificultad).

                if (mt[i][j] == 1) {
                    t.setColor(Color.black); //Si se bloquea
                } else {
                    t.setColor(Color.white); // Ta libre :p
                }

                if (i == xr && j == yr) {
                    mt[i][j] = 5;
                    t.setColor(Color.green);
                }

                if (i == xfr && j == yfr) {
                    mt[i][j] = 6;
                    t.setColor(Color.blue);
                }

                t.fillRect(ancho * j, alto * i, ancho, alto); //Se va moviendo por el código pintando cuadrito x cuadrito.

                t.setColor(Color.black);
                t.drawLine(0, i * alto, m * ancho, i * alto);
                t.setColor(Color.black);
                t.drawLine(j * ancho, 0, j * ancho, n * alto);

            }
        }


    }//GEN-LAST:event_GenerarTableroActionPerformed

    private void dificultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dificultadActionPerformed

    }//GEN-LAST:event_dificultadActionPerformed

    private void columnasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_columnasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_columnasActionPerformed

    private void filasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filasActionPerformed

    private void rightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rightMouseClicked
        if (xpos < n - 1) {
            xpos = xpos + 1;
        }

    }//GEN-LAST:event_rightMouseClicked

    private void leftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftMouseClicked
        if (xpos > 0) {
            xpos = xpos - 1;
        }
    }//GEN-LAST:event_leftMouseClicked

    private void upMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upMouseClicked
        if (ypos > 0) {
            ypos = ypos - 1;
        }
    }//GEN-LAST:event_upMouseClicked

    private void downMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_downMouseClicked
        if (ypos < m - 1) {
            ypos = ypos + 1;
        }
    }//GEN-LAST:event_downMouseClicked

    private void upKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_upKeyPressed

    }//GEN-LAST:event_upKeyPressed

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        char v = evt.getKeyChar();
        if (v == 'W') {
            xtab.setLocation((xpos + 1) * ancho, (ypos) * alto);
        }
    }//GEN-LAST:event_formKeyTyped

    private void TableroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableroMouseClicked
        Point posicion = getPointerInfo().getLocation();     
        int anchopantalla = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int altopantalla = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        
        int xgap = anchopantalla - 1057 - Tablero.getLocation().x;

        int curx = posicion.x - Tablero.getLocationOnScreen().x;
        System.out.println(curx);
        int cury = posicion.y - Tablero.getLocationOnScreen().y;
        System.out.println(cury);

    }//GEN-LAST:event_TableroMouseClicked

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
            java.util.logging.Logger.getLogger(TableroPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableroPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableroPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableroPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableroPrueba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GenerarTablero;
    private javax.swing.JPanel Tablero;
    private javax.swing.JPanel borde;
    private javax.swing.JTextField columnas;
    private javax.swing.JTextField dificultad;
    private javax.swing.JLabel down;
    private javax.swing.JTextField filas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel joystick;
    private javax.swing.JLabel left;
    private javax.swing.JLabel right;
    private javax.swing.JLabel up;
    private javax.swing.JLabel xtab;
    // End of variables declaration//GEN-END:variables
}
