class Person{
    double bmi=0;
    double calc(double weight, double height){
        bmi=weight/(height*height/10000);
        return bmi;
    }
    void BMI(double bmi){
        if(bmi<18.5) {
            System.out.printf("����� ������  %.1f ����",bmi);
        }
        else if(bmi>=18.5 && bmi<23) {
            System.out.printf("����� ������  %.1f ��� ",bmi);
        }
        else if(bmi>=23 && bmi<25) {
            System.out.printf("����� ������  %.1f ���� ",bmi);
        }
        else if(bmi>=25 && bmi<30) {
            System.out.printf("����� ������  %.1f �� 1 ",bmi);
        }
        else if(bmi>=30 && bmi<40) {
            System.out.printf("����� ������  %.1f �� 2 ",bmi);
        }
        else if(bmi>=40) {
            System.out.printf("����� ������  %.1f �� 3 ",bmi);
        }
        else {
            System.out.print("Error");
        }
    }
    public static void main(String[] args){
        Person p = new Person();
        double result = p.calc(70,180);
        p.BMI(result);
    }
}