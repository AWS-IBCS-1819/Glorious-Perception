/*
Maggie Zhang
Computer Science
AboutMe.java
9/12/2018
*/

import java.util.*;

public class AboutMe{

  public static String name;
  public static Integer sib;
  public static String animal;
  public static String fear;
  public static Integer luckyNum;

  public static String mood;
  public static String tvshow;

  public AboutMe(){
    name = "Bailey Black";
    sib = 2;
    animal = "unicorn";
    fear = "ghosts";
    luckyNum = 9;

    mood = "happy";
    tvshow = "Vampire Diaries";
  }

  public static void main(String[] args) {
  AboutMe bB = new AboutMe();
  System.out.println(" ");
  System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
  System.out.println("Hi! Welcome to AWS AboutMe orientation.");


  Scanner in3= new Scanner(System.in);
  System.out.println("You would like to know about (choose from below):");
  System.out.println("Name, Siblings, Animal symbol, Fear, Lucky number, mood, TV show, Change mood, Change TV show, Whole.");
  String c = in3.nextLine();

  if (c.equals("Name")){
    System.out.println("Hey! Nice to meet you. I am " + bB.name + ".");
  }
  else if (c.equals("Siblings")){
    System.out.println("I have " + bB.sib + " siblings in my family, and I love them.");
  }
  else if (c.equals("Animal symbol")){
    System.out.println("If I am to use an animal to describe myself, it will be an " + bB.animal + ".");
  }
  else if (c.equals("Fear")){
    System.out.println("And let me secretly tell you, I am afraid of " + bB.fear + " the most.");
  }
  else if (c.equals("Lucky number")){
    System.out.println("My lucky number is " + bB.luckyNum + ".");
  }
  else if (c.equals("Mood")){
    System.out.println("Guess what! I am really " + bB.mood + " right now.");
  }
  else if (c.equals("TV show")){
    System.out.println("Recently, I am watching " + bB.tvshow + ", which is very interesting.");
  }
  else if (c.equals("Change mood")){
    Scanner in1= new Scanner(System.in);
    System.out.println("Please use a word to describe your mood.");
    String a = in1.nextLine();
    System.out.println("The sky is blue and the air is clear, and I actually feel " + a + " today.");
  }
  else if (c.equals("Change TV show")){
    Scanner in2= new Scanner(System.in);
    System.out.println("Ok. What is a TV show you watch recently?");
    String b = in2.nextLine();
    System.out.println("Do you watch " + b + "? At least I am watching it currently, and it is interesting.");
  }
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
  else{
    System.out.println("NOT a valid option. Please double check your spelling.");
  }
  }
}
