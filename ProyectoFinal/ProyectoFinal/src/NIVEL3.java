
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class NIVEL3 extends javax.swing.JFrame {

    public NIVEL3() {
        initComponents();
        this.setLocationRelativeTo(null);
        score.setText(String.valueOf(HOMEE.Ranking[HOMEE.jugadores][0]));
        nivel3 = false;
        movimientos = 0;
    }
    
    int inicialx = 0, inicialy = 0;
    public static int n, m, nn, mm, ancho, alto, inin, fina, posicioninicial, posicionfinal, xr, yr, xfr, yfr;
    public static int mt[][] = new int[100][100];
    public static int vidas = 1,vd3;
    public static boolean nivel3 = false;
    int movimientos;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b_generar = new javax.swing.JLabel();
        b_automatico = new javax.swing.JLabel();
        vida1 = new javax.swing.JLabel();
        score = new javax.swing.JLabel();
        Tablero = new javax.swing.JPanel();
        lv3bg = new javax.swing.JLabel();
        temp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(b_generar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 480, 170, 50));

        b_automatico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/solvebt.png"))); // NOI18N
        b_automatico.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_automatico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_automaticoMouseClicked(evt);
            }
        });
        getContentPane().add(b_automatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 360, 90, 80));

        vida1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/heartlv3.png"))); // NOI18N
        getContentPane().add(vida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 140, 100, 90));

        score.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        score.setForeground(new java.awt.Color(243, 252, 240));
        score.setText("000");
        getContentPane().add(score, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 240, -1, -1));

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

        getContentPane().add(Tablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 800, 550));

        lv3bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pfmedia/level3bg.png"))); // NOI18N
        getContentPane().add(lv3bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        temp.setText("GENERAR TABLERO");
        temp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempActionPerformed(evt);
            }
        });
        temp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tempKeyPressed(evt);
            }
        });
        getContentPane().add(temp, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        xfr = r.nextInt(nn); 
        yfr = r.nextInt(mm);
        while (xr == xfr && yfr == yr){ 
            xfr = r.nextInt(nn); 
            yfr = r.nextInt(mm); 
        }
        for (int i = 0; i < nn; i++){
            for (int j = 0; j < mm; j++){
                mt[i][j] = r.nextInt(2) + 1; 
                if (mt[i][j] == 1){
                    t.setColor(Color.decode("#1f271b")); 
                }else{
                    t.setColor(Color.decode("#f3fcf0")); 
                }
                if (i == xr && j == yr){
                    mt[i][j] = 5;
                    inin = 5;
                }
                if (i == xfr && j == yfr){
                    mt[i][j] = 6;
                    fina = 6;
                }
                if (!(i == xr && j == yr) && !(i == xfr && j == yfr)){
                    t.fillRect(ancho * j, alto * i, ancho, alto); 
                }
            }
        }
        if (inin == 5){
            t.setColor(Color.decode("#f3fcf0"));
            t.fillRect(ancho * yr, alto * xr, ancho, alto);
            img = new ImageIcon(getClass().getResource("/pfmedia/x.png")).getImage();
            t.drawImage(img, ancho * yr, alto * xr, ancho, alto, Tablero);//posicion inicial
        }
        if (fina == 6){
            t.setColor(Color.decode("#f3fcf0"));
            t.fillRect(ancho * yfr, alto * xfr, ancho, alto);
            img = new ImageIcon(getClass().getResource("/pfmedia/o.png")).getImage();
            t.drawImage(img, ancho * yfr, alto * xfr, ancho, alto, Tablero); // posicion final
        }
        for (int i = 0; i < nn; i++){
            for (int j = 0; j < mm; j++){
                t.setColor(Color.decode("#1f271b"));
                t.drawLine(0, i * alto, mm * ancho, i * alto);
                t.setColor(Color.decode("#1f271b"));
                t.drawLine(j * ancho, 0, j * ancho, nn * alto);
            }
        }
    }//GEN-LAST:event_b_generarMouseClicked

    private void b_generarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_generarMousePressed

    }//GEN-LAST:event_b_generarMousePressed

    private void b_generarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b_generarKeyPressed

    }//GEN-LAST:event_b_generarKeyPressed

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

    private void tempKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tempKeyPressed
        Graphics t = Tablero.getGraphics();
        if (evt.getKeyCode() == 37){ 
            if (mt[xr][yr - 1] != 1 && yr > 0){
                yr = yr - 1;
                t.setColor(Color.decode("#EA5157"));
                t.fillRect(ancho * yr, alto * xr, ancho, alto);
                if (xr == xfr && yr == yfr){
                    HOMEE.Ranking[HOMEE.jugadores][0] = HOMEE.Ranking[HOMEE.jugadores][0] + (nn * mm) - movimientos + vidas * 500;
                    System.out.println(HOMEE.Ranking[HOMEE.jugadores][0]);
                    GANAR ganar = new GANAR();
                    ganar.setVisible(true);
                    this.setVisible(false);
                    nivel3 = true;
                    vd3=vidas;
                }
            }else{
                if (mt[xr][yr - 1] == 1){
                    vidas = vidas - 1;
                    System.out.println("actualmente tienes " + vidas);
                    if (vidas < 1){
                        HOMEE.Ranking[HOMEE.jugadores][0] = HOMEE.Ranking[HOMEE.jugadores][0] + ((nn * mm) - movimientos) / 2;
                        System.out.println(HOMEE.Ranking[HOMEE.jugadores][0]);
                        vida1.setVisible(false);
                        GAMEOVER salir = new GAMEOVER();
                        salir.setVisible(true);
                        this.setVisible(false);
                    }
                }
            }
        }
        if (evt.getKeyCode() == 38){ 
            if (mt[xr - 1][yr] != 1 && xr > 0){
                xr = xr - 1;
                t.setColor(Color.decode("#EA5157"));
                t.fillRect(ancho * yr, alto * xr, ancho, alto);
                if (xr == xfr && yr == yfr){
                    HOMEE.Ranking[HOMEE.jugadores][0] = HOMEE.Ranking[HOMEE.jugadores][0] + (nn * mm) - movimientos + vidas * 500;
                    System.out.println(HOMEE.Ranking[HOMEE.jugadores][0]);
                    GANAR ganar = new GANAR();
                    ganar.setVisible(true);
                    this.setVisible(false);
                    nivel3 = true;
                    vd3=vidas;
                }
            }else{
                if (mt[xr - 1][yr] == 1){
                    vidas = vidas - 1;
                    System.out.println("actualmente tienes " + vidas);
                    if (vidas < 1){
                        HOMEE.Ranking[HOMEE.jugadores][0] = HOMEE.Ranking[HOMEE.jugadores][0] + ((nn * mm) - movimientos) / 2;
                        System.out.println(HOMEE.Ranking[HOMEE.jugadores][0]);
                        vida1.setVisible(false);
                        GAMEOVER salir = new GAMEOVER();
                        salir.setVisible(true);
                        this.setVisible(false);
                    }
                }
            }
        }
        if (evt.getKeyCode() == 39){ 
            if (mt[xr][yr + 1] != 1 && yr < mm){
                yr = yr + 1;
                t.setColor(Color.decode("#EA5157"));
                t.fillRect(ancho * yr, alto * xr, ancho, alto);
                if (xr == xfr && yr == yfr){
                    HOMEE.Ranking[HOMEE.jugadores][0] = HOMEE.Ranking[HOMEE.jugadores][0] + (nn * mm) - movimientos + vidas * 500;
                    System.out.println(HOMEE.Ranking[HOMEE.jugadores][0]);
                    GANAR ganar = new GANAR();
                    ganar.setVisible(true);
                    this.setVisible(false);
                    nivel3 = true;
                    vd3=vidas;
                }
            }else{
                if (mt[xr][yr + 1] == 1){
                    vidas = vidas - 1;
                    vd3=vidas;
                    System.out.println("actualmente tienes " + vidas);
                    if (vidas < 1){
                        HOMEE.Ranking[HOMEE.jugadores][0] = HOMEE.Ranking[HOMEE.jugadores][0] + ((nn * mm) - movimientos) / 2;
                        System.out.println(HOMEE.Ranking[HOMEE.jugadores][0]);
                        vida1.setVisible(false);
                        GAMEOVER salir = new GAMEOVER();
                        salir.setVisible(true);
                        this.setVisible(false);
                    }
                }
            }
        }
        if (evt.getKeyCode() == 40){ 
            if (mt[xr + 1][yr] != 1 && xr < nn){
                xr = xr + 1;
                t.setColor(Color.decode("#EA5157"));
                t.fillRect(ancho * yr, alto * xr, ancho, alto);
                if (xr == xfr && yr == yfr){
                    HOMEE.Ranking[HOMEE.jugadores][0] = HOMEE.Ranking[HOMEE.jugadores][0] + (nn * mm) - movimientos + vidas * 500;
                    System.out.println(HOMEE.Ranking[HOMEE.jugadores][0]);
                    GANAR ganar = new GANAR();
                    ganar.setVisible(true);
                    this.setVisible(false);
                    nivel3 = true;
                    vd3=vidas;
                }
            }else{
                if (mt[xr + 1][yr] == 1){
                    vidas = vidas - 1;
                    System.out.println("actualmente tienes " + vidas);
                    if (vidas < 1){
                        HOMEE.Ranking[HOMEE.jugadores][0] = HOMEE.Ranking[HOMEE.jugadores][0] + ((nn * mm) - movimientos) / 2;
                        System.out.println(HOMEE.Ranking[HOMEE.jugadores][0]);
                        vida1.setVisible(false);
                        GAMEOVER salir = new GAMEOVER();
                        salir.setVisible(true);
                        this.setVisible(false);
                    }
                }
            }
        }
        movimientos++;
    }//GEN-LAST:event_tempKeyPressed

    private void tempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempActionPerformed
        Graphics t = Tablero.getGraphics();
        Image img = new ImageIcon(getClass().getResource("/pfmedia/x.png")).getImage();
        nn = FILCOL.n; 
        mm = FILCOL.m; 
        ancho = 800 / mm;
        alto = 500 / nn;
        Random r = new Random();
        xr = r.nextInt(nn); 
        yr = r.nextInt(mm); 
        xfr = r.nextInt(nn); 
        yfr = r.nextInt(mm);
        while (xr == xfr && yfr == yr){ 
            xfr = r.nextInt(nn); 
            yfr = r.nextInt(mm); 
        }
        for (int i = 0; i < nn; i++){
            for (int j = 0; j < mm; j++){
                mt[i][j] = r.nextInt(2) + 1; 
                if (mt[i][j] == 1){
                    t.setColor(Color.black); 
                }else{
                    t.setColor(Color.white); 
                }
                if (i == xr && j == yr){
                    mt[i][j] = 5;
                    inin = 5;
                }
                if (i == xfr && j == yfr){
                    mt[i][j] = 6;
                    fina = 6;
                }
                if (!(i == xr && j == yr) && !(i == xfr && j == yfr)){
                    t.fillRect(ancho * j, alto * i, ancho, alto); 
                }
            }
        }
        if (inin == 5){
            t.setColor(Color.white);
            t.fillRect(ancho * yr, alto * xr, ancho, alto);
            img = new ImageIcon(getClass().getResource("/pfmedia/x.png")).getImage();
            t.drawImage(img, ancho * yr, alto * xr, ancho, alto, Tablero);
        }
        if (fina == 6){
            t.setColor(Color.white);
            t.fillRect(ancho * yfr, alto * xfr, ancho, alto);
            img = new ImageIcon(getClass().getResource("/pfmedia/o.png")).getImage();
            t.drawImage(img, ancho * yfr, alto * xfr, ancho, alto, Tablero); 
        }
        for (int i = 0; i < nn; i++){
            for (int j = 0; j < mm; j++){
                t.setColor(Color.black);
                t.drawLine(0, i * alto, mm * ancho, i * alto);
                t.setColor(Color.black);
                t.drawLine(j * ancho, 0, j * ancho, nn * alto);
            }
        }
    }//GEN-LAST:event_tempActionPerformed
    public static boolean Buscar(int mt[][], int inicialy, int inicialx, int nn, int mm){
        System.out.println(inicialx + "   ENTRA   " + inicialy);
        if (mt[inicialy][inicialx] == 6){
            System.out.println("encontrado");
            return true;
        }
        if (mt[inicialy][inicialx] == 1 || mt[inicialy][inicialx] == 0){
            System.out.println("sale");
            return false;
        }
        mt[inicialy][inicialx] = 0;
        boolean encontrado = false;
        if (inicialy - 1 >= 0){
            System.out.println("arriba");
            encontrado = Buscar(mt, inicialy - 1, inicialx, nn, mm);
        }
        if (encontrado == true){
            return true;
        }
        if (inicialx + 1 < mm){
            System.out.println("derecha");
            encontrado = Buscar(mt, inicialy, inicialx + 1, nn, mm);
        }
        if (encontrado == true){
            return true;
        }
        if (inicialx - 1 >= 0){
            System.out.println("izquierda");
            encontrado = Buscar(mt, inicialy, inicialx - 1, nn, mm);
        }
        if (encontrado == true){
            return true;
        }
        if (inicialy + 1 < nn){
            System.out.println("abajo");
            encontrado = Buscar(mt, inicialy + 1, inicialx, nn, mm);
        }
        if (encontrado == true){
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
    private javax.swing.JLabel b_automatico;
    private javax.swing.JLabel b_generar;
    private javax.swing.JLabel lv3bg;
    private javax.swing.JLabel score;
    private javax.swing.JButton temp;
    private javax.swing.JLabel vida1;
    // End of variables declaration//GEN-END:variables
}
