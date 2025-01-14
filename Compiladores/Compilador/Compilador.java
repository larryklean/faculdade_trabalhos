//import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.awt.PageAttributes;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.FileChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 6309453
 */
public class Compilador extends javax.swing.JFrame {
    
    private Analisador_Lexico al = new Analisador_Lexico();
    private String copyBuffer = "";
    private String filePathToReOpen = "";
    JFileChooser jf = new JFileChooser();
    JFileChooser jfsave = new JFileChooser();
    private String etcodigosaida = "";
    /**
     * Creates new form Compilador
     */
    public Compilador() {
        
        this.setTitle("Compilador");
        initComponents();
        jf.setApproveButtonText("Abrir");
    }  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane2 = new javax.swing.JScrollPane();
        etCodigo = new javax.swing.JTextArea();
        btNewFile = new javax.swing.JButton();
        btOpenFile = new javax.swing.JButton();
        btSaveFile = new javax.swing.JButton();
        btCut = new javax.swing.JButton();
        btCopy = new javax.swing.JButton();
        btPaste = new javax.swing.JButton();
        btCompile = new javax.swing.JButton();
        btExecute = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lbSaida = new javax.swing.JTextArea();
        arquivoAberto = new javax.swing.JLabel();
        caretPosition = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        newFile = new javax.swing.JMenuItem();
        openFile = new javax.swing.JMenuItem();
        saveFile = new javax.swing.JMenuItem();
        SalvaComo = new javax.swing.JMenuItem();
        Sair = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        cut = new javax.swing.JMenuItem();
        copy = new javax.swing.JMenuItem();
        paste = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        compile = new javax.swing.JMenuItem();
        execute = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        etCodigo.setColumns(20);
        etCodigo.setLineWrap(true);
        etCodigo.setRows(5);
        etCodigo.setToolTipText("");
        etCodigo.setWrapStyleWord(true);
        etCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        etCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                etCodigoKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(etCodigo);

        btNewFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/new.png"))); // NOI18N
        btNewFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewFileActionPerformed(evt);
            }
        });

        btOpenFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder.png"))); // NOI18N
        btOpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOpenFileActionPerformed(evt);
            }
        });

        btSaveFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        btSaveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveFileActionPerformed(evt);
            }
        });

        btCut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cute.png"))); // NOI18N
        btCut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCutActionPerformed(evt);
            }
        });

        btCopy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/copy.png"))); // NOI18N
        btCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCopyActionPerformed(evt);
            }
        });

        btPaste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paste.png"))); // NOI18N
        btPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPasteActionPerformed(evt);
            }
        });

        btCompile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hammer.png"))); // NOI18N
        btCompile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCompileActionPerformed(evt);
            }
        });

        btExecute.setIcon(new javax.swing.ImageIcon(getClass().getResource("/play.png"))); // NOI18N
        btExecute.setToolTipText("");
        btExecute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExecuteActionPerformed(evt);
            }
        });

        lbSaida.setEditable(false);
        lbSaida.setColumns(20);
        lbSaida.setRows(5);
        jScrollPane1.setViewportView(lbSaida);

        jMenu3.setText("Arquivo");
        jMenu3.setToolTipText("");

        newFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newFile.setText("Novo");
        newFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFileActionPerformed(evt);
            }
        });
        jMenu3.add(newFile);

        openFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openFile.setText("Abrir");
        openFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileActionPerformed(evt);
            }
        });
        jMenu3.add(openFile);

        saveFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveFile.setText("Salvar");
        saveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileActionPerformed(evt);
            }
        });
        jMenu3.add(saveFile);

        SalvaComo.setText("Salvar Como");
        SalvaComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvaComoActionPerformed(evt);
            }
        });
        jMenu3.add(SalvaComo);

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        jMenu3.add(Sair);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Edição");

        cut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        cut.setText("Cortar");
        cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutActionPerformed(evt);
            }
        });
        jMenu4.add(cut);

        copy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        copy.setText("Copiar");
        copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyActionPerformed(evt);
            }
        });
        jMenu4.add(copy);

        paste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        paste.setText("Colar");
        paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteActionPerformed(evt);
            }
        });
        jMenu4.add(paste);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Compilação");

        compile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        compile.setText("Compilar");
        compile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compileActionPerformed(evt);
            }
        });
        jMenu5.add(compile);

        execute.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        execute.setText("Executar");
        execute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executeActionPerformed(evt);
            }
        });
        jMenu5.add(execute);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(arquivoAberto)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btNewFile)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btOpenFile)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSaveFile)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btCut)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btCopy)
                                .addGap(4, 4, 4)
                                .addComponent(btPaste)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btCompile)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btExecute)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                        .addComponent(caretPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btExecute, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCompile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btPaste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCopy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSaveFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btOpenFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btNewFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(caretPosition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(arquivoAberto)
                .addGap(4, 4, 4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void newFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFileActionPerformed
        // TODO add your handling code here:
        lbSaida.setText("");
        etCodigo.setText("");
    }//GEN-LAST:event_newFileActionPerformed

    private void cutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutActionPerformed
        // TODO add your handling code here:
        copyBuffer = etCodigo.getText();
        etCodigo.setText("");
    }//GEN-LAST:event_cutActionPerformed

    private void compileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compileActionPerformed
        // TODO add your handling code here:
        ArrayList<Instrucao> instrucoes = new ArrayList<>();
        try {

            String codigo = etCodigo.getText();
            String tokens;
            al.cleanSaida();
            instrucoes = al.run(codigo);
            //tokens+="------------------------------------------------------------------------------";
            lbSaida.setText(Analisador_Lexico.saida);
            
            if (Analisador_Lexico.saida.equals("Compilado com sucesso!\n\n")) {
                Cod_objeto co = new Cod_objeto(al.parser2.tabela);
                co.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                co.setVisible(true);
            }            
        } catch (ParseException ex) {
            Logger.getLogger(Compilador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_compileActionPerformed

    private void copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyActionPerformed
        // TODO add your handling code here:
        copyBuffer = etCodigo.getText();
    }//GEN-LAST:event_copyActionPerformed

    private void pasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteActionPerformed
        // TODO add your handling code here:
        String et = etCodigo.getText();
        et+= copyBuffer;
        etCodigo.setText(et);
    }//GEN-LAST:event_pasteActionPerformed

    private void openFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileActionPerformed
        // TODO add your handling code here:
        String text="";      

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivos de texto", "txt", "text");
        jf.setFileFilter(filter);
        jf.setApproveButtonText("Abrir");        
        jf.setCurrentDirectory(new File(filePathToReOpen));
        
        int returnVal = jf.showSaveDialog(null);
        if(returnVal == JFileChooser.APPROVE_OPTION){
            try {
                arquivoAberto.setText("Arquivo:"+jf.getSelectedFile().getName());
                Scanner scan = new Scanner(jf.getSelectedFile());                
                filePathToReOpen = jf.getCurrentDirectory().toString();
                
                while(scan.hasNextLine()){
                    String s = scan.nextLine();
                    text += s + "\n";
                    //System.out.println(s);                    
                }
                etCodigo.setText(text);    
                etcodigosaida = text;
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Compilador.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
        
        
    }//GEN-LAST:event_openFileActionPerformed

    private void saveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileActionPerformed
        
            // TODO add your handling code here:
        String text = etCodigo.getText();
        
        System.out.println(text);
        try (PrintStream out = new PrintStream(new FileOutputStream(jf.getSelectedFile()))) {
            out.print(text);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        
    }//GEN-LAST:event_saveFileActionPerformed

    private void btNewFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewFileActionPerformed
        // TODO add your handling code here:
        this.newFileActionPerformed(evt);
    }//GEN-LAST:event_btNewFileActionPerformed

    private void btOpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOpenFileActionPerformed
        
        this.openFileActionPerformed(evt);
        
    }//GEN-LAST:event_btOpenFileActionPerformed

    private void btSaveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveFileActionPerformed
        // TODO add your handling code here:
        this.saveFileActionPerformed(evt);
    }//GEN-LAST:event_btSaveFileActionPerformed

    private void btCutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCutActionPerformed
        // TODO add your handling code here:
        this.cutActionPerformed(evt);
    }//GEN-LAST:event_btCutActionPerformed

    private void btCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCopyActionPerformed
        // TODO add your handling code here:
        this.copyActionPerformed(evt);
    }//GEN-LAST:event_btCopyActionPerformed

    private void btPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPasteActionPerformed
        // TODO add your handling code here:
        this.pasteActionPerformed(evt);
    }//GEN-LAST:event_btPasteActionPerformed

    private void btCompileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCompileActionPerformed
        // TODO add your handling code here:
        this.compileActionPerformed(evt);
    }//GEN-LAST:event_btCompileActionPerformed

    private void etCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_etCodigoKeyPressed
        // TODO add your handling code here:        
    }//GEN-LAST:event_etCodigoKeyPressed

    private void SalvaComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvaComoActionPerformed
