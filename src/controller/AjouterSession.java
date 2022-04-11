package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class AjouterSession {

JTextField jTextFieldx;
JTextField jTextFieldx1;
JTextField jTextFieldx2;
JTextField jTextFieldx3;
JTextField jTextFieldx4;
JTextField jTextFieldx5;
JTextField jTextFieldx6;
    public AjouterSession(JTextField jTextFieldx,JTextField jTextFieldx1,JTextField jTextFieldx2,JTextField jTextFieldx3,JTextField jTextFieldx4,JTextField jTextFieldx5,JTextField jTextFieldx6){
        this.jTextFieldx = jTextFieldx;
        this.jTextFieldx1 = jTextFieldx1;
        this.jTextFieldx2 = jTextFieldx2;
        this.jTextFieldx3 = jTextFieldx3;
        this.jTextFieldx4 = jTextFieldx4;
        this.jTextFieldx5 = jTextFieldx5;
        this.jTextFieldx6 = jTextFieldx6;
    }

    public void actionPerformed(ActionEvent e ){

        try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(config.url, config.user, config.password);
                String sql = "insert into Session(JOUR_RESERVATION,HEURE,NOMBRE_PLACE,idSESSION) value (?,?,?,?,)";
                String sql2 = "insert into Session_Has_MENU(idSESSION,) value (?,?,?,?,)";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, jTextFieldx.getText());
                pst.setString(2, jTextFieldx1.getText());
                pst.setString(3, jTextFieldx2.getText());
                pst.setString(4, jTextFieldx3.getText());
                pst.setString(5, jTextFieldx4.getText());
                pst.setString(6, jTextFieldx5.getText());
                pst.executeQuery();
                JOptionPane.showMessageDialog(null,"Session ajoutée" );
                jTextFieldx1.setText("");
                jTextFieldx2.setText("");
                jTextFieldx3.setText("");
                jTextFieldx4.setText("");
                jTextFieldx5.setText("");
                jTextFieldx6.setText("");
        }
        catch(Exception ex){

        }
    }

}