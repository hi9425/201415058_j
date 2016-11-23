import java.util.*;

public class Cha{
    public void CountChars(String letters){
        char[] letter = letters.toCharArray();
        Map<String, Integer> Words = new HashMap<String,Integer>();
        String W;
        for(char c:letter){
            W = Character.toString(c);
            if(Words.containsKey(W)){
                Words.put(W,Words.get(W)+1);
            } else {
                Words.put(W,1);
            }
        }
        System.out.println(Words);
    }
    public static void main(String[] args){
        Cha p = new Cha();
        String letter = "Sangmyung_university";
        p.CountChars(letter);
    }
}