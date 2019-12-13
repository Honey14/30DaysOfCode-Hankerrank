import java.io.*;
import java.util.*;

public class Day6 {
    Scanner scanner = new Scanner(System.in);
    String S;
    int t;
    public int setTestCase(){
        t = scanner.nextInt();
        scanner.nextLine();
        return t;
    }

     public void setString(){
        S = scanner.nextLine();
    }

    public void printEvenIndexChar(){
        int len = S.length();
        for (int i = 0;i < len; i++){
            if(i%2 ==0)
                System.out.print(S.charAt(i));
        }
    }

     public void printOddIndexChar(){
        int len = S.length();
        for (int i = 0;i < len; i++){
            if(i%2 !=0)
                System.out.print(S.charAt(i));
        }
    }

    public static void main(String[] args) {

        Day6  num = new Day6();
        int T = num.setTestCase();

        for(int a0=0;a0<T;a0++){
            num.setString();
            num.printEvenIndexChar();
            System.out.print(" ");
            num.printOddIndexChar();
            System.out.print("\n");
        }
   }
}