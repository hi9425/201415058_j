public class People{
    public void Calc(int[][] data){
        int M_SUM = 0;
        for(int i=0;i<data.length;i++){
            M_SUM += data[i][0];
        }
        System.out.println("man : " + M_SUM);

        double M_AVER = (double)M_SUM/data.length;
        System.out.printf("Man average is %.1f\n: ",M_AVER);

        int W_SUM = 0;
        for(int i=0;i<data.length;i++){
            W_SUM += data[i][1];
        }
        System.out.println("Women : "+ W_SUM);

        double W_AVER = (double)W_SUM/data.length;
        System.out.printf("Women average  : %.1f\n",W_AVER);


        for(int i=0;i<data.length;i++){
            int guSum = 0;
            double guAver = 0;
            guSum = data[i][0]+data[i][1];
            guAver = (double)guSum/2;
            System.out.println("city"+"["+(i+1)+"]"+" total population  : "+guSum);
            System.out.printf("city"+"["+(i+1)+"]"+" average  : %.1f\n",guAver);
        }

    }

    public static void main(String[] args){
        People p = new People();

        int[][] data={
                {74425, 76326},
                {61164, 61636},
                {109688, 115744},
                {144796, 146776},
                {174996, 181676},
                {177841, 177434},
                {204630, 205980},
                {223373, 232245},
                {161055, 166130},
                {171576, 176735},
                {279169, 293772},
                {239450, 251066},
                {148690, 156510},
                {182977, 196992},
                {237792, 242641},
                {283869, 296762},
                {209344, 210282},
                {118965, 114441},
                {186503, 186856},
                {195734, 203014},
                {254381, 249472},
                {212401, 229111},
                {271654, 295354},
                {319197, 335045},
                {229829, 231671}
        };

        p.Calc(data);

    }
}