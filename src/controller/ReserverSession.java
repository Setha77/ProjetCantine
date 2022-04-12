package controller;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import view.Sessionsparent;
import view.login;

public class ReserverSession{

JTable j1;
JTextField j2;


  public ReserverSession(JTable j1,JTextField j2){
    this.j1=j1;
    this.j2=j2;
  }
  public void actionPerformed(ActionEvent e ) {
      try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(config.url, config.user, config.password);
        int row = j1.getSelectedRow();
        String a = j2.getText();
        String cell = j1.getModel().getValueAt(row, 0).toString();
        String sql3 = "SELECT NOMBRE_PLACE FROM SESSION WHERE idSESSION="+Integer.parseInt(cell)+"";
        PreparedStatement pst3 = con.prepareStatement(sql3);
       // pst3.setInt(1, Integer.parseInt(cell));
        ResultSet rs = pst3.executeQuery(sql3);
        int g = rs.getInt("NOMBRE_PLACE");
        int s = g -1;
        //String sql = "UPDATE cantine.SESSION SET NOMBRE_PLACE=NOMBRE_PLACE - 1 where idSESSION=?";
        
        String sql2 ="INSERT INTO  cantine.SESSION_has_ENFANT(ENFANT_idENFANT,SESSION_idSESSION) VALUES("+a+","+cell+")"; 
        PreparedStatement pst2 = con.prepareStatement(sql2);
        //PreparedStatement pst = con.prepareStatement(sql);
        //pst.setString(1, cell);
       //pst.executeUpdate(sql);
        // pst2.setString(1,cell); 
        pst2.executeUpdate(sql2);
        JOptionPane.showMessageDialog(null, "Votre enfant à été Inscrit à la Session" +cell+ " ... ");
                
                  
              
        con.close();
      }
              
      catch(Exception ez){
        JOptionPane.showMessageDialog(null, ez);
      }
          
    }


}