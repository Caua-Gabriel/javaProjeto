
package view;

import dados.EmpresaDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ViewLogin extends javax.swing.JFrame {

    public ViewLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel2 = new java.awt.Panel();
        lblCode = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        txtCode = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JToggleButton();
        btnEntrar = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Acesso de Funcionários");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        setName("Login"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(null);

        panel2.setBackground(new java.awt.Color(204, 0, 0));
        panel2.setForeground(new java.awt.Color(255, 255, 255));
        panel2.setLayout(null);

        lblCode.setBackground(new java.awt.Color(255, 255, 255));
        lblCode.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblCode.setForeground(new java.awt.Color(255, 255, 255));
        lblCode.setText("Código");
        panel2.add(lblCode);
        lblCode.setBounds(50, 110, 70, 40);

        txtSenha.setBackground(new java.awt.Color(255, 255, 255));
        txtSenha.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(51, 51, 51));
        txtSenha.setBorder(null);
        txtSenha.setFocusTraversalPolicy(null);
        txtSenha.setOpaque(true);
        txtSenha.setSelectedTextColor(new java.awt.Color(153, 153, 153));
        txtSenha.setSelectionColor(new java.awt.Color(51, 51, 51));
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        panel2.add(txtSenha);
        txtSenha.setBounds(50, 220, 240, 30);

        txtCode.setBackground(new java.awt.Color(255, 255, 255));
        txtCode.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtCode.setForeground(new java.awt.Color(51, 51, 51));
        txtCode.setBorder(null);
        txtCode.setFocusCycleRoot(true);
        txtCode.setFocusTraversalPolicyProvider(true);
        txtCode.setInheritsPopupMenu(true);
        txtCode.setOpaque(true);
        txtCode.setSelectedTextColor(new java.awt.Color(153, 153, 153));
        txtCode.setSelectionColor(new java.awt.Color(51, 51, 51));
        txtCode.setVerifyInputWhenFocusTarget(false);
        panel2.add(txtCode);
        txtCode.setBounds(50, 150, 240, 30);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Senha");
        panel2.add(jLabel4);
        jLabel4.setBounds(50, 180, 60, 40);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Login ");
        panel2.add(jLabel5);
        jLabel5.setBounds(140, 60, 70, 40);

        btnCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(51, 51, 51));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setBorder(null);
        btnCadastrar.setBorderPainted(false);
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.setFocusPainted(false);
        btnCadastrar.setFocusable(false);
        btnCadastrar.setRequestFocusEnabled(false);
        btnCadastrar.setRolloverEnabled(false);
        btnCadastrar.setVerifyInputWhenFocusTarget(false);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        panel2.add(btnCadastrar);
        btnCadastrar.setBounds(50, 290, 111, 30);

        btnEntrar.setBackground(new java.awt.Color(255, 255, 255));
        btnEntrar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(51, 51, 51));
        btnEntrar.setText("Entrar");
        btnEntrar.setBorder(null);
        btnEntrar.setBorderPainted(false);
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.setFocusPainted(false);
        btnEntrar.setFocusable(false);
        btnEntrar.setRequestFocusEnabled(false);
        btnEntrar.setRolloverEnabled(false);
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        panel2.add(btnEntrar);
        btnEntrar.setBounds(180, 290, 111, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logo.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        panel2.add(jLabel7);
        jLabel7.setBounds(380, -10, 400, 440);

        getContentPane().add(panel2);
        panel2.setBounds(0, 0, 780, 420);

        setSize(new java.awt.Dimension(787, 424));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        new ViewCadastrarFuncionario().setVisible(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        try {
            //cnx com o banco de dados e efetua o login,manda as informacooes do usuario e senha 
            ResultSet resultado = EmpresaDao.login(txtCode.getText(), txtSenha.getText());
            
            if (resultado.next()){
                dispose();
                new ViewMenu().setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos");
            }
            
        } catch (ClassNotFoundException x) {
            JOptionPane.showMessageDialog(null, "Driver JDBC não encontrado " + x.getMessage());
        } catch (SQLException x) {
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados " + x.getMessage());
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

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
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCadastrar;
    private javax.swing.JToggleButton btnEntrar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblCode;
    private java.awt.Panel panel2;
    private javax.swing.JTextField txtCode;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
