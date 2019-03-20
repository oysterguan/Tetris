/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Data.GameData;
import Data.GameRect;
import java.awt.Point;
import java.util.Random;


/**
 *
 * @author 官淦悦
 */
public final class GameService {

    public GameData GD;
    public boolean gameMap[][];
    public int nextCode;
    public int nowCode;


    public GameService(GameData GD) {
        this.GD = GD;
        this.gameMap = this.GD.getGameMap();
        this.nowCode = new Random().nextInt(7);
        this.nowCode = myRandom();
        GameRect gameRect = new GameRect(this.nowCode);
        this.GD.setGameRect(gameRect);
      
        
    }

    public boolean isMoved(int moveX, int moveY, boolean[][] gameMap) {
        Point[] p = this.GD.GR.getAct();

        boolean flag = true;
        for (Point p1 : p) {
            int x = p1.x + moveX;
            int y = p1.y + moveY;
            if (x < 0 || x > 9 || y < 0 || y > 17 || this.gameMap[x][y]) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public void keyUp() {
        if (isMoved(0, -1, this.gameMap) && this.nowCode != 6) {
            this.GD.GR.round(this.gameMap);//To change body of generated methods, choose Tools | Templates.
        }
    }

    public void keyDown() {
        if (isMoved(0, 1, this.gameMap)) {
            this.GD.GR.move(0, 1);
        } else {

            Point[] p = this.GD.GR.getAct();
            for (Point p1 : p) {
                gameMap[p1.x][p1.y] = true;
            }
            this.nowCode = this.nextCode;
            this.GD.GR.init(this.nowCode);
            this.nextCode = myRandom();
            removeLine(this.gameMap);
        }

//To change body of generated methods, choose Tools | Templates.
    }

    public void keyLeft() {
        if (isMoved(-1, 0, this.gameMap)) {
            this.GD.GR.move(-1, 0);//To change body of generated methods, choose Tools | Templates.
        }
    }

    public void keyRight() {
        if (isMoved(1, 0, this.gameMap)) {
            this.GD.GR.move(1, 0);//To change body of generated methods, choose Tools | Templates.
        }
    }

    public int myRandom() {
        int x;
        x = (int) (Math.random() * 7);
        return x;
    }

    public void removeLine(boolean gMap[][]) {
        int count = 0;
        for (int y = 0; y < gMap[0].length; y++) {
            if (canRemove(y, gMap)) {
                count++;
                this.GD.removeLine += 1;
                for (boolean[] gMap1 : gMap) {
                    for (int cloumn = y; cloumn > 0; cloumn--) {
                        gMap1[cloumn] = gMap1[cloumn - 1];
                    }
                }
            }
        }
        if (count > 0) {
            int temp = count - 1;
            this.GD.score += Math.pow(2, temp) * count;
        }
        if (this.GD.removeLine >= this.GD.level * 10 * this.GD.level) {
            this.GD.level++;

        }
    }

    public boolean canRemove(int y, boolean[][] map) {
        for (boolean[] map1 : map) {
            if (!map1[y]) {
                return false;
            }
        }
        return true;
    }

    
}
