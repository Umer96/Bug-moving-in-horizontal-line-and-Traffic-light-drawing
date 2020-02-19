//Muhammad Umer Sheikh
//Assignment 2: Traffic Light
//CS49J

package sjsu.edu;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JComponent;

public class TrafficLightViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(300, 500);
        frame.setTitle("Traffic Light");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        TrafficLightComponent component = new TrafficLightComponent();
        frame.add(component);

        frame.setVisible(true);
    }
}

class TrafficLightComponent extends JComponent{
    public void paintComponent (Graphics g){

        //Recover Graphics 2D
        Graphics2D g2 = (Graphics2D) g;

        //A black rectangle for the outer casing for the traffic light
        Rectangle BlackCasing = new Rectangle (80, 100,120, 320);
        g2.draw(BlackCasing);
        g2.setColor(Color.BLACK);
        g2.fill(BlackCasing);

        //A circle for red light
        Ellipse2D.Double RedCircle = new Ellipse2D.Double(100, 120, 80, 80);
        g2.draw(RedCircle);
        g2.setColor(Color.RED);
        g2.fill(RedCircle);

        //A circle for yellow light
        Ellipse2D.Double YellowCircle = new Ellipse2D.Double(100, 220, 80, 80);
        g2.draw(YellowCircle);
        g2.setColor(Color.YELLOW);
        g2.fill(YellowCircle);

        //A circle for green light
        Ellipse2D.Double GreenCircle = new Ellipse2D.Double(100, 320, 80, 80);
        g2.draw(GreenCircle);
        g2.setColor(Color.GREEN);
        g2.fill(GreenCircle);
    }
}