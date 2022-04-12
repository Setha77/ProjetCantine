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
    JTextField PrenomEnfant;
    JTextField NomEnfant;
    String add;

    public ConEnfant(JTextField idParent,JTextField idEnfant) {
        this.idEnfant = idEnfant;
        this.idParent = idParent;
       


    }

    public void actionPerformed(ActionEvent e ){

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(config.url, config.user, config.password);
          /*  String sql = "Select PARENT_ID from PARENT where LOGIN=? ";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,login.Id);   
            ResultSet rs = pst.executeQuery();   
            if (rs.next()){*/
               // String a = NomEnfant.getText();
               // String b = PrenomEnfant.getText();
                String sql2 ="INSERT INTO cantine.PARENT_has_ENFANT(PARENT_PARENT_ID,ENFANT_idENFANT) VALUES ("+idParent.getText()+","+idEnfant.getText()+")"; 
                PreparedStatement pst2 = con.prepareStatement(sql2);
               // pst2.setInt(1,Integer.parseInt(idParent.getText() ));
               // pst2.setInt(2,Integer.parseInt(idEnfant.getText()));
             //   pst2.setString(3,NomEnfant.getText() );
              //  pst2.setString(4,PrenomEnfant.getText());
                pst2.executeUpdate(sql2);
                JOptionPane.showMessageDialog(null, "Votre enfant à été ajouté ...");

        //    }
            
            con.close();
        }
            
        catch(Exception ez){
            JOptionPane.showMessageDialog(null, ez);

        }
        
    }

}
