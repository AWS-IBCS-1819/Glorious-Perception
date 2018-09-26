/* Gradebook.java by Vivian Yip & Maggie Zhang
This class holds all of the information for Gradebook
which reads a gradebook file and calculates certain
values for the teacher. Then it gives output based
off user feedback.
*/

import java.util.*;
import java.io.*;
public class Gradebook {
  public static int meanGrade;
  public static int gradeSpread;
  public static int topGrade;
  public static int lowestGrade;
  public static String classStudent;
  public static String classSubject;
  public static String classTeacher;


  public static void main(String[] args) {

    //setting up different StringBuilder to store different information
    StringBuilder cjStr = new StringBuilder();//成绩 grade
    StringBuilder myStr = new StringBuilder();//useless stuff
    StringBuilder mzStr = new StringBuilder();//名字 student
    StringBuilder kcStr = new StringBuilder();//课程 subject
    StringBuilder lsStr = new StringBuilder();//老师 teacher
    int count = 0;
    try {
      //reading the file
      File grade = new File("grade.txt");
      Scanner sc = new Scanner(grade);

      //putting the first five words into different StringBuilders
      kcStr.append(sc.next() + " ");
      kcStr.append(sc.next() + " ");
      myStr.append(sc.next() + " ");
      lsStr.append(sc.next() + " ");
      lsStr.append(sc.next() + " ");

      while (sc.hasNext()) {
        //checks to see if our file is empty
        //now scanning from the sixth word and putting them different StringBuilders
        //while loop
        mzStr.append(sc.next() + " ");
        mzStr.append(sc.next() + " \n");
        myStr.append(sc.next() + " ");
        cjStr.append(sc.next() + " ");

      }
    }

    catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    //trying to get the user's choice
    Scanner in1= new Scanner(System.in);
    System.out.println("Welcome to the Student Gradebook, what would you like to see?");
    System.out.println("1. Mean Grade");
    System.out.println("2. Grade Spread");
    System.out.println("3. Top Grade");
    System.out.println("4. Lowest Grade");
    System.out.println("5. Class Subject and Teacher");
    System.out.println("6. Student Roster");
    String choice = in1.nextLine();
    //what will appear after they choose
    if (choice.equals("1")){
      System.out.println("The class mean grade was " + meanGrade + ".");
    }
  /*  else if (choice.equals("2")){
      System.out.println("The class grade spread was " + gradeSpread + ".");
    }
    else if (choice.equals("3")){
      System.out.println("The class top grade was " + topGrade + ".");
    }
    else if (choice.equals("4")){
      System.out.println("The class lowest grade was " + lowestGrade + ".");
    } */
    else if (choice.equals("5")){
      System.out.println("The class's subject was " + kcStr + ".");
      System.out.println("The class's teacher was " + lsStr + ".");
    }
    else if (choice.equals("6")){
      System.out.println("The class's student roster is shown below: ");
      System.out.println(mzStr);
    }
    else {
      System.out.println("The system cannot answer to your command");
    }

//just for testing
    //System.out.println(cjStr);
    //System.out.println(lsStr);






}


//methods
  /*  public void meanGrade(){

    }

    public void gradeSpread(){

    }

    public void topGrade(){

    }

    public void lowestGrade(){

    }*/

  }
