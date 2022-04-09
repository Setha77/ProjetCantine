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
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

import model.Administrateur;

public class ConEnfant implements ActionListener {

    JTextField idEnfant;
    JTextField idParent;
    String add;

    public ConEnfant(JTextField idEnfant,JTextField idParent) {
        this.idEnfant = idEnfant;
        this.idParent = idParent;

    }

            public void actionPerformed(ActionEvent e ){
                try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cantineV2", "root","110401Sultan77");
            String sql = "Select PARENT_ID from PARENT where LOGIN=? ";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,login.Id);   
            ResultSet rs = pst.executeQuery();
        
               if (rs.next()){
        
                String sql2 ="INSERT INTO cantineV2.PARENT_has_ENFANT (PARENT_PARENT_ID, ENFANT_idENFANT) VALUES ("+idParent.getText()+","+idEnfant.getText()+")"; 
                PreparedStatement pst2 = con.prepareStatement(sql2);
                //pst2.setString(2,idEnfant.getText());  
			   // pst2.setString(1,idParent.getText());
                //ResultSet rs2= pst2.executeUpdate();
                pst2.executeUpdate(sql2);
                JOptionPane.showMessageDialog(null, "Votre enfant à été ajouté ...");
              
                
            }
            con.close();
                }
            
            catch(Exception ez){
                JOptionPane.showMessageDialog(null, ez);

            }
        
    
    

        
    }

}