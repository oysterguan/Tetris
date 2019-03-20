/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.awt.Point;


/**
 *
 * @author 官淦悦
 */
public class GameRect {

    private Point[] act;

    public GameRect(int firstRect) {
        this.init(firstRect);
    }

    public void move(int moveX, int moveY) {

        for (Point act1 : act) {
            act1.x += moveX;
            act1.y += moveY;
        }
    }

    public Point[] getAct() {

        return this.act;
    }
    
    public Point[] getNext(){
        return this.act;
    }

    public void round(boolean[][] gameMap) {
        for (int i = 1; i < this.act.length; i++) {
            int newX = this.act[0].y + this.act[0].x - this.act[i].y;
            int newY = this.act[0].y - this.act[0].x + this.act[i].x;
            if (newX < 0 || newX > 9 || newY < 0 || newY > 17 || gameMap[newX][newY]) {
                return;
            }

        }
        for (int i = 1; i < this.act.length; i++) {
            int newX = this.act[0].y + this.act[0].x - this.act[i].y;
            int newY = this.act[0].y - this.act[0].x + this.act[i].x;
            this.act[i].x = newX;
            this.act[i].y = newY;
        }
    }

    public void init(int rectCode) {
        switch (rectCode) {
            case 0: {
                this.act = new Point[]{
                    new Point(4, 0),
                    new Point(3, 0),
                    new Point(5, 0),
                    new Point(5, 1)
                }; 
                break;//To change body of generated methods, choose Tools | Templates.
            }
            case 1:{
                this.act = new Point[]{
                    new Point(4, 0),
                    new Point(3, 0),
                    new Point(5, 0),
                    new Point(6, 0)
                };
                break;
            }
            case 2:{
                this.act = new Point[]{
                    new Point(4, 0),
                    new Point(3, 0),
                    new Point(5, 0),
                    new Point(4, 1)
                };
                break;
            }
            case 3:{
                 this.act = new Point[]{
                    new Point(4, 0),
                    new Point(3, 0),
                    new Point(5, 0),
                    new Point(3, 1)
                };
                 break;
            }
            case 4:{
                 this.act = new Point[]{
                    new Point(4, 0),
                    new Point(4, 1),
                    new Point(5, 0),
                    new Point(3, 1)
                };
                 break;
            }
            case 5:{
                 this.act = new Point[]{
                    new Point(4, 0),
                    new Point(3, 0),
                    new Point(5, 1),
                    new Point(4, 1)
                };
                 break;                 
            }
            case 6:{
                 this.act = new Point[]{
                    new Point(4, 0),
                    new Point(5, 0),
                    new Point(4, 1),
                    new Point(5, 1)
                };
                 break;
            }
        }
    }

}
