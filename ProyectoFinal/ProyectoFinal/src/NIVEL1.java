import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;

public class NIVEL1 extends javax.swing.JFrame {

    public NIVEL1() {
        initComponents();
        this.setLocationRelativeTo(null);
        nivel1 = false;
        movimientos = 0;
        score.setText(String.valueOf(HOMEE.Ranking[HOMEE.jugadores][0]));
    }

    int inicialx = 0, inicialy = 0;
    public static int n, m, nn, mm, ancho, alto, inin, fina, posicioninicial, posicionfinal, xr, yr, xfr, yfr;
    public static int mt[][] = new int[100][100];
    public static boolean nivel1 = false;
    public static int vidas = 5, vd1;
    int movimientos = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        left = new javax.swing.JLabel();
        down = new javax.swing.JLabel();
        up = new javax.swing.JLabel();
        right = new javax.swing.JLabel();
        NOBORRAR = new javax.swing.JButton();
        joystick = new javax.swing.JLabel();
        vida1 = new javax.swing.JLabel();
        vida2 = new javax.swing.JLabel();
        vida5 = new javax.swing.JLabel();
        score = new javax.swing.JLabel();
        vida4 = new javax.swing.JLabel();
        vida3 = new javax.swing.JLabel();
        b_generar = new javax.swing.JLabel();
        Tablero = new javax.swing.JPanel();
        b_automatico = new javax.swing.JLabel();
        level1bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 700));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        left.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        left.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leftMouseClicked(evt);
            }
        });
        jPanel1.add(left, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 510, 40, 40));

        down.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        down.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                downMouseClicked(evt);
            }
        });
        jPanel1.add(down, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 550, 40, 40));

        up.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        up.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                upMouseClicked(evt);
            }
        });
        jPanel1.add(up, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 460, 40, 40));

        right.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        right.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rightMouseClicked(evt);
            }
        });
        jPanel1.add(right, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 510, 40, 40));

        NOBORRAR.setText("GENERAR TABLERO ");
        NOBORRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOBORRARActionPerformed(evt);
            }
        });
        NOBORRAR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NOBORRARKeyPressed(evt);
            }
        });
        jPanel1.add(NOBORRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 490, 0, 0));

        joystick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/joystick.png"))); // NOI18N
        jPanel1.add(joystick, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 450, 150, 150));

        vida1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/heart_spr.png"))); // NOI18N
        jPanel1.add(vida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 140, 50, 50));

        vida2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/heart_spr.png"))); // NOI18N
        jPanel1.add(vida2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 140, 50, 50));

        vida5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/heart_spr.png"))); // NOI18N
        jPanel1.add(vida5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 140, 50, 50));

        score.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        score.setForeground(new java.awt.Color(243, 252, 240));
        score.setText("000");
        jPanel1.add(score, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 240, -1, -1));

        vida4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/heart_spr.png"))); // NOI18N
        jPanel1.add(vida4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 140, 50, 50));

        vida3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/heart_spr.png"))); // NOI18N
        jPanel1.add(vida3, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 140, 50, 50));

        b_generar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/generarbt.png"))); // NOI18N
        b_generar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_generar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_generarMouseClicked(evt);
            }
        });
        jPanel1.add(b_generar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 50, 170, 50));

        Tablero.setBackground(new java.awt.Color(243, 252, 240));
        Tablero.setPreferredSize(new java.awt.Dimension(0, 0));

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

        jPanel1.add(Tablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 800, 550));

        b_automatico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/solvebt.png"))); // NOI18N
        b_automatico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_automatico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_automaticoMouseClicked(evt);
            }
        });
        jPanel1.add(b_automatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 380, 90, 80));

        level1bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/level1bg.png"))); // NOI18N
        jPanel1.add(level1bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_automaticoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_automaticoMouseClicked
        boolean resultado = Buscar(mt, inicialx, inicialy, nn, mm);
        //LLamado a procedimiento que resuelve autom??tica y recursivamente laberinto.
        Graphics t = Tablero.getGraphics();
        for (int i = 0; i < nn; i++) {
            for (int j = 0; j < mm; j++) {
                if (mt[i][j] == 0) {
                    t.setColor(Color.decode("#ff9966"));
                    t.fillRect(ancho * j, alto * i, ancho, alto); //Se va moviendo por el c??digo pintando cuadrito x cuadrito.
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
        nn = FILCOL.n; //Trae la fila
        mm = FILCOL.m; //Trae la columna
        ancho = 800 / mm;//Ancho casillas
        alto = 550 / nn;//Alto casillas
        Random r = new Random();
        xr = r.nextInt(nn);//Posici??n aleatoria de fila inicial.
        yr = r.nextInt(mm);//Posici??n aleatoria de columna inicial.
        inicialx = xr;
        inicialy = yr;
        xfr = r.nextInt(nn);//Posici??n aleatoria de fila final.
        yfr = r.nextInt(mm);//Posici??n aleatoria de columna final.
        while (xr == xfr && yfr == yr) {// En caso de que pos inicial y pos final sean iguales, se usa random otra vez.
            xfr = r.nextInt(nn);//Posici??n aleatoria de fila final.
            yfr = r.nextInt(mm);//Posici??n aleatoria de columna final.
        }
        for (int i = 0; i < nn; i++) {
            for (int j = 0; j < mm; j++) {
                mt[i][j] = r.nextInt(4) + 1;//Genera n??mero aleatorio de 0 a 4 (en este caso, el l??mite var??a seg??n la dificultad).
                if (mt[i][j] == 1) {
                    t.setColor(Color.decode("#1f271b"));//Si se bloquea.
                } else {
                    t.setColor(Color.decode("#f3fcf0"));//Est?? libre.
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
                    t.fillRect(ancho * j, alto * i, ancho, alto); //Se va moviendo por el c??digo pintando cuadrito x cuadrito.
                }
            }
        }
        if (inin == 5) {
            t.setColor(Color.decode("#f3fcf0"));
            t.fillRect(ancho * yr, alto * xr, ancho, alto);
            img = new ImageIcon(getClass().getResource("/pfmedia/x.png")).getImage();//Imagen de la X.
            t.drawImage(img, ancho * yr, alto * xr, ancho, alto, Tablero);//Imagen de la X se guarda en la posici??n inicial.
        }
        if (fina == 6) {
            t.setColor(Color.decode("#f3fcf0"));
            t.fillRect(ancho * yfr, alto * xfr, ancho, alto);
            img = new ImageIcon(getClass().getResource("/pfmedia/o.png")).getImage();//Imagen de O.
            t.drawImage(img, ancho * yfr, alto * xfr, ancho, alto, Tablero);//Imagen de la O se guarda en la posici??n final.
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

    private void NOBORRARKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NOBORRARKeyPressed
        Graphics t = Tablero.getGraphics();

        try {
            if (evt.getKeyCode() == 37) {//Tecla hacia izquierda.
                if (mt[xr][yr - 1] != 1 && yr > 0) {//Validaci??n para casilla libre y evitar salir de panel.
                    yr = yr - 1;
                    t.setColor(Color.decode("#F4A364"));
                    t.fillRect(ancho * yr, alto * xr, ancho, alto);
                    if (xr == xfr && yr == yfr) {//Se lleg?? a posici??n final.
                        nivel1 = true;
                        vd1 = vidas;
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
                        if (vidas == 4) {
                            vida5.setVisible(false);
                        }
                        if (vidas == 3) {
                            vida4.setVisible(false);
                        }
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
            }
            if (evt.getKeyCode() == 38) {//Tecla hacia arriba.
                if (mt[xr - 1][yr] != 1 && xr > 0) {

                    xr = xr - 1;

                    t.setColor(Color.decode("#F4A364"));
                    t.fillRect(ancho * yr, alto * xr, ancho, alto);
                    if (xr == xfr && yr == yfr) {
                        nivel1 = true;
                        vd1 = vidas;
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
                        if (vidas == 4) {
                            vida5.setVisible(false);
                        }
                        if (vidas == 3) {
                            vida4.setVisible(false);
                        }
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
            }

            if (evt.getKeyCode() == 39) {//Tecla hacia derecha.           
                if (mt[xr][yr + 1] != 1 && yr < mm) {
                    yr = yr + 1;
                    t.setColor(Color.decode("#F4A364"));
                    t.fillRect(ancho * yr, alto * xr, ancho, alto);
                    if (xr == xfr && yr == yfr) {
                        nivel1 = true;
                        vd1 = vidas;
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
                        if (vidas == 4) {
                            vida5.setVisible(false);
                        }
                        if (vidas == 3) {
                            vida4.setVisible(false);
                        }
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
            }
            if (evt.getKeyCode() == 40) {//Tecla hacia izquierda.
                if (mt[xr + 1][yr] != 1 && xr < nn) {
                    xr = xr + 1;
                    t.setColor(Color.decode("#F4A364"));
                    t.fillRect(ancho * yr, alto * xr, ancho, alto);
                    if (xr == xfr && yr == yfr) {
                        nivel1 = true;
                        vd1 = vidas;
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

                        if (vidas == 4) {
                            vida5.setVisible(false);
                        }
                        if (vidas == 3) {
                            vida4.setVisible(false);
                        }
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
            }
            movimientos++;
        } catch (Exception e) {
            movimientos++;
        }

    }//GEN-LAST:event_NOBORRARKeyPressed

    private void NOBORRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOBORRARActionPerformed

    }//GEN-LAST:event_NOBORRARActionPerformed

    private void upMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upMouseClicked
        Graphics t = Tablero.getGraphics();
        try {
            if (mt[xr - 1][yr] != 1 && xr > 0) {
                xr = xr - 1;

                t.setColor(Color.decode("#F4A364"));
                t.fillRect(ancho * yr, alto * xr, ancho, alto);
                if (xr == xfr && yr == yfr) {
                    nivel1 = true;
                    vd1 = vidas;
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
                    if (vidas == 4) {
                        vida5.setVisible(false);
                    }
                    if (vidas == 3) {
                        vida4.setVisible(false);
                    }
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

    private void rightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rightMouseClicked
        Graphics t = Tablero.getGraphics();
        try {
            if (mt[xr][yr + 1] != 1 && yr < mm) {
                yr = yr + 1;
                t.setColor(Color.decode("#F4A364"));
                t.fillRect(ancho * yr, alto * xr, ancho, alto);
                if (xr == xfr && yr == yfr) {
                    nivel1 = true;
                    vd1 = vidas;
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
                    if (vidas == 4) {
                        vida5.setVisible(false);
                    }
                    if (vidas == 3) {
                        vida4.setVisible(false);
                    }
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
                    nivel1 = true;
                    vd1 = vidas;
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

                    if (vidas == 4) {
                        vida5.setVisible(false);
                    }
                    if (vidas == 3) {
                        vida4.setVisible(false);
                    }
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

    private void leftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftMouseClicked
        Graphics t = Tablero.getGraphics();
        try {
            if (mt[xr][yr - 1] != 1 && yr > 0) {//Validaci??n para casilla libre y evitar salir de panel.
                yr = yr - 1;
                t.setColor(Color.decode("#F4A364"));
                t.fillRect(ancho * yr, alto * xr, ancho, alto);
                if (xr == xfr && yr == yfr) {//Se lleg?? a posici??n final.
                    nivel1 = true;
                    vd1 = vidas;
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
                    if (vidas == 4) {
                        vida5.setVisible(false);
                    }
                    if (vidas == 3) {
                        vida4.setVisible(false);
                    }
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

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NIVEL1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NOBORRAR;
    private javax.swing.JPanel Tablero;
    private javax.swing.JLabel b_automatico;
    private javax.swing.JLabel b_generar;
    private javax.swing.JLabel down;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel joystick;
    private javax.swing.JLabel left;
    private javax.swing.JLabel level1bg;
    private javax.swing.JLabel right;
    private javax.swing.JLabel score;
    private javax.swing.JLabel up;
    private javax.swing.JLabel vida1;
    private javax.swing.JLabel vida2;
    private javax.swing.JLabel vida3;
    private javax.swing.JLabel vida4;
    private javax.swing.JLabel vida5;
    // End of variables declaration//GEN-END:variables
}
