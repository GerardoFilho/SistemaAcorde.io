
package br.com.acorde.view;

import br.com.acorde.dao.ModuloConexao;
import static br.com.acorde.view.TelaClientePerfil.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class TelaPrincipalCliente extends javax.swing.JFrame {
    
     //variaveis do BD
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    /**
     * Creates new form TelaPrincipalCliente
     */
    public TelaPrincipalCliente() {
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
        lblUserNome = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblMenuPerfilCliente = new javax.swing.JLabel();
        lblMenuDietaCliente = new javax.swing.JLabel();
        lblMenuTreinoCliente = new javax.swing.JLabel();
        lblMenuMensagemCliente = new javax.swing.JLabel();
        lblMenuRelatorioCliente = new javax.swing.JLabel();
        lblSair = new javax.swing.JLabel();
        lblMenuAliementoCliente = new javax.swing.JLabel();
        lblMenuProCliente = new javax.swing.JLabel();
        jPanelAreaCliente = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Seja bem vindo(a) ao <Acorde>, ");

        lblUserNome.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblUserNome.setText("Nome");

        lblData.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblData.setText("Terça, 23 de Março de 2021");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUserNome))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(270, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblUserNome))
                .addGap(18, 18, 18)
                .addComponent(lblData)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Menu");

        lblMenuPerfilCliente.setBackground(new java.awt.Color(255, 255, 255));
        lblMenuPerfilCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMenuPerfilCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/acorde/imagens/user.png"))); // NOI18N
        lblMenuPerfilCliente.setText("     Perfil");
        lblMenuPerfilCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenuPerfilCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuPerfilClienteMouseClicked(evt);
            }
        });

        lblMenuDietaCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMenuDietaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/acorde/imagens/prato.png"))); // NOI18N
        lblMenuDietaCliente.setText("     Dieta");
        lblMenuDietaCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenuDietaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuDietaClienteMouseClicked(evt);
            }
        });

        lblMenuTreinoCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMenuTreinoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/acorde/imagens/treino.png"))); // NOI18N
        lblMenuTreinoCliente.setText("     Treino");
        lblMenuTreinoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenuTreinoCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuTreinoClienteMouseClicked(evt);
            }
        });

        lblMenuMensagemCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMenuMensagemCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/acorde/imagens/msg.png"))); // NOI18N
        lblMenuMensagemCliente.setText("    Mensagens");
        lblMenuMensagemCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenuMensagemCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuMensagemClienteMouseClicked(evt);
            }
        });

        lblMenuRelatorioCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMenuRelatorioCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/acorde/imagens/relatorio1.png"))); // NOI18N
        lblMenuRelatorioCliente.setText("     Relatório");
        lblMenuRelatorioCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblSair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/acorde/imagens/sair.png"))); // NOI18N
        lblSair.setText("     Sair");
        lblSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSairMouseClicked(evt);
            }
        });

        lblMenuAliementoCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMenuAliementoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/acorde/imagens/alimento.png"))); // NOI18N
        lblMenuAliementoCliente.setText("     Alimentos");
        lblMenuAliementoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenuAliementoCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuAliementoClienteMouseClicked(evt);
            }
        });

        lblMenuProCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMenuProCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/acorde/imagens/profissionais.png"))); // NOI18N
        lblMenuProCliente.setText("     Profissionais");
        lblMenuProCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenuProCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuProClienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMenuDietaCliente)
                    .addComponent(lblMenuPerfilCliente)
                    .addComponent(lblMenuTreinoCliente)
                    .addComponent(lblMenuProCliente)
                    .addComponent(lblMenuRelatorioCliente)
                    .addComponent(lblSair)
                    .addComponent(lblMenuMensagemCliente)
                    .addComponent(lblMenuAliementoCliente))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(76, 76, 76))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblMenuAliementoCliente, lblMenuDietaCliente, lblMenuMensagemCliente, lblMenuPerfilCliente, lblMenuProCliente, lblMenuRelatorioCliente, lblMenuTreinoCliente, lblSair});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(2, 2, 2)
                .addComponent(lblMenuPerfilCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMenuDietaCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMenuTreinoCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMenuAliementoCliente)
                .addGap(18, 18, 18)
                .addComponent(lblMenuMensagemCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMenuProCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMenuRelatorioCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSair)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblMenuAliementoCliente, lblMenuDietaCliente, lblMenuMensagemCliente, lblMenuPerfilCliente, lblMenuProCliente, lblMenuRelatorioCliente, lblMenuTreinoCliente, lblSair});

        jPanelAreaCliente.setBackground(new java.awt.Color(204, 204, 204));
        jPanelAreaCliente.setPreferredSize(new java.awt.Dimension(702, 514));

        javax.swing.GroupLayout jPanelAreaClienteLayout = new javax.swing.GroupLayout(jPanelAreaCliente);
        jPanelAreaCliente.setLayout(jPanelAreaClienteLayout);
        jPanelAreaClienteLayout.setHorizontalGroup(
            jPanelAreaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        jPanelAreaClienteLayout.setVerticalGroup(
            jPanelAreaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 513, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelAreaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelAreaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1009, 689));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //traz a data do sistema
        Date data = new Date();
        DateFormat formatado = DateFormat.getDateInstance(DateFormat.FULL);
        lblData.setText(formatado.format(data));
        
    }//GEN-LAST:event_formWindowActivated

    private void lblSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseClicked
        int sair = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Atenção", JOptionPane.YES_NO_OPTION);
        if(sair == JOptionPane.YES_OPTION){
           System.exit(0);
        }
    }//GEN-LAST:event_lblSairMouseClicked

    private void lblMenuPerfilClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuPerfilClienteMouseClicked
        // vai abrir a tela cliente PERFIl dentro da TelaPrincipalCliente
        TelaClientePerfil perfilCliente = new TelaClientePerfil();
        perfilCliente.setVisible(true);
        jPanelAreaCliente.add(perfilCliente);
        
        //ao clicar no botao perfil os dados que o cliente cadastrou vai ser mostrado no tela de Perfil
        //tazer conexao com o bd (ok)
        //(((((PROBLEMA)))) SÓ exibe o msm dado sempre
         
          String sql = "select * from Cliente";
          try{
              pst = conexao.prepareStatement(sql);
              //pst.setString(1, txtIdCliente.getText());
              rs = pst.executeQuery();
              // rs.last() pega a ultima linha que foi colocada no bd, entao vai ter que fazer cadastro e login
              //para mostrar essas duas funcionalidades e pegar o ultimo que foi cadastrado
              if(rs.last()){
                  txtIdCliente.setText(rs.getString(1));
                  txtNomeCliente.setText(rs.getString(2));
                  txtEmailCliente.setText(rs.getString(3));
                  jpfSenhaCliente.setText(rs.getString(4));
                  txtSobrenomeCliente.setText(rs.getString(5));
                  ftxtDataCliente.setText(rs.getString(6));
                  ftxCPFCliente.setText(rs.getString(7));
                  jtxTelefoneCliente.setText(rs.getString(8));
              } 
          }catch(Exception e){
              JOptionPane.showMessageDialog(null, e);
              e.printStackTrace();
          }
          
          
          
        
        
    }//GEN-LAST:event_lblMenuPerfilClienteMouseClicked

    private void lblMenuProClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuProClienteMouseClicked
       // vai abrir a tela cliente PROFISSIONAIS dentro da TelaPrincipalCliente
        TelaClienteProfissional profissionalCliente = new TelaClienteProfissional();
        profissionalCliente.setVisible(true);
        jPanelAreaCliente.add(profissionalCliente);
    }//GEN-LAST:event_lblMenuProClienteMouseClicked

    private void lblMenuDietaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuDietaClienteMouseClicked
        // vai abrir a tela de DIETA dentro da TelaPrincipalCliente
        TelaClienteDieta dietaCliente = new TelaClienteDieta();
        dietaCliente.setVisible(true);
        jPanelAreaCliente.add(dietaCliente);
    }//GEN-LAST:event_lblMenuDietaClienteMouseClicked

    private void lblMenuTreinoClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuTreinoClienteMouseClicked
         // vai abrir a tela de Treino dentro da TelaPrincipalCliente
        TelaClienteTreino treinoCliente = new TelaClienteTreino();
        treinoCliente.setVisible(true);
        jPanelAreaCliente.add(treinoCliente);
    }//GEN-LAST:event_lblMenuTreinoClienteMouseClicked

    private void lblMenuAliementoClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuAliementoClienteMouseClicked
         // vai abrir a tela de Alimentoo dentro da TelaPrincipalCliente
       TelaClienteAlimentos alimentosCliente = new TelaClienteAlimentos();
       alimentosCliente.setVisible(true);
       jPanelAreaCliente.add(alimentosCliente);
    }//GEN-LAST:event_lblMenuAliementoClienteMouseClicked

    private void lblMenuMensagemClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMensagemClienteMouseClicked
         // vai abrir a tela de Mensagem dentro da TelaPrincipalCliente
       TelaClienteMensagem mensagemCliente = new TelaClienteMensagem();
       mensagemCliente.setVisible(true);
       jPanelAreaCliente.add(mensagemCliente);
    }//GEN-LAST:event_lblMenuMensagemClienteMouseClicked

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
            java.util.logging.Logger.getLogger(TelaPrincipalCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelAreaCliente;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblMenuAliementoCliente;
    private javax.swing.JLabel lblMenuDietaCliente;
    private javax.swing.JLabel lblMenuMensagemCliente;
    private javax.swing.JLabel lblMenuPerfilCliente;
    private javax.swing.JLabel lblMenuProCliente;
    private javax.swing.JLabel lblMenuRelatorioCliente;
    private javax.swing.JLabel lblMenuTreinoCliente;
    private javax.swing.JLabel lblSair;
    public static javax.swing.JLabel lblUserNome;
    // End of variables declaration//GEN-END:variables
}
