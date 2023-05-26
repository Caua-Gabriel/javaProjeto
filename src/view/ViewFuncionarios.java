
package view;

import dados.EmpresaDao;
import dados.Funcionarios;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ViewFuncionarios extends javax.swing.JFrame {

    public ViewFuncionarios(String op) {
        initComponents();
        if (op.equalsIgnoreCase("cadastrar")) {
            btnExcluir.setVisible(false);
            btnConsultar.setVisible(false);
            btnAlterar.setVisible(false);
        } else if (op.equalsIgnoreCase("consultar") || op.equalsIgnoreCase("excluir") || op.equalsIgnoreCase("alterar")) {
            btnCadastrar.setVisible(false);
            btnExcluir.setVisible(false);
            btnAlterar.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        btnCadastrar = new javax.swing.JToggleButton();
        btnConsultar = new javax.swing.JToggleButton();
        btnAlterar = new javax.swing.JToggleButton();
        btnExcluir = new javax.swing.JToggleButton();
        btnLimpar = new javax.swing.JToggleButton();

        setTitle("Tela Funcionários");
        getContentPane().setLayout(null);

        lblCodigo.setText("Código");
        getContentPane().add(lblCodigo);
        lblCodigo.setBounds(180, 100, 50, 40);
        getContentPane().add(txtCodigo);
        txtCodigo.setBounds(270, 100, 220, 40);

        lblNome.setText("Nome");
        getContentPane().add(lblNome);
        lblNome.setBounds(180, 170, 50, 40);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(270, 170, 220, 39);

        lblSenha.setText("Senha");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(180, 240, 50, 40);
        getContentPane().add(txtSenha);
        txtSenha.setBounds(270, 240, 220, 37);

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(100, 330, 110, 23);

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultar);
        btnConsultar.setBounds(100, 330, 111, 23);

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar);
        btnAlterar.setBounds(250, 330, 110, 23);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(400, 330, 110, 23);

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar);
        btnLimpar.setBounds(550, 330, 110, 23);

        setSize(new java.awt.Dimension(731, 449));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Funcionarios f = new Funcionarios();
        f.setNome(txtNome.getText());
        f.setCodigo(Integer.parseInt(txtCodigo.getText()));
        f.setSenha(txtSenha.getText());
        try {
            EmpresaDao.salvarDepartamento(f);
            JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso");
        } catch (ClassNotFoundException x) {
            JOptionPane.showMessageDialog(null, "Driver.class JDBC não encontrada" + x.getMessage());
        } catch (SQLException x) {
            if (x.getMessage().contains("Duplicate entry")) {
                JOptionPane.showMessageDialog(null, "Este departamento de código " + txtCodigo.getText() + " já está cadastrado");
            } else {
                JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados " + x.getMessage());
            }
            limparTela();
            txtCodigo.requestFocus();//posiciona o cursor dentro do campo código
        } catch (NumberFormatException x) {
            JOptionPane.showMessageDialog(null, "O código precisa ser número inteiro");
            txtCodigo.requestFocus();
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        Funcionarios dep = new Funcionarios();
        dep.setNome(txtNome.getText());
        dep.setCodigo(Integer.parseInt(txtCodigo.getText()));
        dep.setSenha(txtSenha.getText());
        
        try {
            ResultSet resultado = EmpresaDao.consultarDepartamento(dep);
            if (resultado.next()) {
                txtNome.setText(resultado.getString("nome"));
                txtSenha.setText(resultado.getString("senha"));
                btnExcluir.setVisible(true);
                btnAlterar.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Código de funcionário não encontrado, tente novamente");
            }

        } catch (ClassNotFoundException x) {
            JOptionPane.showMessageDialog(null, "Driver JDBC não encontrado " + x.getMessage());
        } catch (SQLException x) {
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados " + x.getMessage());
        } catch (NumberFormatException x) {
            JOptionPane.showMessageDialog(null, "O código deve ser um valor inteiro ");
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Funcionarios f = new Funcionarios();
        f.setNome(txtNome.getText());
        f.setCodigo(Integer.parseInt(txtCodigo.getText()));
        f.setSenha(txtSenha.getText());
        try {
            EmpresaDao.excluirDepartamento(f);
            limparTela();
            txtCodigo.requestFocus();

            JOptionPane.showMessageDialog(null, "Departamento excluido com sucesso :)");
            dispose();
            
        } catch (ClassNotFoundException x) {
            JOptionPane.showMessageDialog(null, "Driver.class JDBC não encontrada" + x.getMessage());
        } catch (SQLException x) {
            JOptionPane.showMessageDialog(null, x.getMessage());
        } catch (NumberFormatException x) {
            JOptionPane.showMessageDialog(null, "O código precisa ser número inteiro");
            txtCodigo.requestFocus();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        Funcionarios f = new Funcionarios();
        f.setNome(txtNome.getText());
        f.setCodigo(Integer.parseInt(txtCodigo.getText()));
        f.setSenha(txtSenha.getText());
        try {
            EmpresaDao.alterarDepartamento(f);
            JOptionPane.showMessageDialog(null, "Funcionário Alterado com sucesso");
            limparTela();
            txtCodigo.requestFocus();
        } catch (ClassNotFoundException x) {
            JOptionPane.showMessageDialog(null, "Driver JDBC não encontrado " + x.getMessage());
        } catch (SQLException x) {
            JOptionPane.showMessageDialog(null, x.getMessage());
        } catch (NumberFormatException x) {
            JOptionPane.showMessageDialog(null, "O código precisa ser um número inteiro");
            txtCodigo.requestFocus();
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparTela();
    }//GEN-LAST:event_btnLimparActionPerformed


    public void limparTela(){
        txtCodigo.setText("");
        txtNome.setText("");
        txtSenha.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAlterar;
    private javax.swing.JToggleButton btnCadastrar;
    private javax.swing.JToggleButton btnConsultar;
    private javax.swing.JToggleButton btnExcluir;
    private javax.swing.JToggleButton btnLimpar;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
