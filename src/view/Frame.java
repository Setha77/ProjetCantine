package view;

import javax.swing.JFrame;
import javax.swing.JPanel;

//import controller.controller;

public class Frame extends JFrame

{
    //private Panel basePanel;

    public Frame(String titre)
    {
        super("Gestion de cuisine");
        setupFrame();
    }

    private void setupFrame()
    {
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        JPanel contentPane =  (JPanel) this.getComponentPane();
        this.setVisible(true);
    }
}
