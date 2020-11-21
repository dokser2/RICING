package ru.java2d;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class AudioThread implements Runnable {
    @Override
    public void run() {
        try {
            Player p = new Player(new FileInputStream("/home/max/JavaRushTasks/1.mp3"));
            p.play();
        } catch (JavaLayerException | FileNotFoundException e) {
            e.printStackTrace();

        }
    }
}
