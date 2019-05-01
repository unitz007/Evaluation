
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bcda.includes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dinneya Charles
 */
public class dbQuery {

    JTable bodyTable;
    JComboBox lotList;
    ResultSet rs2;
    DefaultTableModel tableModel;
    DefaultComboBoxModel cbm;
    JLabel titleLabel;

    public dbQuery(JTable bodyTable, JComboBox lotList, JLabel titleLabel) {
        this.bodyTable = bodyTable;
        this.lotList = lotList;
        this.titleLabel = titleLabel;
    }

    public void load() {
        try {
            // TODO add your handling code here:
            DefaultTableModel tableModel = (DefaultTableModel) bodyTable.getModel();
            DefaultComboBoxModel cbm = (DefaultComboBoxModel) lotList.getModel();
            this.cbm = cbm;
            this.tableModel = tableModel;
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            Connection con = DriverManager.getConnection("jdbc:derby:bcdaDB");
            
            
            
            String query2 = "SELECT * FROM APP.TABLES_INFO";
            Statement stmt2 = con.createStatement();
            ResultSet rs2 = stmt2.executeQuery(query2);
            

            while (rs2.next()) {

                cbm.addElement(rs2.getString(1));

            }
            String query1 = "SELECT * FROM " + lotList.getItemAt(lotList.getItemCount() - 1);
            Statement stmt1 = con.createStatement();
            ResultSet rs1 = stmt1.executeQuery(query1);

            int i = 0;
            
            while (i < bodyTable.getRowCount()) {
                tableModel.addRow(new Object[]{
                    rs1.getString(1), rs1.getString(2), rs1.getString(3), rs1.getString(4), rs1.getString(5), rs1.getString(6), rs1.getString(7), rs1.getString(8), rs1.getString(9), rs1.getString(10), rs1.getString(11), rs1.getString(12), rs1.getString(13), rs1.getString(14), rs1.getString(15), rs1.getString(16), rs1.getObject(17)
                });
                rs1.next();
            }

            cbm.setSelectedItem(cbm.getElementAt(lotList.getItemCount() - 1));
            
            String query3 = "SELECT LOT_TITLE FROM APP.TABLES_INFO WHERE LOT_CODE = ?";
            PreparedStatement stmt3 = con.prepareStatement(query3);
            stmt3.setString(1, cbm.getSelectedItem().toString());
            ResultSet rs3 = stmt3.executeQuery();
            while (rs3.next()) {
                titleLabel.setText(rs3.getString("lot_title"));
            }

        } catch (SQLException ex) {
           System.err.println(ex);
        } catch(NullPointerException e) {}
        catch(ClassNotFoundException e) {
            System.err.println(e);
        }
       
    }

}
