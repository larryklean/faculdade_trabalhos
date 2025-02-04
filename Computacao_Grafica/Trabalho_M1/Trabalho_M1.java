/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_m1;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JOptionPane;

/**
 *
 * @author Mauricio
 */
public class Trabalho_M1 extends javax.swing.JFrame {
    
    private int[] xPoints;
    private int[] yPoints;

    /**
     * Creates new form Trabalho_M1
     */
    public Trabalho_M1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Translation = new javax.swing.JButton();
        Scala = new javax.swing.JButton();
        Rotacao = new javax.swing.JButton();
        Bresenham = new javax.swing.JButton();
        Save_shape = new javax.swing.JButton();
        Rotation3d = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Translation.setText("Translation");
        Translation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TranslationActionPerformed(evt);
            }
        });

        Scala.setText("Scala");
        Scala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScalaActionPerformed(evt);
            }
        });

        Rotacao.setText("Rotacao");
        Rotacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RotacaoActionPerformed(evt);
            }
        });

        Bresenham.setText("Bresenham");
        Bresenham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BresenhamActionPerformed(evt);
            }
        });

        Save_shape.setText("Save Shape");
        Save_shape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save_shapeActionPerformed(evt);
            }
        });

        Rotation3d.setText("Rotation 3d");
        Rotation3d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rotation3dActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bresenham)
                    .addComponent(Translation)
                    .addComponent(Save_shape)
                    .addComponent(Rotation3d)
                    .addComponent(Rotacao)
                    .addComponent(Scala))
                .addContainerGap(301, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Save_shape)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(Translation)
                .addGap(18, 18, 18)
                .addComponent(Scala)
                .addGap(18, 18, 18)
                .addComponent(Rotacao)
                .addGap(18, 18, 18)
                .addComponent(Rotation3d)
                .addGap(18, 18, 18)
                .addComponent(Bresenham)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TranslationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TranslationActionPerformed
        int somaX, somaY;
        somaX = Integer.parseInt( JOptionPane.showInputDialog( "Informe a soma da coordenada X" ) );
        somaY = Integer.parseInt( JOptionPane.showInputDialog( "Informe a soma da coordenada Y" ) );
        Operations.translation(xPoints, yPoints, somaX, somaY, Drawing.create_image(xPoints, yPoints));
    }//GEN-LAST:event_TranslationActionPerformed

    private void ScalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScalaActionPerformed
        float Xscala, Yscala;
        Xscala = Float.parseFloat( JOptionPane.showInputDialog( "Informe a escala da coordenada X" ) );
        Yscala = Float.parseFloat( JOptionPane.showInputDialog( "Informe a escala da coordenada Y" ) );
        Operations.scale(xPoints, yPoints, Xscala, Yscala, Drawing.create_image(xPoints, yPoints));
    }//GEN-LAST:event_ScalaActionPerformed

    private void RotacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RotacaoActionPerformed
        float grau;
        grau = Integer.parseInt(JOptionPane.showInputDialog( "Informe o grau de rotacao" ) );
        Operations.rotation(xPoints, yPoints, grau, Drawing.create_image(xPoints, yPoints));
    }//GEN-LAST:event_RotacaoActionPerformed

    private void BresenhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BresenhamActionPerformed
        int[] xPoints = new int[2];
        int[] yPoints = new int[2];
        
        for (int i=0; i<2; i++)
        {
            xPoints[i] = Integer.parseInt( JOptionPane.showInputDialog( "Informe a coordenada x(" + (i+1) + ")" ) );
            yPoints[i] = Integer.parseInt( JOptionPane.showInputDialog( "Informe a coordenada y(" + (i+1) + ")" ) );
        }
        
        Operations.bresenham(xPoints[0], yPoints[0], xPoints[1], yPoints[1]);
    }//GEN-LAST:event_BresenhamActionPerformed

    private void Save_shapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_shapeActionPerformed
        int qtdePontos = Integer.parseInt( JOptionPane.showInputDialog( "Informe a quantidade de pontos: " ) );
        xPoints = new int[qtdePontos];
        yPoints = new int[qtdePontos];
        for (int i=0; i<qtdePontos; i++)
        {
            xPoints[i] = Integer.parseInt( JOptionPane.showInputDialog( "Informe a coordenada x(" + (i+1) + ")" ) );
            yPoints[i] = Integer.parseInt( JOptionPane.showInputDialog( "Informe a coordenada y(" + (i+1) + ")" ) );
        }
        BufferedImage image = Drawing.create_image(xPoints, yPoints);
        Drawing.show(image, "Original");
    }//GEN-LAST:event_Save_shapeActionPerformed

    private void Rotation3dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rotation3dActionPerformed
        float [][] points = {{1,2,0},{-1,-1,1},{1,-1,1},{1,-1,-1}};
        float [][] newpoints;
        
        DrawTriangle3d.run(points); //Desenha traingulo original
        
        float grau;
        int eixo;
        
        grau = Integer.parseInt(JOptionPane.showInputDialog( "Informe o grau de rotacao" ) );
        do {
            eixo = Integer.parseInt(JOptionPane.showInputDialog( "Informe o eixo desejado: 1-x 2-y 3-z" ) );
        } while (eixo < 1 | eixo > 3);
        
        newpoints = Operations.rotation3d(points, grau, eixo);
        
        //DrawTriangle3d.run(newpoints);
    }//GEN-LAST:event_Rotation3dActionPerformed

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
            java.util.logging.Logger.getLogger(Trabalho_M1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Trabalho_M1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Trabalho_M1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Trabalho_M1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Trabalho_M1().setVisible(true);
            }
        });
    }
    
public static BufferedImage copyImage(BufferedImage source){
    BufferedImage b = new BufferedImage(source.getWidth(), source.getHeight(), source.getType());
    Graphics g = b.getGraphics();
    g.drawImage(source, 0, 0, null);
    g.dispose();
    return b;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bresenham;
    private javax.swing.JButton Rotacao;
    private javax.swing.JButton Rotation3d;
    private javax.swing.JButton Save_shape;
    private javax.swing.JButton Scala;
    private javax.swing.JButton Translation;
    // End of variables declaration//GEN-END:variables
}
