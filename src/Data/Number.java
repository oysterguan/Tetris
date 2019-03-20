/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Data;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author 官淦悦
 */
public class Number {
    Image number0 = new ImageIcon("Graphics/String/number0.png").getImage();
    Image number1 = new ImageIcon("Graphics/String/number1.png").getImage();
    Image number2= new ImageIcon("Graphics/String/number2.png").getImage();
    Image number3 = new ImageIcon("Graphics/String/number3.png").getImage();
    Image number4 = new ImageIcon("Graphics/String/number4.png").getImage();
    Image number5 = new ImageIcon("Graphics/String/number5.png").getImage();
    Image number6 = new ImageIcon("Graphics/String/number6.png").getImage();
    Image number7 = new ImageIcon("Graphics/String/number7.png").getImage();
    Image number8 = new ImageIcon("Graphics/String/number8.png").getImage();
    Image number9 = new ImageIcon("Graphics/String/number9.png").getImage();
    
    public void drawNumber(int x,int y,int sum,Graphics g){
        String number = sum+"";
        char Number[];
        Number = number.toCharArray();
        for(int i=0;i<Number.length;i++){
            switch(Number[i]){
                case '0':{
                    g.drawImage(number0, x+50*i, y, null);
                    break;
                }
                case '1':{
                    g.drawImage(number1, x+50*i, y, null);
                    break;
                }
                case '2':{
                    g.drawImage(number2, x+50*i, y, null);
                    break;
                }
                case '3':{
                    g.drawImage(number3, x+50*i, y, null);
                    break;
                }
                case '4':{
                    g.drawImage(number4, x+50*i, y, null);
                    break;
                }
                case '5':{
                    g.drawImage(number5, x+50*i, y, null);
                    break;
                }
                case '6':{
                    g.drawImage(number6, x+50*i, y, null);
                    break;
                }
                case '7':{
                    g.drawImage(number7, x+50*i, y, null);
                    break;
                }
                case '8':{
                    g.drawImage(number8, x+50*i, y, null);
                    break;
                }
                case '9':{
                    g.drawImage(number9, x+50*i, y, null);
                    break;
                }
            }
        }
    }
}


