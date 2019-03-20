/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package control;

import Service.GameService;
import java.awt.Point;

import ui.JPanelGame;

/**
 *
 * @author 官淦悦
 */
public class GameControl {
    public JPanelGame pg;
    public GameService GS;
    public myThread MT = new myThread();
    public boolean action = false;
    public GameControl(JPanelGame pg,GameService GS){
        this.pg = pg;
        this.GS = GS;
        
        
        
    }
    public class myThread extends Thread {

        @Override
        public void run() {
            while (true) {
                if (GS.isMoved(0, 1, GS.gameMap)) {
                    GS.GD.GR.move(0, 1);
                } else {

                    Point[] p = GS.GD.GR.getAct();
                    for (Point p1 : p) {
                        GS.gameMap[p1.x][p1.y] = true;
                    }
                    GS.nowCode = GS.nextCode;
                    GS.GD.GR.init(GS.nowCode);
                    GS.nextCode = GS.myRandom();
                    GS.removeLine(GS.gameMap);
                }
                pg.repaint();
                try {
                    Thread.sleep(800);
                    while(!action){
                        Thread.sleep(500);
                    }
                } catch (InterruptedException ex) {

                }
            }
        }
    }
     
}

