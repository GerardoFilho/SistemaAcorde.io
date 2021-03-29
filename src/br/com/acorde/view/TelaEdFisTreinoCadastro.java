
package br.com.acorde.view;

import br.com.acorde.dao.ModuloConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class TelaEdFisTreinoCadastro extends javax.swing.JFrame {
     //variaveis do BD
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    
     private void consultarCliente(){
        String sql = "select idCliente as ID, nome as Nome, Sobrenome as Sobrenome from Cliente where nome like ?";
        try{
            pst = conexao.prepareStatement(sql);
            pst.setString(1, tfClienteNome.getText() + "%");
            rs = pst.executeQuery();
            tblCliente.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
             e.printStackTrace();
        }
    }
    
    //setar o campo id da tabela de cliente
    private void setarCampo(){
        int setar = tblCliente.getSelectedRow();
        tfIDCliente.setText(tblCliente.getModel().getValueAt(setar,0).toString());
    }
    
    private void cadastrarTreino(){
         if(jComboBoxTipoTreino.getSelectedItem().equals("Aeróbico")){
            String sql = "insert into TreinoAer( segunda, terca, quarta, quinta, sexta, sabado, domingo, anotacao, idCliente) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            try{
                pst = conexao.prepareStatement(sql);
                pst.setString(1, taSegunda.getText());
                pst.setString(2, taTerca.getText());
                pst.setString(3, taQuarta.getText());
                pst.setString(4, taQuinta.getText());
                pst.setString(5, taSexta.getText());
                pst.setString(6, taSabado.getText());
                pst.setString(7, taDomingo.getText());
                pst.setString(8, taAnotacao.getText());
                pst.setString(9, tfIDCliente.getText());
                
                 int cadastrado = pst.executeUpdate();
                if(cadastrado > 0){
                    JOptionPane.showMessageDialog(null, "Treino aeróbico cadastrado");
                    taSegunda.setText(null);
                    taTerca.setText(null);
                    taQuarta.setText(null);
                    taQuinta.setText(null);
                    taSexta.setText(null);
                    taSabado.setText(null);
                    taDomingo.setText(null);
                    taAnotacao.setText(null);
                    tfIDCliente.setText(null);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
                e.printStackTrace();
            }
        }else{
              String sql = "insert into TreinoAnaer( segunda, terca, quarta, quinta, sexta, sabado, domingo, anotacao, idCliente) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            try{
                pst = conexao.prepareStatement(sql);
                pst.setString(1, taSegunda.getText());
                pst.setString(2, taTerca.getText());
                pst.setString(3, taQuarta.getText());
                pst.setString(4, taQuinta.getText());
                pst.setString(5, taSexta.getText());
                pst.setString(6, taSabado.getText());
                pst.setString(7, taDomingo.getText());
                pst.setString(8, taAnotacao.getText());
                pst.setString(9, tfIDCliente.getText());
                
                 int cadastrado = pst.executeUpdate();
                if(cadastrado > 0){
                    JOptionPane.showMessageDialog(null, "Treino anaeróbico cadastrado");
                    taSegunda.setText(null);
                    taTerca.setText(null);
                    taQuarta.setText(null);
                    taQuinta.setText(null);
                    taSexta.setText(null);
                    taSabado.setText(null);
                    taDomingo.setText(null);
                    taAnotacao.setText(null);
                    tfIDCliente.setText(null);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
                e.printStackTrace();
            }
         }
    }
    
    private void consultarTreino(){
        if(jComboBoxTipoTreino.getSelectedItem().equals("Aeróbico")){
            String num_treino = JOptionPane.showInputDialog("Numero do Id do Treino:");
            String sql = "select segunda, terca, quarta, quinta, sexta, sabado, domingo, anotacao, IdCliente, IdTreino from TreinoAer where idTreino = " + num_treino;
            try {
                pst = conexao.prepareStatement(sql);
                rs = pst.executeQuery();
                if(rs.next()){
                    tfIdTreino.setText(rs.getString(10));
                    tfIDCliente.setText(rs.getString(9));
                    taSegunda.setText(rs.getString(1));
                    taTerca.setText(rs.getString(2));
                    taQuarta.setText(rs.getString(3));
                    taQuinta.setText(rs.getString(4));
                    taSexta.setText(rs.getString(5));
                    taSabado.setText(rs.getString(6));
                    taDomingo.setText(rs.getString(7));
                    taAnotacao.setText(rs.getString(8));
                    btnCadastrarTreino.setEnabled(false);
                }else{
                    JOptionPane.showMessageDialog(null, "Treino nao cadastrado");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
                e.printStackTrace();
            }
        }else{
            String num_treino = JOptionPane.showInputDialog("Numero do Id do Treino:");
            String sql = "select segunda, terca, quarta, quinta, sexta, sabado, domingo, anotacao, IdCliente, IdTreino from TreinoAnaer where idTreino = " + num_treino;
            try {
                pst = conexao.prepareStatement(sql);
                rs = pst.executeQuery();
                if(rs.next()){
                    tfIdTreino.setText(rs.getString(10));
                    tfIDCliente.setText(rs.getString(9));
                    taSegunda.setText(rs.getString(1));
                    taTerca.setText(rs.getString(2));
                    taQuarta.setText(rs.getString(3));
                    taQuinta.setText(rs.getString(4));
                    taSexta.setText(rs.getString(5));
                    taSabado.setText(rs.getString(6));
                    taDomingo.setText(rs.getString(7));
                    taAnotacao.setText(rs.getString(8));
                    btnCadastrarTreino.setEnabled(false);
                }else{
                    JOptionPane.showMessageDialog(null, "Treino nao cadastrado");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
                e.printStackTrace();
            }
        }
    }
    
    
    private void alterarTreino(){
        if(jComboBoxTipoTreino.getSelectedItem().equals("Aeróbico")){
            String sql = "update TreinoAer set segunda=?, terca=?, quarta=?, quinta=?, sexta=?, sabado=?, domingo=?, anotacao=? where idTreino = ?";
             try{
                pst = conexao.prepareStatement(sql);
                pst.setString(1, taSegunda.getText());
                pst.setString(2, taTerca.getText());
                pst.setString(3, taQuarta.getText());
                pst.setString(4, taQuinta.getText());
                pst.setString(5, taSexta.getText());
                pst.setString(6, taSabado.getText());
                pst.setString(7, taDomingo.getText());
                pst.setString(8, taAnotacao.getText());
                pst.setString(9, tfIdTreino.getText());
               
                
                int cadastrado = pst.executeUpdate();
                if(cadastrado > 0){
                    JOptionPane.showMessageDialog(null, "Treino alterado");
                    taSegunda.setText(null);
                    taTerca.setText(null);
                    taQuarta.setText(null);
                    taQuinta.setText(null);
                    taSexta.setText(null);
                    taSabado.setText(null);
                    taDomingo.setText(null);
                    taAnotacao.setText(null);
                   
                }                  
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
                e.printStackTrace();
            }
        }else{
             String sql = "update TreinoAnaer set segunda=?, terca=?, quarta=?, quinta=?, sexta=?, sabado=?, domingo=?, anotacao=? where idTreino = ?";
             try{
                pst = conexao.prepareStatement(sql);
                pst.setString(1, taSegunda.getText());
                pst.setString(2, taTerca.getText());
                pst.setString(3, taQuarta.getText());
                pst.setString(4, taQuinta.getText());
                pst.setString(5, taSexta.getText());
                pst.setString(6, taSabado.getText());
                pst.setString(7, taDomingo.getText());
                pst.setString(8, taAnotacao.getText());
                pst.setString(9, tfIdTreino.getText());
               
                
                int cadastrado = pst.executeUpdate();
                if(cadastrado > 0){
                    JOptionPane.showMessageDialog(null, "Treino alterado");
                    taSegunda.setText(null);
                    taTerca.setText(null);
                    taQuarta.setText(null);
                    taQuinta.setText(null);
                    taSexta.setText(null);
                    taSabado.setText(null);
                    taDomingo.setText(null);
                    taAnotacao.setText(null);
                   
                }                  
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
                e.printStackTrace();
            }
        }
    }
    
    private void excluirTreino(){
        if(jComboBoxTipoTreino.getSelectedItem().equals("Aeróbico")){
            int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o treino?", "Atenção", JOptionPane.YES_NO_OPTION);   
            if(confirma == JOptionPane.YES_OPTION){
                String sql = "delete from TreinoAer where IdTreino = ?";
                try{
                   pst = conexao.prepareStatement(sql);
                   pst.setString(1, tfIdTreino.getText());
                   int excluido =  pst.executeUpdate();
                   if(excluido > 0){
                       JOptionPane.showMessageDialog(null, "Treino apagado com sucesso");
                        taSegunda.setText(null);
                        taTerca.setText(null);
                        taQuarta.setText(null);
                        taQuinta.setText(null);
                        taSexta.setText(null);
                        taSabado.setText(null);
                        taDomingo.setText(null);
                        taAnotacao.setText(null);
                        btnCadastrarTreino.setEnabled(true);
                   }    
                }catch(Exception e){
                     JOptionPane.showMessageDialog(null, e);
                      e.printStackTrace();
                }
            }
         }else{
                int conf = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o treino?", "Atenção", JOptionPane.YES_NO_OPTION);   
                if(conf == JOptionPane.YES_OPTION){
                String sql = "delete from TreinoAnaer where IdTreino = ?";
                try{
                   pst = conexao.prepareStatement(sql);
                   pst.setString(1, tfIdTreino.getText());
                   int excluido =  pst.executeUpdate();
                   if(excluido > 0){
                       JOptionPane.showMessageDialog(null, "Treino apagado com sucesso");
                        taSegunda.setText(null);
                        taTerca.setText(null);
                        taQuarta.setText(null);
                        taQuinta.setText(null);
                        taSexta.setText(null);
                        taSabado.setText(null);
                        taDomingo.setText(null);
                        taAnotacao.setText(null);
                        btnCadastrarTreino.setEnabled(true);
                    }    
                }catch(Exception e){
                     JOptionPane.showMessageDialog(null, e);
                      e.printStackTrace();
                    }
                }
            }
       
    }
    /**
     * Creates new form TelaEdFisTreinoCadastro
     */
    public TelaEdFisTreinoCadastro() {
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
        jLabel1 = new javax.swing.JLabel();
        tfIdTreino = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tdData = new javax.swing.JTextField();
        jComboBoxTipoTreino = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tfClienteNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfIDCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        taSegunda = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taTerca = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        taQuarta = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        taQuinta = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        taSexta = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        taSabado = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        taDomingo = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        taAnotacao = new javax.swing.JTextArea();
        btnCadastrarTreino = new javax.swing.JButton();
        btnConsultarTreino = new javax.swing.JButton();
        btnEditarTreino = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Treino", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("ID Treino:");

        tfIdTreino.setEditable(false);
        tfIdTreino.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Data:");

        tdData.setEditable(false);
        tdData.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jComboBoxTipoTreino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aeróbico", "Anaeróbico" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Tipo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(tfIdTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tdData, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxTipoTreino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfIdTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tdData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxTipoTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 11, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Nome:");

        tfClienteNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfClienteNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfClienteNomeKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("ID:");

        tfIDCliente.setEditable(false);
        tfIDCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "Sobrenome"
            }
        ));
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCliente);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(tfIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 11, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Segunda-Feira");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 266, -1, -1));

        taSegunda.setColumns(18);
        taSegunda.setRows(5);
        jScrollPane5.setViewportView(taSegunda);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 299, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Terça-Feira");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 266, -1, -1));

        taTerca.setColumns(18);
        taTerca.setRows(5);
        jScrollPane2.setViewportView(taTerca);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 299, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Quarta-Feira");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 266, -1, -1));

        taQuarta.setColumns(18);
        taQuarta.setRows(5);
        jScrollPane3.setViewportView(taQuarta);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 299, -1, -1));

        taQuinta.setColumns(18);
        taQuinta.setRows(5);
        jScrollPane6.setViewportView(taQuinta);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(847, 299, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Quinta-Feira");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(847, 266, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Sexta-Feira");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 421, -1, -1));

        taSexta.setColumns(18);
        taSexta.setRows(5);
        jScrollPane7.setViewportView(taSexta);

        getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 454, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Sábado");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 421, -1, -1));

        taSabado.setColumns(18);
        taSabado.setRows(5);
        jScrollPane8.setViewportView(taSabado);

        getContentPane().add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 454, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Domingo");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 421, -1, -1));

        taDomingo.setColumns(18);
        taDomingo.setRows(5);
        jScrollPane4.setViewportView(taDomingo);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 454, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Anotação Opcional");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(847, 421, -1, -1));

        taAnotacao.setColumns(18);
        taAnotacao.setRows(5);
        jScrollPane9.setViewportView(taAnotacao);

        getContentPane().add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(847, 454, -1, -1));

        btnCadastrarTreino.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCadastrarTreino.setText("Cadastrar");
        btnCadastrarTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarTreinoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrarTreino, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 596, -1, -1));

        btnConsultarTreino.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnConsultarTreino.setText("Consultar");
        btnConsultarTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarTreinoActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultarTreino, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 596, -1, -1));

        btnEditarTreino.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEditarTreino.setText("Editar");
        btnEditarTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarTreinoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditarTreino, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 596, 91, -1));

        Excluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Excluir.setText("Excluir");
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(Excluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(814, 596, 91, -1));

        setSize(new java.awt.Dimension(1216, 709));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfClienteNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfClienteNomeKeyReleased
        consultarCliente();
    }//GEN-LAST:event_tfClienteNomeKeyReleased

    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMouseClicked
        setarCampo();
    }//GEN-LAST:event_tblClienteMouseClicked

    private void btnCadastrarTreinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarTreinoActionPerformed
        cadastrarTreino();
    }//GEN-LAST:event_btnCadastrarTreinoActionPerformed

    private void btnConsultarTreinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarTreinoActionPerformed
        consultarTreino();
    }//GEN-LAST:event_btnConsultarTreinoActionPerformed

    private void btnEditarTreinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarTreinoActionPerformed
        alterarTreino();
    }//GEN-LAST:event_btnEditarTreinoActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        excluirTreino();
    }//GEN-LAST:event_ExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEdFisTreinoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEdFisTreinoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEdFisTreinoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEdFisTreinoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEdFisTreinoCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Excluir;
    private javax.swing.JButton btnCadastrarTreino;
    private javax.swing.JButton btnConsultarTreino;
    private javax.swing.JButton btnEditarTreino;
    public static javax.swing.JComboBox<String> jComboBoxTipoTreino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea taAnotacao;
    private javax.swing.JTextArea taDomingo;
    private javax.swing.JTextArea taQuarta;
    private javax.swing.JTextArea taQuinta;
    private javax.swing.JTextArea taSabado;
    private javax.swing.JTextArea taSegunda;
    private javax.swing.JTextArea taSexta;
    private javax.swing.JTextArea taTerca;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField tdData;
    private javax.swing.JTextField tfClienteNome;
    private javax.swing.JTextField tfIDCliente;
    private javax.swing.JTextField tfIdTreino;
    // End of variables declaration//GEN-END:variables
}
