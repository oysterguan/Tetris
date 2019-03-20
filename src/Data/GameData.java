/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Data;

/**
 *
 * @author 官淦悦
 */
public class GameData {
    private boolean[][]GameMap;
    public GameRect GR;
    private int next;
    public int score;
    public int level;
    public int removeLine;
    public GameData(){
        this.GameMap = new boolean[10][18];
        this.level = 1;
        this.removeLine=0;
        this.score=0;                                     
    }
    public void initMap(){
        for(int i =0;i< this.GameMap.length;i++){
            for(int j=0;j<this.GameMap[i].length;j++){
                this.GameMap[i][j] = false;
                
            }
        }
        this.level = 1;
        this.removeLine=0;
        this.score=0;        
    }
    public void setGameRect(GameRect GR){
        this.GR = GR;
    }
    public boolean[][] getGameMap(){
        return this.GameMap;
    }
    public void setGameMap(boolean [][]Map){
        this.GameMap = Map;
    }
}
