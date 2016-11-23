public class Hello{
    public void reverse(String words){
        char[] word = words.toCharArray();
        StringBuilder reverse = new StringBuilder();
        for(int i=word.length-1;i>=0;i--){
            reverse.append(word[i]);
        }
        System.out.println(reverse);
    }
    public static void main(String[] args) {
        Hello p = new Hello();
        String words = "Hello";
        p.reverse(words);
    }
}