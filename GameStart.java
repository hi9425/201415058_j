
import javax.swing.*;
import java.util.*;
import java.awt.event.*;

public class GameStart extends JFrame implements ActionListener{
    static JTextField player1 = new JTextField(11);
    static JTextField player2 = new JTextField(11);
    JLabel label1 = new JLabel("Player1");
    JLabel label2 = new JLabel("Player2");
    JButton b1 = new JButton("Start");
    JButton b2 = new JButton("EXIT");
    JButton b3 = new JButton("Yut Game");
    String p1;
    String p2;
    static Scanner sc = new Scanner(System.in);

    public String getName(JTextField p){

        return p.getText();
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource().equals(b1)) {
            p1 = getName(player1);
            p2 = getName(player2);
            System.out.println("Player Name is "+p1);
            System.out.println("Player Name is "+p2);
        }

        else if(e.getSource().equals(b2)){
            p1 = getName(player1);
            p2 = getName(player2);
            System.exit(0);}
        else if(e.getSource().equals(b3)){
            System.out.println("Yut Game");

            new Yut();}
    }
    public static void main(String[] args){



    }
}
