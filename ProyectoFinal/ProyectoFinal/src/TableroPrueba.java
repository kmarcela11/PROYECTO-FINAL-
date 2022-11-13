
import java.awt.Color;
import java.awt.Graphics;
import static java.awt.MouseInfo.getPointerInfo;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.Random;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Scanner;


public class TableroPrueba extends javax.swing.JFrame {
    
    public TableroPrueba() {
        initComponents();
       

    }

    Scanner lea = new Scanner(System.in);
    int xpos = 0;
    int ypos = 0;
    int n;
    int m;
    int ancho;
    int alto;
    boolean sel=true;
    public static int mt[][] = new int[100][100];

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Tablero = new javax.swing.JPanel();
        GenerarTablero = new javax.swing.JButton();
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
        dificultad = new javax.swing.JTextField();
        mostrarmt = new javax.swing.JButton();
        auto = new javax.swing.JRadioButton();
        manu = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

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
        Tablero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TableroKeyPressed(evt);
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

        right.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        right.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rightMouseClicked(evt);
            }
        });
        getContentPane().add(right, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 550, 40, 20));

        left.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        left.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leftMouseClicked(evt);
            }
        });
        getContentPane().add(left, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 550, 40, 20));

        down.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        down.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                downMouseClicked(evt);
            }
        });
        getContentPane().add(down, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 570, 20, 30));

        up.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        dificultad.setText("jTextField1");
        dificultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dificultadActionPerformed(evt);
            }
        });

        mostrarmt.setText("Miostrar matriz en consola");
        mostrarmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarmtActionPerformed(evt);
            }
        });

        auto.setText("Automático");

        manu.setText("Manual");
        manu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manuActionPerformed(evt);
            }
        });

        jLabel3.setText("Método de camino:");

        jButton1.setText("Resolver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(dificultad, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(mostrarmt)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 951, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(manu)
                    .addComponent(jLabel3)
                    .addComponent(auto))
                .addGap(425, 425, 425))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(mostrarmt)
                .addGap(18, 18, 18)
                .addComponent(dificultad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel3)
                .addGap(56, 56, 56)
                .addComponent(auto)
                .addGap(48, 48, 48)
                .addComponent(manu)
                .addGap(36, 36, 36)
                .addComponent(jButton1)
                .addContainerGap(357, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1480, 720));

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

        // Por si las posiciones son iguales.
        while (xr == xfr && yfr == yr) {
            xfr = r.nextInt(n);
            yfr = r.nextInt(m);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mt[i][j] = r.nextInt(4) + 1; // Genera el número aleatorio de 0 a 4 (en este caso, el límite varía según la dificultad).
                t.setColor(Color.white);

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
      
    }//GEN-LAST:event_formKeyTyped

    private void TableroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableroMouseClicked

        Point posicion = getPointerInfo().getLocation();
        int anchopantalla = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int altopantalla = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;

        int curx = posicion.x - Tablero.getLocationOnScreen().x;
        // System.out.println(curx); DE CONTROL
        int cury = posicion.y - Tablero.getLocationOnScreen().y;
        // System.out.println(cury); DE CONTROL

        int inx = PosMatriz(curx, m, ancho);
        int iny = PosMatriz(cury, n, alto);
        System.out.println(inx + "    " + iny);

        if (mt[iny][inx] == 1) {
            dificultad.setText("Bloqueado :p");
        } else {
            mt[iny][inx] = 5;
            Graphics t = Tablero.getGraphics();
            t.setColor(Color.red);
            t.fillRect(ancho * inx, alto * iny, ancho, alto); // Pinta la casilla seleccionada.
        }
        
        
        if (manu.isSelected() == true){
            
        
            int selx = posicion.x - Tablero.getLocationOnScreen().x;
            int sely = posicion.y - Tablero.getLocationOnScreen().y;
            
            int px = PosMatriz(selx, m, ancho);
            int py = PosMatriz(sely, n, alto);
            
            if (mt[px][py]!=5){
                
                sel=false;
                
            }
        }
        


    }//GEN-LAST:event_TableroMouseClicked

    private void mostrarmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarmtActionPerformed
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(String.valueOf(mt[i][j]) + " ");
            }
            System.out.print(" \n");
        }

        System.out.print(" \n");
    }//GEN-LAST:event_mostrarmtActionPerformed

    private void manuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TableroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TableroKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TableroKeyPressed

    private int PosMatriz(int poscursor, int filcol, int medida) {
        // Función que retorna la posición del cursor en la matriz.
        int k = 0;
        while (k < filcol && poscursor > k * medida) {
            k++;
        }
        return k - 1;
    }

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
    private javax.swing.JRadioButton auto;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField columnas;
    private javax.swing.JTextField dificultad;
    private javax.swing.JLabel down;
    private javax.swing.JTextField filas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel joystick;
    private javax.swing.JLabel left;
    private javax.swing.JRadioButton manu;
    private javax.swing.JButton mostrarmt;
    private javax.swing.JLabel right;
    private javax.swing.JLabel up;
    private javax.swing.JLabel xtab;
    // End of variables declaration//GEN-END:variables
}
