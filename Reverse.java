//Maggie Z
//Reverse.java
// Two methods to convert a stringbuilder into the reverse
//1st method: while Loop
//2nd method: Recursive method

import java.util.*;

public class Reverse{

  public static String reverse(String rev) {
      if ((null == rev) || (rev.length() <= 1)) {
          return rev;
      }
      return reverse(rev.substring(1)) + rev.charAt(0);
  }



  public static void main(String[] args) {

        System.out.println("Please enter your word choice to reverse:");
        Scanner in = new Scanner(System.in);
        String yis = in.nextLine();
        StringBuilder fin = new StringBuilder(yis);
        System.out.println("Its reverse is");
        System.out.println(fin.reverse().toString());

        System.out.println("Please enter your word choice to reverse:");
        Scanner in2 = new Scanner(System.in);
        String en = in2.nextLine();
        String reverseen = reverse(en);
        System.out.println("Its reverse is ");
        System.out.println(reverseen);
    }
}
