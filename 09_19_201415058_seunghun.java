
public class Subway
{
    int line;
    void setLine(int i)
    {
        line=i;
    }

    void subwayRun()
    {
        System.out.println(line+"달리고 있습니다");
    }

   }

class brazilCoffe
{
    int grade;
    String origin;
    int degreeOfRoast;
    brazilCoffe(String origin)
    {
        this.origin=origin;
    }

    
    void roast()
    {
        System.out.println("로스팅중!"+origin);
    }
    void brew()
    {
        System.out.println("끓이는 중!"+origin);
    }
    void grind()
    {
        System.out.println("가는 중"+origin);
    }

}

class Hello
{
    String name;
    Hello(String name)
    {
        this.name=name;
    }
    void Sayhello()
    {
        System.out.println("Hello"+name);
    }

    public static void main(String[] args) {

        Subway subway=new Subway();
        subway.setLine(5);
        subway.subwayRun();

        brazilCoffe BrazilCoffe=new brazilCoffe("믹스커피");
        BrazilCoffe.roast();
        BrazilCoffe.grind();
        BrazilCoffe.brew();

        Hello hello=new Hello("world");
        hello.Sayhello();

    }
    
}

   