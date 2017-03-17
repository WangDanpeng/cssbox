import org.fit.cssbox.demo.ImageRenderer;

import java.io.File;
import java.io.FileOutputStream;
 
public class CssBox {
    public static void main(String[] args) throws Exception {
        ImageRenderer render = new ImageRenderer();
        //https开头的网址好像不行；另外，中文连乱码
        String url = "http://www.csdn.net/";
        FileOutputStream out = new FileOutputStream(new File("D:"+File.separator+"html.png"));
        render.renderURL(url, out, ImageRenderer.TYPE_PNG);
    }
}