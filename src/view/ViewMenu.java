package view;

public class ViewMenu extends javax.swing.JFrame {

    public ViewMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuCadastrarFuncionarios = new javax.swing.JMenuItem();
        mnuiConsultarFuncionarios = new javax.swing.JMenuItem();
        mnuiAlterarFuncionarios = new javax.swing.JMenuItem();
        mnuiExcluirFuncionarios = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Funcionários");
        getContentPane().setLayout(null);

        jMenu1.setBorder(null);
        jMenu1.setText("Clientes");

        jMenuItem2.setText("Consultar Pedidos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Alterar Pedidos");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Cancelar Pedidos");
        jMenu1.add(jMenuItem4);

        jMenuItem10.setText("Relatórios");
        jMenu1.add(jMenuItem10);
        jMenu1.add(jSeparator1);

        jMenuItem5.setText("Pagamento");
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Funcionários");

        mnuCadastrarFuncionarios.setText("Cadastrar Funcionário");
        mnuCadastrarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastrarFuncionariosActionPerformed(evt);
            }
        });
        jMenu2.add(mnuCadastrarFuncionarios);

        mnuiConsultarFuncionarios.setText("Consultar Funcionário");
        mnuiConsultarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiConsultarFuncionariosActionPerformed(evt);
            }
        });
        jMenu2.add(mnuiConsultarFuncionarios);

        mnuiAlterarFuncionarios.setText("Alterar Funcionário");
        mnuiAlterarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiAlterarFuncionariosActionPerformed(evt);
            }
        });
        jMenu2.add(mnuiAlterarFuncionarios);

        mnuiExcluirFuncionarios.setText("Excluir Funcionários");
        mnuiExcluirFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiExcluirFuncionariosActionPerformed(evt);
            }
        });
        jMenu2.add(mnuiExcluirFuncionarios);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(646, 424));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuiConsultarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiConsultarFuncionariosActionPerformed
        new ViewFuncionarios("consultar").setVisible(true);

    }//GEN-LAST:event_mnuiConsultarFuncionariosActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void mnuCadastrarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastrarFuncionariosActionPerformed
        new ViewFuncionarios("cadastrar").setVisible(true);
    }//GEN-LAST:event_mnuCadastrarFuncionariosActionPerformed

    private void mnuiAlterarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiAlterarFuncionariosActionPerformed
        new ViewFuncionarios("alterar").setVisible(true);

    }//GEN-LAST:event_mnuiAlterarFuncionariosActionPerformed

    private void mnuiExcluirFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiExcluirFuncionariosActionPerformed
        new ViewFuncionarios("excluir").setVisible(true);

    }//GEN-LAST:event_mnuiExcluirFuncionariosActionPerformed

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
            java.util.logging.Logger.getLogger(ViewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem mnuCadastrarFuncionarios;
    private javax.swing.JMenuItem mnuiAlterarFuncionarios;
    private javax.swing.JMenuItem mnuiConsultarFuncionarios;
    private javax.swing.JMenuItem mnuiExcluirFuncionarios;
    // End of variables declaration//GEN-END:variables
}
