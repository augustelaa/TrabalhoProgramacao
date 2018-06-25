/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemajanela.apresentacao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import br.com.sistemajanela.dominio.Clicavel;
import br.com.sistemajanela.dominio.Icone;
import br.com.sistemajanela.dominio.Janela;
import br.com.sistemajanela.dominio.Regiao;

/**
 *
 * @author Marcelo
 */
public class Apresentacao extends javax.swing.JFrame {

    //Atributos ApresentaÃ§Ã£o 
    Janela janela;
    
    
    public Apresentacao() {
        initComponents();
        janela = new Janela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cadastroTable = new javax.swing.JTabbedPane();
        cadastroIcone = new javax.swing.JPanel();
        cadastroText1 = new javax.swing.JTextField();
        cadastroText2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        botaoCadastroIcone = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cadastroIconeText = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        cadastroRegiao = new javax.swing.JPanel();
        cadastroRegiaoBotao = new javax.swing.JButton();
        cadastroRegiaoAltura = new javax.swing.JTextField();
        cadastroRegiaoLargura = new javax.swing.JTextField();
        cadastroRegiaoPosicionamentoX = new javax.swing.JTextField();
        cadastroRegiaoPosicionamentoY = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cadastroRegiaoText = new javax.swing.JTextArea();
        cadastroRegiaoText.setEnabled(false);
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lerClickX = new javax.swing.JTextField();
        lerClickY = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        lerClickText = new javax.swing.JTextArea();
        lerClickText.setEnabled(false);
        lerClickConsultar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        relatorioTabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("X:");

        jLabel2.setText("Y:");

        jLabel3.setText("unidades");

        jLabel4.setText("unidades");

        botaoCadastroIcone.setText("Cadastrar Ícone");
        botaoCadastroIcone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastroIconeActionPerformed(evt);
            }
        });

        cadastroIconeText.setColumns(20);
        cadastroIconeText.setRows(5);
        cadastroIconeText.setText("Obs.: O valor deve ser maior que zero e menor\nque 500 unidades.");
        cadastroIconeText.setEnabled(false);
        jScrollPane1.setViewportView(cadastroIconeText);

        jLabel13.setText("Posicionamento:");

        javax.swing.GroupLayout cadastroIconeLayout = new javax.swing.GroupLayout(cadastroIcone);
        cadastroIcone.setLayout(cadastroIconeLayout);
        cadastroIconeLayout.setHorizontalGroup(
            cadastroIconeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastroIconeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cadastroIconeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(cadastroIconeLayout.createSequentialGroup()
                        .addGroup(cadastroIconeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cadastroIconeLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(botaoCadastroIcone))
                            .addGroup(cadastroIconeLayout.createSequentialGroup()
                                .addGroup(cadastroIconeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(cadastroIconeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cadastroText1)
                                    .addComponent(cadastroText2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(cadastroIconeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        cadastroIconeLayout.setVerticalGroup(
            cadastroIconeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastroIconeLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cadastroIconeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadastroIconeLayout.createSequentialGroup()
                        .addGroup(cadastroIconeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cadastroText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cadastroIconeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cadastroText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(19, 19, 19)
                        .addComponent(botaoCadastroIcone, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(265, Short.MAX_VALUE))
        );

        cadastroTable.addTab("Cadastro Ícone", cadastroIcone);

        cadastroRegiaoBotao.setText("Cadastrar Região");
        cadastroRegiaoBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroRegiaoBotaoActionPerformed(evt);
            }
        });

        cadastroRegiaoAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroRegiaoAlturaActionPerformed(evt);
            }
        });

        jLabel5.setText("Largura:");

        jLabel6.setText("Altura:");

        jLabel7.setText("X:");

        jLabel8.setText("Y:");

        jLabel9.setText("unidades");

        jLabel10.setText("unidades");

        jLabel11.setText("unidades");

        jLabel12.setText("unidades");

        cadastroRegiaoText.setColumns(20);
        cadastroRegiaoText.setRows(5);
        cadastroRegiaoText.setText("Obs.: O valor deve ser maior que zero e\nmenor que 500 unidades.");
        jScrollPane2.setViewportView(cadastroRegiaoText);

        jLabel14.setText("Posicionamento:");

        jLabel15.setText("Dimensões:");

        javax.swing.GroupLayout cadastroRegiaoLayout = new javax.swing.GroupLayout(cadastroRegiao);
        cadastroRegiao.setLayout(cadastroRegiaoLayout);
        cadastroRegiaoLayout.setHorizontalGroup(
            cadastroRegiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastroRegiaoLayout.createSequentialGroup()
                .addGroup(cadastroRegiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadastroRegiaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(cadastroRegiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cadastroRegiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastroRegiaoLayout.createSequentialGroup()
                                    .addGap(37, 37, 37)
                                    .addGroup(cadastroRegiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(cadastroRegiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(cadastroRegiaoLayout.createSequentialGroup()
                                            .addComponent(cadastroRegiaoAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel9))
                                        .addGroup(cadastroRegiaoLayout.createSequentialGroup()
                                            .addComponent(cadastroRegiaoLargura, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel10))))
                                .addComponent(jLabel14))
                            .addComponent(jLabel15)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastroRegiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(cadastroRegiaoLayout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cadastroRegiaoPosicionamentoY, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel12))
                                .addGroup(cadastroRegiaoLayout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cadastroRegiaoPosicionamentoX, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel11))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE))
                    .addGroup(cadastroRegiaoLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(cadastroRegiaoBotao)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        cadastroRegiaoLayout.setVerticalGroup(
            cadastroRegiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastroRegiaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cadastroRegiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(cadastroRegiaoLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cadastroRegiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cadastroRegiaoAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cadastroRegiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cadastroRegiaoLargura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cadastroRegiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastroRegiaoPosicionamentoX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cadastroRegiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastroRegiaoPosicionamentoY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastroRegiaoBotao)
                .addContainerGap(204, Short.MAX_VALUE))
        );

        cadastroTable.addTab("Cadastro Região", cadastroRegiao);

        jLabel16.setText("Coordenadas:");

        jLabel17.setText("X:");

        jLabel18.setText("Y:");

        lerClickX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lerClickXActionPerformed(evt);
            }
        });

        lerClickText.setColumns(20);
        lerClickText.setRows(5);
        lerClickText.setText("Obs.: O valor deve ser maior que zero e menor\nque 500 unidades.");
        jScrollPane3.setViewportView(lerClickText);

        lerClickConsultar.setText("Consultar");
        lerClickConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lerClickConsultarActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane4.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lerClickConsultar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lerClickY))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lerClickX)))
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(lerClickX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(lerClickY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lerClickConsultar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        cadastroTable.addTab("Ler Click", jPanel1);

        String header[] = new String[] { "Data/Hora", "Clique (x,y)", "Item selecionado", "Distância"};
        modeloRelatorioTabela = new DefaultTableModel(0, 0);
        modeloRelatorioTabela.setColumnIdentifiers(header);
        relatorioTabela.setModel(modeloRelatorioTabela);
        relatorioTabela.setUpdateSelectionOnSort(false);
        jScrollPane5.setViewportView(relatorioTabela);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cadastroTable.addTab("Relatorio", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(cadastroTable)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(cadastroTable)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastroIconeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastroIconeActionPerformed
        if (cadastroText1.getText().trim().isEmpty()) {
        	JOptionPane.showMessageDialog(this, "Favor informar a coordenada X.");
        	return;
        }

        if (cadastroText2.getText().trim().isEmpty()) {
        	JOptionPane.showMessageDialog(this, "Favor informar a coordenada Y.");
        	return;
        }
    	try {
            int valorX = Integer.parseInt(cadastroText1.getText().trim());
            int valorY = Integer.parseInt(cadastroText2.getText().trim());
            
            Icone icone = new Icone(valorX, valorY);
            janela.addItem(icone);
            JOptionPane.showMessageDialog(this, "Cadastro do ícone efetuado com sucesso");
            cadastroText1.setText("");
            cadastroText2.setText("");
                    
        } catch (IllegalArgumentException iae) {
            JOptionPane.showMessageDialog(this, iae.getMessage());
        }
    }//GEN-LAST:event_botaoCadastroIconeActionPerformed

    private void cadastroRegiaoAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroRegiaoAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroRegiaoAlturaActionPerformed

    private void cadastroRegiaoBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroRegiaoBotaoActionPerformed
    	
    	if (cadastroRegiaoPosicionamentoX.getText().trim().isEmpty()) {
        	JOptionPane.showMessageDialog(this, "Favor informar a coordenada X.");
        	return;
        }

        if (cadastroRegiaoPosicionamentoY.getText().trim().isEmpty()) {
        	JOptionPane.showMessageDialog(this, "Favor informar a coordenada Y.");
        	return;
        }
        
    	if (cadastroRegiaoAltura.getText().trim().isEmpty()) {
        	JOptionPane.showMessageDialog(this, "Favor informar a altura.");
        	return;
        }

        if (cadastroRegiaoLargura.getText().trim().isEmpty()) {
        	JOptionPane.showMessageDialog(this, "Favor informar a largura.");
        	return;
        }
        
        try {
        Regiao regiao = new Regiao(Integer.parseInt(cadastroRegiaoPosicionamentoX.getText().trim()), Integer.parseInt(cadastroRegiaoPosicionamentoY.getText().trim()), 
        Integer.parseInt(cadastroRegiaoAltura.getText().trim()), Integer.parseInt(cadastroRegiaoLargura.getText().trim()));
        janela.addItem(regiao);
        JOptionPane.showMessageDialog(this, "Região cadastrada com sucesso"); 
        
        cadastroRegiaoPosicionamentoX.setText("");
        cadastroRegiaoPosicionamentoY.setText(""); 
        cadastroRegiaoAltura.setText("");
        cadastroRegiaoLargura.setText("");
        
        } catch (IllegalArgumentException iae) {
        JOptionPane.showMessageDialog(this, iae.getMessage());
        }
        
         
         
         
    }//GEN-LAST:event_cadastroRegiaoBotaoActionPerformed

    private void lerClickXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lerClickXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lerClickXActionPerformed

    private void lerClickConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lerClickConsultarActionPerformed
    	
    	if (lerClickX.getText().trim().isEmpty()) {
        	JOptionPane.showMessageDialog(this, "Favor informar a coordenada X.");
        	return;
        }
    	
    	if (lerClickY.getText().trim().isEmpty()) {
        	JOptionPane.showMessageDialog(this, "Favor informar a coordenada Y.");
        	return;
        }
    	
    	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    	Date date = new Date();
    	Clicavel item = null;
    	double distancia = 0;
    	
    	try {
    		String x = lerClickX.getText().trim();
    		String y = lerClickY.getText().trim();
    		item = janela.clicar(Integer.parseInt(x), Integer.parseInt(y), jTextArea1);
            if (item == null) {
            	modeloRelatorioTabela.addRow(new Object[] {dateFormat.format(date), x + "," + y, "Nenhum item", distancia});
            } else {
            	distancia = janela.getDistancia(Integer.parseInt(x), Integer.parseInt(y), item.getX(), item.getY());
            	modeloRelatorioTabela.addRow(new Object[] {dateFormat.format(date), x + "," + y, item.hashCode(), distancia});
            }
        } catch (IllegalArgumentException iae) {
           JOptionPane.showMessageDialog(this, iae.getMessage());
        }
       
    }//GEN-LAST:event_lerClickConsultarActionPerformed

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
            java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Apresentacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastroIcone;
    private javax.swing.JPanel cadastroIcone;
    private javax.swing.JTextArea cadastroIconeText;
    private javax.swing.JPanel cadastroRegiao;
    private javax.swing.JTextField cadastroRegiaoAltura;
    private javax.swing.JButton cadastroRegiaoBotao;
    private javax.swing.JTextField cadastroRegiaoLargura;
    private javax.swing.JTextField cadastroRegiaoPosicionamentoX;
    private javax.swing.JTextField cadastroRegiaoPosicionamentoY;
    private javax.swing.JTextArea cadastroRegiaoText;
    private javax.swing.JTabbedPane cadastroTable;
    private javax.swing.JTextField cadastroText1;
    private javax.swing.JTextField cadastroText2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton lerClickConsultar;
    private javax.swing.JTextArea lerClickText;
    private javax.swing.JTextField lerClickX;
    private javax.swing.JTextField lerClickY;
    private javax.swing.JTable relatorioTabela;
    private DefaultTableModel modeloRelatorioTabela;
    // End of variables declaration//GEN-END:variables

}
