/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import ui.JPanelGame;

/**
 *
 * @author 官淦悦
 */
public class Background {

    Image bg1 = new ImageIcon("Graphics/Background/bg1.jpg").getImage();
    Image bg2 = new ImageIcon("Graphics/Background/bg2.jpg").getImage();
    Image bg3 = new ImageIcon("Graphics/Background/bg3.jpg").getImage();
    Image bg4 = new ImageIcon("Graphics/Background/bg4.jpg").getImage();
    Image bg5 = new ImageIcon("Graphics/Background/bg5.jpg").getImage();
    Image bg6 = new ImageIcon("Graphics/Background/bg6.jpg").getImage();
    Image bg7 = new ImageIcon("Graphics/Background/bg7.jpg").getImage();
    Image bg8 = new ImageIcon("Graphics/Background/bg8.jpg").getImage();
    Image bg9 = new ImageIcon("Graphics/Background/bg9.jpg").getImage();
    Image bg10 = new ImageIcon("Graphics/Background/bg10.jpg").getImage();

    public void drawBackgroud(Graphics g, int count, JPanelGame jp) {
        switch (count) {
            case 1:
                g.drawImage(bg1, 0, 0, jp.getWidth(), jp.getHeight(), jp);
                break;
            case 2:
                g.drawImage(bg2, 0, 0, jp.getWidth(), jp.getHeight(), jp);
                break;
            case 3:
                g.drawImage(bg3, 0, 0, jp.getWidth(), jp.getHeight(), jp);
                break;
            case 4:
                g.drawImage(bg4, 0, 0, jp.getWidth(), jp.getHeight(), jp);
                break;
            case 5:
                g.drawImage(bg5, 0, 0, jp.getWidth(), jp.getHeight(), jp);
                break;
            case 6:
                g.drawImage(bg6, 0, 0, jp.getWidth(), jp.getHeight(), jp);
                break;
            case 7:
                g.drawImage(bg7, 0, 0, jp.getWidth(), jp.getHeight(), jp);
                break;
            case 8:
                g.drawImage(bg8, 0, 0, jp.getWidth(), jp.getHeight(), jp);
                break;
            case 9:
                g.drawImage(bg9, 0, 0, jp.getWidth(), jp.getHeight(), jp);
                break;
            case 10:
                g.drawImage(bg10, 0, 0, jp.getWidth(), jp.getHeight(), jp);
                break;
        }
    }
}
