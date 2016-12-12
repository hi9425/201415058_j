import javax.swing.*;
import java.util.Random;

class Yut extends JFrame {
     static String buffer;

    void Throw()
    {
        StringBuffer buffer = new StringBuffer();
        Random random = new Random();

        String Yut[] = ("Do,Gae,Gul,Yut,Mo".split(","));


        for (int i=0 ; i<1 ; i++)
        {

            buffer.append(Yut[random.nextInt(Yut.length)]);

        }



        this.buffer=buffer.toString();
        System.out.println(buffer);

    }

    String getBuffer()
    {

        return buffer;
    }


    public static void main(String[] args) {

        Yut y =new Yut();
        y.Throw();
        y.getBuffer();

    }
    }

