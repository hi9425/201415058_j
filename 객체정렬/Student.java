import java.util.*;

public class Student{
    private int studentNum;
    private String name;
        Student(String name, int sNum){
        this.name = name;
        studentNum = sNum;
    }
    public String getName(){
        return name;
    }

    public static void main(String[] args){
        ArrayList<String> studentNameList = new ArrayList<String>();
        Student s1 = new Student("LEE SEUNG HUN 1",1000);
        Student s2 = new Student("LEE SEUNG HUN 3",3000);
        Student s3 = new Student("LEE SEUNG HUN 5",5000);
        Student s4 = new Student("LEE SEUNG HUN 2",2000);
        Student s5 = new Student("LEE SEUNG HUN 4",4000);
        studentNameList.add(s1.getName());
        studentNameList.add(s2.getName());
        studentNameList.add(s3.getName());
        studentNameList.add(s4.getName());
        studentNameList.add(s5.getName());
        Collections.sort(studentNameList);
        System.out.println(studentNameList);
    }
}