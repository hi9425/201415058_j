import java.util.Calendar;
class CountingCalendar{
    void count(){
        int Sunday = 0;
        Calendar cc = Calendar.getInstance();
        for(int y=1901; y<=2000; y++){
            for(int m=0; m<12; m++){
                cc.set(y,m,1);
                if(cc.get(Calendar.DAY_OF_WEEK)==1){
                    Sunday=Sunday+1;
                }
            }
        }
        System.out.println("첫번째 일요일은 : "+Sunday);
    }
    public static void main(String[] args){
        CountingCalendar cal = new CountingCalendar();
        cal.count();
    }
} 