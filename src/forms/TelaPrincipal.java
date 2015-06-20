/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import dB.ConectaBanco;
import javax.swing.JOptionPane;

/**
 *
 * @author Anderson
 */
public class TelaPrincipal extends javax.swing.JFrame {
    
    ConectaBanco conecta = new ConectaBanco();//variavel global
    
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        conecta.conexao();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        textoLogin = new javax.swing.JLabel();
        usuarioLoginText = new javax.swing.JTextField();
        textoUsuario = new javax.swing.JLabel();
        textoSenha = new javax.swing.JLabel();
        botaoAcessar = new javax.swing.JButton();
        jPasswordCampo = new javax.swing.JPasswordField();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastrarObras = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        ButomConsultar = new javax.swing.JMenuItem();
        menuFuncionarios = new javax.swing.JMenu();
        botaoCadastrarFuncionario = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        jMenuItem2.setText("jMenuItem2");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        jMenuItem6.setText("jMenuItem6");

        jMenuItem10.setText("jMenuItem10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema para Empresa de Engenharia");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("SISTEMA DE ENGENHARIA");

        textoLogin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textoLogin.setText("LOGIN");

        usuarioLoginText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        usuarioLoginText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioLoginTextActionPerformed(evt);
            }
        });

        textoUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textoUsuario.setText("USUÁRIO");

        textoSenha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textoSenha.setText("SENHA");

        botaoAcessar.setText("Acessar");
        botaoAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAcessarActionPerformed(evt);
            }
        });

        jPasswordCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordCampoActionPerformed(evt);
            }
        });

        menuCadastrarObras.setText("Obras");
        menuCadastrarObras.setEnabled(false);
        menuCadastrarObras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarObrasActionPerformed(evt);
            }
        });

        jMenu1.setText("Cadastrar");

        jMenuItem11.setText("Casa");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem11);

        jMenuItem12.setText("Sobrado");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem12);

        jMenuItem13.setText("Salão");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem13);

        menuCadastrarObras.add(jMenu1);

        ButomConsultar.setText("Gerenciar");
        ButomConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButomConsultarActionPerformed(evt);
            }
        });
        menuCadastrarObras.add(ButomConsultar);

        jMenuBar1.add(menuCadastrarObras);

        menuFuncionarios.setText("Funcionarios");
        menuFuncionarios.setEnabled(false);

        botaoCadastrarFuncionario.setText("Cadastrar");
        botaoCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarFuncionarioActionPerformed(evt);
            }
        });
        menuFuncionarios.add(botaoCadastrarFuncionario);

        jMenuItem8.setText("Gerenciar");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        menuFuncionarios.add(jMenuItem8);

        jMenuBar1.add(menuFuncionarios);

        jMenu3.setText("Sair");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoUsuario)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textoSenha)
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usuarioLoginText, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(textoLogin)
                            .addComponent(jPasswordCampo))
                        .addGap(18, 18, 18)
                        .addComponent(botaoAcessar)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addComponent(textoLogin)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuarioLoginText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoUsuario))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textoSenha)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botaoAcessar)
                        .addComponent(jPasswordCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
     
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void menuCadastrarObrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarObrasActionPerformed
        //new TelaCadastrarObras().setVisible(true);
    }//GEN-LAST:event_menuCadastrarObrasActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        conecta.desconecta();
        System.exit(0);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        
    FormularioObrasSobrado cadastrar = new FormularioObrasSobrado();
        if(!cadastrar.isVisible()){
            cadastrar.setVisible(true);
        }       
        
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void ButomConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButomConsultarActionPerformed
        new TelaGerenciarObra().setVisible(true);
    }//GEN-LAST:event_ButomConsultarActionPerformed

    private void usuarioLoginTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioLoginTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioLoginTextActionPerformed

    private void jPasswordCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordCampoActionPerformed

    private void botaoAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAcessarActionPerformed
        if(usuarioLoginText.getText().equals("admin") && (jPasswordCampo.getText().equals("admin"))){
            JOptionPane.showMessageDialog(null, "Usuario autenticado com Sucesso");
            menuCadastrarObras.setEnabled(true);
            menuFuncionarios.setEnabled(true);
            textoUsuario.setVisible(false);
            textoSenha.setVisible(false);
            botaoAcessar.setVisible(false);
            textoLogin.setVisible(false);
            usuarioLoginText.setVisible(false);
            jPasswordCampo.setVisible(false);
        }
        
    }//GEN-LAST:event_botaoAcessarActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        
        FormularioObrasCasa cadastrar = new FormularioObrasCasa();
        if(!cadastrar.isVisible()){
            cadastrar.setVisible(true);
        }       
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        FormularioObrasSalão cadastrar = new FormularioObrasSalão();
        if(!cadastrar.isVisible()){
            cadastrar.setVisible(true);
        } 
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void botaoCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarFuncionarioActionPerformed
        CadastrarFuncionario cadastrar = new CadastrarFuncionario();
        if(!cadastrar.isVisible()){
            cadastrar.setVisible(true);
        } 
    }//GEN-LAST:event_botaoCadastrarFuncionarioActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        new TelaGerenciarFuncionario().setVisible(true);
               
    }//GEN-LAST:event_jMenuItem8ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ButomConsultar;
    private javax.swing.JButton botaoAcessar;
    private javax.swing.JMenuItem botaoCadastrarFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPasswordField jPasswordCampo;
    private javax.swing.JMenu menuCadastrarObras;
    private javax.swing.JMenu menuFuncionarios;
    private javax.swing.JLabel textoLogin;
    private javax.swing.JLabel textoSenha;
    private javax.swing.JLabel textoUsuario;
    private javax.swing.JTextField usuarioLoginText;
    // End of variables declaration//GEN-END:variables
}
