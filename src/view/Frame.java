package view;

import javax.swing.JFrame;

import controller.controller;

public class Frame extends JFrame

{
    private Panel basePanel;

    public Frame(controller baseController)
    {
        basePanel = new Panel(baseController);
        setupFrame();
    }

    private void setupFrame()
    {
        this.setContentPane(basePanel);
        this.setSize(500, 500);
        this.setVisible(true);
    }
}