//        jfsave = new JFileChooser();
//        File f = new File(etCodigo.getText());
//        FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivos de texto", "txt", "text");
//        jfsave.setFileFilter(filter);
//        
//        jfsave.setCurrentDirectory(new File(filePathToReOpen));
//        f = new File(jfsave.getCurrentDirectory().toString());
//        System.out.println(jfsave.getCurrentDirectory().toString());
//        
//        int returnVal = jfsave.showSaveDialog(null);
//        if(returnVal == JFileChooser.APPROVE_OPTION)
//        {
//            saveTextToFile(etCodigo.getText(), f);
//        }

    FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivos de texto", "txt", "text");
        jf.setFileFilter(filter);
        
        jf.setCurrentDirectory(new File(filePathToReOpen));
        
        int returnVal = jf.showSaveDialog(null);
        if(returnVal == JFileChooser.APPROVE_OPTION){
        
        String path = jf.getCurrentDirectory().toString();
        String name = jf.getName();
        path += name;
        System.out.println(path);
        File f = new File(path);
            saveTextToFile(etCodigo.getText(), f);
        }
    }//GEN-LAST:event_SalvaComoActionPerformed
    
    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        String sairText = "";
        sairText = etCodigo.getText();
        if(sairText.equals(etcodigosaida))
        {
            System.exit(0);
        }else{
            System.out.println("Foi alterado");
            saveFileActionPerformed(evt);        
        }

    }//GEN-LAST:event_SairActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        System.out.println("XaLESIEF");
        
    }//GEN-LAST:event_formWindowClosing

    private void btExecuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExecuteActionPerformed
        // TODO add your handling code here:
        executeActionPerformed(evt);
    }//GEN-LAST:event_btExecuteActionPerformed

    private void executeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executeActionPerformed
        // TODO add your handling code here:
        ArrayList<Instrucao> instrucoes = new ArrayList<>();
        try {

            String codigo = etCodigo.getText();
            String tokens;
            al.cleanSaida();
            instrucoes = al.run(codigo);
            //tokens+="------------------------------------------------------------------------------";
            lbSaida.setText(Analisador_Lexico.saida);
            
            Cod_objeto co = new Cod_objeto(al.parser2.tabela);
            co.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            //co.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(Compilador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(al.parser2.tabela.acao.size());
        
        if (Analisador_Lexico.saida.equals("Compilado com sucesso!\n\n")) {
//            Vm vm = new Vm(al.parser2.tabela);
//            vm.call();

              MaquinaVirtual vm = new MaquinaVirtual(al.parser2.tabela);
              vm.call();            
            
        }       
    }//GEN-LAST:event_executeActionPerformed
    
    
    private void saveTextToFile(String content, File file) {
        try {
            PrintWriter writer;
            writer = new PrintWriter(file);
            writer.println(content);
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
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
            java.util.logging.Logger.getLogger(Compilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compilador().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Sair;
    private javax.swing.JMenuItem SalvaComo;
    private javax.swing.JLabel arquivoAberto;
    private javax.swing.JButton btCompile;
    private javax.swing.JButton btCopy;
    private javax.swing.JButton btCut;
    private javax.swing.JButton btExecute;
    private javax.swing.JButton btNewFile;
    private javax.swing.JButton btOpenFile;
    private javax.swing.JButton btPaste;
    private javax.swing.JButton btSaveFile;
    private javax.swing.JLabel caretPosition;
    private javax.swing.JMenuItem compile;
    private javax.swing.JMenuItem copy;
    private javax.swing.JMenuItem cut;
    private javax.swing.JTextArea etCodigo;
    private javax.swing.JMenuItem execute;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea lbSaida;
    private javax.swing.JMenuItem newFile;
    private javax.swing.JMenuItem openFile;
    private javax.swing.JMenuItem paste;
    private javax.swing.JMenuItem saveFile;
    // End of variables declaration//GEN-END:variables
}
