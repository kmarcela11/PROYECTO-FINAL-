
import java.awt.Color;
import java.awt.Graphics;
import static java.awt.MouseInfo.getPointerInfo;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class TableroFacil extends javax.swing.JFrame {

    
    public Clip clip;
    public String link = "/sonido/";
    
    public TableroFacil() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void mus(String archivo){
        
        try{
            
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(link+ archivo+ ".wav")));
            clip.start();
        }
        catch(IOException | LineUnavailableException | UnsupportedAudioFileException e){
            
        }
    }
    
    Scanner lea = new Scanner(System.in);
    int xpos = 0;
    int ypos = 0;
    int acum = 0;
    int n;
    int m;
    int ancho;
    int alto;
  
    public static int mt[][] = new int[100][100];
    int inicialx = 0;
    int inicialy = 0;
    int finalx = 0;
    int finaly = 0;

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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        GenerarTablero = new javax.swing.JButton();
        Tablero = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

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

        xtab.setText("holaaaaaaaaaa");
        getContentPane().add(xtab, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 80, 20));

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

        jButton3.setText("Generar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("musica");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(mostrarmt)
                        .addGap(266, 266, 266)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tablero, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(dificultad, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(148, 148, 148)
                                    .addComponent(GenerarTablero)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(jLabel4))))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addComponent(jButton4))))
                .addContainerGap(241, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(mostrarmt))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dificultad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(GenerarTablero)
                                .addComponent(jButton3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Tablero, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jButton4)
                        .addGap(51, 51, 51)
                        .addComponent(jButton1)))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GenerarTableroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarTableroActionPerformed
        Graphics t = Tablero.getGraphics();
       

        if (filas.getText().equals("") || columnas.getText().equals("")) { //validación texto vacio 
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR LOS DOS DATOS (N y M )");
        } else {
            n = Integer.parseInt(filas.getText());
            m = Integer.parseInt(columnas.getText());
            ancho = 800 / m;
            alto = 500 / n;
            acum = 1;

            if (((n <= 100) && (n > 0)) && ((m > 0) && (m <= 100))) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        t.setColor(Color.white);
                        
                        t.fillRect(ancho * j, alto * i, ancho, alto); //Se va moviendo por el código pintando cuadrito x cuadrito.

                        t.setColor(Color.black);
                        t.drawLine(0, i * alto, m * ancho, i * alto);
                        t.setColor(Color.black);
                        t.drawLine(j * ancho, 0, j * ancho, n * alto);

                    }
                }
            }

        }
    }//GEN-LAST:event_GenerarTableroActionPerformed

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
            System.out.println(inx + "  e  " + iny);

         
                Graphics t = Tablero.getGraphics();

                if (acum == 2) {
                    mt[iny][inx] = 6; //Posición final :)
                    t.setColor(Color.green);

                }

                if (acum == 1) {
                    mt[iny][inx] = 5; //Posición inicial :p
                    t.setColor(Color.red);
                    inicialx = inx;
                    inicialy = iny;
                    xtab.setLocation(inicialx * ancho,inicialy*alto);
                }
                acum = acum + 1;

                t.fillRect(ancho * inx, alto * iny, ancho, alto); // Pinta la casilla seleccionada.

            
        } else {
            JOptionPane.showMessageDialog(null, "YA SELECCIONO LAS DOS CASILLAS"); // con joptionpane mientras tanto 
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.out.println(inicialx + "   " + inicialy);
        boolean resultado = Buscar(mt, inicialy, inicialx, n, m);
        Graphics t = Tablero.getGraphics();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mt[i][j] == 0) {
                    t.setColor(Color.decode("#ff9966"));
                    t.fillRect(ancho * j, alto * i, ancho, alto); //Se va moviendo por el código pintando cuadrito x cuadrito.
                }

                t.setColor(Color.black);
                t.drawLine(0, i * alto, m * ancho, i * alto);
                t.drawLine(j * ancho, 0, j * ancho, n * alto);

            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static boolean Buscar(int mt[][], int inicialy, int inicialx, int n, int m) {
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
            encontrado = Buscar(mt, inicialy - 1, inicialx, n, m);
        }

        if (encontrado == true) {
            return true;
        }

        if (inicialx + 1 < m) {
            System.out.println("derecha");
            encontrado = Buscar(mt, inicialy, inicialx + 1, n, m);
        }

        if (encontrado == true) {
            return true;
        }

        if (inicialx - 1 >= 0) {
            System.out.println("izquierda");
            encontrado = Buscar(mt, inicialy, inicialx - 1, n, m);
        }

        if (encontrado == true) {
            return true;
        }

        if (inicialy + 1 < n) {
            System.out.println("abajo");
            encontrado = Buscar(mt, inicialy + 1, inicialx, n, m);
        }

        if (encontrado == true) {
            return true;
        }
        mt[inicialy][inicialx] = 1;
        return false;
    }
    
    
    private void TableroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TableroKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TableroKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void filasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filasKeyTyped
        char f = evt.getKeyChar();
        if ((f < '0' || f > '9') && (f != KeyEvent.VK_BACK_SPACE) && (f != '.' || filas.getText().contains(".")))
            evt.consume();
    }//GEN-LAST:event_filasKeyTyped

    private void columnasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_columnasKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c != KeyEvent.VK_BACK_SPACE) && (c != '.' || columnas.getText().contains(".")))
            evt.consume();
    }//GEN-LAST:event_columnasKeyTyped

    private void dificultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dificultadActionPerformed

    }//GEN-LAST:event_dificultadActionPerformed

    private void columnasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_columnasActionPerformed

    }//GEN-LAST:event_columnasActionPerformed

    private void filasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filasActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Graphics t = Tablero.getGraphics();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                
                t.setColor(Color.white);
                Random r = new Random();
                
                if(mt[i][j]!= 5 && mt[i][j]!=6){ /*estas son las casillas inicial y final*/
                    
                    mt[i][j] = r.nextInt(4) + 1; 
                    
                    if (mt[i][j] == 1) {
                            t.setColor(Color.black); /*bloqueada*/
                            
                            
                    }
                    t.fillRect(ancho * j, alto * i, ancho, alto); //Se va moviendo por el código pintando cuadrito x cuadrito.

                        t.setColor(Color.black);
                        t.drawLine(0, i * alto, m * ancho, i * alto);
                        t.setColor(Color.black);
                        t.drawLine(j * ancho, 0, j * ancho, n * alto);

                    }
                }
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
       mus("musica");
        
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(TableroFacil.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableroFacil.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableroFacil.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableroFacil.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField columnas;
    private javax.swing.JTextField dificultad;
    private javax.swing.JLabel down;
    private javax.swing.JTextField filas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel joystick;
    private javax.swing.JLabel left;
    private javax.swing.JButton mostrarmt;
    private javax.swing.JLabel right;
    private javax.swing.JLabel up;
    private javax.swing.JLabel xtab;
    // End of variables declaration//GEN-END:variables
}
