
package br.com.acorde.view;

import br.com.acorde.dao.ModuloConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class TelaCadastro extends javax.swing.JFrame {
    
     //variaveis do BD
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    private void adicionarUsuario(){
        if(jComboBoxPerfilCadastro.getSelectedItem().equals("Cliente")){
             String sql = "insert into Cliente (nome, email, senha, Sobrenome, DataNascimento, Telefone ) values (?,?,?,?,?,?)";
             try{
                  pst = conexao.prepareStatement(sql);
                  pst.setString(1, txtNomeCliente.getText());
                  pst.setString(2, txtEmailCliente.getText());
                  pst.setString(3, jpfSenhaCliente.getText());
                  pst.setString(4, txtSobrenomeCliente.getText());
                  pst.setString(5, ftxtDataCliente.getText());
                  pst.setString(6, jtxTelefoneCliente.getText());
                  
                  //validando se os campos obrigatorios foram preenchidos
                  if( txtNomeCliente.getText().isEmpty() || txtEmailCliente.getText().isEmpty()
                     || jpfSenhaCliente.getText().isEmpty()){
                       JOptionPane.showMessageDialog(null, "Preencha os campos obrigatorios");
                  }else{
                      //a linha abaixo atualiza a tbela com o dados que pegou do form e coloca o resultado dentro da var
                int adicionado = pst.executeUpdate();
                //se o  pst.executeUpdate() for executado com sucesso ele retorna 1, 
                //se colocar pst.executeUpdate() > 0 ele vai executar duas vezes a insercao na tabela
                if( adicionado > 0){
                    JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso");
                    txtNomeCliente.setText(null);
                    txtEmailCliente.setText(null);
                    jpfSenhaCliente.setText(null);
                    TelaLogin.main(null);
                    dispose();
                    }
                  }             
             }catch(Exception e){
                  JOptionPane.showMessageDialog(null, e);
                  e.printStackTrace();
             }
        }else if(jComboBoxPerfilCadastro.getSelectedItem().equals("Educador Físico")){
            String sql = "insert into Educador_Fisico (nome, email, senha, Sobrenome, DataNascimento, Telefone ) values (?,?,?,?,?,?)";
             try{
                  pst = conexao.prepareStatement(sql);
                  pst.setString(1, txtNomeCliente.getText());
                  pst.setString(2, txtEmailCliente.getText());
                  pst.setString(3, jpfSenhaCliente.getText());
                  pst.setString(4, txtSobrenomeCliente.getText());
                  pst.setString(5, ftxtDataCliente.getText());
                  pst.setString(6, jtxTelefoneCliente.getText());
                  
                  //validando se os campos obrigatorios foram preenchidos
                  if(txtNomeCliente.getText().isEmpty() || txtEmailCliente.getText().isEmpty()
                     || jpfSenhaCliente.getText().isEmpty()){
                       JOptionPane.showMessageDialog(null, "Preencha os campos obrigatorios");
                  }else{
                      //a linha abaixo atualiza a tbela com o dados que pegou do form e coloca o resultado dentro da var
                int adicionado = pst.executeUpdate();
                //se o  pst.executeUpdate() for executado com sucesso ele retorna 1, 
                //se colocar pst.executeUpdate() > 0 ele vai executar duas vezes a insercao na tabela
                if( adicionado > 0){
                    JOptionPane.showMessageDialog(null, "Profissional cadastrado com sucesso");
                    txtNomeCliente.setText(null);
                    txtEmailCliente.setText(null);
                    jpfSenhaCliente.setText(null);
                    TelaLogin.main(null);
                    dispose();
                    }
                  }             
             }catch(Exception e){
                  JOptionPane.showMessageDialog(null, e);
                  e.printStackTrace();
             }
        }else{
            String sql = "insert into Nutricionista (nome, email, senha, Sobrenome, DataNascimento, Telefone) values (?,?,?,?,?,?)";
             try{
                  pst = conexao.prepareStatement(sql);
                  pst.setString(1, txtNomeCliente.getText());
                  pst.setString(2, txtEmailCliente.getText());
                  pst.setString(3, jpfSenhaCliente.getText());
                  pst.setString(4, txtSobrenomeCliente.getText());
                  pst.setString(5, ftxtDataCliente.getText());
                  pst.setString(6, jtxTelefoneCliente.getText());
                  
                  //validando se os campos obrigatorios foram preenchidos
                  if(txtNomeCliente.getText().isEmpty() || txtEmailCliente.getText().isEmpty()
                     || jpfSenhaCliente.getText().isEmpty()){
                       JOptionPane.showMessageDialog(null, "Preencha os campos obrigatorios");
                  }else{
                      //a linha abaixo atualiza a tbela com o dados que pegou do form e coloca o resultado dentro da var
                int adicionado = pst.executeUpdate();
                //se o  pst.executeUpdate() for executado com sucesso ele retorna 1, 
                //se colocar pst.executeUpdate() > 0 ele vai executar duas vezes a insercao na tabela
                if( adicionado > 0){
                    JOptionPane.showMessageDialog(null, "Profissional cadastrado com sucesso");
                    txtNomeCliente.setText(null);
                    txtEmailCliente.setText(null);
                    jpfSenhaCliente.setText(null);
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
     * Creates new form TelaCadastro
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

        jPanel9 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        ftxtDataCliente = new javax.swing.JFormattedTextField();
        txtSobrenomeCliente = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jtxTelefoneCliente = new javax.swing.JFormattedTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        txtEmailCliente = new javax.swing.JTextField();
        jpfSenhaCliente = new javax.swing.JPasswordField();
        jPanel10 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jComboBoxPerfilCadastro = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastre-se no <Acorde!>");

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setMinimumSize(new java.awt.Dimension(702, 514));

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel45.setText("*Nome:");

        txtNomeCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNomeCliente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));

        ftxtDataCliente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        try {
            ftxtDataCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtDataCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtSobrenomeCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSobrenomeCliente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel47.setText("Telefone:");

        jtxTelefoneCliente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        try {
            jtxTelefoneCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#.####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtxTelefoneCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel48.setText("*Email:");

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel49.setText("*Senha:");

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel51.setText("Sobrenome:");

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel52.setText("Data de Nascimento:");

        txtEmailCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEmailCliente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));

        jpfSenhaCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jpfSenhaCliente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));

        jPanel10.setBackground(new java.awt.Color(153, 153, 153));

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel55.setText("Cadastro");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel55)
                .addGap(293, 293, 293))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel55)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel46.setText("*Campos Obrigatórios");

        btnCadastrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jComboBoxPerfilCadastro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxPerfilCadastro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Educador Físico", "Nutricionista" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("*Perfil:");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addGap(197, 197, 197)
                        .addComponent(jLabel51)
                        .addGap(140, 140, 140)
                        .addComponent(jLabel47))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(txtSobrenomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jtxTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel52)
                                .addGap(103, 103, 103)
                                .addComponent(jLabel48))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(ftxtDataCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(txtEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxPerfilCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel46)
                            .addComponent(jpfSenhaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel49))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(btnCadastrar)
                .addGap(70, 70, 70)
                .addComponent(btnCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCadastrar, btnCancelar});

        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel45)
                            .addComponent(jLabel51))))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSobrenomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jtxTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel52)
                        .addComponent(jLabel48))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel49)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(ftxtDataCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpfSenhaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxPerfilCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46))
                .addGap(54, 54, 54)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnCancelar))
                .addGap(170, 170, 170))
        );

        jPanel9Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCadastrar, btnCancelar});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(688, 413));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        adicionarUsuario();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JFormattedTextField ftxtDataCliente;
    private javax.swing.JComboBox<String> jComboBoxPerfilCadastro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jpfSenhaCliente;
    private javax.swing.JFormattedTextField jtxTelefoneCliente;
    private javax.swing.JTextField txtEmailCliente;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtSobrenomeCliente;
    // End of variables declaration//GEN-END:variables
}
