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

public class ConEnfant implements ActionListener {

    JTextField idEnfant;
    JTextField tfprenom;
    JTextField tfdate;
    JTextField tfsexe;
    private String idPARENT;

    String add;

    public ConEnfant(JTextField idEnfant) {
        this.idEnfant = idEnfant;

    }

    public void actionPerformed(ActionEvent e) {
        int i = Integer.parseInt(idEnfant.getText());
         String sql3 = "Select PARENT_ID FROM PARENT where LOGIN =? ";
         String sql = "insert to PARENT_has_ENFANT(PARENT_PARENT_ID,ENFANT_idENFANT), VALUES(?,?)";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/cantineV2", "root",
                    "110401Sultan77");
            //String sql3 = "Select PARENT_ID FROM PARENT where LOGIN =? ";
            PreparedStatement pst = con2.prepareStatement(sql3);
            
            pst.setString(1, "" + login.Id + "");
            
            //pst.setString(2, add);
            //pst.setInt(3,i);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                add = rs.getString("PARENT_ID");
                JOptionPane.showMessageDialog(null, add);
                // JOptionPane.showMessageDialog(null, ""+sql3+"");
               PreparedStatement pst2 = con2.prepareStatement(sql);
               pst2.setString(1,""+add+"");
               pst2.setInt(2,i);
            ResultSet rs2 = pst2.executeQuery();
              
                if(rs2.next()){
                     JOptionPane.showMessageDialog(null, "Va dormir Setha");
                }
            }

             con2.close();
        }
            
        // }

        catch (Exception ez) {
            JOptionPane.showMessageDialog(null, ez);

        }

    }

}