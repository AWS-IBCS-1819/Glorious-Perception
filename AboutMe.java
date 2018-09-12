/*
Maggie Zhang
Computer Science
AboutMe.java
9/12/2018
*/

//import scanner
import java.util.*;

//create a class called AboutMe
public class AboutMe{

  //use string and integer to store information of the five static variables
  public static String name;
  public static Integer sib;
  public static String animal;
  public static String fear;
  public static Integer luckyNum;

  //use string and integer to store information of the two mutable variables
  public static String mood;
  public static String tvshow;

  public AboutMe(){
    //store values and information to static variables
    name = "Bailey Black";
    sib = 2;
    animal = "unicorn";
    fear = "ghosts";
    luckyNum = 9;

    //store values and information to mutable variables
    mood = "happy";
    tvshow = "Vampire Diaries";
  }

  //main method
  public static void main(String[] args) {
  AboutMe bB = new AboutMe();
  System.out.println(" ");
  System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
  System.out.println("Hi! Welcome to AWS AboutMe orientation.");

  //use scanner to ask what category of information the user would like to see
  Scanner in3= new Scanner(System.in);
  System.out.println("You would like to know about (choose from below):");
  System.out.println("Name, Siblings, Animal symbol, Fear, Lucky number, mood, TV show, Change mood, Change TV show, Whole.");
  String c = in3.nextLine();

  //if the user's input is name, then information about name pops out
  if (c.equals("Name")){
    System.out.println("Hey! Nice to meet you. I am " + bB.name + ".");
  }
  //if the user's input is siblings, then information about siblings pops out
  else if (c.equals("Siblings")){
    System.out.println("I have " + bB.sib + " siblings in my family, and I love them.");
  }
  //if the user's input is animal symbol, then information about animal symbol pops out
  else if (c.equals("Animal symbol")){
    System.out.println("If I am to use an animal to describe myself, it will be an " + bB.animal + ".");
  }
  //if the user's input is fear, then information about fear pops out
  else if (c.equals("Fear")){
    System.out.println("And let me secretly tell you, I am afraid of " + bB.fear + " the most.");
  }
  //if the user's input is lucky number, then information about lucky number pops out
  else if (c.equals("Lucky number")){
    System.out.println("My lucky number is " + bB.luckyNum + ".");
  }
  //if the user's input is mood, then information about mood pops out
  else if (c.equals("Mood")){
    System.out.println("Guess what! I am really " + bB.mood + " right now.");
  }
  //if the user's input is tv show, then information about tv show pops out
  else if (c.equals("TV show")){
    System.out.println("Recently, I am watching " + bB.tvshow + ", which is very interesting.");
  }
  //this is when user decides to change the value for the mutable variable, mood.
  //At this part, user can input a new value, which will change the information stored in this mutable variable.
  else if (c.equals("Change mood")){
    Scanner in1= new Scanner(System.in);
    System.out.println("Please use a word to describe your mood.");
    String a = in1.nextLine();
    System.out.println("The sky is blue and the air is clear, and I actually feel " + a + " today.");
  }
  //this is when user decides to change the value for the mutable variable, tv show.
  //At this part, user can input a new value, which will change the information stored in this mutable variable.
  else if (c.equals("Change TV show")){
    Scanner in2= new Scanner(System.in);
    System.out.println("Ok. What is a TV show you watch recently?");
    String b = in2.nextLine();
    System.out.println("Do you watch " + b + "? At least I am watching it currently, and it is interesting.");
  }
  //if user's input is whole, then it will give the whole version of the introductoin of the person
  else if (c.equals("Whole")){
    System.out.println(" ");
    System.out.println("Here is the brief introduction about myself:");
    System.out.println("Hey! I am " + bB.name + ".");
    System.out.println("I am grateful that I have " + bB.sib + " siblings in my family.");
    System.out.println("If I am to use an animal to describe myself, it will be an " + bB.animal + ".");
    System.out.println("And let me secretly tell you, I am afraid of " + bB.fear + " the most.");
    System.out.println("My lucky number is " + bB.luckyNum + ".");
    System.out.println("Right now, I feel really " + bB.mood + ".");
    System.out.println("Do you watch " + bB.tvshow + "? At least I am watching it currently, and it is interesting.");
    System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
    System.out.println(" ");
  }
  //if user's input does not match any of the choices, then it will give the message that the user input something wrong.
  else{
    System.out.println("NOT a valid option. Please double check your spelling.");
  }
  }
}
