/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package control;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


/**
 *
 * @author 官淦悦
 */
public class PlayerControl extends KeyAdapter{
    public GameControl GC;
    public PlayerControl(GameControl GC){
        this.GC = GC;
    }
    @Override
    public void keyPressed(KeyEvent e){
        if(!GC.action)
            return;
        switch(e.getKeyCode()){
            case KeyEvent.VK_UP: 
                this.GC.GS.keyUp();
                this.GC.pg.repaint();
                break;
            case KeyEvent.VK_DOWN:
                this.GC.GS.keyDown();
                this.GC.pg.repaint();
                break;
            case KeyEvent.VK_LEFT:
                this.GC.GS.keyLeft();
                this.GC.pg.repaint();
                break;
            case KeyEvent.VK_RIGHT:
                this.GC.GS.keyRight();
                this.GC.pg.repaint();
                break;
        }
    }

    
}
