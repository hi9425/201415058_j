class Person{
    double bmi=0;
    double calc(double weight, double height){
        bmi=weight/(height*height/10000);
        return bmi;
    }
    void BMI(double bmi){
        if(bmi<18.5) {
            System.out.printf("당신의 몸무게  %.1f 낮다",bmi);
        }
        else if(bmi>=18.5 && bmi<23) {
            System.out.printf("당신의 몸무게  %.1f 평범 ",bmi);
        }
        else if(bmi>=23 && bmi<25) {
            System.out.printf("당신의 몸무게  %.1f 위험 ",bmi);
        }
        else if(bmi>=25 && bmi<30) {
            System.out.printf("당신의 몸무게  %.1f 비만 1 ",bmi);
        }
        else if(bmi>=30 && bmi<40) {
            System.out.printf("당신의 몸무게  %.1f 비만 2 ",bmi);
        }
        else if(bmi>=40) {
            System.out.printf("당신의 몸무게  %.1f 비만 3 ",bmi);
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