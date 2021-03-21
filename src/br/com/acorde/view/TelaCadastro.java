/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.acorde.view;

import br.com.acorde.dao.ModuloConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class TelaCadastro extends javax.swing.JFrame {
    
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    private void adicionarUsuario(){
        if(jComboBoxPerfilCadastro.getSelectedItem().equals("Cliente")){
             String sql = "insert into Cliente (nome, email, senha ) values (?,?,?)";
             try{
                  pst = conexao.prepareStatement(sql);
                  pst.setString(1, jTextFieldNomeCadastro.getText());
                  pst.setString(2, jTextFieldEmailCadastro.getText());
                  pst.setString(3, jPasswordFieldSenhaCadrasto.getText());
                  
                  //validando se os campos obrigatorios foram preenchidos
                  if(jTextFieldNomeCadastro.getText().isEmpty() || jTextFieldEmailCadastro.getText().isEmpty()
                     || jPasswordFieldSenhaCadrasto.getText().isEmpty()){
                       JOptionPane.showMessageDialog(null, "Preencha os campos obrigatorios");
                  }else{
                      //a linha abaixo atualiza a tbela com o dados que pegou do form e coloca o resultado dentro da var
                int adicionado = pst.executeUpdate();
                //se o  pst.executeUpdate() for executado com sucesso ele retorna 1, 
                //se colocar pst.executeUpdate() > 0 ele vai executar duas vezes a insercao na tabela
                if( adicionado > 0){
                    JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso");
                    jTextFieldNomeCadastro.setText(null);
                    jTextFieldEmailCadastro.setText(null);
                    jPasswordFieldSenhaCadrasto.setText(null);
                    TelaLogin.main(null);
                    dispose();
                    }
                  }             
             }catch(Exception e){
                  JOptionPane.showMessageDialog(null, e);
                  e.printStackTrace();
             }
        }else if(jComboBoxPerfilCadastro.getSelectedItem().equals("Educador Físico")){
            String sql = "insert into Educador_Fisico (nome, email, senha ) values (?,?,?)";
             try{
                  pst = conexao.prepareStatement(sql);
                  pst.setString(1, jTextFieldNomeCadastro.getText());
                  pst.setString(2, jTextFieldEmailCadastro.getText());
                  pst.setString(3, jPasswordFieldSenhaCadrasto.getText());
                  
                  //validando se os campos obrigatorios foram preenchidos
                  if(jTextFieldNomeCadastro.getText().isEmpty() || jTextFieldEmailCadastro.getText().isEmpty()
                     || jPasswordFieldSenhaCadrasto.getText().isEmpty()){
                       JOptionPane.showMessageDialog(null, "Preencha os campos obrigatorios");
                  }else{
                      //a linha abaixo atualiza a tbela com o dados que pegou do form e coloca o resultado dentro da var
                int adicionado = pst.executeUpdate();
                //se o  pst.executeUpdate() for executado com sucesso ele retorna 1, 
                //se colocar pst.executeUpdate() > 0 ele vai executar duas vezes a insercao na tabela
                if( adicionado > 0){
                    JOptionPane.showMessageDialog(null, "Profissional cadastrado com sucesso");
                    jTextFieldNomeCadastro.setText(null);
                    jTextFieldEmailCadastro.setText(null);
                    jPasswordFieldSenhaCadrasto.setText(null);
                    TelaLogin.main(null);
                    dispose();
                    }
                  }             
             }catch(Exception e){
                  JOptionPane.showMessageDialog(null, e);
                  e.printStackTrace();
             }
        }else{
            String sql = "insert into Nutricionista (nome, email, senha ) values (?,?,?)";
             try{
                  pst = conexao.prepareStatement(sql);
                  pst.setString(1, jTextFieldNomeCadastro.getText());
                  pst.setString(2, jTextFieldEmailCadastro.getText());
                  pst.setString(3, jPasswordFieldSenhaCadrasto.getText());
                  
                  //validando se os campos obrigatorios foram preenchidos
                  if(jTextFieldNomeCadastro.getText().isEmpty() || jTextFieldEmailCadastro.getText().isEmpty()
                     || jPasswordFieldSenhaCadrasto.getText().isEmpty()){
                       JOptionPane.showMessageDialog(null, "Preencha os campos obrigatorios");
                  }else{
                      //a linha abaixo atualiza a tbela com o dados que pegou do form e coloca o resultado dentro da var
                int adicionado = pst.executeUpdate();
                //se o  pst.executeUpdate() for executado com sucesso ele retorna 1, 
                //se colocar pst.executeUpdate() > 0 ele vai executar duas vezes a insercao na tabela
                if( adicionado > 0){
                    JOptionPane.showMessageDialog(null, "Profissional cadastrado com sucesso");
                    jTextFieldNomeCadastro.setText(null);
                    jTextFieldEmailCadastro.setText(null);
                    jPasswordFieldSenhaCadrasto.setText(null);
                    TelaLogin.main(null);
                    dispose();
                    }
                  }             
             }catch(Exception e){
                  JOptionPane.showMessageDialog(null, e);
                  e.printStackTrace();
             }
        }
        
    }

    /**
     * Creates new form TelaCadastro1
     */
    public TelaCadastro() {
        initComponents();
         conexao = ModuloConexao.conexaoBanco();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAcorde = new javax.swing.JLabel();
        lblNomeCadastro = new javax.swing.JLabel();
        jTextFieldNomeCadastro = new javax.swing.JTextField();
        lblEmailCadastro = new javax.swing.JLabel();
        jTextFieldEmailCadastro = new javax.swing.JTextField();
        lblSenhaCadastro = new javax.swing.JLabel();
        jPasswordFieldSenhaCadrasto = new javax.swing.JPasswordField();
        lblPerfilCadastro = new javax.swing.JLabel();
        jComboBoxPerfilCadastro = new javax.swing.JComboBox<>();
        jButtonVolta = new javax.swing.JButton();
        jButtonCadastro1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastre-se no <Acorde!>");
        setResizable(false);
        getContentPane().setLayout(null);

        lblAcorde.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        lblAcorde.setText("<Acorde!>");
        getContentPane().add(lblAcorde);
        lblAcorde.setBounds(130, 10, 130, 40);

        lblNomeCadastro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNomeCadastro.setText("NOME:");
        getContentPane().add(lblNomeCadastro);
        lblNomeCadastro.setBounds(30, 70, 40, 14);

        jTextFieldNomeCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeCadastro);
        jTextFieldNomeCadastro.setBounds(90, 60, 160, 30);

        lblEmailCadastro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblEmailCadastro.setText("EMAIL:");
        getContentPane().add(lblEmailCadastro);
        lblEmailCadastro.setBounds(30, 120, 40, 14);
        getContentPane().add(jTextFieldEmailCadastro);
        jTextFieldEmailCadastro.setBounds(90, 110, 160, 30);

        lblSenhaCadastro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSenhaCadastro.setText("SENHA:");
        getContentPane().add(lblSenhaCadastro);
        lblSenhaCadastro.setBounds(30, 170, 50, 14);
        getContentPane().add(jPasswordFieldSenhaCadrasto);
        jPasswordFieldSenhaCadrasto.setBounds(90, 160, 160, 30);

        lblPerfilCadastro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPerfilCadastro.setText("PERFIL:");
        getContentPane().add(lblPerfilCadastro);
        lblPerfilCadastro.setBounds(30, 220, 50, 14);

        jComboBoxPerfilCadastro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Educador Físico", "Nutricionista" }));
        getContentPane().add(jComboBoxPerfilCadastro);
        jComboBoxPerfilCadastro.setBounds(90, 210, 160, 30);

        jButtonVolta.setBackground(new java.awt.Color(255, 255, 255));
        jButtonVolta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonVolta.setText("Voltar");
        jButtonVolta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jButtonVolta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVolta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVolta);
        jButtonVolta.setBounds(190, 260, 120, 30);

        jButtonCadastro1.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCadastro1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCadastro1.setText("Cadastrar");
        jButtonCadastro1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jButtonCadastro1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCadastro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastro1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastro1);
        jButtonCadastro1.setBounds(40, 260, 110, 30);

        setSize(new java.awt.Dimension(389, 368));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeCadastroActionPerformed

    private void jButtonVoltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltaActionPerformed
            TelaLogin.main(null);
            dispose();
    }//GEN-LAST:event_jButtonVoltaActionPerformed

    private void jButtonCadastro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastro1ActionPerformed
        adicionarUsuario();
    }//GEN-LAST:event_jButtonCadastro1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastro1;
    private javax.swing.JButton jButtonVolta;
    private javax.swing.JComboBox<String> jComboBoxPerfilCadastro;
    private javax.swing.JPasswordField jPasswordFieldSenhaCadrasto;
    private javax.swing.JTextField jTextFieldEmailCadastro;
    private javax.swing.JTextField jTextFieldNomeCadastro;
    private javax.swing.JLabel lblAcorde;
    private javax.swing.JLabel lblEmailCadastro;
    private javax.swing.JLabel lblNomeCadastro;
    private javax.swing.JLabel lblPerfilCadastro;
    private javax.swing.JLabel lblSenhaCadastro;
    // End of variables declaration//GEN-END:variables
}
