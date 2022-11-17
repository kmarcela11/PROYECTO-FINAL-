
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
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
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class TableroFacil extends javax.swing.JFrame {
    
    public Clip clip; /*sonido*/
    public String link = "/sonido/"; /*paquete en donde se encuentra la música*/

    public TableroFacil() {
        initComponents();
        this.setLocationRelativeTo(null);
     
    }    

    public void mus(String archivo) { /*código para la pista musical*/
        try {
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(link + archivo + ".wav")));
            clip.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            
        }
    }
    
    Scanner lea= new Scanner(System.in);
    int inicialx = 0, inicialy = 0;
    public static int n, m, ancho, alto, posicioninicial, posicionfinal, x, y, dx, dy, xr, yr;
    public static int mt[][] = new int[100][100];
    private Image img;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filas = new javax.swing.JTextField();
        columnas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        dificultad = new javax.swing.JTextField();
        b_mostrarmatriz = new javax.swing.JButton();
        b_resolver = new javax.swing.JButton();
        b_salir = new javax.swing.JButton();
        b_pintar = new javax.swing.JButton();
        Tablero = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        b_generar = new javax.swing.JButton();
        b_musica = new javax.swing.JButton();
        equis = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(filas, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, 100, -1));
        getContentPane().add(columnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, 100, -1));

        jLabel1.setText("n");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, -1, -1));

        jLabel2.setText("m");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, -1, -1));

        jPanel1.setBackground(new java.awt.Color(153, 204, 0));
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
        });

        b_mostrarmatriz.setText("Mostrar matriz en consola");
        b_mostrarmatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_mostrarmatrizActionPerformed(evt);
            }
        });

        b_resolver.setText("Resolver");
        b_resolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_resolverActionPerformed(evt);
            }
        });

        b_salir.setText("salir xd");
        b_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_salirActionPerformed(evt);
            }
        });

        b_pintar.setText("Pintar ");
        b_pintar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_pintarActionPerformed(evt);
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

        b_generar.setText("Generar");
        b_generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_generarActionPerformed(evt);
            }
        });

        b_musica.setText("musica");
        b_musica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_musicaActionPerformed(evt);
            }
        });

        equis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/x.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(dificultad, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(148, 148, 148)
                                .addComponent(b_pintar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(b_generar))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(equis, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Tablero, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(b_resolver)
                                    .addComponent(b_musica)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(b_mostrarmatriz)
                                .addGap(266, 266, 266)
                                .addComponent(b_salir)))
                        .addContainerGap(241, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_salir)
                            .addComponent(b_mostrarmatriz))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(dificultad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(b_pintar)
                                        .addComponent(b_generar)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Tablero, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(equis, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(b_musica)
                        .addGap(51, 51, 51)
                        .addComponent(b_resolver)))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_pintarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_pintarActionPerformed
        
        Graphics t = Tablero.getGraphics();
         Image img = new ImageIcon(getClass().getResource("/pfmedia/x.png")).getImage();
        
        if (filas.getText().equals("") || columnas.getText().equals("")) { //validación texto vacio 
            
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR LOS DOS DATOS (N y M )");
            
        } else {
            
            n = Integer.parseInt(filas.getText()); /*toma cantidad de filas del textfield*/
            
            m = Integer.parseInt(columnas.getText()); /*toma cantidad de columnas del textfield*/
            
            if ((n >= 8 && n <= 100) && (m >= 16 && m <= 100)) { /*validación de tamaño máx y min de matriz*/
                
                ancho = 800 / m; /* ancho casillas*/
                alto = 500 / n; /* alto casillas*/
   
                Random r = new Random();

                int xr = r.nextInt(n); // Posición aleatoria de fila inicial.
                int yr = r.nextInt(m); // Posición aleatoria de columnas inicial.

                int xfr = r.nextInt(n); // Posición aleatoria de fila final.
                int yfr = r.nextInt(m); // Posición aleatoria de columnas final.
                
                while (xr == xfr && yfr == yr) { // en caso de que pos inicial y pos final sean iguales, se usa random otra vez
                    
                    xfr = r.nextInt(n); // Posición aleatoria de fila final.
                    yfr = r.nextInt(m); // Posición aleatoria de columnas final.
                }


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
                        t.setColor(Color.green); // posicion inicial
                    }

                    if (i == xfr && j == yfr) {
                        mt[i][j] = 6;
                        t.setColor(Color.blue); // posicion final
                    }

                t.fillRect(ancho * j, alto * i, ancho, alto); //Se va moviendo por el código pintando cuadrito x cuadrito.
                t.setColor(Color.black);
                t.drawLine(0, i * alto, m * ancho, i * alto);
                t.setColor(Color.black);
                t.drawLine(j * ancho, 0, j * ancho, n * alto);

                    }
                }
                
            }
            else {
                
                JOptionPane.showMessageDialog(null, "el número de filas debe ser mayor o igual a 8 y menor o igual a 100. \n"
                        + "el número de columnas debe ser mayor o igual a 16 y menor o igual a 100");                
            }
        }
    }//GEN-LAST:event_b_pintarActionPerformed

    private void TableroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableroMouseClicked
        /*Point posicion = getPointerInfo().getLocation();
        dificultad.setText("");
        int curx = posicion.x - Tablero.getLocationOnScreen().x;
        // System.out.println(curx); DE CONTROL
        int cury = posicion.y - Tablero.getLocationOnScreen().y;
        // System.out.println(cury); DE CONTROL
        // System.out.println(acum); DE CONTROL
        if (acum <= 2) { //validacion para que solo se pueda seleccionar dos casillas 
            int inx = PosMatriz(curx, m, ancho);
            int iny = PosMatriz(cury, n, alto);
            System.out.println(" la columna " + inx + "  y  " + " la fila " + iny);
            Graphics t = Tablero.getGraphics();
            Image img = new ImageIcon(getClass().getResource("/pfmedia/x.png")).getImage();
            if (acum == 1) {
                mt[iny][inx] = 5; //Posición inicial :p
                inicialx = inx;
                inicialy = iny;
                img = new ImageIcon(getClass().getResource("/pfmedia/x.png")).getImage();
                t.drawImage(img, (ancho * inx) + 18, (alto * iny) + 20, Tablero);
                
                System.out.println(posicioninicial);
            }
            if (acum == 2) {
                mt[iny][inx] = 6; //Posición final :)
                int yf = iny;
                int xf = inx;
                
                System.out.println(posicionfinal);
                if ((inicialx != xf) && (inicialy != yf)) {
                    System.out.println(posicioninicial + " diferente de " + posicionfinal);
                    img = new ImageIcon(getClass().getResource("/pfmedia/o.png")).getImage();
                    /*img = img.getScaledInstance(inx, iny, java.awt.Image.SCALE_SMOOTH); //PARA REDIMENSIONAR (No funciona :/) 
                    t.drawImage(img, (ancho * inx) + 18, (alto * iny) + 20, Tablero);
                } else {
                    JOptionPane.showMessageDialog(null, "no puede digitar la misma casilla de inicio");
                    acum = acum - 1;                    
                    System.out.println(posicioninicial + " igual " + posicionfinal); //validacion no pueden ser las mismas casillas al seleccionar
                }
            }
            acum = acum + 1;            
        } else {
            JOptionPane.showMessageDialog(null, "YA SELECCIONO LAS DOS CASILLAS"); // con joptionpane mientras tanto 
        } */
    }//GEN-LAST:event_TableroMouseClicked

    private void b_mostrarmatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_mostrarmatrizActionPerformed
        /*for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(String.valueOf(mt[i][j]) + " ");
            }
            System.out.print(" \n");
        }
        
        System.out.print(" \n"); */
    }//GEN-LAST:event_b_mostrarmatrizActionPerformed

    private void b_resolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_resolverActionPerformed
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
    }//GEN-LAST:event_b_resolverActionPerformed
   
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
    

    private void b_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_b_salirActionPerformed

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

    private void b_generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_generarActionPerformed
        Graphics t = Tablero.getGraphics();        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
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
                    t.drawLine(0, i * alto, m * ancho, i * alto);
                    t.setColor(Color.black);
                    t.drawLine(j * ancho, 0, j * ancho, n * alto);
                }
            }
        } 

    }//GEN-LAST:event_b_generarActionPerformed

    private void b_musicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_musicaActionPerformed
        mus("musica");
        
    }//GEN-LAST:event_b_musicaActionPerformed

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped

    }//GEN-LAST:event_formKeyTyped

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed
        // TODO add your handling code here:
        x = equis.getX();
        y = equis.getY();
        switch(evt.getExtendedKeyCode()){
            case KeyEvent.VK_UP:equis.setLocation(x,y-1); break;
            case KeyEvent.VK_DOWN:equis.setLocation(x,y+1); break;
            case KeyEvent.VK_RIGHT:equis.setLocation(x+1,y); break;
            case KeyEvent.VK_LEFT:equis.setLocation(x-1,y); break;
        }
        
      
    }//GEN-LAST:event_jPanel1KeyPressed

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
    
    


    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableroFacil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Tablero;
    private javax.swing.JButton b_generar;
    private javax.swing.JButton b_mostrarmatriz;
    private javax.swing.JButton b_musica;
    private javax.swing.JButton b_pintar;
    private javax.swing.JButton b_resolver;
    private javax.swing.JButton b_salir;
    private javax.swing.JTextField columnas;
    private javax.swing.JTextField dificultad;
    private javax.swing.JLabel equis;
    private javax.swing.JTextField filas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
