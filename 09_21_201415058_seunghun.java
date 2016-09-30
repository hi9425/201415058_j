
public class Person {

   private float weight;



    public void SetWeight(float weight)
    {
        this.weight=weight;
    }

    float getWeight()
    {
        return weight;
    }

    public static void main(String[] args) {
        Person person =new Person();
        person.SetWeight(50);
        person.getWeight();
        System.out.println(person.getWeight());
    }

}
