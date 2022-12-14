package entity;

import Game2D.GamePanel;
import Game2D.KeyHandler;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
<<<<<<< HEAD
import java.io.File;
=======
>>>>>>> 75ca46129e0d8549c858e0a890944f5f8c4575ed
import java.util.HashSet;
import java.util.Set;
import javax.imageio.ImageIO;

public class Player extends Entity{
    GamePanel gp;
    KeyHandler keyH;
<<<<<<< HEAD
    BufferedImage image = null;
    
=======
>>>>>>> 75ca46129e0d8549c858e0a890944f5f8c4575ed
    
    public Player(GamePanel gp, KeyHandler keyH){
        this.gp = gp;
        this.keyH = keyH;
        
        setDefaultValues();
<<<<<<< HEAD
        getPlayerImage();
=======
//        getPlayerImage();
>>>>>>> 75ca46129e0d8549c858e0a890944f5f8c4575ed
        
    }
    public void setDefaultValues(){
        x = 100;
        y = 100;
        speed = 4;
        direction = "down";
    }
    public void getPlayerImage(){
        try{
<<<<<<< HEAD
            System.out.println("Image loading started");
=======
>>>>>>> 75ca46129e0d8549c858e0a890944f5f8c4575ed
            up1 = ImageIO.read(getClass().getResourceAsStream("player/boy_up_1.png"));
            up2 = ImageIO.read(getClass().getResourceAsStream("player/boy_up_2.png"));
            down1 = ImageIO.read(getClass().getResourceAsStream("player/boy_down_1.png"));
            down2 = ImageIO.read(getClass().getResourceAsStream("player/boy_down_2.png"));
            left1 = ImageIO.read(getClass().getResourceAsStream("player/boy_left_1.png"));
            left2 = ImageIO.read(getClass().getResourceAsStream("player/boy_left_2.png"));
            right1 = ImageIO.read(getClass().getResourceAsStream("player/boy_right_1.png"));
            right2 = ImageIO.read(getClass().getResourceAsStream("player/boy_right_2.png"));
<<<<<<< HEAD
            System.out.println("Image loading ended");
=======
            
>>>>>>> 75ca46129e0d8549c858e0a890944f5f8c4575ed
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public void update(){
        if(keyH.upPressed == true){
            direction = "up";
            y -= speed;
        }
        else if(keyH.downPressed == true){
            direction = "down";
            y += speed;
        }
        else if(keyH.leftPressed == true){
            direction = "left";
            x -= speed;
        }
        else if(keyH.rightPressed == true){
            direction = "right";
            x += speed;
        }
    }
    public void draw(Graphics2D g2){
//        g2.setColor(Color.white);
//        g2.fillRect(x, y, gp.tileSize, gp.tileSize);
        
        BufferedImage image = null;
        switch(direction){
            case "up":
                image = up1;
                break;
            case "down":
                image = down1;
                break;
            case "left":
                image = left1;
                break;
            case "right":
                image = right1;
                break;
        }
        g2.drawImage(image, x, y, gp.tileSize, gp.tileSize, null);
    }
}
