
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


public class TelaNutriDietaCadastro extends javax.swing.JFrame {
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
    
    private void cadastrarDieta(){
        if(jComboBoxRefeicao.getSelectedItem().equals("Café da Manhã")){
            String sql = "insert into DietaCafeManha (segunda, terca, quarta, quinta, sexta, sabado, domingo, anotacao, idCliente) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
                    JOptionPane.showMessageDialog(null, "Dieta para o cafe da manhã cadastrada");
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
        }else if(jComboBoxRefeicao.getSelectedItem().equals("Lanche da Manhã")){
            String sql = "insert into DietaLancheManha (segunda, terca, quarta, quinta, sexta, sabado, domingo, anotacao, idCliente) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
                    JOptionPane.showMessageDialog(null, "Dieta para o lanche da manhã cadastrada");
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
        }else if(jComboBoxRefeicao.getSelectedItem().equals("Almoço")){
            String sql = "insert into DietaAlmoco (segunda, terca, quarta, quinta, sexta, sabado, domingo, anotacao, idCliente) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
                    JOptionPane.showMessageDialog(null, "Dieta para o almoco cadastrada");
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
        }else if(jComboBoxRefeicao.getSelectedItem().equals("Lanche da Tarde")){
            String sql = "insert into DietaLancheTarde (segunda, terca, quarta, quinta, sexta, sabado, domingo, anotacao, idCliente) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
                    JOptionPane.showMessageDialog(null, "Dieta para o lanche da tarde cadastrada");
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
        }else if(jComboBoxRefeicao.getSelectedItem().equals("Janta")){
             String sql = "insert into DietaJanta (segunda, terca, quarta, quinta, sexta, sabado, domingo, anotacao, idCliente) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
                    JOptionPane.showMessageDialog(null, "Dieta para a janta cadastrada");
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
             String sql = "insert into DietaLancheNoite (segunda, terca, quarta, quinta, sexta, sabado, domingo, anotacao, idCliente) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
                    JOptionPane.showMessageDialog(null, "Dieta para o lanche da noite cadastrada");
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
    
    private void pesquisarDieta(){
        if(jComboBoxRefeicao.getSelectedItem().equals("Café da Manhã")){
            String num_dieta = JOptionPane.showInputDialog("Numero do Id da Dieta:");
            String sql = "select segunda, terca, quarta, quinta, sexta, sabado, domingo, anotacao, IdCliente, IdDieta from DietaCafeManha where idDieta = " + num_dieta;
            try {
                pst = conexao.prepareStatement(sql);
                rs = pst.executeQuery();
                if(rs.next()){
                    tfIdDieta.setText(rs.getString(10));
                    tfIDCliente.setText(rs.getString(9));
                    taSegunda.setText(rs.getString(1));
                    taTerca.setText(rs.getString(2));
                    taQuarta.setText(rs.getString(3));
                    taQuinta.setText(rs.getString(4));
                    taSexta.setText(rs.getString(5));
                    taSabado.setText(rs.getString(6));
                    taDomingo.setText(rs.getString(7));
                    taAnotacao.setText(rs.getString(8));
                    btnCadastrarDieta.setEnabled(false);
                }else{
                    JOptionPane.showMessageDialog(null, "Dieta nao cadastrada");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
                e.printStackTrace();
            }
        }else if(jComboBoxRefeicao.getSelectedItem().equals("Lanche da Manhã")){
            String num_dieta = JOptionPane.showInputDialog("Numero do Id da Dieta:");
            String sql = "select segunda, terca, quarta, quinta, sexta, sabado, domingo, anotacao, IdCliente, IdDieta from DietaLancheManha where idDieta = " + num_dieta;
            try {
                pst = conexao.prepareStatement(sql);
                rs = pst.executeQuery();
                if(rs.next()){
                    tfIdDieta.setText(rs.getString(10));
                    tfIDCliente.setText(rs.getString(9));
                    taSegunda.setText(rs.getString(1));
                    taTerca.setText(rs.getString(2));
                    taQuarta.setText(rs.getString(3));
                    taQuinta.setText(rs.getString(4));
                    taSexta.setText(rs.getString(5));
                    taSabado.setText(rs.getString(6));
                    taDomingo.setText(rs.getString(7));
                    taAnotacao.setText(rs.getString(8));
                    btnCadastrarDieta.setEnabled(false);
                }else{
                    JOptionPane.showMessageDialog(null, "Dieta nao cadastrada");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
                e.printStackTrace();
            }
        }else if(jComboBoxRefeicao.getSelectedItem().equals("Almoço")){
            String num_dieta = JOptionPane.showInputDialog("Numero do Id da Dieta:");
            String sql = "select segunda, terca, quarta, quinta, sexta, sabado, domingo, anotacao, IdCliente. IdDieta from Almoco where idDieta = " + num_dieta;
            try {
                pst = conexao.prepareStatement(sql);
                rs = pst.executeQuery();
                if(rs.next()){
                    tfIdDieta.setText(rs.getString(10));
                    tfIDCliente.setText(rs.getString(9));
                    taSegunda.setText(rs.getString(1));
                    taTerca.setText(rs.getString(2));
                    taQuarta.setText(rs.getString(3));
                    taQuinta.setText(rs.getString(4));
                    taSexta.setText(rs.getString(5));
                    taSabado.setText(rs.getString(6));
                    taDomingo.setText(rs.getString(7));
                    taAnotacao.setText(rs.getString(8));
                    btnCadastrarDieta.setEnabled(false);
                }else{
                    JOptionPane.showMessageDialog(null, "Dieta nao cadastrada");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
                e.printStackTrace();
            }
        }else if(jComboBoxRefeicao.getSelectedItem().equals("Lanche da Tarde")){
            String num_dieta = JOptionPane.showInputDialog("Numero do Id da Dieta:");
            String sql = "select segunda, terca, quarta, quinta, sexta, sabado, domingo, anotacao, IdCliente, IdDieta from DietaLancheTarde where idDieta = " + num_dieta;
            try {
                pst = conexao.prepareStatement(sql);
                rs = pst.executeQuery();
                if(rs.next()){
                    tfIdDieta.setText(rs.getString(10));
                    tfIDCliente.setText(rs.getString(9));
                    taSegunda.setText(rs.getString(1));
                    taTerca.setText(rs.getString(2));
                    taQuarta.setText(rs.getString(3));
                    taQuinta.setText(rs.getString(4));
                    taSexta.setText(rs.getString(5));
                    taSabado.setText(rs.getString(6));
                    taDomingo.setText(rs.getString(7));
                    taAnotacao.setText(rs.getString(8));
                    btnCadastrarDieta.setEnabled(false);
                }else{
                    JOptionPane.showMessageDialog(null, "Dieta nao cadastrada");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
                e.printStackTrace();
            }
        }else if(jComboBoxRefeicao.getSelectedItem().equals("Janta")){
            String num_dieta = JOptionPane.showInputDialog("Numero do Id da Dieta:");
            String sql = "select segunda, terca, quarta, quinta, sexta, sabado, domingo, anotacao, IdCliente, IdDieta from DietaJanta where idDieta = " + num_dieta;
            try {
                pst = conexao.prepareStatement(sql);
                rs = pst.executeQuery();
                if(rs.next()){
                    tfIdDieta.setText(rs.getString(10));
                    tfIDCliente.setText(rs.getString(9));
                    taSegunda.setText(rs.getString(1));
                    taTerca.setText(rs.getString(2));
                    taQuarta.setText(rs.getString(3));
                    taQuinta.setText(rs.getString(4));
                    taSexta.setText(rs.getString(5));
                    taSabado.setText(rs.getString(6));
                    taDomingo.setText(rs.getString(7));
                    taAnotacao.setText(rs.getString(8));
                    btnCadastrarDieta.setEnabled(false);
                }else{
                    JOptionPane.showMessageDialog(null, "Dieta nao cadastrada");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
                e.printStackTrace();
            }
        }else {
            String num_dieta = JOptionPane.showInputDialog("Numero do Id da Dieta:");
            String sql = "select segunda, terca, quarta, quinta, sexta, sabado, domingo, anotacao, IdCliente, IdDieta from DietaLancheNoite where idDieta = " + num_dieta;
            try {
                pst = conexao.prepareStatement(sql);
                rs = pst.executeQuery();
                if(rs.next()){
                    tfIdDieta.setText(rs.getString(10));
                    tfIDCliente.setText(rs.getString(9));
                    taSegunda.setText(rs.getString(1));
                    taTerca.setText(rs.getString(2));
                    taQuarta.setText(rs.getString(3));
                    taQuinta.setText(rs.getString(4));
                    taSexta.setText(rs.getString(5));
                    taSabado.setText(rs.getString(6));
                    taDomingo.setText(rs.getString(7));
                    taAnotacao.setText(rs.getString(8));
                    btnCadastrarDieta.setEnabled(false);
                }else{
                    JOptionPane.showMessageDialog(null, "Dieta nao cadastrada");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
                e.printStackTrace();
            }
        }
    }
    
    private void alterarDieta(){
         if(jComboBoxRefeicao.getSelectedItem().equals("Café da Manhã")){
             String sql = "update DietaCafeManha set segunda=?, terca=?, quarta=?, quinta=?, sexta=?, sabado=?, domingo=?, anotacao=? where idDieta = ?";
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
                pst.setString(9, tfIdDieta.getText());
               
                
                int cadastrado = pst.executeUpdate();
                if(cadastrado > 0){
                    JOptionPane.showMessageDialog(null, "Dieta para a café da manhã alterada");
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
         }else if(jComboBoxRefeicao.getSelectedItem().equals("Lanche da Manhã")){
             String sql = "update DietaLancheManha set segunda=? terca=? quarta=? quinta=? sexta=? sabado=? domingo=? anotacao=? where idDieta = ?";
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
                 pst.setString(9, tfIdDieta.getText());
               
                
                int cadastrado = pst.executeUpdate();
                if(cadastrado > 0){
                    JOptionPane.showMessageDialog(null, "Dieta para a lanche da manhã alterada");
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
         }else if(jComboBoxRefeicao.getSelectedItem().equals("Almoço")){
             String sql = "update DietaAlmoco set segunda=? terca=? quarta=? quinta=? sexta=? sabado=? domingo=? anotacao=? where idDieta = ?";
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
                pst.setString(9, tfIdDieta.getText());
               
                
                int cadastrado = pst.executeUpdate();
                if(cadastrado > 0){
                    JOptionPane.showMessageDialog(null, "Dieta para alomoço alterada");
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
         }else if(jComboBoxRefeicao.getSelectedItem().equals("Lanche da Tarde")){
             String sql = "update DietaLancheTarde set segunda=? terca=? quarta=? quinta=? sexta=? sabado=? domingo=? anotacao=? where idDieta = ?";
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
                pst.setString(9, tfIdDieta.getText());
                
                int cadastrado = pst.executeUpdate();
                if(cadastrado > 0){
                    JOptionPane.showMessageDialog(null, "Dieta para lanche da tarde alterada");
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
         }else if(jComboBoxRefeicao.getSelectedItem().equals("Janta")){
             String sql = "update DietaJanta set segunda=? terca=? quarta=? quinta=? sexta=? sabado=? domingo=? anotacao=? where idDieta = ?";
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
                pst.setString(9, tfIdDieta.getText());
                
                int cadastrado = pst.executeUpdate();
                if(cadastrado > 0){
                    JOptionPane.showMessageDialog(null, "Dieta para janta alterada");
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
             String sql = "update DietaLancheNoite set segunda=? terca=? quarta=? quinta=? sexta=? sabado=? domingo=? anotacao=? where idDieta = ?";
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
                pst.setString(9, tfIdDieta.getText());
                
                int cadastrado = pst.executeUpdate();
                if(cadastrado > 0){
                    JOptionPane.showMessageDialog(null, "Dieta para lanche da noite alterada");
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
    
    private void excluirDieta(){
        if(jComboBoxRefeicao.getSelectedItem().equals("Café da Manhã")){
            int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir a dieta", "Atenção", JOptionPane.YES_NO_OPTION);   
            if(confirma == JOptionPane.YES_OPTION){
                String sql = "delete from DietaCafeManha where IdDieta = ?";
                try{
                   pst = conexao.prepareStatement(sql);
                   pst.setString(1, tfIdDieta.getText());
                   int excluido =  pst.executeUpdate();
                   if(excluido > 0){
                       JOptionPane.showMessageDialog(null, "Dieta apagada com sucesso");
                        taSegunda.setText(null);
                        taTerca.setText(null);
                        taQuarta.setText(null);
                        taQuinta.setText(null);
                        taSexta.setText(null);
                        taSabado.setText(null);
                        taDomingo.setText(null);
                        taAnotacao.setText(null);
                        btnCadastrarDieta.setEnabled(true);
                   }    
                }catch(Exception e){
                     JOptionPane.showMessageDialog(null, e);
                      e.printStackTrace();
                }
            }
        }else if(jComboBoxRefeicao.getSelectedItem().equals("Lanche da Manhã")){
            int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir a dieta?", "Atenção", JOptionPane.YES_NO_OPTION);   
            if(confirma == JOptionPane.YES_OPTION){
                String sql = "delete from DietaLancheManha where IdDieta = ?";
                try{
                   pst = conexao.prepareStatement(sql);
                   pst.setString(1, tfIdDieta.getText());
                   int excluido =  pst.executeUpdate();
                   if(excluido > 0){
                       JOptionPane.showMessageDialog(null, "Dieta apagada com sucesso");
                        taSegunda.setText(null);
                        taTerca.setText(null);
                        taQuarta.setText(null);
                        taQuinta.setText(null);
                        taSexta.setText(null);
                        taSabado.setText(null);
                        taDomingo.setText(null);
                        taAnotacao.setText(null);
                        btnCadastrarDieta.setEnabled(true);
                   }    
                }catch(Exception e){
                     JOptionPane.showMessageDialog(null, e);
                      e.printStackTrace();
                }
            }
        }else if(jComboBoxRefeicao.getSelectedItem().equals("Almoço")){
            int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir a dieta?", "Atenção", JOptionPane.YES_NO_OPTION);   
            if(confirma == JOptionPane.YES_OPTION){
                String sql = "delete from DietaAlmoco where IdDieta = ?";
                try{
                   pst = conexao.prepareStatement(sql);
                   pst.setString(1, tfIdDieta.getText());
                   int excluido =  pst.executeUpdate();
                   if(excluido > 0){
                       JOptionPane.showMessageDialog(null, "Dieta apagada com sucesso");
                        taSegunda.setText(null);
                        taTerca.setText(null);
                        taQuarta.setText(null);
                        taQuinta.setText(null);
                        taSexta.setText(null);
                        taSabado.setText(null);
                        taDomingo.setText(null);
                        taAnotacao.setText(null);
                        btnCadastrarDieta.setEnabled(true);
                   }    
                }catch(Exception e){
                     JOptionPane.showMessageDialog(null, e);
                      e.printStackTrace();
                }
            }
        }else if(jComboBoxRefeicao.getSelectedItem().equals("Lanche da Tarde")){
            int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir a dieta?", "Atenção", JOptionPane.YES_NO_OPTION);   
            if(confirma == JOptionPane.YES_OPTION){
                String sql = "delete from DietaLancheTarde where IdDieta = ?";
                try{
                   pst = conexao.prepareStatement(sql);
                   pst.setString(1, tfIdDieta.getText());
                   int excluido =  pst.executeUpdate();
                   if(excluido > 0){
                       JOptionPane.showMessageDialog(null, "Dieta apagada com sucesso");
                        taSegunda.setText(null);
                        taTerca.setText(null);
                        taQuarta.setText(null);
                        taQuinta.setText(null);
                        taSexta.setText(null);
                        taSabado.setText(null);
                        taDomingo.setText(null);
                        taAnotacao.setText(null);
                        btnCadastrarDieta.setEnabled(true);
                   }    
                }catch(Exception e){
                     JOptionPane.showMessageDialog(null, e);
                      e.printStackTrace();
                }
            }
        }else if(jComboBoxRefeicao.getSelectedItem().equals("Janta")){
            int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir a dieta?", "Atenção", JOptionPane.YES_NO_OPTION);   
            if(confirma == JOptionPane.YES_OPTION){
                String sql = "delete from DietaJanta where IdDieta = ?";
                try{
                   pst = conexao.prepareStatement(sql);
                   pst.setString(1, tfIdDieta.getText());
                   int excluido =  pst.executeUpdate();
                   if(excluido > 0){
                       JOptionPane.showMessageDialog(null, "Dieta apagada com sucesso");
                        taSegunda.setText(null);
                        taTerca.setText(null);
                        taQuarta.setText(null);
                        taQuinta.setText(null);
                        taSexta.setText(null);
                        taSabado.setText(null);
                        taDomingo.setText(null);
                        taAnotacao.setText(null);
                        btnCadastrarDieta.setEnabled(true);
                   }    
                }catch(Exception e){
                     JOptionPane.showMessageDialog(null, e);
                      e.printStackTrace();
                }
            }
        }else{
            int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir a dieta?", "Atenção", JOptionPane.YES_NO_OPTION);   
            if(confirma == JOptionPane.YES_OPTION){
                String sql = "delete from DietaLancheNoite where IdDieta = ?";
                try{
                   pst = conexao.prepareStatement(sql);
                   pst.setString(1, tfIdDieta.getText());
                   int excluido =  pst.executeUpdate();
                   if(excluido > 0){
                       JOptionPane.showMessageDialog(null, "Dieta apagada com sucesso");
                        taSegunda.setText(null);
                        taTerca.setText(null);
                        taQuarta.setText(null);
                        taQuinta.setText(null);
                        taSexta.setText(null);
                        taSabado.setText(null);
                        taDomingo.setText(null);
                        taAnotacao.setText(null);
                        btnCadastrarDieta.setEnabled(true);
                   }    
                }catch(Exception e){
                     JOptionPane.showMessageDialog(null, e);
                      e.printStackTrace();
                }
            }
        }
    }
    /**
     * Creates new form TelaNutriDietaCadastro
     */
    public TelaNutriDietaCadastro() {
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
        tfIdDieta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tdData = new javax.swing.JTextField();
        jComboBoxRefeicao = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tfClienteNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfIDCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taTerca = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        taQuarta = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        taDomingo = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        taSegunda = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        taQuinta = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        taSexta = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        taSabado = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        taAnotacao = new javax.swing.JTextArea();
        btnCadastrarDieta = new javax.swing.JButton();
        btnConsultarDieta = new javax.swing.JButton();
        btnEditarDieta = new javax.swing.JButton();
        btnDeletarDieta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dieta");
        setMinimumSize(new java.awt.Dimension(1200, 670));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dieta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("ID Dieta:");

        tfIdDieta.setEditable(false);
        tfIdDieta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Data:");

        tdData.setEditable(false);
        tdData.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jComboBoxRefeicao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Café da Manhã", "Lanche da Manhã", "Almoço", "Lanche da Tarde", "Janta", "Lanche da Noite" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Refeição");

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
                            .addComponent(tfIdDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tdData, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxRefeicao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                    .addComponent(tfIdDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tdData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxRefeicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Segunda-Feira");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Terça-Feira");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Quarta-Feira");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Quinta-Feira");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Sexta-Feira");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Sábado");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Domingo");

        taTerca.setColumns(18);
        taTerca.setRows(5);
        jScrollPane2.setViewportView(taTerca);

        taQuarta.setColumns(18);
        taQuarta.setRows(5);
        jScrollPane3.setViewportView(taQuarta);

        taDomingo.setColumns(18);
        taDomingo.setRows(5);
        jScrollPane4.setViewportView(taDomingo);

        taSegunda.setColumns(18);
        taSegunda.setRows(5);
        jScrollPane5.setViewportView(taSegunda);

        taQuinta.setColumns(18);
        taQuinta.setRows(5);
        jScrollPane6.setViewportView(taQuinta);

        taSexta.setColumns(18);
        taSexta.setRows(5);
        jScrollPane7.setViewportView(taSexta);

        taSabado.setColumns(18);
        taSabado.setRows(5);
        jScrollPane8.setViewportView(taSabado);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Anotação Opcional");

        taAnotacao.setColumns(18);
        taAnotacao.setRows(5);
        jScrollPane9.setViewportView(taAnotacao);

        btnCadastrarDieta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCadastrarDieta.setText("Cadastrar");
        btnCadastrarDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarDietaActionPerformed(evt);
            }
        });

        btnConsultarDieta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnConsultarDieta.setText("Consultar");
        btnConsultarDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarDietaActionPerformed(evt);
            }
        });

        btnEditarDieta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEditarDieta.setText("Editar");
        btnEditarDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarDietaActionPerformed(evt);
            }
        });

        btnDeletarDieta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDeletarDieta.setText("Deletar");
        btnDeletarDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarDietaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)
                            .addComponent(jScrollPane7)
                            .addComponent(jScrollPane5))
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane8))
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12)
                            .addComponent(jScrollPane3)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane4))
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13)
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane6)
                            .addComponent(jScrollPane9)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(btnCadastrarDieta)
                        .addGap(80, 80, 80)
                        .addComponent(btnConsultarDieta)
                        .addGap(107, 107, 107)
                        .addComponent(btnEditarDieta)
                        .addGap(88, 88, 88)
                        .addComponent(btnDeletarDieta)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCadastrarDieta, btnConsultarDieta, btnDeletarDieta, btnEditarDieta});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarDieta)
                    .addComponent(btnConsultarDieta)
                    .addComponent(btnEditarDieta)
                    .addComponent(btnDeletarDieta))
                .addGap(0, 62, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1216, 709));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfClienteNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfClienteNomeKeyReleased
        consultarCliente();
    }//GEN-LAST:event_tfClienteNomeKeyReleased

    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMouseClicked
        setarCampo();
    }//GEN-LAST:event_tblClienteMouseClicked

    private void btnCadastrarDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarDietaActionPerformed
        cadastrarDieta();
    }//GEN-LAST:event_btnCadastrarDietaActionPerformed

    private void btnConsultarDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarDietaActionPerformed
      pesquisarDieta();
    }//GEN-LAST:event_btnConsultarDietaActionPerformed

    private void btnEditarDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarDietaActionPerformed
       alterarDieta();
    }//GEN-LAST:event_btnEditarDietaActionPerformed

    private void btnDeletarDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarDietaActionPerformed
        excluirDieta();
    }//GEN-LAST:event_btnDeletarDietaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaNutriDietaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaNutriDietaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaNutriDietaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaNutriDietaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaNutriDietaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarDieta;
    private javax.swing.JButton btnConsultarDieta;
    private javax.swing.JButton btnDeletarDieta;
    private javax.swing.JButton btnEditarDieta;
    public static javax.swing.JComboBox<String> jComboBoxRefeicao;
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
    private javax.swing.JTextField tfIdDieta;
    // End of variables declaration//GEN-END:variables
}
