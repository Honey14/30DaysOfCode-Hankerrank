import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in); 

  	int one ;
        double two;
        String s1;
        one = scan.nextInt();
        two = scan.nextDouble();
        s1 = scan.nextLine();
        s1 = scan.nextLine();
        System.out.println(i + one);
        System.out.println(d + two);
        System.out.println("HackerRank "+s1);
  	scan.close();
    }
}