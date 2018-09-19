/* Gradebook.java by Vivian Yip & Maggie Zhang
This class holds all of the information for Gradebook
which reads a gradebook file and calculates certain
values for the teacher. Then it gives output based
off user feedback.
*/

import java.util.*;
import java.io.*;

public class Gradebook {

  public static void main(String[] args) {
    Scanner in1= new Scanner(System.in);
    System.out.println("Welcome to the Student Gradebook, what would you like to see?");
    System.out.println("1. Mean Grade");
    System.out.println("2. Median Grade");
    System.out.println("3. Top Grade");
    System.out.println("4. Lowest Grade");
    System.out.println("5. Class Subject and Teacher");
    System.out.println("6. Student Roster");
  //  Integer a = in1.nextLine();

/*
    if (a.equals(1)){
      System.out.println("The class mean grade was " + gradeBook.meanGrade() + ".");
    }
    if (a.equals(2)){
      System.out.println("The class median grade was " + gradeBook.medianGrade() + ".");
    }
    if (a.equals(3)){
      System.out.println("The class top grade was " + gradeBook.topGrade() + ".");
    }
    if (a.equals(4)){
      System.out.println("The class lowest grade was " + gradeBook.lowestGrade() + ".");
    }
    if (a.equals(5)){
      System.out.println("The class's subject was " + gradeBook.classSubject() + ".");
      System.out.println("The class's teacher was " + gradeBook.classTeacher() + ".");
    }
    if (a.equals(6)){
      System.out.println("The class's student roster is shown below: ");
      System.out.println(gradeBook.classSubject());
    }

    File file1 = new File("grades.txt");
        String[] names = new String[100];
        int[] scores = new int[100];
        int i = 0;
        try {
            Scanner scanner = new Scanner(file1);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split("\t");
                names[i] = words[0]; // storing value in the first array
                scores[i] = Integer.parseInt(words[1]); // storing value in the
                                                        // second array
                i++;
            }
            /*
             * This piece of code will give unnecessary values as you have
             * selected an array of size greater than the values in the file for
             *
             * for(String name: names) {
             *      System.out.println("Name:- "+name);
             * }
             * for(int score: scores) {
             *      System.out.println("Score:- "+score);
             *  }

            // Better use the below way, here i am restricting the iteration till i
            // i is actually the count of lines your file have.
            for (int j = 0; j < i; j++) {
                System.out.println("Name:- " + names[j] + "\t" + "Score:- " + scores[j]);
            }
          } catch (FileNotFoundException e) {
          e.printStackTrace();
      }*/
  }
}
