import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;

public class NIVEL2 extends javax.swing.JFrame {

    public NIVEL2() {
        initComponents();
        this.setLocationRelativeTo(null);
        movimientos = 0;
        nivel2 = false;
        score.setText(String.valueOf(HOMEE.Ranking[HOMEE.jugadores][0]));
    }

    int inicialx = 0, inicialy = 0;
    public static boolean nivel2 = false;
    public static int n, m, nn, mm, ancho, alto, inin, fina, posicioninicial, posicionfinal, xr, yr, xfr, yfr;
    public static int mt[][] = new int[100][100];
    public static int vidas = 3, vd2;
    private Image img;
    int movimientos = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        up = new javax.swing.JLabel();
        left = new javax.swing.JLabel();
        right = new javax.swing.JLabel();
        down = new javax.swing.JLabel();
        joystick = new javax.swing.JLabel();
        p_nivel2 = new javax.swing.JPanel();
        Tablero = new javax.swing.JPanel();
        vida1 = new javax.swing.JLabel();
        vida2 = new javax.swing.JLabel();
        vida3 = new javax.swing.JLabel();
        score = new javax.swing.JLabel();
        b_generar = new javax.swing.JLabel();
        b_automatico = new javax.swing.JLabel();
        level2bg = new javax.swing.JLabel();
        needed = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
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

