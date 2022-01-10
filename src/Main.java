import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws AWTException, IOException {
        GPU gpu=new GPU();
        String path="D:\\fuck.png";
        BufferedImage screen=gpu.GetScreen();
        gpu.SaveImage(screen,path);
        BufferedImage GrayImage=gpu.TurnGray(screen);
        path="D:\\gray.png";
        gpu.SaveImage(GrayImage,path);
    }
}
