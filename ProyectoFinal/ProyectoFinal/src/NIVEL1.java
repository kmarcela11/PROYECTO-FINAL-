
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class NIVEL1 extends javax.swing.JFrame {

    public NIVEL1() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    int inicialx = 0, inicialy = 0;
    public static int n, m, nn, mm, ancho, alto, inin, fina, posicioninicial, posicionfinal, xr, yr, xfr, yfr;
    public static int mt[][] = new int[100][100];
    boolean nivel1 = false;
    public static int vidas = 5;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        b_generar = new javax.swing.JButton();
        Tablero = new javax.swing.JPanel();
        b_nivel2 = new javax.swing.JButton();
        b_bloqueadas = new javax.swing.JButton();
        b_home = new javax.swing.JButton();
        b_ayuda = new javax.swing.JButton();
        b_automatico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 0));

        b_generar.setText("GENERAR TABLERO ");
        b_generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_generarActionPerformed(evt);
            }
        });
        b_generar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                b_generarKeyPressed(evt);
            }
        });

        Tablero.setPreferredSize(new java.awt.Dimension(0, 0));

        javax.swing.GroupLayout TableroLayout = new javax.swing.GroupLayout(Tablero);
        Tablero.setLayout(TableroLayout);
        TableroLayout.setHorizontalGroup(
            TableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        TableroLayout.setVerticalGroup(
            TableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        b_nivel2.setText("SIGUIENTE NIVEL ");
        b_nivel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_nivel2ActionPerformed(evt);
            }
        });

        b_bloqueadas.setText("GENERAR CAS BLOQUEADAS AGAIN ");
        b_bloqueadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_bloqueadasActionPerformed(evt);
            }
        });

        b_home.setText("VOLVER A INICIO ");
        b_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_homeActionPerformed(evt);
            }
        });

        b_ayuda.setText("AYUDA");
        b_ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ayudaActionPerformed(evt);
            }
        });

        b_automatico.setText("AUTOMATICO");
        b_automatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_automaticoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(Tablero, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_bloqueadas)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b_generar)
                            .addComponent(b_nivel2)
                            .addComponent(b_home))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(b_ayuda)
                .addGap(58, 58, 58)
                .addComponent(b_automatico)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b_home)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b_nivel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b_generar)
                .addGap(18, 18, 18)
                .addComponent(b_bloqueadas)
                .addGap(360, 360, 360))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_ayuda)
                    .addComponent(b_automatico))
                .addGap(52, 52, 52)
                .addComponent(Tablero, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_generarActionPerformed
        Graphics t = Tablero.getGraphics();
        Image img = new ImageIcon(getClass().getResource("/pfmedia/x.png")).getImage();
        vidas = 5;
        nn = FILCOL.n; //trae la fila
        mm = FILCOL.m; //trae la columna
        ancho = 800 / mm;/* ancho casillas*/
        alto = 500 / nn;/* alto casillas*/
        Random r = new Random();
        xr = r.nextInt(nn); // Posición aleatoria de fila inicial.
        yr = r.nextInt(mm); // Posición aleatoria de columnas inicial.
        xfr = r.nextInt(nn); // Posición aleatoria de fila final.
        yfr = r.nextInt(mm); // Posición aleatoria de columnas final.

        while (xr == xfr && yfr == yr) { // en caso de que pos inicial y pos final sean iguales, se usa random otra vez
            xfr = r.nextInt(nn); // Posición aleatoria de fila final.
            yfr = r.nextInt(mm); // Posición aleatoria de columnas final.
        }
        for (int i = 0; i < nn; i++) {
            for (int j = 0; j < mm; j++) {
                mt[i][j] = r.nextInt(4) + 1; // Genera el número aleatorio de 0 a 4 (en este caso, el límite varía según la dificultad).           
                if (mt[i][j] == 1) {
                    t.setColor(Color.black); //Si se bloquea     
                } else {
                    t.setColor(Color.white); // Ta libre :p
                }
                if (i == xr && j == yr) {
                    mt[i][j] = 5;
                    inin = 5;
                }
                if (i == xfr && j == yfr) {
                    mt[i][j] = 6;
                    fina = 6;
                }
                if (!(i == xr && j == yr) && !(i == xfr && j == yfr)) {
                    t.fillRect(ancho * j, alto * i, ancho, alto); //Se va moviendo por el código pintando cuadrito x cuadrito.
                }
                t.setColor(Color.black);
                t.drawLine(0, i * alto, mm * ancho, i * alto);
                t.setColor(Color.black);
                t.drawLine(j * ancho, 0, j * ancho, nn * alto);
            }
        }
        if (inin == 5) {
            img = new ImageIcon(getClass().getResource("/pfmedia/x.png")).getImage();
            t.drawImage(img, ancho * yr, alto * xr, ancho, alto, Tablero);//posicion inicial
        }

        if (fina == 6) {
            img = new ImageIcon(getClass().getResource("/pfmedia/o.png")).getImage();
            t.drawImage(img, ancho * yfr, alto * xfr, ancho, alto, Tablero); // posicion final
        }
    }//GEN-LAST:event_b_generarActionPerformed

    private void b_generarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b_generarKeyPressed
        Graphics t = Tablero.getGraphics();
        if (evt.getKeyCode() == 37) { //izquierda
            if (mt[xr][yr - 1] != 1 && yr > 0) {
                yr = yr - 1;
                t.setColor(Color.green);
                t.fillRect(ancho * yr, alto * xr, ancho, alto);
                if (xr == xfr && yr == yfr) {
                    JOptionPane.showMessageDialog(null, "Ganaste wuu");
                    nivel1 = true;
                }
            } else {
                if (mt[xr][yr - 1] == 1) {
                    JOptionPane.showMessageDialog(null, "TOCASTE UNA CASILLA BLOQUEADA, AHORA TIENES UNA VIDA MENOS");
                    vidas = vidas - 1;
                    System.out.println("actualmente tienes " + vidas);
                    if (vidas == 0) {
                        JOptionPane.showMessageDialog(null, "YA NO TIENES MAS VIDAS, NO PUEDES SEGUIR JUGANDO");
                        FILCOL abrir = new FILCOL();
                        this.setVisible(false);
                        abrir.setVisible(true);
                    }
                }
            }
        }

        if (evt.getKeyCode() == 38) { //arriba

            if (mt[xr - 1][yr] != 1 && xr > 0) {
                xr = xr - 1;
                t.setColor(Color.green);
                t.fillRect(ancho * yr, alto * xr, ancho, alto);

                if (xr == xfr && yr == yfr) {
                    JOptionPane.showMessageDialog(null, "Ganaste wuu");
                    nivel1 = true;
                }
            } else {
                if (mt[xr - 1][yr] == 1) {
                    JOptionPane.showMessageDialog(null, "TOCASTE UNA CASILLA BLOQUEADA, AHORA TIENES UNA VIDA MENOS");
                    vidas = vidas - 1;
                    System.out.println("actualmente tienes " + vidas);
                    if (vidas == 0) {
                        JOptionPane.showMessageDialog(null, "YA NO TIENES MAS VIDAS, NO PUEDES SEGUIR JUGANDO");
                        FILCOL abrir = new FILCOL();
                        this.setVisible(false);
                        abrir.setVisible(true);
                    }
                }
            }
        }

        if (evt.getKeyCode() == 39) { // derecha           
            if (mt[xr][yr + 1] != 1 && yr < mm) {
                yr = yr + 1;
                t.setColor(Color.green);
                t.fillRect(ancho * yr, alto * xr, ancho, alto);
                if (xr == xfr && yr == yfr) {
                    JOptionPane.showMessageDialog(null, "Ganaste wuu");
                    nivel1 = true;
                }
            } else {
                if (mt[xr][yr + 1] == 1) {
                    JOptionPane.showMessageDialog(null, "TOCASTE UNA CASILLA BLOQUEADA, AHORA TIENES UNA VIDA MENOS");
                    vidas = vidas - 1;
                    System.out.println("actualmente tienes " + vidas);
                    if (vidas == 0) {
                        JOptionPane.showMessageDialog(null, "YA NO TIENES MAS VIDAS, NO PUEDES SEGUIR JUGANDO");
                        FILCOL abrir = new FILCOL();
                        this.setVisible(false);
                        abrir.setVisible(true);
                    }
                }
            }
        }

        if (evt.getKeyCode() == 40) { //izquierda
            if (mt[xr + 1][yr] != 1 && xr < nn) {
                xr = xr + 1;
                t.setColor(Color.green);
                t.fillRect(ancho * yr, alto * xr, ancho, alto);
                if (xr == xfr && yr == yfr) {
                    JOptionPane.showMessageDialog(null, "Ganaste wuu");
                    nivel1 = true;
                } else {
                    if (mt[xr + 1][yr] == 1) {
                        JOptionPane.showMessageDialog(null, "TOCASTE UNA CASILLA BLOQUEADA, AHORA TIENES UNA VIDA MENOS");
                        vidas = vidas - 1;
                        System.out.println("actualmente tienes " + vidas);
                        if (vidas == 0) {
                            JOptionPane.showMessageDialog(null, "YA NO TIENES MAS VIDAS, NO PUEDES SEGUIR JUGANDO");
                            FILCOL abrir = new FILCOL();
                            this.setVisible(false);
                            abrir.setVisible(true);
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_b_generarKeyPressed

    private void b_ayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ayudaActionPerformed
        AYUDAA abrir = new AYUDAA();
        this.setVisible(false);
        abrir.setVisible(true);
    }//GEN-LAST:event_b_ayudaActionPerformed

    private void b_bloqueadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_bloqueadasActionPerformed
        Graphics t = Tablero.getGraphics();
        for (int i = 0; i < nn; i++) {
            for (int j = 0; j < mm; j++) {
                t.setColor(Color.white);
                Random r = new Random();
                if (mt[i][j] != 5 && mt[i][j] != 6) {
                    /*estas son las casillas inicial y final*/
                    mt[i][j] = r.nextInt(4) + 1;
                    if (mt[i][j] == 1) {
                        t.setColor(Color.black);
                        /*bloqueada*/
                    }
                    t.fillRect(ancho * j, alto * i, ancho, alto); //Se va moviendo por el código pintando cuadrito x cuadrito.
                    t.setColor(Color.black);
                    t.drawLine(0, i * alto, mm * ancho, i * alto);
                    t.setColor(Color.black);
                    t.drawLine(j * ancho, 0, j * ancho, nn * alto);
                }
            }
        }
    }//GEN-LAST:event_b_bloqueadasActionPerformed

    private void b_automaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_automaticoActionPerformed
        System.out.println(inicialx + "   " + inicialy);
        boolean resultado = Buscar(mt, inicialx, inicialy, nn, mm);
        Graphics t = Tablero.getGraphics();
        for (int i = 0; i < nn; i++) {
            for (int j = 0; j < mm; j++) {
                if (mt[i][j] == 0) {
                    t.setColor(Color.decode("#ff9966"));
                    t.fillRect(ancho * j, alto * i, ancho, alto); //Se va moviendo por el código pintando cuadrito x cuadrito.
                }
                t.setColor(Color.black);
                t.drawLine(0, i * alto, mm * ancho, i * alto);
                t.drawLine(j * ancho, 0, j * ancho, nn * alto);
            }
        }
    }//GEN-LAST:event_b_automaticoActionPerformed

    private void b_nivel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_nivel2ActionPerformed
        if (nivel1 == true) {
            NIVEL2 abrir = new NIVEL2();
            this.setVisible(false);
            abrir.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "NO HAS PASADO EL NIVEL 1");
        }
    }//GEN-LAST:event_b_nivel2ActionPerformed

    private void b_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_homeActionPerformed
        FILCOL abrir = new FILCOL();
        this.setVisible(false);
        abrir.setVisible(true);
    }//GEN-LAST:event_b_homeActionPerformed
    public static boolean Buscar(int mt[][], int inicialy, int inicialx, int nn, int mm) {
        System.out.println(inicialx + "   ENTRA   " + inicialy);
        if (mt[inicialy][inicialx] == 6) {
            System.out.println("encontrado");
            return true;
        }

        if (mt[inicialy][inicialx] == 1 || mt[inicialy][inicialx] == 0) {
            System.out.println("sale");
            return false;
        }

        mt[inicialy][inicialx] = 0;

        boolean encontrado = false;
        if (inicialy - 1 >= 0) {
            System.out.println("arriba");
            encontrado = Buscar(mt, inicialy - 1, inicialx, nn, mm);
        }

        if (encontrado == true) {
            return true;
        }

        if (inicialx + 1 < mm) {
            System.out.println("derecha");
            encontrado = Buscar(mt, inicialy, inicialx + 1, nn, mm);
        }

        if (encontrado == true) {
            return true;
        }

        if (inicialx - 1 >= 0) {
            System.out.println("izquierda");
            encontrado = Buscar(mt, inicialy, inicialx - 1, nn, mm);
        }

        if (encontrado == true) {
            return true;
        }

        if (inicialy + 1 < nn) {
            System.out.println("abajo");
            encontrado = Buscar(mt, inicialy + 1, inicialx, nn, mm);
        }

        if (encontrado == true) {
            return true;
        }
        mt[inicialy][inicialx] = 1;
        return false;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NIVEL1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Tablero;
    private javax.swing.JButton b_automatico;
    private javax.swing.JButton b_ayuda;
    private javax.swing.JButton b_bloqueadas;
    private javax.swing.JButton b_generar;
    private javax.swing.JButton b_home;
    private javax.swing.JButton b_nivel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
