package forms;

import Class.Obra;
import dB.ConectaBanco;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import obra.fachada.ObraFachada;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Maxximus
 */
public class FormularioObrasCasa extends javax.swing.JFrame {

    private ObraFachada cadastra;
    private Obra cadastrarObra;        
   // ConectaBanco conecta = new ConectaBanco();
 
    
    public FormularioObrasCasa() {
        initComponents();
        this.cadastra = new ObraFachada();
     //   conecta.conexao();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        preenchCampos = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        nomeObra = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dataTermino = new javax.swing.JTextField();
        jLabelDataTermino = new javax.swing.JLabel();
        dataInicio = new javax.swing.JTextField();
        labelTipoObra = new javax.swing.JLabel();
        labelLaje = new javax.swing.JLabel();
        tipoDoObra = new javax.swing.JComboBox();
        laje = new javax.swing.JComboBox();
        labelObraMetros = new javax.swing.JLabel();
        metroObra = new javax.swing.JTextField();
        labelVigaBaldrame = new javax.swing.JLabel();
        VigaBaldrame = new javax.swing.JTextField();
        labelPilares = new javax.swing.JLabel();
        pilaresML = new javax.swing.JTextField();
        labelTijolo = new javax.swing.JLabel();
        tijoloTipo = new javax.swing.JComboBox();
        botaoSalvarObra = new javax.swing.JButton();
        botaoCancelarObra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        preenchCampos.setText("Preencha os campos abaixo");

        labelNome.setText("Nome:");

        nomeObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeObraActionPerformed(evt);
            }
        });

        jLabel3.setText("Data de Inicio:");

        dataTermino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataTerminoActionPerformed(evt);
            }
        });

        jLabelDataTermino.setText("Data de Termino:");

        dataInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataInicioActionPerformed(evt);
            }
        });

        labelTipoObra.setText("Tipo da Obra");

        labelLaje.setText("Laje?");

        tipoDoObra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Casa" }));
        tipoDoObra.setEnabled(false);
        tipoDoObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoDoObraActionPerformed(evt);
            }
        });

        laje.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sim", "Não" }));

        labelObraMetros.setText("Obra(em m²)");

        labelVigaBaldrame.setText("Viga Baldrame(em m²)");

        labelPilares.setText("Pilares(em ML)");

        labelTijolo.setText("Tijolo");

        tijoloTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bloco de Concreto", "Tijolo Barro Cozido", "Tijo Furado - 8 Furos", "Tijolo Furado - 10 Furos", "Tijolo de Vidro" }));

        botaoSalvarObra.setText("Salvar");
        botaoSalvarObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarObraActionPerformed(evt);
            }
        });

        botaoCancelarObra.setText("Cancelar");
        botaoCancelarObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarObraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(preenchCampos)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNome)
                            .addComponent(nomeObra, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tipoDoObra, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelTipoObra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(labelLaje))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(laje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(labelObraMetros)
                            .addComponent(labelVigaBaldrame)
                            .addComponent(metroObra, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VigaBaldrame, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTijolo)
                            .addComponent(tijoloTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dataTermino)
                        .addComponent(jLabelDataTermino, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dataInicio))
                    .addComponent(labelPilares)
                    .addComponent(pilaresML, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botaoSalvarObra)
                .addGap(18, 18, 18)
                .addComponent(botaoCancelarObra)
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(preenchCampos)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDataTermino)
                    .addComponent(labelTipoObra)
                    .addComponent(labelLaje))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataTermino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoDoObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(laje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelObraMetros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(metroObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelVigaBaldrame)
                    .addComponent(labelPilares))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VigaBaldrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pilaresML, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelTijolo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tijoloTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSalvarObra)
                    .addComponent(botaoCancelarObra))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeObraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeObraActionPerformed

    private void dataTerminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataTerminoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataTerminoActionPerformed

    private void dataInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataInicioActionPerformed

    private void botaoSalvarObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarObraActionPerformed
        /*try {
            preencherCampo();
        } catch (Exception ex) {
            Logger.getLogger(FormularioObrasCasa.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        cadastrarObra = new Obra();
        cadastrarObra.setNomeObra(nomeObra.getText());
        cadastrarObra.setDataInicio(dataInicio.getText());
        cadastrarObra.setDataTermino(dataTermino.getText());
        cadastrarObra.setTipoObra(1);
        cadastrarObra.setMetroQuadradoObra(new Double(metroObra.getText()));
        cadastrarObra.setAlturaObra(3);
        cadastra.inserir(cadastrarObra);
        FormularioObrasCasa.this.dispose();
        limparCampos();

    }//GEN-LAST:event_botaoSalvarObraActionPerformed

    private void botaoCancelarObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarObraActionPerformed
        FormularioObrasCasa.this.dispose();
        limparCampos();
    }//GEN-LAST:event_botaoCancelarObraActionPerformed

    private void tipoDoObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoDoObraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoDoObraActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioObrasCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioObrasCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioObrasCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioObrasCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioObrasCasa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField VigaBaldrame;
    private javax.swing.JButton botaoCancelarObra;
    private javax.swing.JButton botaoSalvarObra;
    private javax.swing.JTextField dataInicio;
    private javax.swing.JTextField dataTermino;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelDataTermino;
    private javax.swing.JLabel labelLaje;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelObraMetros;
    private javax.swing.JLabel labelPilares;
    private javax.swing.JLabel labelTijolo;
    private javax.swing.JLabel labelTipoObra;
    private javax.swing.JLabel labelVigaBaldrame;
    private javax.swing.JComboBox laje;
    private javax.swing.JTextField metroObra;
    private javax.swing.JTextField nomeObra;
    private javax.swing.JTextField pilaresML;
    private javax.swing.JLabel preenchCampos;
    private javax.swing.JComboBox tijoloTipo;
    private javax.swing.JComboBox tipoDoObra;
    // End of variables declaration//GEN-END:variables

   /* private boolean validarCampos() {
        if (nomeObra.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite o nome da Obra");
            nomeObra.requestFocus();
            return false;
        }
        return true;
    }
*/
    /*public void preencherCampo() throws Exception {
        try {
            PreparedStatement pst;
            pst = conecta.conn.prepareStatement("Insert into obra (nome_obra, data_inicio, data_termino, tipo_obra, metro_quadrado_obra, altura_obra)values(?,?,?,?,?,?)");
            pst.setString(1, nomeObra.getText());
            pst.setString(2, dataInicio.getText());
            pst.setString(3, dataTermino.getText());
            pst.setInt(4, 1);
            pst.setDouble(5, new Double(metroObra.getText()));
            pst.setDouble(6, 100);
            pst.executeUpdate();
          

        } catch (Exception ex) {
            ex.getMessage();
            Logger.getLogger(FormularioObrasCasa.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
*/
        public void limparCampos() {
        nomeObra.setText("");
        dataInicio.setText("");
        dataTermino.setText("");
        metroObra.setText("");
        pilaresML.setText("");
        VigaBaldrame.setText("");
        tijoloTipo.setSelectedIndex(0);
        tipoDoObra.setSelectedIndex(0);
    }
        public void setarCampos(String nome, String di, String dt) {
        nomeObra.setText(nome);
        dataInicio.setText(di);
        dataTermino.setText(dt);
        metroObra.setText("");
        tijoloTipo.setSelectedIndex(0);
        tipoDoObra.setSelectedIndex(0);
    }
}
