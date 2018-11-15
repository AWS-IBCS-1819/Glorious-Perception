/*
Creator: Maggie Z
         Katty S
Project: Zoo.java
*/

import java.util.*;

public class Zoo { //use this to run the whole program

  public void printAnimals(Animal[] a){ // a method to get all the animal names
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i].getName());
    }
  }

  public Zoo() { //constructor
  }

  public static void main(String[] args) { //main method
    Zoo z = new Zoo(); //create a zoo

    Enclosure e1= new Enclosure("Harry Potter Land", 6, 5); //input info of enclosure 1 in predetermined order
    Enclosure e2 = new Enclosure("Disney Land", 4, 4); //input info of enclosure 2 in predetermined order
    Enclosure[] all = {e1, e2}; //a string to hold all enclosures

    Animal h1 = new Animal("Phoenix", "Fawkes", 6.6, 3); //input info of animal 1 in harry potter land
    Animal h2 = new Animal("Owl", "Hedwig", 2.3, 2); //input info of animal 2 in harry potter land
    Animal h3 = new Animal("House elf", "Dobby", 2.5, 1); //input info of animal 3 in harry potter land
    Animal h4 = new Animal("Mountain troll", "Gianty", 17.0, 5); //input info of animal 4 in harry potter land
    Animal h5 = new Animal("Unicorn", "Cupcake", 5.9, 2); //input info of animal 5 in harry potter land
    Animal h6 = new Animal("Werewolve", "Jacob", 12.7, 5); //input info of animal 6 in harry potter land
    Animal[] harrypotterland = {h1, h2, h3, h4, h5, h6}; // a string to hold all animals (including their information) in harry potter land

    Animal d1 = new Animal("Mouse", "Gus", 0.2, 1); //input info of animal 1 in disney land
    Animal d2 = new Animal("Reindeer", "Sven", 4.9, 1); //input info of animal 2 in disney land
    Animal d3 = new Animal("Warthog", "Pumbaa", 2.8,2); //input info of animal 3 in disney land
    Animal d4 = new Animal("Meerkat", "Timon", 9.8,2); //input info of animal 4 in disney land
    Animal[] disneyland = {d1, d2, d3, d4}; // a string to hold all animals (including their information) in disney land

    Map<String, Animal[]> m; //create a hashmap
    m = new HashMap<String, Animal[]>();
    m.put(e1.getOrigin(), harrypotterland); //add the key and value of enclosure 1 to the hashmap
    m.put(e2.getOrigin(), disneyland); //add the key and value of enclosure 2 to the hashmap

    while (true){ //a while loop to let the program keep going
      Scanner in1= new Scanner(System.in);
      System.out.println("\n----------------------------");
      System.out.println("Welcome to Matty's Zoo!");
      System.out.println("\n----------------------------");
      System.out.println("Please choose an enclosure:");
      System.out.println("1. Harry Potter Land \n2. Disney Land \n3. Quit program"); //print out options for user
      String choice = in1.nextLine(); //use scanner to scan user's choice of which enclosure to look at

      if(choice.equals("1")){ //if user's choice is harry potter land
        System.out.println("\n----------------------------"); //then prints out info about that enclosure
        System.out.println("Harry Potter Land contains " + e1.getAnimalsize() + " types of animals. \nOur visitors have rated this enclosure " + e1.getPopularity()+ " stars.");
        System.out.println("You will see these animals here:");
        z.printAnimals(m.get("Harry Potter Land")); //print all animals stored in enclosure 1
        System.out.println("\n----------------------------");
        System.out.println("");
        Scanner in2= new Scanner(System.in);
        System.out.println("Which of them would you like to know more about?"); //ask the user to choose which animal to look at
        System.out.println("Please type the animal name or 'none' if you have no interest."); // user can either look at an animal or go back to the previous page
        String choice2 = in2.nextLine(); //use scanner to scan user's choice
          if(choice2.equals("Phoenix") || choice2.equals("phoeix")){ //if user chooses phoenix
            System.out.println("\n----------------------------"); //then print out info about it
            System.out.println("Our phoenix is called " + h1.getNick() + ". \nIt has a body length of " + h1.getSize()+ " inches. \nPlease notice that this species has a danger level of " + h1.getDanger() + " (maximum 5).");
            System.out.println("\n----------------------------");
          }
          else if(choice2.equals("Owl") || choice2.equals("owl")){ //if user chooses owl
            System.out.println("\n----------------------------"); //then print out info about it
            System.out.println("Our owl is called " + h2.getNick() + ". \nIt has a body length of " + h2.getSize()+ " inches. \nPlease notice that this species has a danger level of " + h2.getDanger() + " (maximum 5).");
            System.out.println("\n----------------------------");
          }
          else if(choice2.equals("House elf") || choice2.equals("house elf")){ //if user chooses house elf
            System.out.println("\n----------------------------"); //then print out info about it
            System.out.println("Our house elf is called " + h3.getNick() + ". \nIt has a body length of " + h3.getSize()+ " inches. \nPlease notice that this species has a danger level of " + h3.getDanger() + " (maximum 5).");
            System.out.println("\n----------------------------");
          }
          else if(choice2.equals("Mountain troll") || choice2.equals("mountain troll")){ //if user chooses mountain troll
            System.out.println("\n----------------------------"); //then print out info about it
            System.out.println("Our mountain troll is called " + h4.getNick() + ". \nIt has a body length of " + h4.getSize()+ " inches. \nPlease notice that this species has a danger level of " + h4.getDanger() + " (maximum 5).");
            System.out.println("\n----------------------------");
          }
          else if(choice2.equals("Unicorn") || choice2.equals("unicorn")){ //if user chooses unicorn
            System.out.println("\n----------------------------"); //then print out info about it
            System.out.println("Our unicorn is called " + h5.getNick() + ". \nIt has a body length of " + h5.getSize()+ " inches. \nPlease notice that this species has a danger level of " + h5.getDanger() + " (maximum 5).");
            System.out.println("\n----------------------------");
          }
          else if(choice2.equals("Werewolf") || choice2.equals("werewolf")){ //if user chooses werewolf
            System.out.println("\n----------------------------"); //then print out info about it
            System.out.println("Our werewolf is called " + h6.getNick() + ". \nIt has a body length of " + h6.getSize()+ " inches. \nPlease notice that this species has a danger level of " + h6.getDanger() + " (maximum 5).");
            System.out.println("\n----------------------------");
          }
          else if(choice2.equals("None") || choice2.equals("none")){ //if user chooses to go back to the previous page, then print out okay and go back
            break;
          }
          else{ //otherwise it is an invalid option
            System.out.println("\n----------------------------");
            System.out.println("Invalid option.");
            System.out.println("\n----------------------------");
          }
      }

      else if(choice.equals("2")){ //if user's choice is disney land
        System.out.println("\n----------------------------"); //then prints out info about that enclosure
        System.out.println("Disney Land contains " + e2.getAnimalsize() + " types of animals. \nOur visitors have rated this enclosure " + e2.getPopularity()+ " stars.");
        System.out.println("You will see these animals here:");
        z.printAnimals(m.get("Disney Land")); //print all animals stored in enclosure 1
        System.out.println("\n----------------------------");
        System.out.println("");
        Scanner in2= new Scanner(System.in);
        System.out.println("Which of them would you like to know more about?"); //ask the user to choose which animal to look at
        System.out.println("Please type the animal name or 'none' if you have no interest."); // user can either look at an animal or go back to the previous page
        String choice2 = in2.nextLine(); //use scanner to scan user's choice
          if(choice2.equals("Mouse") || choice2.equals("mouse")){ //if user chooses mouse
            System.out.println("\n----------------------------"); //then print out info about it
            System.out.println("Our mouse is called " + d1.getNick() + ". \nIt has a body length of " + d1.getSize()+ " inches. \nPlease notice that this species has a danger level of " + d1.getDanger() + " (maximum 5).");
            System.out.println("\n----------------------------");
          }
          else if(choice2.equals("Reindeer") || choice2.equals("reindeer")){ //if user chooses reindeer
            System.out.println("\n----------------------------"); //then print out info about it
            System.out.println("Our reindeer is called " + d2.getNick() + ". \nIt has a body length of " + d2.getSize()+ " inches. \nPlease notice that this species has a danger level of " + d2.getDanger() + " (maximum 5).");
            System.out.println("\n----------------------------");
          }
          else if(choice2.equals("Warthog") || choice2.equals("warthog")){ //if user chooses warthog
            System.out.println("\n----------------------------"); //then print out info about it
            System.out.println("Our warthog is called " + d3.getNick() + ". \nIt has a body length of " + d3.getSize()+ " inches. \nPlease notice that this species has a danger level of " + d3.getDanger() + " (maximum 5).");
            System.out.println("\n----------------------------");
          }
          else if(choice2.equals("Meerkat") || choice2.equals("meerkat")){ //if user chooses meerkat
            System.out.println("\n----------------------------"); //then print out info about it
            System.out.println("Our meerkat is called " + d4.getNick() + ". \nIt has a body length of " + d4.getSize()+ " inches. \nPlease notice that this species has a danger level of " + d4.getDanger() + " (maximum 5).");
            System.out.println("\n----------------------------");
          }
          else if(choice2.equals("None") || choice2.equals("none")){ //if user chooses to go back to the previous page, then print out okay and go back
            System.out.println("\n----------------------------");
            System.out.println("Okay.");
            System.out.println("\n----------------------------");
          }
          else{ //otherwise it is an invalid option
            System.out.println("\n----------------------------");
            System.out.println("Invalid option.");
            System.out.println("\n----------------------------");
          }
      }
      else if (choice.equals("3")){ //if user chooses to quit program, then break from while loop and end the program
        break;
      }

  }
}
}
