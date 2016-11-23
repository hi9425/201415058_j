public class Temp{
    private double f =0;
    private double c =0;
    public void Convert_FF(double temp) {
        System.out.printf("Ceerlsius is %.2f C\n",temp);
        f = (temp*1.8)+32;
        System.out.printf("Converted  %.2f F\n",f);
    }
    public void ConverT_CCC(double temp) {
        System.out.printf("Fahrenheit is %.2f F\n",temp);
        c = (temp-32)/1.8;
        System.out.printf("Celsius is %.2f C\n",c);
    }
    public static void main(String[] args) {
        Temp tt = new Temp();
        double temp = 37.5;
        tt.Convert_FF(temp);
        temp = 91.7;
        tt.ConverT_CCC(temp);
    }
}