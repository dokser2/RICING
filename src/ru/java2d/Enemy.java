package ru.java2d;

import ru.java2d.Player;

import javax.swing.*;
import java.awt.*;

public class Enemy extends Player{
    Image img = new ImageIcon("res/en.png").getImage();
    Road road;
    int v;
    int x;
    int y;
    public Rectangle getRect(){
        return new Rectangle(x,y,234,91);
    }

    public Enemy(Road road, int v, int x, int y) {
        this.road = road;
        this.v = v;
        this.x = x;
        this.y = y;
    }
    public void move(){
        x = x -road.p.v +v;
    }
}

