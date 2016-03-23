/**
 * Created by aman on 7/9/15.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CircleColor implements ActionListener {
    JFrame frame;
    JButton button;
    public static void main(String args[]){
        CircleColor gui = new CircleColor();
        gui.go();
    }

    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button = new JButton("Click Me");
        button.addActionListener(this);

        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event){
        frame.repaint();
    }
}

class MyDrawPanel extends JPanel{
    int i, j;
    public void paintComponent(Graphics g){

            int red = (int)(Math.random()*255);
            int blue = (int)(Math.random()*255);
            int green = (int)(Math.random()*255);
            i = (int)(Math.random()*200);
            j = (int)(Math.random()*200);
            Color randomColor = new Color(red, blue, green);
            g.setColor(randomColor);
            g.fillOval(0+i, 0+j, 100, 100);

    }
}
