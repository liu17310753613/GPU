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

    public BufferedImage TurnGray(BufferedImage Img){
        int width=Img.getWidth();
        int height=Img.getHeight();
        BufferedImage GrayImage =new BufferedImage(width,height,BufferedImage.TYPE_BYTE_GRAY);
        for(int i=0 ;i<width;i++){
            for(int j=0;j<height;j++){
                int RGB=Img.getRGB(i,j);
                Color color=new Color(RGB);
                int Gray=((color.getRed()*30)+(color.getGreen()*59)+(color.getBlue()*11)+50)/100;
                GrayImage.setRGB(i,j,Gray);
            }
        }
        return GrayImage;
    }
}
