/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reconhecedordelinguagemregular;

/**
 *
 * @author Gabriel
 */
public class Tela extends javax.swing.JFrame {
    
    

    /**
     * Creates new form Tela2
     */
    public Tela() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Limpar = new javax.swing.JButton();
        Analisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Entrada = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        Saida = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Limpar.setText("Limpar");
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });

        Analisar.setText("Analisar");
        Analisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnalisarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(Entrada);

        Saida.setEditable(false);
        Saida.setColumns(20);
        Saida.setRows(5);
        jScrollPane3.setViewportView(Saida);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 332, Short.MAX_VALUE)
                        .addComponent(Analisar)
                        .addGap(44, 44, 44)
                        .addComponent(Limpar)
                        .addGap(43, 43, 43))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Analisar)
                    .addComponent(Limpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AnalisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnalisarActionPerformed
        // TODO add your handling code here:
        String entrada = Entrada.getText().toLowerCase();
        String saida = "";
        entrada = entrada.replace("\n", " ");
        char[] texto = entrada.toCharArray();
        String sentenca = "";
        int aux;
        boolean aux2=false;
        
        for(char carac : texto)
        {
            aux = ChecaSimbolo(carac);
            System.out.println(aux);
            
            if (aux==4)
                aux2=true;
                
            
            if(aux==2||aux==3)
            {
                if(aux2)
                {
                    saida = saida + ("ERRO: Simbolo(s) invalido(s):      " + sentenca + '\n');
                    sentenca="";
                    if (aux==2)
                        saida = saida + ("Operador Aritmetico:      " + carac + '\n');
                    aux2=false;
                    continue;
                }
                if(!sentenca.equals(""))
                {
                    if(ChecaSentenca(sentenca))
                        saida = saida + ("Sentenca valida:      " + sentenca + '\n');
                    else
                        saida = saida + ("ERRO: Sentenca invalida:      " + sentenca + '\n');
                }
                if (aux==2)
                   saida = saida + ("Operador Aritmetico:      " + carac + '\n');
                sentenca="";
            }
            else
                sentenca = sentenca + carac;
        }
        if (!sentenca.equals(""))
        {
            if(aux2)
            {
                saida = saida + ("ERRO: Simbolo(s) invalido(s):      " + sentenca + '\n');
                aux2=false;
            }
            else
            {
                if(ChecaSentenca(sentenca))
                    saida = saida + ("Sentenca valida:      " + sentenca + '\n');
                else
                    saida = saida + ("ERRO: Sentenca invalida:      " + sentenca + '\n');
            }
            
        }
        Saida.setText(saida);
    }//GEN-LAST:event_AnalisarActionPerformed

    private int ChecaSimbolo(char carac)
    {
        if (carac=='a'||carac=='b'||carac=='c'||carac=='d')
        {
            return 1;
        }
        if (carac=='+'||carac=='-'||carac=='*'||carac=='/')
        {
            return 2;
        }
        if (carac>0&&carac<33)
        {
            return 3;
        }
        return 4;
    }
    
    private boolean ChecaSentenca(String texto)
    {
        int [][] tabela = {{11,10,12,5}
                           ,{12,12,12,5}
                           ,{12,10,12,5}
                           ,{12,12,2,12}
                           ,{12,3,12,12}
                           ,{12,12,12,1}
                           ,{12,8,12,12}
                           ,{12,12,6,12}
                           ,{12,12,9,12}
                           ,{12,7,12,1}
                           ,{12,12,4,12}
                           ,{0,8,12,12}
                           ,{12,12,12,12}};
        int [] finais = {5,9};
        
        char[] sentenca = texto.toCharArray();
        int estado = 0;
        int letra;
        for (char carac : sentenca)
        {
            switch (carac)
            {
                case 'a':
                    letra = 0;
                    break;
                    
                case 'b':
                    letra = 1;
                    break;
                    
                case 'c':
                    letra = 2;
                    break;
                    
                case 'd':
                    letra = 3;
                    break; 
                    
                default:
                    return false;
            }
            
            if (tabela[estado][letra] == 12)
            {
                return false;
            }
            
            estado = tabela[estado][letra];
        }
        
        for (int x : finais)
        {
            if (estado == x)
            {
                return true;
            }
        }
        
        return false;
    }
    
    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        Saida.setText("");
        Entrada.setText("");
    }//GEN-LAST:event_LimparActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Analisar;
    private javax.swing.JTextPane Entrada;
    private javax.swing.JButton Limpar;
    private javax.swing.JTextArea Saida;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
