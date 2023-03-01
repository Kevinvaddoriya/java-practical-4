import java.applet.Applet;
import java.awt.*;

/* <applet code = "q11.java" width =800 height =600> </applet> */
public class q11 extends Applet {
    String name = "KEVIN ";
    public void init(){
        Font s = new Font(name,Font.BOLD,50);
        setFont(s);
    }
    @Override
    public void paint(Graphics g) {

        g.drawString(name,200,200);
        char f = name.charAt(0);
        name = name.substring(1);
        name = name + f;
        try {
            Thread.sleep(1000);
        }catch (Exception ignored){}
        repaint();

    }
}
