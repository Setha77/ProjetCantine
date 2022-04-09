package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import view.login;
import view.parentinterface;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;

import model.Administrateur;


public class listEn implements ActionListener {

    JTextField idEnfant;
    JTextField idParent;
    JTable j ;
    String add;

    public listEn(JTable j ) {
    
   this.j = j;

    }

            public void actionPerformed(ActionEvent e ){
                DefaultTableModel tm;
                try{
                    
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cantineV2", "root","110401Sultan77");
                int row = j.getSelectedRow();
                String cell = j.getModel().getValueAt(row, 0).toString();
                String sql2 ="SELECT ENFANT_idENFANT FROM SESSION_has_ENFANT WHERE idSESSION ="+cell+") "; 
                String sql = "SELECT* FROM ENFANT WHERE ENFANT ";
                PreparedStatement pst2 = con.prepareStatement(sql2);
                ResultSet rs = pst2.executeQuery();
                rs.getInt("idENFANT");
                
                Object o[] = { rs.getString("NOM"),rs.getString("PRENOM"),rs.getString("SEX"),rs.getInt("DATE_NAISSANCE")};
                tm.addRow(o);
            
            con.close();
                }
            
            catch(Exception ez){
                JOptionPane.showMessageDialog(null, ez);

            }
    }



}
