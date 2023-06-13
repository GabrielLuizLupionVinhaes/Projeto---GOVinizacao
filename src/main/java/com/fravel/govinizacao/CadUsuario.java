
package com.fravel.govinizacao;

import com.fravel.govinizacao.db.MongoDBUtil;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
        

public class CadUsuario extends javax.swing.JFrame {

    
    public CadUsuario() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        txtConfSenha = new javax.swing.JPasswordField();
        txtNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        txtCPF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cbxClassificacao = new javax.swing.JComboBox<>();
        cbxStatus = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cbxCNH = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnCad = new javax.swing.JMenu();
        mnUsuario = new javax.swing.JMenuItem();
        mnVeiculo = new javax.swing.JMenuItem();
        mnAgendamento = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Status:");

        jLabel5.setText("Senha de Acesso:");

        txtNome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel6.setText("Confirme a Senha:");

        jLabel1.setText("Nome:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setText("Matricula/CPF:");

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Classificação:");

        cbxClassificacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "MOTORISTA", "OPERADOR" }));

        cbxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ATIVO", "INATIVO", "BLOQUEADO" }));

        jLabel7.setText("Categoria CNH:");

        cbxCNH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E" }));

        mnCad.setText("Cadastro");

        mnUsuario.setForeground(new java.awt.Color(153, 153, 153));
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
                Abrir_CadVeiculo(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSenha)
                            .addComponent(txtConfSenha, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                            .addComponent(txtNome)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(cbxClassificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(74, 74, 74)
                                                .addComponent(jLabel7))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cbxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cbxCNH, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGap(0, 10, Short.MAX_VALUE)))))
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxClassificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxCNH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jLabel5)
                .addGap(4, 4, 4)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        MongoDBUtil.connect();
        MongoDatabase database = MongoDBUtil.getDatabase();
        Document document = new Document();
        document.append("agendamento", evt.getActionCommand());
        MongoCollection<Document> collection = database.getCollection("govinizacao");
        collection.insertOne(document);
        
        MongoDBUtil.close();
    }//GEN-LAST:event_txtNomeActionPerformed

    private void mnUsuarioAbrir_CadUsuario(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnUsuarioAbrir_CadUsuario
       
    }//GEN-LAST:event_mnUsuarioAbrir_CadUsuario

    private void Abrir_CadVeiculo(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Abrir_CadVeiculo
        CadVeiculo cadVei = new CadVeiculo();
        cadVei.setVisible(true);
        cadVei.setLocationRelativeTo(null);
        CadUsuario.this.dispose();
    }//GEN-LAST:event_Abrir_CadVeiculo

    private void mnAgendamentoAgendar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnAgendamentoAgendar
        Agendamento_Grupo age = new Agendamento_Grupo();
        age.setVisible(true);
        age.setLocationRelativeTo(null);
        CadUsuario.this.dispose();
    }//GEN-LAST:event_mnAgendamentoAgendar

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        MongoDBUtil.connect();
        
        String nome = txtNome.getText();
        String cpf = txtCPF.getText();
        String classificacao = (String) cbxClassificacao.getSelectedItem();
        String status = (String) cbxStatus.getSelectedItem();
        String CNH = (String) cbxCNH.getSelectedItem();
        String senha = new String(txtSenha.getPassword());
        String confSenha = new String(txtConfSenha.getPassword());

        if(senha.equals(confSenha)){
            Document documento = new Document();
            documento.append("nome", nome);
            documento.append("cpf", cpf);
            documento.append("classificacao", classificacao);
            documento.append("status", status);
            documento.append("CNH", CNH);
            documento.append("senha", senha);

            MongoDBUtil.insert("usuario", documento);
            JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso!!");
            txtNome.setText("");
            txtCPF.setText("");
            cbxClassificacao.setSelectedItem("ADMIN");
            cbxStatus.setSelectedItem("ATIVO");
            cbxCNH.setSelectedItem("A");
            txtSenha.setText("");
            txtConfSenha.setText("");
        }else{
            JOptionPane.showMessageDialog(null, "Os campos de senha nao estão combinando, tente novamente");

        }
        MongoDBUtil.close();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxCNH;
    private javax.swing.JComboBox<String> cbxClassificacao;
    private javax.swing.JComboBox<String> cbxStatus;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenu mnAgendamento;
    private javax.swing.JMenu mnCad;
    private javax.swing.JMenuItem mnUsuario;
    private javax.swing.JMenuItem mnVeiculo;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JPasswordField txtConfSenha;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
