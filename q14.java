import java.applet.Applet;
import java.awt.*;
/* <applet code = "q14.java" width =800 height =600> </applet> */
public class q14 extends Applet {
    @Override
    public void paint(Graphics g) {
        int[] x ={380,300,380,467,467,300};
        int[] y ={50,216,50,216,216,216};
        g.setColor(Color.black);
        g.fillPolygon(x,y,6);
        g.setColor(Color.YELLOW);
        g.fillOval(331,113,103,103);
    }
}
