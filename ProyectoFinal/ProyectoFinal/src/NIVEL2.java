
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Random;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class NIVEL2 extends javax.swing.JFrame {

    public NIVEL2() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    Scanner lea = new Scanner(System.in);
    int inicialx = 0, inicialy = 0;
    public static boolean nivel2 = false;
    public static int n, m, nn, mm, ancho, alto, inin, fina, posicioninicial, posicionfinal, xr, yr, xfr, yfr;
    public static int mt[][] = new int[100][100];
    public static int vidas = 3;
    private Image img;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_nivel2 = new javax.swing.JPanel();
        Tablero = new javax.swing.JPanel();
        b_generar = new javax.swing.JLabel();
        needed = new javax.swing.JButton();
        b_automatico = new javax.swing.JLabel();
        b_nivel3 = new javax.swing.JButton();
        level2bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p_nivel2.setBackground(new java.awt.Color(153, 204, 0));
        p_nivel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tablero.setBackground(new java.awt.Color(243, 252, 240));

        javax.swing.GroupLayout TableroLayout = new javax.swing.GroupLayout(Tablero);
        Tablero.setLayout(TableroLayout);
        TableroLayout.setHorizontalGroup(
            TableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        TableroLayout.setVerticalGroup(
            TableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        p_nivel2.add(Tablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 800, 550));

        b_generar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/generarbt.png"))); // NOI18N
        b_generar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_generar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_generarMouseClicked(evt);
            }
        });
        p_nivel2.add(b_generar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 560, 170, 50));

        needed.setText("GENERAR TABLERO ");
        needed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neededActionPerformed(evt);
            }
        });
        needed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                neededKeyPressed(evt);
            }
        });
        p_nivel2.add(needed, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 50, -1, -1));

        b_automatico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/solvebt.png"))); // NOI18N
        b_automatico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_automatico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_automaticoMouseClicked(evt);
            }
        });
        p_nivel2.add(b_automatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 360, 90, 80));

        b_nivel3.setText("SIGUIENTE NIVEL ");
        b_nivel3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_nivel3ActionPerformed(evt);
            }
        });
        p_nivel2.add(b_nivel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 30, -1, -1));

        level2bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/level2bg.png"))); // NOI18N
        p_nivel2.add(level2bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        getContentPane().add(p_nivel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void neededActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neededActionPerformed

    }//GEN-LAST:event_neededActionPerformed
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

    private void columnasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_columnasKeyTyped

    }//GEN-LAST:event_columnasKeyTyped

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
    }//GEN-LAST:event_formKeyTyped
    private void neededKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_neededKeyPressed
        Graphics t = Tablero.getGraphics();
        if (evt.getKeyCode() == 37) { //izquierda
            if (mt[xr][yr - 1] != 1 && yr > 0) {
                yr = yr - 1;
                t.setColor(Color.decode("#F4A364"));
                t.fillRect(ancho * yr, alto * xr, ancho, alto);
                if (xr == xfr && yr == yfr) {
                    JOptionPane.showMessageDialog(null, "Ganaste wuu");
                    nivel2 = true;
                }
            } else {
                if (mt[xr][yr - 1] == 1) {
                    JOptionPane.showMessageDialog(null, "TOCASTE UNA CASILLA BLOQUEADA, AHORA TIENES UNA VIDA MENOS");
                    vidas = vidas - 1;
                    System.out.println("actualmente tienes " + vidas);
                    if (vidas < 1) {
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
                t.setColor(Color.decode("#F4A364"));
                t.fillRect(ancho * yr, alto * xr, ancho, alto);

                if (xr == xfr && yr == yfr) {
                    JOptionPane.showMessageDialog(null, "Ganaste wuu");
                    nivel2 = true;
                }
            } else {
                if (mt[xr - 1][yr] == 1) {
                    JOptionPane.showMessageDialog(null, "TOCASTE UNA CASILLA BLOQUEADA, AHORA TIENES UNA VIDA MENOS");
                    vidas = vidas - 1;
                    System.out.println("actualmente tienes " + vidas);
                    if (vidas < 1) {
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
                t.setColor(Color.decode("#F4A364"));
                t.fillRect(ancho * yr, alto * xr, ancho, alto);
                if (xr == xfr && yr == yfr) {
                    JOptionPane.showMessageDialog(null, "Ganaste wuu");
                    nivel2 = true;
                }
            } else {
                if (mt[xr][yr + 1] == 1) {
                    JOptionPane.showMessageDialog(null, "TOCASTE UNA CASILLA BLOQUEADA, AHORA TIENES UNA VIDA MENOS");
                    vidas = vidas - 1;
                    System.out.println("actualmente tienes " + vidas);
                    if (vidas < 1) {
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
                t.setColor(Color.decode("#F4A364"));
                t.fillRect(ancho * yr, alto * xr, ancho, alto);
                if (xr == xfr && yr == yfr) {
                    JOptionPane.showMessageDialog(null, "Ganaste wuu");
                    nivel2 = true;
                }
            } else {
                if (mt[xr + 1][yr] == 1) {
                    JOptionPane.showMessageDialog(null, "TOCASTE UNA CASILLA BLOQUEADA, AHORA TIENES UNA VIDA MENOS");
                    vidas = vidas - 1;
                    System.out.println("actualmente tienes " + vidas);
                    if (vidas < 1) {
                        JOptionPane.showMessageDialog(null, "YA NO TIENES MAS VIDAS, NO PUEDES SEGUIR JUGANDO");
                        FILCOL abrir = new FILCOL();
                        this.setVisible(false);
                        abrir.setVisible(true);
                    }
                }
            }
        }

    }//GEN-LAST:event_neededKeyPressed

    private void b_nivel3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_nivel3ActionPerformed
        if (nivel2 == true) {
            NIVEL3 abrir = new NIVEL3();
            this.setVisible(false);
            abrir.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "NO HAS PASADO EL NIVEL 2");
        }
    }//GEN-LAST:event_b_nivel3ActionPerformed

    private void b_automaticoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_automaticoMouseClicked
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
    }//GEN-LAST:event_b_automaticoMouseClicked

    private void b_generarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_generarMouseClicked

        Graphics t = Tablero.getGraphics();
        Image img = new ImageIcon(getClass().getResource("/pfmedia/x.png")).getImage();
        nn = FILCOL.n; //trae la fila
        mm = FILCOL.m; //trae la columna
        ancho = 800 / mm;/* ancho casillas*/
        alto = 550 / nn;/* alto casillas*/
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
                mt[i][j] = r.nextInt(3) + 1; // Genera el número aleatorio de 0 a 4 (en este caso, el límite varía según la dificultad).
                if (mt[i][j] == 1) {
                    t.setColor(Color.decode("#1f271b")); //Si se bloquea
                } else {
                    t.setColor(Color.decode("#f3fcf0")); // Ta libre :p
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
            }
        }

        if (inin == 5) {
            t.setColor(Color.decode("#f3fcf0"));
            t.fillRect(ancho * yr, alto * xr, ancho, alto);
            img = new ImageIcon(getClass().getResource("/pfmedia/x.png")).getImage();
            t.drawImage(img, ancho * yr, alto * xr, ancho, alto, Tablero);//posicion inicial

        }
        if (fina == 6) {
            t.setColor(Color.decode("#f3fcf0"));
            t.fillRect(ancho * yfr, alto * xfr, ancho, alto);
            img = new ImageIcon(getClass().getResource("/pfmedia/o.png")).getImage();
            t.drawImage(img, ancho * yfr, alto * xfr, ancho, alto, Tablero); // posicion final
        }

        for (int i = 0; i < nn; i++) {
            for (int j = 0; j < mm; j++) {
                t.setColor(Color.decode("#1f271b"));
                t.drawLine(0, i * alto, mm * ancho, i * alto);
                t.setColor(Color.decode("#1f271b"));
                t.drawLine(j * ancho, 0, j * ancho, nn * alto);
            }
        }
    }//GEN-LAST:event_b_generarMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
   
        Graphics t = Tablero.getGraphics();
        Image img = new ImageIcon(getClass().getResource("/pfmedia/x.png")).getImage();
        nn = FILCOL.n; //trae la fila
        mm = FILCOL.m; //trae la columna
        ancho = 800 / mm;/* ancho casillas*/
        alto = 550 / nn;/* alto casillas*/
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
                mt[i][j] = r.nextInt(3) + 1; // Genera el número aleatorio de 0 a 4 (en este caso, el límite varía según la dificultad).
                if (mt[i][j] == 1) {
                    t.setColor(Color.decode("#1f271b")); //Si se bloquea
                } else {
                    t.setColor(Color.decode("#f3fcf0")); // Ta libre :p
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
            }
        }

        if (inin == 5) {
            t.setColor(Color.decode("#f3fcf0"));
            t.fillRect(ancho * yr, alto * xr, ancho, alto);
            img = new ImageIcon(getClass().getResource("/pfmedia/x.png")).getImage();
            t.drawImage(img, ancho * yr, alto * xr, ancho, alto, Tablero);//posicion inicial

        }
        if (fina == 6) {
            t.setColor(Color.decode("#f3fcf0"));
            t.fillRect(ancho * yfr, alto * xfr, ancho, alto);
            img = new ImageIcon(getClass().getResource("/pfmedia/o.png")).getImage();
            t.drawImage(img, ancho * yfr, alto * xfr, ancho, alto, Tablero); // posicion final
        }

        for (int i = 0; i < nn; i++) {
            for (int j = 0; j < mm; j++) {
                t.setColor(Color.decode("#1f271b"));
                t.drawLine(0, i * alto, mm * ancho, i * alto);
                t.setColor(Color.decode("#1f271b"));
                t.drawLine(j * ancho, 0, j * ancho, nn * alto);
            }
        }
    }//GEN-LAST:event_formWindowOpened
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NIVEL2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Tablero;
    private javax.swing.JLabel b_automatico;
    private javax.swing.JLabel b_generar;
    private javax.swing.JButton b_nivel3;
    private javax.swing.JLabel level2bg;
    private javax.swing.JButton needed;
    private javax.swing.JPanel p_nivel2;
    // End of variables declaration//GEN-END:variables
}
