package JavaChallenges.formatter;

public class Formatter {
    public static void main(String[] args) {
        String s1 = "Jorge";
        int x = 42;
        double y = 445644.1;

        System.out.printf("%1$14s %2$05d %3$2.5f %n",s1,x,y);
    }
}
