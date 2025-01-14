/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafotad;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JFrame;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Gabriel
 */
public class Tela extends javax.swing.JFrame {
    private GrafoN g;
    private ArrayList<Integer> coordenadasX;
    private ArrayList<Integer> coordenadasY;
    

    /**
     * Creates new form Tela
     */
    public Tela(GrafoN gArg, ArrayList<Integer> x, ArrayList<Integer> y) {
        setBackground(Color.WHITE);
        setForeground(Color.RED);
        this.g = gArg;
        
        coordenadasX = x;
        coordenadasY = y;
        initComponents();
    }

    private Tela() {
        showMessageDialog(null, "Construtor Errado");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }
    
    public void paint(Graphics gra) {  

        for(Vertice v: g.getVertices())
        {
            for(Aresta a : v.getArestas())
            {
                Vertice v1 = a.getVertice1();
                Vertice v2 = a.getVertice2();
                
                int x1 = coordenadasX.get(g.getVertices().indexOf(v1)) +10;
                int x2 = coordenadasX.get(g.getVertices().indexOf(v2)) +10;
                int y1 = coordenadasY.get(g.getVertices().indexOf(v1)) +10;
                int y2 = coordenadasY.get(g.getVertices().indexOf(v2)) +10;
                
                gra.drawLine(x1, y1, x2, y2);
                
            }
        }
        
        for(Vertice v: g.getVertices())
        {
            int x = coordenadasX.get(g.getVertices().indexOf(v));
            int y = coordenadasY.get(g.getVertices().indexOf(v));
            gra.fillOval(x, y, 20, 20);
            //setForeground(Color.WHITE);
            y=y+20;
            gra.drawString(v.getId(), x, y);
        }
        
        
//        gra.drawString("Hello",40,40);  
//        setBackground(Color.WHITE);  
//        gra.fillRect(130, 30,100, 80);  
//        gra.drawOval(30,130,50, 60);  
//        setForeground(Color.RED);  
//        gra.fillOval(130,130,50, 60);  
//        gra.drawArc(30, 200, 40,50,90,60);  
//        gra.fillArc(30, 130, 40,50,180,40);  
          
    }
    
    public static void main(String[] args) {  
        Tela m = new Tela();  
        JFrame f=new JFrame(); 
        f.add(m);  
        f.setSize(900,900);  
        //f.setLayout(null);  
        f.setVisible(true);  
    }  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Tela().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
