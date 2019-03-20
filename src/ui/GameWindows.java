/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author 官淦悦
 */
public class GameWindows {
    private static final Image wd = new ImageIcon("Graphics/Windows/Window.png").getImage();
    private static final int SIZE = 7;
    private final int imgW = wd.getWidth(null);
    private final int imgH = wd.getHeight(null);
    public void CreateWindows(int x, int y ,int width, int height,Graphics g){
        g.drawImage(wd, x, y, x+SIZE, y+SIZE, 0, 0, SIZE, SIZE, null);
        g.drawImage(wd, x+SIZE, y, x+SIZE+width, y+SIZE, SIZE, 0, imgW-SIZE, SIZE, null);
        g.drawImage(wd, x+width+SIZE, y, x+SIZE+width+SIZE, y+SIZE, imgW-SIZE, 0, imgW, SIZE, null);
        g.drawImage(wd, x, y+SIZE, x+SIZE, y+SIZE+height, 0,SIZE , SIZE, imgH-SIZE, null);
        g.drawImage(wd, x, y+SIZE+height, x+SIZE, y+SIZE+height+SIZE, 0,imgH-SIZE , SIZE, imgH, null);
        g.drawImage(wd, x+SIZE, y+SIZE+height, x+SIZE+width, y+SIZE+height+SIZE, SIZE, imgH-SIZE, imgW-SIZE, imgH, null);
        g.drawImage(wd, x+SIZE+width, y+SIZE+height, x+SIZE+width+SIZE, y+SIZE+height+SIZE, imgW-SIZE, imgH-SIZE, imgW, imgH, null);
        g.drawImage(wd, x+SIZE+width, y+SIZE, x+SIZE+width+SIZE, y+SIZE+height, imgW-SIZE, SIZE, imgW, imgH-SIZE, null);
        g.drawImage(wd, x+SIZE, y+SIZE, x+SIZE+width, y+SIZE+height, SIZE, SIZE, imgW-SIZE, imgH-SIZE, null);
    }
}
