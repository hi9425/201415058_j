
public class Subway
{
    int line;
    void setLine(int i)
    {
        line=i;
    }

    void subwayRun()
    {
        System.out.println(line+"�޸��� �ֽ��ϴ�");
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
        System.out.println("�ν�����!"+origin);
    }
    void brew()
    {
        System.out.println("���̴� ��!"+origin);
    }
    void grind()
    {
        System.out.println("���� ��"+origin);
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

        brazilCoffe BrazilCoffe=new brazilCoffe("�ͽ�Ŀ��");
        BrazilCoffe.roast();
        BrazilCoffe.grind();
        BrazilCoffe.brew();

        Hello hello=new Hello("world");
        hello.Sayhello();

    }
    
}

   