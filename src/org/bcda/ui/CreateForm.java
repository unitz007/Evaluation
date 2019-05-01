/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bcda.ui;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.sql.SQLTransactionRollbackException;
import java.sql.Statement;

/**
 *
 * @author USER1
 */
public class CreateForm extends javax.swing.JDialog {

    /**
     * Creates new form CreateForm
     */
    static String s1;

    public CreateForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public CreateForm() {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lotLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        lotCode = new javax.swing.JTextField();
        lotCreate = new javax.swing.JButton();
        addLotNotify = new javax.swing.JLabel();
        exclame1 = new javax.swing.JLabel();
        exclame2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lotTitle = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Lot");
        setBounds(new java.awt.Rectangle(100, 100, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(null);
        setLocation(new java.awt.Point(550, 250));
        setResizable(false);
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });

        lotLabel.setFont(new java.awt.Font("Garamond", 1, 12)); // NOI18N
        lotLabel.setText("Lot No:");

        titleLabel.setFont(new java.awt.Font("Garamond", 1, 12)); // NOI18N
        titleLabel.setText("Project Title:");

        lotCode.setBackground(new java.awt.Color(204, 204, 204));
        lotCode.setFont(new java.awt.Font("Garamond", 0, 11)); // NOI18N
        lotCode.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        lotCode.setOpaque(false);
        lotCode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lotCodeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lotCodeFocusLost(evt);
            }
        });
        lotCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lotCodeActionPerformed(evt);
            }
        });

        lotCreate.setFont(new java.awt.Font("Garamond", 0, 11)); // NOI18N
        lotCreate.setText("CREATE");
        lotCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lotCreateActionPerformed(evt);
            }
        });

        addLotNotify.setFont(new java.awt.Font("Garamond", 1, 12)); // NOI18N
        addLotNotify.setLabelFor(addLotNotify);

        exclame1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        exclame1.setForeground(new java.awt.Color(255, 0, 0));

        exclame2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        exclame2.setForeground(new java.awt.Color(255, 0, 0));

        lotTitle.setBackground(new java.awt.Color(204, 204, 204));
        lotTitle.setColumns(20);
        lotTitle.setRows(5);
        jScrollPane1.setViewportView(lotTitle);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lotLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exclame2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lotCode, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exclame1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(addLotNotify, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lotCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(addLotNotify, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lotLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lotCode, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(exclame1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exclame2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lotCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lotCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lotCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lotCodeActionPerformed

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowStateChanged

    private void lotCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lotCreateActionPerformed
        try {
            // TODO add your handling code here:
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            Connection con = DriverManager.getConnection("jdbc:derby:bcdaDB;create=true");
            String query1 = "CREATE TABLE " + lotCode.getText() + "(NAME_OF_COMPANY VARCHAR(50) NOT NULL, CAC VARCHAR(20), TAX_CERT VARCHAR(20), PENCOM VARCHAR(20), ITF VARCHAR(20), NSITF VARCHAR(20), BPP_IPR VARCHAR(20), AFFIDAVIT VARCHAR(20), AUDIT_ACCOUNT_YEARS VARCHAR(20), F_CAPACITY VARCHAR(20), CV_KEY_STAFF VARCHAR(20), JOB_EVIDENCES VARCHAR(20), CMD_CERT VARCHAR(20), LIST_PLANTS VARCHAR(20), JOINT_VENTURE VARCHAR(20), FWD_LETTER VARCHAR(20), REMARK DOUBLE, PRIMARY KEY (NAME_OF_COMPANY))";
            Statement stmt1 = con.createStatement();

            String query2 = "INSERT INTO TABLES_INFO (LOT_CODE, LOT_TITLE) VALUES (?, ?)";
            PreparedStatement stmt2 = con.prepareStatement(query2);
            stmt2.setString(1, lotCode.getText());
            stmt2.setString(2, lotTitle.getText());

            String query3 = "SELECT LOT_CODE FROM TABLES_INFO";
            Statement stmt3 = con.createStatement();
            ResultSet rs = stmt3.executeQuery(query3);

            if (lotCode.getText().isEmpty() && lotTitle.getText().isEmpty()) {
                addLotNotify.setForeground(Color.red);
                addLotNotify.setText("       Error!");
                exclame1.setText("!");
                exclame2.setText("!");
            } else if (lotTitle.getText().isEmpty() || lotTitle.getText().startsWith(" ") || lotTitle.getText().endsWith(" ")) {
                addLotNotify.setForeground(Color.red);
                addLotNotify.setText("       Error!");
                exclame2.setText("!");

            } else if (lotCode.getText().isEmpty() || lotCode.getText().startsWith(" ") || lotCode.getText().endsWith(" ") || lotCode.getText().contains(" ") || lotCode.getText().contains(",")) {
                addLotNotify.setForeground(Color.red);
                addLotNotify.setText("       Error!");
                exclame1.setText("!");

            } else {

                // Executes stmt1
                stmt1.execute(query1);

                // Executes stmt2
                stmt2.executeUpdate();
                String s = lotCode.getText();
                this.s1 = s;
                

                // Display Success notification
                addLotNotify.setForeground(Color.green);
                addLotNotify.setText("      Lot Created");
                this.setVisible(false);
            }

        } catch (SQLTransactionRollbackException e) {
            addLotNotify.setForeground(Color.red);
            addLotNotify.setText("Error: Lot Exists");
        } catch (SQLSyntaxErrorException e) {
            System.err.println(e);
            addLotNotify.setForeground(Color.red);
            addLotNotify.setText("       Error!");
        } catch (SQLException e) {
            System.err.println(e);
            addLotNotify.setForeground(Color.red);
            addLotNotify.setText("       Error!");
        }
        
        catch(ClassNotFoundException e) {
            System.err.println(e);
        }

    }//GEN-LAST:event_lotCreateActionPerformed

    private void lotCodeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lotCodeFocusGained
        // TODO add your handling code here:
        addLotNotify.setText(null);
        exclame1.setText(null);
    }//GEN-LAST:event_lotCodeFocusGained

    private void lotCodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lotCodeFocusLost
        // TODO add your handling code here:
        lotCode.setText(lotCode.getText().toUpperCase());
    }//GEN-LAST:event_lotCodeFocusLost

    /**
     * @param args the command line arguments
     */
   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addLotNotify;
    private javax.swing.JLabel exclame1;
    private javax.swing.JLabel exclame2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lotCode;
    private javax.swing.JButton lotCreate;
    private javax.swing.JLabel lotLabel;
    private javax.swing.JTextArea lotTitle;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
