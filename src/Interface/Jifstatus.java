/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cristiano
 */
public class Jifstatus extends javax.swing.JInternalFrame {

    private Object Jtb2;
    private Object Jtb02;
    private Object Jtcod;
    
    
    

    /**
     * Creates new form Jifstatus
     */
    public Jifstatus() {
        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        Jtcpfcliente = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jtb1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Jtcodigoemprestimo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Jtb3 = new javax.swing.JTable();
        jbnovo = new javax.swing.JButton();
        Jbeditar = new javax.swing.JButton();
        Jbsalvar = new javax.swing.JButton();
        Jbsair = new javax.swing.JButton();
        jbapagar = new javax.swing.JButton();
        jbnovo1 = new javax.swing.JButton();
        Jbeditar1 = new javax.swing.JButton();
        Jbsalvar1 = new javax.swing.JButton();
        Jbsair1 = new javax.swing.JButton();
        jbapagar1 = new javax.swing.JButton();
        Janela1 = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Status Empréstimo");

        jTextField1.setText("    Entre com CPF do Cliente");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        Jtcpfcliente.setEnabled(false);

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField3.setText("Status da Solicitação do Empréstimo");

        Jtb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cpf Ciente", "Codigo Empréstimo", "Nome do Cliente", "Valor do Empréstimo", "Qtdade Parcelas"
            }
        ));
        jScrollPane1.setViewportView(Jtb1);

        jLabel1.setText("Entre com Codigo do Empréstimo ");

        Jtcodigoemprestimo.setEnabled(false);
        Jtcodigoemprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtcodigoemprestimoActionPerformed(evt);
            }
        });

        Jtb3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CodEmpréstimo", "Valor Empréstimo", "Qtdade Parcelas", "Data Primeira Parcela", "E-mail Cliente", "Renda do Cliente "
            }
        ));
        jScrollPane2.setViewportView(Jtb3);

        jbnovo.setText("Novo");
        jbnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnovoActionPerformed(evt);
            }
        });

        Jbeditar.setText("Editar");

        Jbsalvar.setText("Salvar");
        Jbsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbsalvarActionPerformed(evt);
            }
        });

        Jbsair.setText("Sair");

        jbapagar.setText("Apagar");
        jbapagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbapagarActionPerformed(evt);
            }
        });

        jbnovo1.setText("Novo");
        jbnovo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnovo1ActionPerformed(evt);
            }
        });

        Jbeditar1.setText("Editar");

        Jbsalvar1.setText("Salvar");
        Jbsalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbsalvar1ActionPerformed(evt);
            }
        });

        Jbsair1.setText("Sair");

        jbapagar1.setText("Apagar");
        jbapagar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbapagar1ActionPerformed(evt);
            }
        });

        Janela1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Janela1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jbnovo1)
                        .addGap(31, 31, 31)
                        .addComponent(Jbeditar1)
                        .addGap(18, 18, 18)
                        .addComponent(Jbsalvar1)
                        .addGap(18, 18, 18)
                        .addComponent(Jbsair1)
                        .addGap(145, 145, 145)
                        .addComponent(jbapagar1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jtcpfcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jtcodigoemprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(Janela1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(58, 58, 58)
                    .addComponent(jbnovo)
                    .addGap(31, 31, 31)
                    .addComponent(Jbeditar)
                    .addGap(18, 18, 18)
                    .addComponent(Jbsalvar)
                    .addGap(18, 18, 18)
                    .addComponent(Jbsair)
                    .addGap(145, 145, 145)
                    .addComponent(jbapagar)
                    .addContainerGap(58, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Jtcpfcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Jtcodigoemprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbnovo1)
                            .addComponent(jbapagar1)
                            .addComponent(Jbeditar1)
                            .addComponent(Jbsair1)
                            .addComponent(Jbsalvar1))
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Janela1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(217, 217, 217))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(242, 242, 242)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbnovo)
                        .addComponent(jbapagar)
                        .addComponent(Jbeditar)
                        .addComponent(Jbsair)
                        .addComponent(Jbsalvar))
                    .addContainerGap(242, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jbnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnovoActionPerformed
       
         Jtcpfcliente.setEnabled(true);
        
        
        
        Jbeditar.setEnabled(true);
        Jbsalvar.setEnabled(true);
        

    }//GEN-LAST:event_jbnovoActionPerformed

    private void jbapagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbapagarActionPerformed

        ((DefaultTableModel) Jtb1.getModel()).removeRow(Jtb1.getSelectedRow());

    }//GEN-LAST:event_jbapagarActionPerformed

    private void jbnovo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnovo1ActionPerformed
        
        
        
        Jtcodigoemprestimo.setEnabled(true);
        
        
        
        Jbeditar.setEnabled(true);
        Jbsalvar.setEnabled(true);
        
        
        
        String Cod_Empréstimo = Jtcodigoemprestimo.getText().trim();
       DefaultTableModel val;
        val = (DefaultTableModel)Jtb3.getModel();
        val.addRow(new String[] {Cod_Empréstimo});

     

    }//GEN-LAST:event_jbnovo1ActionPerformed

    private void jbapagar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbapagar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbapagar1ActionPerformed

    private void JbsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbsalvarActionPerformed
    String cpfcliente = Jtcpfcliente.getText().trim();    DefaultTableModel val;
        val = (DefaultTableModel)Jtb1.getModel();
        val.addRow(new String[] {cpfcliente});
        
      
    }//GEN-LAST:event_JbsalvarActionPerformed

    private void Jbsalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbsalvar1ActionPerformed
    String Cod_Empréstimo = Jtcodigoemprestimo.getText().trim();

       DefaultTableModel val;
        val = (DefaultTableModel)Jtb3.getModel();
        val.addRow(new String[] {Cod_Empréstimo}); 
        
       
        
        
        
        
        
        
        
    }//GEN-LAST:event_Jbsalvar1ActionPerformed

    private void JtcodigoemprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtcodigoemprestimoActionPerformed
                // TODO add your handling code here:
    }//GEN-LAST:event_JtcodigoemprestimoActionPerformed

    private void Janela1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Janela1ActionPerformed
       
    }//GEN-LAST:event_Janela1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Janela1;
    private javax.swing.JButton Jbeditar;
    private javax.swing.JButton Jbeditar1;
    private javax.swing.JButton Jbsair;
    private javax.swing.JButton Jbsair1;
    private javax.swing.JButton Jbsalvar;
    private javax.swing.JButton Jbsalvar1;
    private javax.swing.JTable Jtb1;
    private javax.swing.JTable Jtb3;
    private javax.swing.JTextField Jtcodigoemprestimo;
    private javax.swing.JTextField Jtcpfcliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton jbapagar;
    private javax.swing.JButton jbapagar1;
    private javax.swing.JButton jbnovo;
    private javax.swing.JButton jbnovo1;
    // End of variables declaration//GEN-END:variables


}
