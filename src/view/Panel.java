package view;

import javax.swing.JPanel;

import controller.controller;

public class Panel extends JPanel{
    

    private controller baseController;
    public Panel(controller  baseController){
        this.baseController = baseController;
    }
}
