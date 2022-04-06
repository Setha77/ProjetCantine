package view;

import javax.swing.*;

import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

public class AccueilAdmin extends JFrame {
  
    JPanel mainPanel;
    Image logoCantine = new ImageIcon(AccueilAdmin.class.getResource("view/logoCantine.png")).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
    Image imgSession;
    Image imgEnfants;
    Image imgMenus;

    public void initialize(){
       
        /************ Main Panel  *************/
        setTitle("Page accueil");
        //setSize(800, 500);
        setMinimumSize(new Dimension(600, 600));
        setBackground(new Color(236, 118, 166));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 807, 418);

        mainPanel = new JPanel();
        mainPanel.setBackground(new Color(236, 118, 166));
        setContentPane(mainPanel);
        mainPanel.setLayout(null);
        //mainPanel.add(menuPanel, BorderLayout.WEST);

        //add(mainPanel);

        /************ Admin Panel set to right *************/

        JLabel lbFirstName = new JLabel("First Name");
       
        JLabel lbLastName = new JLabel("Last Name");
       
        JLabel lbStatut = new JLabel("Statut");
    
        JPanel adminPanel = new JPanel();
        adminPanel.setBackground(new Color(234, 82, 144));
        adminPanel.setLayout(new GridLayout(3, 1));
        adminPanel.add(lbFirstName);
        adminPanel.add(lbLastName);
        adminPanel.add(lbStatut);
        mainPanel.add(adminPanel, BorderLayout.EAST);

                /***** Button panel *****/
        
        /************ Menu Panel set to left *************/
        JPanel menuPanel = new JPanel();
        menuPanel.setBackground(new Color(210, 82, 144));
        menuPanel.setBounds(0, 0, 200, 600);
        mainPanel.add(menuPanel);
        menuPanel.setLayout(null);

        JLabel lbIconLogo = new JLabel("");
        lbIconLogo.setHorizontalAlignment(SwingConstants.CENTER);
        lbIconLogo.setBounds(10, 11, 229, 139);
        lbIconLogo.setIcon(new ImageIcon(logoCantine));
        menuPanel.add(lbIconLogo);

                 /***** Panel session *****/
        JPanel panelSession = new JPanel();
        panelSession.setBackground(new Color(210, 82, 144));
        panelSession.setBounds(0, 140, 249, 40);
        menuPanel.add(panelSession);
        panelSession.setLayout(null);

        


        setVisible(true);
    }
    

    public static void main() {
            AccueilAdmin myFrame =new AccueilAdmin();
            myFrame.initialize();
    }

}