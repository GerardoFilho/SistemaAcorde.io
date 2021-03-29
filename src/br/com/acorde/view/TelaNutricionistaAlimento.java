
package br.com.acorde.view;

import br.com.acorde.dao.ModuloConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class TelaNutricionistaAlimento extends javax.swing.JInternalFrame {
     //variaveis do BD
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    private void adicionarAlimento(){
        String sql = "insert into Alimento (nome, gordura, proteina, caloria, qtdProteina, qtdGordura, qtdCaloria) values (?, ?, ?, ?, ?, ?, ?)";
        try{
             pst = conexao.prepareStatement(sql);
             pst.setString(1, tfNomeAlimento.getText());
             pst.setString(2, tfGordura.getText());
             pst.setString(3, tfProteina.getText());
             pst.setString(4, tfCaloria.getText());
             pst.setString(5, tfQtdProt.getText());
             pst.setString(6, tfQtdGord.getText());
             pst.setString(7, tfQtdCal.getText());
             
             //validando se os campos obrigatorios foram preenchidos
                  if( tfNomeAlimento.getText().isEmpty() || tfCaloria.getText().isEmpty()
                          || tfQtdCal.getText().isEmpty()){
                       JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios");
                  }else{
                   //a linha abaixo atualiza a tbela com o dados que pegou do form e coloca o resultado dentro da var
                int adicionado = pst.executeUpdate();
                //se o  pst.executeUpdate() for executado com sucesso ele retorna 1, 
                //se colocar pst.executeUpdate() > 0 ele vai executar duas vezes a insercao na tabela
                if( adicionado > 0){
                    JOptionPane.showMessageDialog(null, "Alimento cadastrado com sucesso");
                    tfNomeAlimento.setText(null);
                    tfGordura.setText(null);
                    tfProteina.setText(null);
                    tfCaloria.setText(null);
                    tfQtdProt.setText(null);
                    tfQtdGord.setText(null);
                    tfQtdCal.setText(null);
               
                    }
                  }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
    }
    
    private void pesquisarAlimento(){
        String sql = "select nome as Nome, proteina as Proteína, qtdProteina as Quantidade, gordura as Gordura, qtdGordura as Quantidade, caloria as Caloria, qtdCaloria as Quantidade from Alimento where nome like ?";
        
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, tfNomeAlimento.getText() + "%");
            rs = pst.executeQuery();
            tblAlimento.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, e);
             e.printStackTrace();
        }
    }
    
    //metodo para setar o conteudo do formulario ao clicar em um alimento na tabea
    public void setarCampos(){
        int setar = tblAlimento.getSelectedRow();
        tfProteina.setText(tblAlimento.getModel().getValueAt(setar, 1).toString());
        tfQtdProt.setText(tblAlimento.getModel().getValueAt(setar, 2).toString());
        tfGordura.setText(tblAlimento.getModel().getValueAt(setar, 3).toString());
        tfQtdGord.setText(tblAlimento.getModel().getValueAt(setar, 4).toString());
        tfCaloria.setText(tblAlimento.getModel().getValueAt(setar, 5).toString());
        tfQtdCal.setText(tblAlimento.getModel().getValueAt(setar, 6).toString());
    }
    
    
    
     private void editarAlimento(){
         String sql = "update table Alimento set proteina = ?, gordura = ?, caloria = ?, qtdProteina = ?, qtdGordura = ?, qtdCaloria = ? where nome = ?";
         try{
             pst = conexao.prepareStatement(sql);
             
             pst.setString(1, tfProteina.getText());
             pst.setString(2, tfGordura.getText());
             pst.setString(3, tfCaloria.getText());
             pst.setString(4, tfQtdProt.getText());
             pst.setString(5, tfQtdGord.getText());
             pst.setString(6, tfQtdCal.getText());
             pst.setString(7, tfNomeAlimento.getText());
             
             //validando se os campos obrigatorios foram preenchidos
                  if( tfNomeAlimento.getText().isEmpty() || tfCaloria.getText().isEmpty()
                          || tfQtdCal.getText().isEmpty()){
                       JOptionPane.showMessageDialog(null, "Preencha os campos Nome, Caloria e Quantidade");
                  }else{
                   //a linha abaixo atualiza a tbela com o dados que pegou do form e coloca o resultado dentro da var
                int adicionado = pst.executeUpdate();
                //se o  pst.executeUpdate() for executado com sucesso ele retorna 1, 
                //se colocar pst.executeUpdate() > 0 ele vai executar duas vezes a insercao na tabela
                if( adicionado > 0){
                    JOptionPane.showMessageDialog(null, "Alimento alterado com sucesso");
                    tfNomeAlimento.setText(null);
                    tfGordura.setText(null);
                    tfProteina.setText(null);
                    tfCaloria.setText(null);
                    tfQtdProt.setText(null);
                    tfQtdGord.setText(null);
                    tfQtdCal.setText(null);
               
                    }
                  }
         }catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
             e.printStackTrace();
         }
     }
    /**
     * Creates new form TelaNutricionistaAlimento
     */
    public TelaNutricionistaAlimento() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfCaloria = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfNomeAlimento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfProteina = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfGordura = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnCadastrarAli = new javax.swing.JButton();
        btnCancelarCadAli = new javax.swing.JButton();
        lblQtdProteina = new javax.swing.JLabel();
        lblQtdGordura = new javax.swing.JLabel();
        lblQtdCaloria = new javax.swing.JLabel();
        tfQtdProt = new javax.swing.JTextField();
        tfQtdGord = new javax.swing.JTextField();
        tfQtdCal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlimento = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setMinimumSize(new java.awt.Dimension(753, 511));
        setPreferredSize(new java.awt.Dimension(753, 511));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setMinimumSize(new java.awt.Dimension(737, 88));
        jPanel2.setPreferredSize(new java.awt.Dimension(737, 88));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Alimento");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(306, 306, 306)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        tfCaloria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("*Nome:");

        tfNomeAlimento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfNomeAlimento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfNomeAlimentoKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Proteína:");

        tfProteina.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Gordura:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("*Calorias:");

        btnCadastrarAli.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCadastrarAli.setText("Cadastrar");
        btnCadastrarAli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarAliActionPerformed(evt);
            }
        });

        btnCancelarCadAli.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelarCadAli.setText("Cancelar");
        btnCancelarCadAli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCadAliActionPerformed(evt);
            }
        });

        lblQtdProteina.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblQtdProteina.setText("Quantidade:");

        lblQtdGordura.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblQtdGordura.setText("Quantidade:");

        lblQtdCaloria.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblQtdCaloria.setText("*Quantidade:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("*Campos Obrigatórios");

        tblAlimento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Proteina", "Quantidade", "Gordura", "Quantidade", "Caloria", "Quantidade"
            }
        ));
        tblAlimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAlimentoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAlimento);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Alterar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfProteina, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblQtdProteina)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfQtdProt, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfGordura, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblQtdGordura)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfQtdGord, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(56, 56, 56)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfCaloria, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel12)
                                        .addGap(53, 53, 53))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblQtdCaloria)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfQtdCal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jButton3)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNomeAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(btnCadastrarAli)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(442, 442, 442)
                        .addComponent(btnCancelarCadAli, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfNomeAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(tfProteina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfGordura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(tfCaloria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12)
                                .addGap(4, 4, 4)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQtdProteina)
                            .addComponent(tfQtdProt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblQtdGordura)
                            .addComponent(tfQtdGord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfQtdCal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblQtdCaloria))
                        .addGap(123, 123, 123))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelarCadAli)
                            .addComponent(jButton3)
                            .addComponent(btnCadastrarAli))
                        .addGap(44, 44, 44))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarAliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarAliActionPerformed
       adicionarAlimento();
    }//GEN-LAST:event_btnCadastrarAliActionPerformed

    private void btnCancelarCadAliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCadAliActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarCadAliActionPerformed

    private void tfNomeAlimentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNomeAlimentoKeyReleased
        pesquisarAlimento();
    }//GEN-LAST:event_tfNomeAlimentoKeyReleased

    private void tblAlimentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAlimentoMouseClicked
        setarCampos();
    }//GEN-LAST:event_tblAlimentoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarAli;
    private javax.swing.JButton btnCancelarCadAli;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblQtdCaloria;
    private javax.swing.JLabel lblQtdGordura;
    private javax.swing.JLabel lblQtdProteina;
    private javax.swing.JTable tblAlimento;
    private javax.swing.JTextField tfCaloria;
    private javax.swing.JTextField tfGordura;
    private javax.swing.JTextField tfNomeAlimento;
    private javax.swing.JTextField tfProteina;
    private javax.swing.JTextField tfQtdCal;
    private javax.swing.JTextField tfQtdGord;
    private javax.swing.JTextField tfQtdProt;
    // End of variables declaration//GEN-END:variables
}
