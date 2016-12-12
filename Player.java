
public class Player {
    int result;
    protected String name=null;
    String num;
    public Player(String name) {

        this.name=name;

    }
    public int play() {

        Yut y= new Yut();
         y.Throw();
         y.getBuffer();


        if (y.getBuffer()=="Do")
        {
             this.result=1;

        }
        else if (y.getBuffer()=="Gul")
        {
            this.result=3;
        }
        else if (y.getBuffer()=="Gae")
        {
            this.result=2;
        }
        else if(y.getBuffer()=="Yut")
        {

            this.result=4;
        }
        else if (y.getBuffer()=="Mo")
        {
            this.result=5;
        }

        return result;

    }

    String getNum()
    {

        System.out.println(num);
        return num;
    }

    public static void main(String[] args) {
        Player p=new Player("D");
        p.play();
    }
    }



