import javax.swing.*;
import java.awt.*;

public class Main extends JPanel
{

    //Overriding the paint method to add things
    //to our canvas
    public void paint(Graphics canvas)
    {
        int x = 20, y = 10, width = 420, height =420;
        for (int i = 0; i <=7; i++)
        {
            if(i%2 == 0)
            {
                canvas.setColor(Color.red);
            }
//            if(i%2 == 0)
//            {
//                if(i==0)
//                canvas.setColor(Color.white);
//                if(i==2)
//                    canvas.setColor(Color.orange);
//                if(i==4)
//                    canvas.setColor(Color.white);
//                if(i==6)
//                    canvas.setColor(Color.green);
//            }
            else
                canvas.setColor(Color.white);
            canvas.fillOval(x,y,width,height);
            x += 30;
            y += 30;
            width -= 60;
            height -= 60;
        }
    }
    public static void main(String[] args)
    {

	  //Let's instantiate a new JFrame (outer window)
        JFrame frame = new JFrame();
        frame.setTitle("Bullseye!");
        frame.setSize(480, 480);
        //by default, frames are invisible
        frame.setVisible(true);
        //Add the panel to the frame
        frame.add(new Main());


    }
}
