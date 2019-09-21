import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Soal4 extends JPanel{
    public void paint(Graphics draw){
        draw.drawString("D",50,50);
        draw.drawString("U",60,60);
        draw.drawString("M",70,70);
        draw.drawString("B",80,80);
        draw.drawString("W",90,90);
        draw.drawString("A",100,100);
        draw.drawString("Y",110,110);
        draw.drawString("S",120,120);

        draw.drawString("D",150,50);
        draw.drawString("E",160,60);
        draw.drawString("V",170,70);
        draw.drawString("9",180,80);
        draw.drawString("9",190,90);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Nomer 4");
        frame.getContentPane().add(new Soal4());
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
}
