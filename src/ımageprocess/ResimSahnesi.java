/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ımageprocess;

import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import sun.java2d.pipe.BufferedBufImgOps;

/**
 *
 * @author Halil
 */
public class ResimSahnesi extends JFrame {

    ResimPaneli pnl;

    public ResimSahnesi(String path) {
        pnl = new ResimPaneli(path);
        Int();
    }

    public ResimSahnesi(BufferedImage image) {
        pnl = new ResimPaneli(image);
        Int();
    }

    private void Int() {
        add(pnl);
        setSize(pnl.getImg().getWidth(), pnl.getImg().getHeight());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
