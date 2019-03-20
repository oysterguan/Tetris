/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author 官淦悦
 */
public class MusicPlayer {

    public MusicPlayer() throws FileNotFoundException, JavaLayerException {

        while (true) {

            File file1 = new File("d:/Tetris/music/1.mp3");

            FileInputStream fis1 = new FileInputStream(file1);

            BufferedInputStream stream1 = new BufferedInputStream(fis1);

            Player p1 = new Player(stream1);
            p1.play();
            File file2 = new File("d:/Tetris/music/2.mp3");

            FileInputStream fis2 = new FileInputStream(file2);

            BufferedInputStream stream2 = new BufferedInputStream(fis2);

            Player p2 = new Player(stream2);
            p2.play();
            File file3 = new File("d:/Tetris/music/3.mp3");

            FileInputStream fis3 = new FileInputStream(file3);

            BufferedInputStream stream3 = new BufferedInputStream(fis3);

            Player p3 = new Player(stream3);
            p3.play();
            File file4 = new File("d:/Tetris/music/4.mp3");

            FileInputStream fis4 = new FileInputStream(file4);

            BufferedInputStream stream4 = new BufferedInputStream(fis4);

            Player p4 = new Player(stream4);
            p4.play();

        }

    }
}
