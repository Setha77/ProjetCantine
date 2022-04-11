package controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import view.admininterface;
import view.login;
import view.parentinterface;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

import model.Administrateur;



public class ConAdmin implements ActionListener{



JTextField jTextFieldx;
JTextComponent jPasswordFieldx;
boolean x  = false;
boolean y = false;;

    public ConAdmin (JTextField jTextFieldx,JTextComponent jPasswordFieldx){
        this.jPasswordFieldx=jPasswordFieldx;
        this.jTextFieldx=jTextFieldx;
    }

    public void actionPerformed(ActionEvent e ){
      
     
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(config.url, config.user, config.password);
            String sql = "Select * from ADMINISTRATEUR where LOGIN=? and  MOT_PASSE =?";
            String sql2 ="Select * from PARENT where LOGIN=? and  MOT_PASSE =?"; 
            PreparedStatement pst = con.prepareStatement(sql);
            PreparedStatement pst2 = con.prepareStatement(sql2);
            login.Id = jTextFieldx.getText();
            pst.setString(1,jTextFieldx.getText());  
			pst.setString(2,jPasswordFieldx.getText());
            pst2.setString(1,jTextFieldx.getText());  
			pst2.setString(2,jPasswordFieldx.getText());
            ResultSet rs = pst.executeQuery();
            ResultSet rs2= pst2.executeQuery();
            if (rs.next()){
                 x = true;
                 //y = false;
               JOptionPane.showMessageDialog(null, "Connection Admin Réussie");
                login.fermer();
                admininterface p = new admininterface();
                p.main();
                
                
            }
            
             if (rs2.next()){
                x = true;
                // y = false;
              JOptionPane.showMessageDialog(null, login.Id);
               JOptionPane.showMessageDialog(null, "Connection Réussie");
                login.fermer();
                parentinterface p = new parentinterface();
                p.main();
                
            }
             
                if(x == false && y == false  ){
                JOptionPane.showMessageDialog(null, "Id ou Mot de Passe Incorrecte");
                 jTextFieldx.setText("");
                 jPasswordFieldx.setText("");
                }
             
        
            con.close();
        }
        catch(Exception ez){
            JOptionPane.showMessageDialog(null, ez);

        }
    
    

        
    }




	

    
}