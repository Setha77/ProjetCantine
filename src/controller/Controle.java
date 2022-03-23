package controller;

import view.Login;

public class Controle implements {
    //private Frame appFrame;
    private Login login;
    public static void main(String[] args)
    {
        new Controle();
    }

    public Controle(){
        this.login = new Login(this);
        this.login.setVisible(true);
    }
}
