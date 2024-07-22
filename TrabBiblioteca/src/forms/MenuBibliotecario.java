/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;
import forms.TelaEmprestimo;

/**
 *
 * @author a1feu
 */
public class MenuBibliotecario extends javax.swing.JFrame {

    /**
     * Creates new form MenuBibliotecario
     */
    public MenuBibliotecario() {
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

        jLabel1 = new javax.swing.JLabel();
        btnDeletarUsuario = new javax.swing.JButton();
        btnCadastrarUsuario = new javax.swing.JButton();
        btnAtualizarDados = new javax.swing.JButton();
        btnCadstrarLivro = new javax.swing.JButton();
        btnEmprestimo = new javax.swing.JButton();
        btnDevolucao = new javax.swing.JButton();
        btnListaExemplares = new javax.swing.JButton();
        btnListaEmprestimo = new javax.swing.JButton();
        btnExluirLivro = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnCadastrarExemplares = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("MENU");

        btnDeletarUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnDeletarUsuario.setText("Deletar Usuario");
        btnDeletarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarUsuarioActionPerformed(evt);
            }
        });

        btnCadastrarUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnCadastrarUsuario.setText("Cadastrar Usuario");
        btnCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarUsuarioActionPerformed(evt);
            }
        });

        btnAtualizarDados.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnAtualizarDados.setText("Atualizar Dados");
        btnAtualizarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarDadosActionPerformed(evt);
            }
        });

        btnCadstrarLivro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnCadstrarLivro.setText("Cadastrar Livro");
        btnCadstrarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadstrarLivroActionPerformed(evt);
            }
        });

        btnEmprestimo.setText("Emprestimo");
        btnEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmprestimoActionPerformed(evt);
            }
        });

        btnDevolucao.setText("Devolução");
        btnDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolucaoActionPerformed(evt);
            }
        });

        btnListaExemplares.setText("Lista de Exemplares");
        btnListaExemplares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaExemplaresActionPerformed(evt);
            }
        });

        btnListaEmprestimo.setText("Lista de Emprestimo");
        btnListaEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaEmprestimoActionPerformed(evt);
            }
        });

        btnExluirLivro.setText("Excluir Livro");

        btnCadastrarExemplares.setText("Cadastrar Exemplares");
        btnCadastrarExemplares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarExemplaresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnExluirLivro)
                                .addGap(18, 18, 18)
                                .addComponent(btnCadastrarExemplares))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnListaExemplares)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnListaEmprestimo))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCadastrarUsuario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnDeletarUsuario))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCadstrarLivro)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEmprestimo)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDevolucao)
                                    .addComponent(btnAtualizarDados)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel1)))
                .addGap(0, 23, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarUsuario)
                    .addComponent(btnDeletarUsuario)
                    .addComponent(btnAtualizarDados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadstrarLivro)
                    .addComponent(btnEmprestimo)
                    .addComponent(btnDevolucao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListaExemplares)
                    .addComponent(btnListaEmprestimo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExluirLivro)
                    .addComponent(btnCadastrarExemplares))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeletarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarUsuarioActionPerformed
        DeletaUsuario dU = new DeletaUsuario();
        dU.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDeletarUsuarioActionPerformed

    private void btnCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarUsuarioActionPerformed
        CadastroUsuario cadUser = new CadastroUsuario();
        cadUser.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCadastrarUsuarioActionPerformed

    private void btnAtualizarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarDadosActionPerformed
        AtualizarDados ad = new AtualizarDados();
        ad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAtualizarDadosActionPerformed

    private void btnCadstrarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadstrarLivroActionPerformed
        CadastroLivro cl = new CadastroLivro();
        cl.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCadstrarLivroActionPerformed

    private void btnEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmprestimoActionPerformed
        TelaEmprestimo te = new TelaEmprestimo();
        te.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnEmprestimoActionPerformed

    private void btnDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolucaoActionPerformed
        TelaDevolucao td = new TelaDevolucao();
        td.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDevolucaoActionPerformed

    private void btnListaExemplaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaExemplaresActionPerformed
        ListaExemplares le = new ListaExemplares();
        le.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnListaExemplaresActionPerformed

    private void btnListaEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaEmprestimoActionPerformed
        ListaEmprestimos le = new ListaEmprestimos();
        le.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnListaEmprestimoActionPerformed

    private void btnCadastrarExemplaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarExemplaresActionPerformed
        // TODO add your handling code here:
        CadastroExemplar le = new CadastroExemplar();
        le.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCadastrarExemplaresActionPerformed

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
            java.util.logging.Logger.getLogger(MenuBibliotecario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuBibliotecario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuBibliotecario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuBibliotecario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuBibliotecario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarDados;
    private javax.swing.JButton btnCadastrarExemplares;
    private javax.swing.JButton btnCadastrarUsuario;
    private javax.swing.JButton btnCadstrarLivro;
    private javax.swing.JButton btnDeletarUsuario;
    private javax.swing.JButton btnDevolucao;
    private javax.swing.JButton btnEmprestimo;
    private javax.swing.JButton btnExluirLivro;
    private javax.swing.JButton btnListaEmprestimo;
    private javax.swing.JButton btnListaExemplares;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
