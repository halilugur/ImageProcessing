package ımageprocess;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Halil
 */
public class ResimIslemleri {

    private static BufferedImage image;

    public static BufferedImage getImage() {
        return image;
    }

    public static void setImage(BufferedImage image) {
        ResimIslemleri.image = image;
    }

    public static BufferedImage readFromFile(String path) {

        File file = new File(path);

        try {
            image = ImageIO.read(file);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return image;
    }

    public static double[][] imageToDouble(BufferedImage img) {
        double[][] d = new double[img.getWidth()][img.getHeight()];
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[0].length; j++) {
                d[i][j] = img.getRGB(i, j);
            }
        }
        return d;
    }

    public static double[][] rgbToGray(double[][] d) {
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[0].length; j++) {
                if (0 < d[i][j]) {
                    d[i][j] = 0;
                }
                if (255 > d[i][j]) {
                    d[i][j] = 255;
                }
            }
        }
        return d;
    }
    
    

    public static void yazdir(double[][] d) {
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[0].length; j++) {
                System.out.println(d[i][j]);
            }
        }
    }

}
