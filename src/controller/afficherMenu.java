
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import view.login;
import view.parentinterface;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

import model.Administrateur;



public class afficherMenu  {


    public String[] Menu(){
                      
        try{
                    
            int i;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con2 = DriverManager.getConnection(config.url, config.user, config.password);
            /* String sql = "SELECT COUNT(*) AS total FROM MENU";
            PreparedStatement pst = con2.prepareStatement(sql);
                    
            ResultSet rs = pst.executeQuery();
            int total = rs.getInt("total");
            */
            String[] strings= new String[21];
           
            
            for(i=1;i<=20;i++){

                            
                String sql2 = "SELECT * FROM MENU WHERE idMENU = ?";
                PreparedStatement pst2 = con2.prepareStatement(sql2);
                pst2.setInt(1, i);
                ResultSet rs2 = pst2.executeQuery();
                    if(rs2.next()){
                                    
                    String entree = rs2.getString("ENTREE");
                    String repas = rs2.getString("REPAS");
                    String dessert = rs2.getString("DESSERT");
                    String idMenu = String.valueOf(i);
                    strings[i]="Menu "+ idMenu + " : " + entree + ", " + repas + ", " + dessert + ".";
                                    
                                    
                    }   
                }
            
            
        
        con2.close();
        return strings;
        }
        catch(Exception ez){
            JOptionPane.showMessageDialog(null, ez);
            return null;
        }   

          

    }

}