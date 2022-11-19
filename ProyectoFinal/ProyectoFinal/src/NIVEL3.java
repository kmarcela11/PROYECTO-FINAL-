import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JOptionPane;
public class NIVEL3 extends javax.swing.JFrame {
    public NIVEL3() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    int inicialx = 0, inicialy = 0;
    public static int n, m,nn,mm, ancho, alto,bloq,inin,fina, posicioninicial, posicionfinal, x, y, dx, dy, xr, yr, xfr, yfr;
    public static int mt[][] = new int[100][100];
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Tablero = new javax.swing.JPanel();
        b_generar = new javax.swing.JButton();
        b_ayuda = new javax.swing.JButton();
        b_bloqueadas = new javax.swing.JButton();
        b_ranking = new javax.swing.JButton();
        b_home = new javax.swing.JButton();
        b_salir = new javax.swing.JButton();
        b_automatico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 0));

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

        b_generar.setText("GENERAR TABLERO");
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

        b_ayuda.setText("AYUDA");
        b_ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ayudaActionPerformed(evt);
            }
        });

        b_bloqueadas.setText("GENERAR CASILLAS BLOQ AGAIN");
        b_bloqueadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_bloqueadasActionPerformed(evt);
            }
        });

        b_ranking.setText("VER RANKING");
        b_ranking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_rankingActionPerformed(evt);
            }
        });

        b_home.setText("VOLVER A INICIO ");
        b_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_homeActionPerformed(evt);
            }
        });

        b_salir.setText("SALIR");
        b_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_salirActionPerformed(evt);
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
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(Tablero, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_salir, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(b_automatico, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(92, 92, 92)
                .addComponent(b_ayuda)
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(b_ranking)
                        .addGap(69, 69, 69)
                        .addComponent(b_home))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(b_generar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_bloqueadas)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_ayuda)
                            .addComponent(b_generar)
                            .addComponent(b_bloqueadas)
                            .addComponent(b_salir))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(b_ranking))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b_automatico))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(b_home)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(Tablero, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_generarActionPerformed
    }//GEN-LAST:event_b_generarActionPerformed

    private void b_generarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b_generarKeyPressed
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
    }//GEN-LAST:event_b_generarKeyPressed

    private void b_ayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ayudaActionPerformed
        AYUDA abrir = new AYUDA();
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

    private void b_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_b_salirActionPerformed

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

    private void b_rankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_rankingActionPerformed
        RANKING abrir = new RANKING();
        this.setVisible(false);
        abrir.setVisible(true);
    }//GEN-LAST:event_b_rankingActionPerformed

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
                new NIVEL3().setVisible(true);
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
    private javax.swing.JButton b_ranking;
    private javax.swing.JButton b_salir;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
