package ımageprocess;

import java.awt.image.BufferedImage;

/**
 *
 * @author Halil
 */
public class ImageProcess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        BufferedImage img = ResimIslemleri.readFromFile("image\\lena.jpg");
        double[][] pixel = ResimIslemleri.imageToDouble(img);
        ResimIslemleri.yazdir(pixel);
        ResimSahnesi rs = new ResimSahnesi(img);
    }
    
}
