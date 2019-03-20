/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import Data.GameData;
import Data.Number;
import Service.Background;
import Service.GameService;
import control.GameControl;
import control.PlayerControl;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Service.MusicPlayer;
import java.io.FileNotFoundException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javazoom.jl.decoder.JavaLayerException;

/**
 *
 * @author 官淦悦
 */
public class JPanelGame extends JPanel {

    public GameService gameService = new GameService(new GameData());
    public PlayerControl playerControl = new PlayerControl(new GameControl(this, this.gameService));
    private final Background bg = new Background();
    private final JButton start = new JButton();
    private final JButton stop = new JButton();

    public boolean firstAction = false;
    private final ImageIcon startImage = new ImageIcon("Graphics/String/start.png");
    private final ImageIcon stopImage = new ImageIcon("Graphics/String/exit.png");
    private final Image overImage = new ImageIcon("Graphics/String/over.png").getImage();
    private final Image musicImage = new ImageIcon("Graphics/Background/music.png").getImage();

    private final int RECT_SIZE = 32;
    private final Image rect = new ImageIcon("Graphics/Rect/rectImage.png").getImage();
    private final Image rect0 = new ImageIcon("Graphics/Rect/0.png").getImage();
    private final Image rect1 = new ImageIcon("Graphics/Rect/1.png").getImage();
    private final Image rect2 = new ImageIcon("Graphics/Rect/2.png").getImage();
    private final Image rect3 = new ImageIcon("Graphics/Rect/3.png").getImage();
    private final Image rect4 = new ImageIcon("Graphics/Rect/4.png").getImage();
    private final Image rect5 = new ImageIcon("Graphics/Rect/5.png").getImage();
    private final Image rect6 = new ImageIcon("Graphics/Rect/6.png").getImage();
    private final Image mark = new ImageIcon("Graphics/String/mark.png").getImage();
    private final Image stopImage1 = new ImageIcon("Graphics/String/stop.png").getImage();
    private final musicThread mT = new musicThread();
    private boolean over = false;

    public JPanelGame() {
        initComponent();
        start.setIcon(this.startImage);
        stop.setIcon(this.stopImage);

        this.add(this.stop);
        this.add(this.start);

    }
 

