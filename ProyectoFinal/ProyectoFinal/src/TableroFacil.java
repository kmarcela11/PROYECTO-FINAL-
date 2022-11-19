
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
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

    public Clip clip;
    /*sonido*/
    public String link = "/sonido/";
    /*paquete en donde se encuentra la música*/
    
    public TableroFacil() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void mus(String archivo) {
        /*código para la pista musical*/
        try {
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(link + archivo + ".wav")));
            clip.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {

        }
    }

    Scanner lea = new Scanner(System.in);
    int inicialx = 0, inicialy = 0;
    public static int n, m,nn,mm, ancho, alto,bloq,inin,fina, posicioninicial, posicionfinal, x, y, dx, dy, xr, yr, xfr, yfr;
    public static int mt[][] = new int[100][100];
    private Image img;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        b_pintar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                b_pintarKeyPressed(evt);
            }
        });

        Tablero.setBackground(new java.awt.Color(204, 204, 204));
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

        jLabel1.setText("n");

        jLabel2.setText("m");

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
                                .addComponent(b_salir)
                                .addGap(190, 190, 190)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(241, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(b_salir)
                                    .addComponent(b_mostrarmatriz))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(dificultad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(b_pintar)
                                                .addComponent(b_generar)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(equis, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Tablero, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(b_musica)
                        .addGap(51, 51, 51)
                        .addComponent(b_resolver)))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_pintarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_pintarActionPerformed
    Graphics t = Tablero.getGraphics();
    Image img = new ImageIcon(getClass().getResource("/pfmedia/x.png")).getImage();
    
                nn = inicio.n; //trae la fila
                mm = inicio.m; //trae la columna
                
                if ((nn >= 8 && nn <= 100) && (mm >= 16 && mm <= 100)) { /*validación de tamaño máx y min de matriz*/
                
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
                        
                        if ((i == xfr && j == yfr)&& !(mt[i][j] == 1)) {
                            mt[i][j] = 6;
                            fina = 6;
                        }
                        
                        if (!(i == xr && j == yr) && !(i == xfr && j == yfr)){
                             t.fillRect(ancho * j, alto * i, ancho, alto); //Se va moviendo por el código pintando cuadrito x cuadrito.
                        }
                        
                        t.setColor(Color.black);
                        t.drawLine(0, i * alto, mm * ancho, i * alto);
                        t.setColor(Color.black);
                        t.drawLine(j * ancho, 0, j * ancho, nn * alto);

                    }
                }
               
                if (inin == 5){
                    img = new ImageIcon(getClass().getResource("/pfmedia/x.png")).getImage();
                    t.drawImage(img, ancho * yr, alto * xr, ancho, alto, Tablero);//posicion inicial
                }
                
                if (fina ==6){
                    img = new ImageIcon(getClass().getResource("/pfmedia/o.png")).getImage();
                    t.drawImage(img, ancho * yfr, alto * xfr, ancho, alto, Tablero); // posicion final
                }  
                
            } else {                
                JOptionPane.showMessageDialog(null, "el número de filas debe ser mayor o igual a 8 y menor o igual a 100. \n"
                        + "el número de columnas debe ser mayor o igual a 16 y menor o igual a 100");               
            }
    }//GEN-LAST:event_b_pintarActionPerformed

    private void b_mostrarmatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_mostrarmatrizActionPerformed
        for (int i = 0; i < nn; i++) {
            for (int j = 0; j < mm; j++) {
                System.out.print(String.valueOf(mt[i][j]) + " ");
            }
            System.out.print(" \n");
        }

        System.out.print(" \n");
    }//GEN-LAST:event_b_mostrarmatrizActionPerformed

    private void b_resolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_resolverActionPerformed
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
    }//GEN-LAST:event_b_resolverActionPerformed
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

    private void b_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_b_salirActionPerformed

    private void columnasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_columnasKeyTyped

    }//GEN-LAST:event_columnasKeyTyped

    private void b_generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_generarActionPerformed
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

    }//GEN-LAST:event_b_generarActionPerformed

    private void b_musicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_musicaActionPerformed
        mus("musica");

    }//GEN-LAST:event_b_musicaActionPerformed

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped

    }//GEN-LAST:event_formKeyTyped

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed

    }//GEN-LAST:event_jPanel1KeyPressed

    private void TableroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TableroKeyPressed
    
    }//GEN-LAST:event_TableroKeyPressed

    private void b_pintarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b_pintarKeyPressed
        Graphics t = Tablero.getGraphics();
        
        if (evt.getKeyCode()==37){ //izquierda
            if(mt[xr][yr-1]!=1 && yr>0){
                yr=yr-1;
                t.setColor(Color.green);
                t.fillRect(ancho * yr, alto * xr, ancho, alto);
                if (xr==xfr && yr==yfr){
                     JOptionPane.showMessageDialog(null, "Ganaste wuu");
                }
            }    
        }
        
        if (evt.getKeyCode()==38){ //arriba
            
            if(mt[xr-1][yr]!=1 && xr>0){
                xr=xr-1;
                t.setColor(Color.green);
                t.fillRect(ancho * yr, alto * xr, ancho, alto);
                
                 if (xr==xfr && yr==yfr){
                     JOptionPane.showMessageDialog(null, "Ganaste wuu");
                }
            }
        }
        
        if (evt.getKeyCode()==39){ // derecha           
           
            if(mt[xr][yr+1]!=1 && yr<mm){
                yr=yr+1;
                t.setColor(Color.green);
                t.fillRect(ancho * yr, alto * xr, ancho, alto);                
                 if (xr==xfr && yr==yfr){
                     JOptionPane.showMessageDialog(null, "Ganaste wuu");
                }
            }
            
           
      
        
        if (evt.getKeyCode()==40){ //izquierda
            if(mt[xr+1][yr]!=1 && xr<nn){
                xr=xr+1;
                t.setColor(Color.green);
                t.fillRect(ancho * yr, alto * xr, ancho, alto);
                 if (xr==xfr && yr==yfr){
                     JOptionPane.showMessageDialog(null, "Ganaste wuu");
                }
            }
        }
        
    }//GEN-LAST:event_b_pintarKeyPressed

    private int PosMatriz(int poscursor, int filcol, int medida) {
        // Función que retorna la posición del cursor en la matriz.
        int k = 0;
        while (k < filcol && poscursor > k * medida) {
            k++;
        }
        return k - 1;
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
    private javax.swing.JTextField dificultad;
    private javax.swing.JLabel equis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
