package visao;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import principal.Principal;


public class JFrame_Importacao extends javax.swing.JFrame {

    public JFrame_Importacao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jLabel1 = new javax.swing.JLabel();
        btnPesquisa = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trabalho Final Teoria dos Grafos");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Carregue um documento .dat");

        btnPesquisa.setText("Pesquisar");
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });

        btnSair.setText("Encerrar");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPesquisa)
                .addGap(30, 30, 30)
                .addComponent(btnSair)
                .addGap(72, 72, 72))
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnPesquisa, btnSair});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisa)
                    .addComponent(btnSair))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("static-access")
    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
       
       
       FileNameExtensionFilter filtro = new FileNameExtensionFilter("Arquivo DAT (.dat)", "dat");
       String dBase = System.getProperty("user.home")+"/Desktop";
       File dir = new File(dBase);
       
       JFileChooser arq = new JFileChooser();
       arq.setCurrentDirectory(dir);
       arq.setFileSelectionMode(JFileChooser.FILES_ONLY);
       arq.setAcceptAllFileFilterUsed(false);
       arq.addChoosableFileFilter(filtro);
       
       //arq.showOpenDialog(this);
       
              
       //Exibe um JFileChooser para abertura de arquivo. Retorna 1 se o usuário ñ selecinar um arquivo
	int verificacao = arq.showOpenDialog(new JFrame());
        File f = arq.getSelectedFile();
        
       
       if(verificacao !=1 ){           
            this.dispose();
            JFrame_Algoritmos formBase = new JFrame_Algoritmos();
            formBase.setLocationRelativeTo(null);
            formBase.setVisible(true);
            
           try{ 
               Principal p = new Principal(f);
           }catch (FileNotFoundException ex) {
               Logger.getLogger(JFrame_Importacao.class.getName()).log(Level.SEVERE, null, ex);
           }
       }else{
           JOptionPane.showMessageDialog(null, "Nenhum arquivo foi escolhido");
       }        
    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Importacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollBar jScrollBar1;
    // End of variables declaration//GEN-END:variables
}
