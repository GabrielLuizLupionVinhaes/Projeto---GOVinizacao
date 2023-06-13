
package com.fravel.govinizacao;

import com.fravel.govinizacao.db.MongoDBUtil;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import org.bson.types.ObjectId;

public class Agendamento_Uno extends javax.swing.JFrame {

   
    public Agendamento_Uno() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnBuscaNome = new javax.swing.JButton();
        txtCPF = new javax.swing.JTextField();
        btnBuscaCPF = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDataLocacao = new javax.swing.JTextField();
        txtDataDevolucao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblCNH = new javax.swing.JLabel();
        btnAgendar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnCad = new javax.swing.JMenu();
        mnUsuario = new javax.swing.JMenuItem();
        mnVeiculo = new javax.swing.JMenuItem();
        mnAgendamento = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("Usuario\n");
        jScrollPane2.setViewportView(jTextArea2);

        jLabel1.setText("Categoria CNH: B");

        jLabel2.setText("Capacidade: 4");

        jLabel3.setText("Ano: 2006");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(0, 255, 0));
        jLabel4.setText("*DISPONIVEL*");

        jLabel5.setText("Categotiria CNH:");

        btnBuscaNome.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        btnBuscaNome.setText("Buscar");
        btnBuscaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaNomeActionPerformed(evt);
            }
        });

        btnBuscaCPF.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        btnBuscaCPF.setText("Buscar");
        btnBuscaCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaCPFActionPerformed(evt);
            }
        });

        jLabel6.setText("Data de Locação:");

        jLabel7.setText("CPF:");

        txtDataDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataDevolucaoActionPerformed(evt);
            }
        });

        jLabel8.setText("Nome:");

        jLabel9.setText("Data de Devolução: ");

        lblCNH.setText("...");

        btnAgendar.setText("Agendar");
        btnAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarActionPerformed(evt);
            }
        });

        jLabel11.setText("Modelo: Uno");

        jLabel12.setText("Marca: Fiat");

        jLabel13.setText("Status:");

        lblStatus.setText("...");

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setText("Usuario\n");
        jScrollPane3.setViewportView(jTextArea3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(btnAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)
                                    .addComponent(btnBuscaCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)
                                    .addComponent(btnBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCNH))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblStatus)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(41, 41, 41)
                            .addComponent(jLabel4))
                        .addComponent(jLabel9)
                        .addComponent(txtDataLocacao)
                        .addComponent(txtDataDevolucao)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel11))
                            .addGap(22, 22, 22)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addComponent(jLabel3))))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(lblCNH))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(lblStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNome)
                    .addComponent(txtDataLocacao)
                    .addComponent(btnBuscaNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscaCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mnCad.setText("Cadastro");

        mnUsuario.setText("Usuario");
        mnUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mnUsuarioAbrir_CadUsuario(evt);
            }
        });
        mnCad.add(mnUsuario);

        mnVeiculo.setText("Veiculo");
        mnVeiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mnVeiculoAbrir_CadVeiculo(evt);
            }
        });
        mnCad.add(mnVeiculo);

        jMenuBar1.add(mnCad);

        mnAgendamento.setText("Agendamento");
        mnAgendamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnAgendamentoAgendar(evt);
            }
        });
        jMenuBar1.add(mnAgendamento);

        jMenu3.setText("Relatorios");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Configuração");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Suporte");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnUsuarioAbrir_CadUsuario(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnUsuarioAbrir_CadUsuario
        CadUsuario cadUse = new CadUsuario();
        cadUse.setVisible(true);
        cadUse.setLocationRelativeTo(null);
        Agendamento_Uno.this.dispose();
    }//GEN-LAST:event_mnUsuarioAbrir_CadUsuario

    private void mnVeiculoAbrir_CadVeiculo(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnVeiculoAbrir_CadVeiculo
        CadUsuario cadUse = new CadUsuario();
        cadUse.setVisible(true);
        cadUse.setLocationRelativeTo(null);
        Agendamento_Uno.this.dispose();
    }//GEN-LAST:event_mnVeiculoAbrir_CadVeiculo

    private void mnAgendamentoAgendar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnAgendamentoAgendar
        Agendamento_Grupo age = new Agendamento_Grupo();
        age.setVisible(true);
        age.setLocationRelativeTo(null);
        Agendamento_Uno.this.dispose();
    }//GEN-LAST:event_mnAgendamentoAgendar

    private void btnBuscaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaNomeActionPerformed
        MongoDBUtil.connect();
        
        if(MongoDBUtil.queryUsuario("nome", txtNome.getText(), "nome").equals("")){
            JOptionPane.showMessageDialog(null,"Usuario não encontrado!");

        }else{
            txtCPF.setText(MongoDBUtil.queryUsuario("nome", txtNome.getText(), "cpf"));
            lblCNH.setText(MongoDBUtil.queryUsuario("nome", txtNome.getText(), "CNH"));
            lblStatus.setText(MongoDBUtil.queryUsuario("nome", txtNome.getText(), "status"));
        }
        
        MongoDBUtil.close();
    }//GEN-LAST:event_btnBuscaNomeActionPerformed

    private void btnBuscaCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaCPFActionPerformed
        MongoDBUtil.connect();
                
        if(MongoDBUtil.queryUsuario("cpf", txtCPF.getText(), "cpf").equals("")){
            JOptionPane.showMessageDialog(null,"Usuario não encontrado!");

        }else{
            txtNome.setText(MongoDBUtil.queryUsuario("cpf", txtCPF.getText(), "nome"));
            lblCNH.setText(MongoDBUtil.queryUsuario("cpf", txtCPF.getText(), "CNH"));
            lblStatus.setText(MongoDBUtil.queryUsuario("cpf", txtCPF.getText(), "status"));

        }
        
        MongoDBUtil.close();
    }//GEN-LAST:event_btnBuscaCPFActionPerformed

    private void txtDataDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataDevolucaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataDevolucaoActionPerformed

    private void btnAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarActionPerformed
       
        if(!txtNome.getText().equals("") && !txtCPF.getText().equals("") && !txtDataLocacao.getText().equals("") && !txtDataDevolucao.getText().equals("")){
            MongoDBUtil.connect();
            
            Document documento = new Document();
            String idUsuario = MongoDBUtil.queryUsuario("cpf", txtCPF.getText(), "id");
            String idVeiculo = MongoDBUtil.queryVeiculo("placa", "ABC-DEFG", "id");
            
            documento.append("usuario",new ObjectId(idUsuario));
            documento.append("veiculo",new ObjectId(idVeiculo));
            documento.append("dataLocacao",txtDataLocacao.getText());
            documento.append("dataDevolicao",txtDataDevolucao.getText());
            documento.append("observacao","");
            documento.append("ocorrencia","");

            MongoDBUtil.insert("historicoLocacao", documento);
            JOptionPane.showMessageDialog(null, "Veiculo agendado com sucesso!!");
            
            MongoDBUtil.close();
            
            lblCNH.setText("...");
            lblStatus.setText("...");
            txtNome.setText("");
            txtCPF.setText("");
            txtDataLocacao.setText("");
            txtDataDevolucao.setText("");
        }
        else{
            JOptionPane.showMessageDialog(null, "Preencha todos os campos para que o veiculo seja locado!");
        }
    }//GEN-LAST:event_btnAgendarActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agendamento_Uno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgendar;
    private javax.swing.JButton btnBuscaCPF;
    private javax.swing.JButton btnBuscaNome;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JLabel lblCNH;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JMenu mnAgendamento;
    private javax.swing.JMenu mnCad;
    private javax.swing.JMenuItem mnUsuario;
    private javax.swing.JMenuItem mnVeiculo;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtDataDevolucao;
    private javax.swing.JTextField txtDataLocacao;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
