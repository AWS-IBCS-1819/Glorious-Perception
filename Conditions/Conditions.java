// Conditions.java by Maggie Zhang
// 9/14/18

import java.util.*;
import java.io.*;

public class Conditions {

  public static void main(String[] args) {

    StringBuilder myStr = new StringBuilder();
    int count = 0;
    try {
      File harrypotter = new File("Harrypotter.txt");
      Scanner sc = new Scanner(harrypotter);


      while (sc.hasNext()) { //checks to see if our file is empty
        myStr.append(sc.next() + " ");
        count++;
      }
    }
    catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    System.out.println(myStr);

    int numO = 0;
    for (int i = 0; i < count - 1; i++) {
      if (myStr.substring(i, i + 1).equals("a")) {
        System.out.println(myStr.substring(i, i + 1));
        numO++;
      }
    }
    System.out.println("Number of 'a' in Harry Potter: " + Integer.toString(numO));

  }
}
