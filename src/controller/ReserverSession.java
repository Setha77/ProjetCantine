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
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cantineV2", "root","110401Sultan77");
                int row = j1.getSelectedRow();
                String a = j2.getText();
                String cell = j1.getModel().getValueAt(row, 0).toString();
                String sql2 ="INSERT INTO  cantineV2.SESSION_has_ENFANT(ENFANT_idENFANT,idSESSION) VALUES("+a+","+cell+")"; 
                PreparedStatement pst2 = con.prepareStatement(sql2);
              //  pst2.setString(1,cell); 
                pst2.execute(sql2);
                JOptionPane.showMessageDialog(null, "Votre enfant à été Inscrit à la Session" +cell+ " ... ");
              
                
            
            con.close();
                }
            
            catch(Exception ez){
                JOptionPane.showMessageDialog(null, ez);

            }
        
            }


}