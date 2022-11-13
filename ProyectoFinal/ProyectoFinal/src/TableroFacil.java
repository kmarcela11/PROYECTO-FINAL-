
import java.awt.Color;
import java.awt.Graphics;
import static java.awt.MouseInfo.getPointerInfo;
import java.awt.Point;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class TableroFacil extends javax.swing.JFrame {

    public TableroFacil() {
        initComponents();
    }

    Scanner lea = new Scanner(System.in);
    int xpos = 0;
    int ypos = 0;
    int acum = 0;
    int n;
    int m;
    int ancho;
    int alto;
    boolean sel = true;
    public static int mt[][] = new int[100][100];

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
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
        jButton2 = new javax.swing.JButton();
        GenerarTablero = new javax.swing.JButton();
        Tablero = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        mostrarmt.setText("Mostrar matriz en consola");
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

        jButton2.setText("salir xd");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        GenerarTablero.setText("Pintar ");
        GenerarTablero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarTableroActionPerformed(evt);
            }
        });

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

        jLabel4.setText("presione la casilla para indicar la X (1° presionada)  y la O (2°presionada ) (que indica el inicio y el final) ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(manu)
                    .addComponent(jLabel3)
                    .addComponent(auto))
                .addGap(425, 425, 425))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(mostrarmt)
                                .addGap(266, 266, 266)
                                .addComponent(jButton2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dificultad, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(148, 148, 148)
                                .addComponent(GenerarTablero))
                            .addComponent(Tablero, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel4)))
                .addContainerGap(650, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(mostrarmt))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dificultad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GenerarTablero))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(58, 58, 58)
                        .addComponent(auto)
                        .addGap(48, 48, 48)
                        .addComponent(manu)
                        .addGap(36, 36, 36)
                        .addComponent(jButton1)
                        .addContainerGap(376, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Tablero, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(78, Short.MAX_VALUE))))
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
        acum = 1;
        Random r = new Random();

//        int xr = r.nextInt(n); // Posición aleatoria de fila.
//        int yr = r.nextInt(m); // Posición aleatoria de columnas.
//        int xfr = r.nextInt(n); // Posición aleatoria de fila.
//        int yfr = r.nextInt(m); // Posición aleatoria de columnas.
        // Por si las posiciones son iguales.
//        while (xr == xfr && yfr == yr) {
//            xfr = r.nextInt(n);
//            yfr = r.nextInt(m);
//        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mt[i][j] = r.nextInt(4) + 1; // Genera el número aleatorio de 0 a 4 (en este caso, el límite varía según la dificultad).
                t.setColor(Color.white);

                if (mt[i][j] == 1) {
                    t.setColor(Color.black); //Si se bloquea
                } else {
                    t.setColor(Color.white); // Ta libre :p
                }
//
//                if (i == xr && j == yr) {
//                    mt[i][j] = 5;
//                    t.setColor(Color.green);
//                }
//
//                if (i == xfr && j == yfr) {
//                    mt[i][j] = 6;
//                    t.setColor(Color.blue);
//                }

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
        dificultad.setText("");

        int curx = posicion.x - Tablero.getLocationOnScreen().x;
        // System.out.println(curx); DE CONTROL
        int cury = posicion.y - Tablero.getLocationOnScreen().y;
        // System.out.println(cury); DE CONTROL
        // System.out.println(acum); DE CONTROL
        if (acum <= 2) { //validacion para que solo se pueda seleccionar dos casillas 

            int inx = PosMatriz(curx, m, ancho);
            int iny = PosMatriz(cury, n, alto);
            System.out.println(inx + "    " + iny);

            if (mt[iny][inx] == 1) {
                dificultad.setText("Bloqueado :p");
            } else {
                Graphics t = Tablero.getGraphics();

                if (acum == 2) {
                    mt[iny][inx] = 6; //Posición final :)
                    t.setColor(Color.green);
                }

                if (acum == 1) {
                    mt[iny][inx] = 5; //Posición inicial :p
                    t.setColor(Color.red);
                }
                acum = acum + 1;

                t.fillRect(ancho * inx, alto * iny, ancho, alto); // Pinta la casilla seleccionada.

            }
        } else {
            JOptionPane.showMessageDialog(null, "YA SELECCIONO LAS DOS CASILLAS"); // con joptionpane mientras tanto 
        }

        if (manu.isSelected() == true) {

            int selx = posicion.x - Tablero.getLocationOnScreen().x;
            int sely = posicion.y - Tablero.getLocationOnScreen().y;

            int px = PosMatriz(selx, m, ancho);
            int py = PosMatriz(sely, n, alto);

            if (mt[px][py] != 5) {

                sel = false;

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private int PosMatriz(int poscursor, int filcol, int medida) {
        // Función que retorna la posición del cursor en la matriz.
        int k = 0;
        while (k < filcol && poscursor > k * medida) {
            k++;
        }
        return k - 1;
    }

    public void movimiento(int[][] mt, int f, int c) {

        String paso = lea.next();

        if (paso.compareTo("w") == 0 || paso.compareTo("W") == 0) {
            /* movimiento hacia arriba*/

            if (mt[f - 1][c] != 1 && (f - 1 >= 0 || f - 1 <= n)) {

                mt[f - 1][c] = 5;
                Graphics t = Tablero.getGraphics();
                t.setColor(Color.red);
                t.fillRect(ancho * (f - 1), alto * c, ancho, alto);

            } else {

                dificultad.setText("¡¡Te golpeaste con una pared!!");

            }

        } else {

            if (paso.compareTo("a") == 0 || paso.compareTo("A") == 0) {
                /* movimiento hacia izquierda*/

                if (mt[f][c - 1] != 1 && (c - 1 >= 0 || c - 1 <= m)) {

                    mt[f][c - 1] = 5;
                    Graphics t = Tablero.getGraphics();
                    t.setColor(Color.red);
                    t.fillRect(ancho * f, alto * (c - 1), ancho, alto);

                } else {

                    dificultad.setText("¡¡Te golpeaste con una pared!!");

                }

            } else {
                if (paso.compareTo("s") == 0 || paso.compareTo("S") == 0) {
                    /* movimiento hacia abajo*/

                    if (mt[f + 1][c] != 1 && (f + 1 >= 0 || f + 1 <= n)) {

                        mt[f + 1][c] = 5;
                        Graphics t = Tablero.getGraphics();
                        t.setColor(Color.red);
                        t.fillRect(ancho * (f + 1), alto * c, ancho, alto);

                    } else {

                        dificultad.setText("¡¡Te golpeaste con una pared!!");

                    }

                } else {

                    if (paso.compareTo("d") == 0 || paso.compareTo("D") == 0) {
                        /* movimiento hacia derecha*/

                        if (mt[f][c + 1] != 1 && (c + 1 >= 0 || c + 1 <= m)) {

                            mt[f][c + 1] = 5;
                            Graphics t = Tablero.getGraphics();
                            t.setColor(Color.red);
                            t.fillRect(ancho * f, alto * (c + 1), ancho, alto);

                        } else {

                            dificultad.setText("¡¡Te golpeaste con una pared!!");

                        }

                    }

                }

            }

        }

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
            java.util.logging.Logger.getLogger(TableroFacil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableroFacil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableroFacil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableroFacil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableroFacil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GenerarTablero;
    private javax.swing.JPanel Tablero;
    private javax.swing.JRadioButton auto;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField columnas;
    private javax.swing.JTextField dificultad;
    private javax.swing.JLabel down;
    private javax.swing.JTextField filas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