    public void initComponent() {

        mT.loop();

        this.addKeyListener(this.playerControl);

        this.start.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (firstAction && over) {
                   gameService.GD.initMap();
                   over=false;
                    
                } else if (!firstAction) {
                    playerControl.GC.MT.start();
                    firstAction = true;
                }
                playerControl.GC.action = true;//To change body of generated methods, choose Tools | Templates.
            }
        });
        this.stop.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                playerControl.GC.action = false;
                repaint();//To change body of generated methods, choose Tools | Templates.
            }
        });
    }

    @Override
    public void paintComponent(Graphics g) {
        this.start.setBounds(1140, 185, 150, 85);
        this.stop.setBounds(1310, 185, 150, 85);

        super.paintComponent(g);
        this.bg.drawBackgroud(g, this.gameService.GD.level, this);

        GameWindows gw = new GameWindows();
        gw.CreateWindows(133, 155, 320, 250, g);
        gw.CreateWindows(133, 488, 320, 250, g);
        gw.CreateWindows(633, 155, 320, 576, g);
        gw.CreateWindows(1133, 155, 320, 120, g);
        gw.CreateWindows(1133, 300, 200, 150, g);
        gw.CreateWindows(1353, 300, 100, 150, g);
        gw.CreateWindows(1133, 478, 320, 250, g);
        Number nb = new Number();
        nb.drawNumber(276, 180, this.gameService.GD.score, g);
        nb.drawNumber(276, 300, this.gameService.GD.removeLine, g);
        nb.drawNumber(1365, 370, this.gameService.GD.level, g);
        Image start = new ImageIcon("Graphics/String/start.png").getImage();
        Image exit = new ImageIcon("Graphics/String/exit.png").getImage();
        Image level = new ImageIcon("Graphics/String/level.png").getImage();
        Image score = new ImageIcon("Graphics/String/score.png").getImage();
        Image remove = new ImageIcon("Graphics/String/remove.png").getImage();
        Image time = new ImageIcon("Graphics/String/time.png").getImage();
        g.drawImage(level, 1360, 325, this);
        g.drawImage(score, 180, 200, this);
        g.drawImage(remove, 180, 320, this);
        g.drawImage(this.musicImage, 140, 520, this);
        g.drawImage(this.mark, 1150, 480, this);
        g.drawImage(time, 1150, 650, this);
        this.requestFocus();
        draw(g);
    }

    public void draw(Graphics g) {

        
        drawMap(g);
        drawActionRect(g);
        if (!playerControl.GC.action && this.firstAction && !over) {
            g.drawImage(this.stopImage1, 520, 250, this);
        }
        if (over) {
            g.drawImage(this.overImage, 630, 340, this);
        }
    }

    public void drawActionRect(Graphics g) {
        Point[] p = this.gameService.GD.GR.getAct();
        if (!over){ 
        for (Point p1 : p) {
           
            g.drawImage(this.rect, 639 + p1.x * this.RECT_SIZE,
                    161 + p1.y * this.RECT_SIZE, 641 + p1.x * this.RECT_SIZE + this.RECT_SIZE,
                    163 + p1.y * this.RECT_SIZE + this.RECT_SIZE, 32 + this.RECT_SIZE * this.gameService.nowCode, 0, 32 + this.RECT_SIZE * this.gameService.nowCode + this.RECT_SIZE, 32, this);

            }
        }
        int x = this.gameService.nextCode;
        switch (x) {
            case 0:
                g.drawImage(this.rect0, 1200, 355, this);
                break;
            case 1:
                g.drawImage(this.rect1, 1180, 365, this);
                break;
            case 2:
                g.drawImage(this.rect2, 1200, 355, this);
                break;
            case 3:
                g.drawImage(this.rect3, 1200, 355, this);
                break;
            case 4:
                g.drawImage(this.rect4, 1200, 355, this);
                break;
            case 5:
                g.drawImage(this.rect5, 1200, 355, this);
                break;
            case 6:
                g.drawImage(this.rect6, 1200, 355, this);
                break;
        }
    }

    public void drawMap(Graphics g) {
        boolean[][] gameMap = this.gameService.GD.getGameMap();
        for (int f = 0; f < gameMap.length; f++) {
            if (gameMap[f][0]) {
                over = true;
                playerControl.GC.action = false;

            }
        }
        for (int raw = 0; raw < gameMap.length; raw++) {
            for (int cloumn = 0; cloumn < gameMap[raw].length; cloumn++) {

                if (gameMap[raw][cloumn] && !over) {
                    g.drawImage(this.rect, 639 + raw * this.RECT_SIZE,
                            161 + cloumn * this.RECT_SIZE, 641 + raw * this.RECT_SIZE + this.RECT_SIZE,
                            163 + cloumn * this.RECT_SIZE + this.RECT_SIZE, 0, 0, 32, 32, this);
                } else if (gameMap[raw][cloumn]) {
                    g.drawImage(this.rect, 639 + raw * this.RECT_SIZE,
                            161 + cloumn * this.RECT_SIZE, 641 + raw * this.RECT_SIZE + this.RECT_SIZE,
                            163 + cloumn * this.RECT_SIZE + this.RECT_SIZE, 256, 0, 288, 32, this);
                }
            }
        }
    }

    class musicThread extends Thread {

        @Override
        public void run() {
            try {
                while (true) {
                    MusicPlayer mp = new MusicPlayer();
                }
            } catch (FileNotFoundException ex) {

            } catch (JavaLayerException ex) {

            }
        }

        public void loop() {

            this.start();

        }

    }
}
