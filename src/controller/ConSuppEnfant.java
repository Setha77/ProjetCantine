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
import javax.swing.text.JTextComponent;

import model.Administrateur;

public class ConSuppEnfant implements ActionListener {

    JTextField idEnfant;
    JTextField idParent;
    JTable j ;
    String add;

    public ConSuppEnfant(JTable j ) {
    
    this.j = j;

    }

    public void actionPerformed(ActionEvent e ){
        try{
            Connection con = DriverManager.getConnection(config.url, config.user, config.password);
            int row = j.getSelectedRow();
            String cell = j.getModel().getValueAt(row, 0).toString();
            String sql2 ="DELETE FROM cantine.PARENT_has_ENFANT WHERE (ENFANT_idENFANT = "+cell+") "; 
            PreparedStatement pst2 = con.prepareStatement(sql2);
            //pst2.setString(1,cell); 
            pst2.executeUpdate(sql2);
            JOptionPane.showMessageDialog(null, "Votre enfant à été Supprimé ...");
              
            con.close();

            }
            
            catch(Exception ez){
                JOptionPane.showMessageDialog(null, ez);

            }
    }
}