        up.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        up.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                upMouseClicked(evt);
            }
        });
        getContentPane().add(up, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 460, 40, 40));

        left.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        left.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leftMouseClicked(evt);
            }
        });
        getContentPane().add(left, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 510, 40, 40));

        right.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        right.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rightMouseClicked(evt);
            }
        });
        getContentPane().add(right, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 510, 40, 40));

        down.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        down.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                downMouseClicked(evt);
            }
        });
        getContentPane().add(down, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 550, 40, 40));

        joystick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/joystick.png"))); // NOI18N
        getContentPane().add(joystick, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 450, 150, 150));

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

        vida1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/heart_spr.png"))); // NOI18N
        p_nivel2.add(vida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 140, 50, 50));

        vida2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/heart_spr.png"))); // NOI18N
        p_nivel2.add(vida2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 140, 50, 50));

        vida3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/heart_spr.png"))); // NOI18N
        p_nivel2.add(vida3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 140, 50, 50));

        score.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        score.setForeground(new java.awt.Color(243, 252, 240));
        score.setText("000");
        p_nivel2.add(score, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 240, -1, -1));

        b_generar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/generarbt.png"))); // NOI18N
        b_generar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_generar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_generarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b_generarMousePressed(evt);
            }
        });
        b_generar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                b_generarKeyPressed(evt);
            }
        });
        p_nivel2.add(b_generar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 50, 170, 50));

        b_automatico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/solvebt.png"))); // NOI18N
        b_automatico.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_automatico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_automaticoMouseClicked(evt);
            }
        });
        p_nivel2.add(b_automatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 360, 90, 80));

        level2bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/level2bg.png"))); // NOI18N
        p_nivel2.add(level2bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

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
        p_nivel2.add(needed, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 510, 10, 0));

        getContentPane().add(p_nivel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static boolean Buscar(int mt[][], int inicialy, int inicialx, int nn, int mm) {//Procedimiento que resuelve autom??tica y recursivamente laberinto.
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

    private void b_automaticoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_automaticoMouseClicked
        boolean resultado = Buscar(mt, inicialx, inicialy, nn, mm);
        Graphics t = Tablero.getGraphics();
        for (int i = 0; i < nn; i++) {
            for (int j = 0; j < mm; j++) {
                if (mt[i][j] == 0) {
                    t.setColor(Color.decode("#ff9966"));
                    t.fillRect(ancho * j, alto * i, ancho, alto);
                }
                t.setColor(Color.black);
                t.drawLine(0, i * alto, mm * ancho, i * alto);
                t.drawLine(j * ancho, 0, j * ancho, nn * alto);
            }
        }

        try {
            Thread.sleep(2000);
            HOMEE.Ranking[HOMEE.jugadores][0] = HOMEE.Ranking[HOMEE.jugadores][0];
            System.out.println(HOMEE.Ranking[HOMEE.jugadores][0]);
            System.out.println(movimientos);
            GAMEOVER salir = new GAMEOVER();
            salir.setVisible(true);
            this.setVisible(false);

        } catch (InterruptedException ex) {

        }
    }//GEN-LAST:event_b_automaticoMouseClicked

    private void b_generarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_generarMouseClicked
        Graphics t = Tablero.getGraphics();
        Image img = new ImageIcon(getClass().getResource("/pfmedia/x.png")).getImage();
        nn = FILCOL.n;
        mm = FILCOL.m;
        ancho = 800 / mm;
        alto = 550 / nn;
        Random r = new Random();
        xr = r.nextInt(nn);
        yr = r.nextInt(mm);
        inicialx = xr;
        inicialy = yr;
        xfr = r.nextInt(nn);
        yfr = r.nextInt(mm);
        while (xr == xfr && yfr == yr) {
            xfr = r.nextInt(nn);
            yfr = r.nextInt(mm);
        }
        for (int i = 0; i < nn; i++) {
            for (int j = 0; j < mm; j++) {
                mt[i][j] = r.nextInt(3) + 1;
                if (mt[i][j] == 1) {
                    t.setColor(Color.decode("#1f271b"));
                } else {
                    t.setColor(Color.decode("#f3fcf0"));
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
                    t.fillRect(ancho * j, alto * i, ancho, alto);
                }
            }
        }
        if (inin == 5) {
            t.setColor(Color.decode("#f3fcf0"));
            t.fillRect(ancho * yr, alto * xr, ancho, alto);
            img = new ImageIcon(getClass().getResource("/pfmedia/x.png")).getImage();
            t.drawImage(img, ancho * yr, alto * xr, ancho, alto, Tablero);
        }
        if (fina == 6) {
            t.setColor(Color.decode("#f3fcf0"));
            t.fillRect(ancho * yfr, alto * xfr, ancho, alto);
            img = new ImageIcon(getClass().getResource("/pfmedia/o.png")).getImage();
            t.drawImage(img, ancho * yfr, alto * xfr, ancho, alto, Tablero);
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

    }//GEN-LAST:event_formWindowOpened

    private void b_generarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b_generarKeyPressed

    }//GEN-LAST:event_b_generarKeyPressed

    private void b_generarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_generarMousePressed
    }//GEN-LAST:event_b_generarMousePressed

    private void neededKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_neededKeyPressed
        Graphics t = Tablero.getGraphics();

        try {
            if (evt.getKeyCode() == 37) {
                if (mt[xr][yr - 1] != 1 && yr > 0) {
                    yr = yr - 1;
                    t.setColor(Color.decode("#FCC26B"));
                    t.fillRect(ancho * yr, alto * xr, ancho, alto);
                    if (xr == xfr && yr == yfr) {
                        nivel2 = true;
                        vd2 = vidas;
                        HOMEE.Ranking[HOMEE.jugadores][0] = HOMEE.Ranking[HOMEE.jugadores][0] + (nn * mm) - movimientos + vidas * 100;
                        System.out.println(HOMEE.Ranking[HOMEE.jugadores][0]);
                        System.out.println(movimientos);
                        NEXTLEVEL abrir = new NEXTLEVEL();
                        abrir.setVisible(true);
                        this.setVisible(false);
                    }
                } else {
                    if (mt[xr][yr - 1] == 1) {
                        vidas = vidas - 1;
                        System.out.println("actualmente tienes " + vidas);
                        if (vidas == 2) {
                            vida3.setVisible(false);
                        }
                        if (vidas == 1) {
                            vida2.setVisible(false);
                        }
                        if (vidas < 1) {
                            HOMEE.Ranking[HOMEE.jugadores][0] = HOMEE.Ranking[HOMEE.jugadores][0] + ((nn * mm) - movimientos + vidas * 100) / 2;
                            System.out.println(HOMEE.Ranking[HOMEE.jugadores][0]);
                            System.out.println(movimientos);
                            vida1.setVisible(false);
                            GAMEOVER salir = new GAMEOVER();
                            salir.setVisible(true);
                            this.setVisible(false);
                        }
                    }
                }
            }
            if (evt.getKeyCode() == 38) {

                if (mt[xr - 1][yr] != 1 && xr > 0) {
                    xr = xr - 1;
                    t.setColor(Color.decode("#FCC26B"));
                    t.fillRect(ancho * yr, alto * xr, ancho, alto);
                    if (xr == xfr && yr == yfr) {
                        nivel2 = true;
                        vd2 = vidas;
                        HOMEE.Ranking[HOMEE.jugadores][0] = HOMEE.Ranking[HOMEE.jugadores][0] + (nn * mm) - movimientos + vidas * 100;
                        System.out.println(HOMEE.Ranking[HOMEE.jugadores][0]);
                        System.out.println(movimientos);
                        NEXTLEVEL abrir = new NEXTLEVEL();
                        abrir.setVisible(true);
                        this.setVisible(false);
                    }
                } else {
                    if (mt[xr - 1][yr] == 1) {
                        vidas = vidas - 1;
                        System.out.println("actualmente tienes " + vidas);
                        if (vidas == 2) {
                            vida3.setVisible(false);
                        }
                        if (vidas == 1) {
                            vida2.setVisible(false);
                        }
                        if (vidas < 1) {
                            HOMEE.Ranking[HOMEE.jugadores][0] = HOMEE.Ranking[HOMEE.jugadores][0] + ((nn * mm) - movimientos + vidas * 100) / 2;
                            System.out.println(HOMEE.Ranking[HOMEE.jugadores][0]);
                            System.out.println(movimientos);
                            vida1.setVisible(false);
                            GAMEOVER salir = new GAMEOVER();
                            salir.setVisible(true);
                            this.setVisible(false);
                        }
                    }
                }
            }

            if (evt.getKeyCode() == 39) {
                if (mt[xr][yr + 1] != 1 && yr < mm) {
                    yr = yr + 1;
                    t.setColor(Color.decode("#FCC26B"));
                    t.fillRect(ancho * yr, alto * xr, ancho, alto);
                    if (xr == xfr && yr == yfr) {
                        nivel2 = true;
                        vd2 = vidas;
                        HOMEE.Ranking[HOMEE.jugadores][0] = HOMEE.Ranking[HOMEE.jugadores][0] + (nn * mm) - movimientos + vidas * 100;
                        System.out.println(HOMEE.Ranking[HOMEE.jugadores][0]);
                        System.out.println(movimientos);
                        NEXTLEVEL abrir = new NEXTLEVEL();
                        abrir.setVisible(true);
                        this.setVisible(false);
                    }
                } else {
                    if (mt[xr][yr + 1] == 1) {
                        vidas = vidas - 1;
                        System.out.println("actualmente tienes " + vidas);
                        if (vidas == 2) {
                            vida3.setVisible(false);
                        }
                        if (vidas == 1) {
                            vida2.setVisible(false);
                        }
                        if (vidas < 1) {
                            HOMEE.Ranking[HOMEE.jugadores][0] = HOMEE.Ranking[HOMEE.jugadores][0] + ((nn * mm) - movimientos + vidas * 100) / 2;
                            System.out.println(HOMEE.Ranking[HOMEE.jugadores][0]);
                            System.out.println(movimientos);
                            vida1.setVisible(false);
                            GAMEOVER salir = new GAMEOVER();
                            salir.setVisible(true);
                            this.setVisible(false);
                        }
                    }
                }
            }
            if (evt.getKeyCode() == 40) {
                if (mt[xr + 1][yr] != 1 && xr < nn) {
                    xr = xr + 1;
                    t.setColor(Color.decode("#FCC26B"));
                    t.fillRect(ancho * yr, alto * xr, ancho, alto);
                    if (xr == xfr && yr == yfr) {
                        nivel2 = true;
                        vd2 = vidas;
                        HOMEE.Ranking[HOMEE.jugadores][0] = HOMEE.Ranking[HOMEE.jugadores][0] + (nn * mm) - movimientos + vidas * 100;
                        System.out.println(HOMEE.Ranking[HOMEE.jugadores][0]);
                        System.out.println(movimientos);
                        NEXTLEVEL abrir = new NEXTLEVEL();
                        abrir.setVisible(true);
                        this.setVisible(false);
                    }
                } else {
                    if (mt[xr + 1][yr] == 1) {
                        vidas = vidas - 1;
                        System.out.println("actualmente tienes " + vidas);

                        if (vidas == 2) {
                            vida3.setVisible(false);
                        }
                        if (vidas == 1) {
                            vida2.setVisible(false);
                        }
                        if (vidas < 1) {
                            HOMEE.Ranking[HOMEE.jugadores][0] = HOMEE.Ranking[HOMEE.jugadores][0] + ((nn * mm) - movimientos + vidas * 100) / 2;
                            System.out.println(HOMEE.Ranking[HOMEE.jugadores][0]);
                            System.out.println(movimientos);
                            vida1.setVisible(false);
                            GAMEOVER salir = new GAMEOVER();
                            salir.setVisible(true);
                            this.setVisible(false);
                        }
                    }
                }
            }
        } catch (Exception e) {

        }
        movimientos++;
    }//GEN-LAST:event_neededKeyPressed

    private void neededActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neededActionPerformed

    }//GEN-LAST:event_neededActionPerformed

    private void upMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upMouseClicked
        Graphics t = Tablero.getGraphics();
        try {
            if (mt[xr - 1][yr] != 1 && xr > 0) {
                xr = xr - 1;

                t.setColor(Color.decode("#F4A364"));
                t.fillRect(ancho * yr, alto * xr, ancho, alto);
                if (xr == xfr && yr == yfr) {
                    nivel2 = true;
                    vd2 = vidas;
                    HOMEE.Ranking[HOMEE.jugadores][0] = HOMEE.Ranking[HOMEE.jugadores][0] + (nn * mm) - movimientos + vidas * 50;
                    //C??lculo de puntaje obtenido.
                    System.out.println(HOMEE.Ranking[HOMEE.jugadores][0]);
                    System.out.println(movimientos);
                    NEXTLEVEL sgte = new NEXTLEVEL();
                    sgte.setVisible(true);
                    this.setVisible(false);
                }
            } else {
                if (mt[xr - 1][yr] == 1) {
                    vidas = vidas - 1;
                    System.out.println("actualmente tienes " + vidas);

                    if (vidas == 2) {
                        vida3.setVisible(false);
                    }
                    if (vidas == 1) {
                        vida2.setVisible(false);
                    }
                    if (vidas < 1) {
                        HOMEE.Ranking[HOMEE.jugadores][0] = HOMEE.Ranking[HOMEE.jugadores][0] + ((nn * mm) - movimientos + vidas * 50) / 2;
                        System.out.println(HOMEE.Ranking[HOMEE.jugadores][0]);
                        System.out.println(movimientos);
                        vida1.setVisible(false);
                        GAMEOVER salir = new GAMEOVER();
                        salir.setVisible(true);
                        this.setVisible(false);
                    }
                }
            }
            movimientos++;
        } catch (Exception e) {
            movimientos++;
        }
    }//GEN-LAST:event_upMouseClicked

    private void leftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftMouseClicked
        Graphics t = Tablero.getGraphics();
        try {
            if (mt[xr][yr - 1] != 1 && yr > 0) {//Validaci??n para casilla libre y evitar salir de panel.
                yr = yr - 1;
                t.setColor(Color.decode("#F4A364"));
                t.fillRect(ancho * yr, alto * xr, ancho, alto);
                if (xr == xfr && yr == yfr) {//Se lleg?? a posici??n final.
                    nivel2 = true;
                    vd2 = vidas;
                    HOMEE.Ranking[HOMEE.jugadores][0] = HOMEE.Ranking[HOMEE.jugadores][0] + (nn * mm) - movimientos + vidas * 50;
                    //C??lculo de puntaje obtenido.
                    System.out.println(HOMEE.Ranking[HOMEE.jugadores][0]);
                    System.out.println(movimientos);
                    NEXTLEVEL sgte = new NEXTLEVEL();
                    sgte.setVisible(true);
                    this.setVisible(false);
                }
            } else {
                if (mt[xr][yr - 1] == 1) {//Golpe con casilla bloqueada.
                    vidas = vidas - 1;//Pierde una vida.
                    System.out.println("actualmente tienes " + vidas);

                    if (vidas == 2) {
                        vida3.setVisible(false);
                    }
                    if (vidas == 1) {
                        vida2.setVisible(false);
                    }
                    if (vidas < 1) {
                        vida1.setVisible(false);
                        HOMEE.Ranking[HOMEE.jugadores][0] = HOMEE.Ranking[HOMEE.jugadores][0] + ((nn * mm) - movimientos + vidas * 50) / 2;
                        //C??lculo del puntaje obtenido.
                        System.out.println(HOMEE.Ranking[HOMEE.jugadores][0]);
                        System.out.println(movimientos);
                        GAMEOVER salir = new GAMEOVER();
                        salir.setVisible(true);
                        this.setVisible(false);
                    }
                }
            }
            movimientos++;
        } catch (Exception e) {
            movimientos++;
        }
    }//GEN-LAST:event_leftMouseClicked

    private void rightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rightMouseClicked
        Graphics t = Tablero.getGraphics();
        try {
            if (mt[xr][yr + 1] != 1 && yr < mm) {
                yr = yr + 1;
                t.setColor(Color.decode("#F4A364"));
                t.fillRect(ancho * yr, alto * xr, ancho, alto);
                if (xr == xfr && yr == yfr) {
                    nivel2 = true;
                    vd2 = vidas;
                    HOMEE.Ranking[HOMEE.jugadores][0] = HOMEE.Ranking[HOMEE.jugadores][0] + (nn * mm) - movimientos + vidas * 50;
                    System.out.println(HOMEE.Ranking[HOMEE.jugadores][0]);
                    System.out.println(movimientos);
                    NEXTLEVEL sgte = new NEXTLEVEL();
                    sgte.setVisible(true);
                    this.setVisible(false);
                }
            } else {
                if (mt[xr][yr + 1] == 1) {
                    vidas = vidas - 1;
                    System.out.println("actualmente tienes " + vidas);

                    if (vidas == 2) {
                        vida3.setVisible(false);
                    }
                    if (vidas == 1) {
                        vida2.setVisible(false);
                    }
                    if (vidas < 1) {
                        HOMEE.Ranking[HOMEE.jugadores][0] = HOMEE.Ranking[HOMEE.jugadores][0] + ((nn * mm) - movimientos + vidas * 50) / 2;
                        System.out.println(HOMEE.Ranking[HOMEE.jugadores][0]);
                        System.out.println(movimientos);
                        vida1.setVisible(false);
                        GAMEOVER salir = new GAMEOVER();
                        salir.setVisible(true);
                        this.setVisible(false);
                    }
                }
            }
            movimientos++;
        } catch (Exception e) {
            movimientos++;
        }
    }//GEN-LAST:event_rightMouseClicked

    private void downMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_downMouseClicked
        Graphics t = Tablero.getGraphics();
        try {
            if (mt[xr + 1][yr] != 1 && xr < nn) {
                xr = xr + 1;
                t.setColor(Color.decode("#F4A364"));
                t.fillRect(ancho * yr, alto * xr, ancho, alto);
                if (xr == xfr && yr == yfr) {
                    nivel2 = true;
                    vd2 = vidas;
                    HOMEE.Ranking[HOMEE.jugadores][0] = HOMEE.Ranking[HOMEE.jugadores][0] + (nn * mm) - movimientos + vidas * 50;
                    System.out.println(HOMEE.Ranking[HOMEE.jugadores][0]);
                    HOMEE.Ranking[HOMEE.jugadores][1] = HOMEE.Ranking[HOMEE.jugadores][1] + vidas;
                    System.out.println(movimientos);
                    NEXTLEVEL sgte = new NEXTLEVEL();
                    sgte.setVisible(true);
                    this.setVisible(false);
                }
            } else {
                if (mt[xr + 1][yr] == 1) {
                    vidas = vidas - 1;
                    System.out.println("actualmente tienes " + vidas);

                    if (vidas == 2) {
                        vida3.setVisible(false);
                    }
                    if (vidas == 1) {
                        vida2.setVisible(false);
                    }
                    if (vidas < 1) {
                        HOMEE.Ranking[HOMEE.jugadores][0] = HOMEE.Ranking[HOMEE.jugadores][0] + ((nn * mm) - movimientos + vidas * 50) / 2;
                        System.out.println(HOMEE.Ranking[HOMEE.jugadores][0]);
                        System.out.println(movimientos);
                        vida1.setVisible(false);
                        GAMEOVER salir = new GAMEOVER();
                        salir.setVisible(true);
                        this.setVisible(false);
                    }
                }
            }
            movimientos++;
        } catch (Exception e) {
            movimientos++;
        }
    }//GEN-LAST:event_downMouseClicked
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
    private javax.swing.JLabel down;
    private javax.swing.JLabel joystick;
    private javax.swing.JLabel left;
    private javax.swing.JLabel level2bg;
    private javax.swing.JButton needed;
    private javax.swing.JPanel p_nivel2;
    private javax.swing.JLabel right;
    private javax.swing.JLabel score;
    private javax.swing.JLabel up;
    private javax.swing.JLabel vida1;
    private javax.swing.JLabel vida2;
    private javax.swing.JLabel vida3;
    // End of variables declaration//GEN-END:variables
}
