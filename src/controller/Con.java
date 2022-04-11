package controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import view.login;
import view.parentinterface;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

import model.Administrateur;



public class Con implements ActionListener{



JTextField jTextFieldx;
JTextComponent jPasswordFieldx;


    public Con (JTextField jTextFieldx,JTextComponent jPasswordFieldx){
        this.jPasswordFieldx=jPasswordFieldx;
        this.jTextFieldx=jTextFieldx;
    }

    public void actionPerformed(ActionEvent e ){
      
     
         
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(config.url, config.user, config.password);
            String sql = "Select * from PARENT where LOGIN=? and  MOT_PASSE =?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,jTextFieldx.getText());  
			pst.setString(2,jPasswordFieldx.getText());
            login.Id = jTextFieldx.getText();
            ResultSet rs = pst.executeQuery();
            if (rs.next()){
              // JOptionPane.showMessageDialog(null, "Connection Réussie");
                JOptionPane.showMessageDialog(null, login.Id);
                login.fermer();
                parentinterface p = new parentinterface();
                p.main();
                
            }
            else{
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