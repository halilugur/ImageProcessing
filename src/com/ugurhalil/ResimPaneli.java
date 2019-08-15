/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ugurhalil;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Halil
 */
public class ResimPaneli extends JPanel {

    private BufferedImage img;

    public ResimPaneli(String path) {
        try {
            img = ImageIO.read(new File(path));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public ResimPaneli(BufferedImage img) {
        this.img = img;
    }

    public BufferedImage getImg() {
        return img;
    }

    public void setImg(BufferedImage img) {
        this.img = img;
    }
    
    @Override
    public void paintComponent(Graphics g){
        g.drawImage(this.img, 0, 0, null);
        repaint();
    }
    
}
