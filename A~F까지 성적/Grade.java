public class Grade {
    private char Grade;
    public char result_Grade(double score){
        if(90< score&&score <=100) {
            Grade = 'A';
            return Grade;
        }
        else if(80< score&&score <=90){
            Grade = 'B';
            return Grade;
        }
        else if(70< score&&score <=80){
            Grade = 'C';
            return Grade;
        }
        else if(60< score&&score <=70){
            Grade = 'D';
            return Grade;
        }
        else if(score<=60){
            Grade = 'F';
            return Grade;
        }
        else {
            Grade ='x';
            return Grade;
        }
    }
    public void SetGrade(char s){
        System.out.printf("the garde is : %c\n",s);
    }
    public static void main(String[] args){
        Grade g1 = new Grade();
        double[] g ={95.3,89.1,65.9,74.1,58.0};
        for(double i:g){
            char s = g1.result_Grade(i);
            g1.SetGrade(s);
        }
    }
}