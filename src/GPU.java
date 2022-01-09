import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GPU {
    public BufferedImage GetScreen() throws AWTException {
        Dimension ScreenSize=Toolkit.getDefaultToolkit().getScreenSize();
        BufferedImage image=new Robot().createScreenCapture(new Rectangle(ScreenSize));
        return image;
    }
    public void SaveImage(BufferedImage Img,String Path) throws IOException {
        File ImgFile=new File(Path);
        ImageIO.write(Img,"png",ImgFile);
    }
}
