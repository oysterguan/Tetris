/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author 官淦悦
 */
public class JFrameGame extends JFrame {

    public JFrameGame() {
        this.setTitle("俄罗斯方块");//标题
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1600, 900);//窗口大小
        this.setResizable(false);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screen = toolkit.getScreenSize();
        int w = (screen.width - this.getWidth()) / 2;
        int h = (screen.height - this.getHeight()) / 2;
        this.setLocation(w, h);
        this.setContentPane(new JPanelGame());
    }

  
}
