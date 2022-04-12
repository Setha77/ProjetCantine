package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import view.admininterface;
import view.login;
import view.parentinterface;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

import model.Administrateur;

public class ConSession implements ActionListener {

    JTextField tfdate;
    JTextField tfheure;
    JTextField tfmenu;
    JTextField tfmenuv;

    public ConSession(JTextField tfdate, JTextField tfheure, JTextField tfmenu, JTextField tfmenuv) {

        this.tfdate = tfdate;
        this.tfheure = tfheure;
        this.tfmenu = tfmenu;
        this.tfmenuv = tfmenuv;
    }

    public void actionPerformed(ActionEvent e) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(config.url, config.user, config.password);
            String sql = "INSERT INTO cantine.SESSION (JOUR_RESERVATION, HEURE, NOMBRE_PLACE, Menu_normal, Menu_veg) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, tfdate.getText());
            pst.setString(2, tfheure.getText());
            pst.setInt(3, 30);
            pst.setInt(4, Integer.parseInt(tfmenu.getText()));
            pst.setInt(5, Integer.parseInt(tfmenuv.getText()));
            pst.executeUpdate();

            
            JOptionPane.showMessageDialog(null, "Session ajouté");
            tfdate.setText("");
            tfheure.setText("");
            tfmenu.setText("");
            tfmenuv.setText("");
            con.close();
          
        } 

        catch (Exception ez) {
            JOptionPane.showMessageDialog(null, ez);

        }
    }

}
