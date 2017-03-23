/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ımageprocess;

import javax.swing.JFrame;

/**
 *
 * @author Halil
 */
public class ResimSahnesi extends JFrame{

    public ResimSahnesi(String path){
        ResimPaneli pnl = new ResimPaneli(path);
        add(pnl);
        setSize(pnl.getImg().getWidth(),pnl.getImg().getHeight());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }    
}
