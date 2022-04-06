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





public class Enfants implements ActionListener{




    public void actionPerformed(ActionEvent e ){
      
     
        
        try{
            if (){
               JOptionPane.showMessageDialog(null, "Connection Réussie");
                login.fermer();
                parentinterface p = new parentinterface();
                p.main();
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Id ou Mot de Passe Incorrecte");
              
            }
       
        }
        catch(Exception ez){
            JOptionPane.showMessageDialog(null, ez);

        }
    
    

        
    }




	

    
}