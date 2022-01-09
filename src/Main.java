import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws AWTException, IOException {
        GPU gpu=new GPU();
        BufferedImage screen=gpu.GetScreen();
        String path="D:\\fuck.png";
        gpu.SaveImage(screen,path);
    }
}
