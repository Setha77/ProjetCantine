package controller;

import view.Frame;

public class controller {
    private Frame appFrame;

    public void start()
    {
        appFrame = new Frame(this); 
    }
}
