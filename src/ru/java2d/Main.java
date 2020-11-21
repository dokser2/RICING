package ru.java2d;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame("My ricing game");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(1000, 680);
        f.add(new Road());
        f.setVisible(true);




    }
}
