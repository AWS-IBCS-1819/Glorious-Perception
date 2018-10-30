//Maggie Zhang
//Project: Blackjack.java

import java.util.*;

public class Blackjack {

  Deck d;
  ArrayList<Card> userHand;
  ArrayList<Card> compHand;

  public Blackjack() {
    d = new Deck();
    userHand = new ArrayList<Card>();
    compHand = new ArrayList<Card>();
  }


  public Integer calculateHand(ArrayList<Card> h) { //calculate the total numbers of user's and dealer's hand
    Card c;
    int num = 0; //2-10 cases
    int face = 0; //king, queen, jack cases
    int ace = 0; //A cases
    int total = 0; //total value
      for (int i = 0; i < h.size(); i++){
        if (h.get(i).getValue()>10){ //if it gets king/queen/jack
          face = 10; //king, queen, jack = 10
          total = total + face; //total number adds 10
        }
        else if (h.get(i).getValue()== 1){ //if it gets A
        ace = 11; //A = 11
        total = total + ace; //total number adds 11
      }else if (h.get(i).getValue()<= 10){ //2-10 cases
      total = total + h.get(i).getValue(); //total number adds the number the card is
    }
  }
    return total; //return total number
}
  public String nameHand(ArrayList<Card> n) { //the name of the cards
    Card c;
    String na = ""; //final names of cards
      for (int i = 0; i < n.size(); i++){
      n.get(i).getName();
      na = na + "\n" + n.get(i).getName() + "   "; //adds to the final names of cards
    }
      return na;
    }

  public static void main(String[] args) {
    while(true){ //user can quit/continut to play as they wish
      Blackjack b = new Blackjack(); //object
      b.d.reset(); //reset cards
      b.d.shuffle(); //shuffle cards
      b.userHand.clear(); //start from 0
      b.compHand.clear(); //start from 0
      System.out.println("\n" + "\n" + "---------------------" + "\nWelcome to Blackjack." + "\n---------------------");

      b.userHand.add(b.d.drawCard()); //user draws cards twice
      b.userHand.add(b.d.drawCard());
      System.out.println("\nHere is your hand:");
      System.out.println(b.nameHand(b.userHand)+"\n"+ "Value:" + " " + Integer.toString(b.calculateHand(b.userHand)) + "\n---------------------"); //display cards and total

      b.compHand.add(b.d.drawCard()); //dealer draws cards twice
      b.compHand.add(b.d.drawCard());
      System.out.println("\nHere is Dealer's hand:\n" +"\n" + b.compHand.get(0).getName() + "\n---------------------"); //display cards and total


      while(b.calculateHand(b.userHand)<21){ //condition that user does not bust

        System.out.println("\nWhat would you like to do \n1. Hit \n2. Stay \n3. Quit\n" + "\n---------------------");//prints options
        Scanner input = new Scanner(System.in);
        String choice = input.next();

        if(choice.equals("1")){
          b.userHand.add(b.d.drawCard());
          System.out.println("\nHere is your hand now:2\n" + b.nameHand(b.userHand) + " " + "\nValue:" + " " + Integer.toString(b.calculateHand(b.userHand))+ "\n" + "\n---------------------");//print card names after cards have been drawn
        }
        else if(choice.equals("2")){ //do not make actions anymore for user, stay the same
        break;
        }
        else if(choice.equals("3")){
        System.exit(0); //exit the program
        }
      }

      while (b.calculateHand(b.compHand)<= 16){ //when dealer has a total number smaller than 16
        b.compHand.add(b.d.drawCard()); //keep drawing cards until reaches or goes over 16
        System.out.println("\n" + "\n---------------------" + "\nHere is dealer's hand now:\n" + b.nameHand(b.compHand) + " " + "\nValue:\n" + " " + Integer.toString(b.calculateHand(b.compHand))+"\n---------------");//printing results
      }


      if (b.calculateHand(b.compHand) == 21){ //if dealer gets exactly 21, user loses
             System.out.println("\nDealer's total was "+b.calculateHand(b.compHand) + "\n"+"\nYou lose!\n");
          }else if (b.calculateHand(b.compHand)> 21 && b.calculateHand(b.userHand) <= 21){ //if dealer bust, but user does not bust, user wins
             System.out.println("\nDealer bust! You win!\n");
           }else if(b.calculateHand(b.userHand) == 21){ //if user gets exactly 21, user wins
                System.out.println("\nYour total was " + b.calculateHand(b.userHand) + "\n" + "\nYou win!\n");
              }else if(b.calculateHand(b.userHand) > 21 && b.calculateHand(b.compHand) <= 21){ //if user bust, but dealer does not bust, user loses
                   System.out.println("\n You bust! You lose!\n");
                 }
               else if(b.calculateHand(b.userHand) > 21 && b.calculateHand(b.compHand)> 21){ //if both user and dealer bust, user loses (according to blackjack rules)
                 System.out.println("\nYou both bust! You lose!\n");
            }
          else if (b.calculateHand(b.compHand) > b.calculateHand(b.userHand) && b.calculateHand(b.compHand) < 21 && b.calculateHand(b.userHand) < 21){ //when both user and dealer do not bust or have 21, if dealer has greater total number, dealer wins
            System.out.println("\nDealer's total was "+b.calculateHand(b.compHand)+"\nYour total was " + b.calculateHand(b.userHand)+"\n"+"\nYou lose!\n");
          }else if (b.calculateHand(b.compHand) < b.calculateHand(b.userHand) && b.calculateHand(b.compHand) < 21 && b.calculateHand(b.userHand) < 21){//when both user and dealer do not bust or have 21, if user has greater total number, user wins
            System.out.println("\nDealer's total was "+b.calculateHand(b.compHand)+"\nYour total was " + b.calculateHand(b.userHand)+"\n"+"\nYou win!\n");
          }else if (b.calculateHand(b.compHand) == b.calculateHand(b.userHand)){ //if dealer and user have the same total number, tie
             System.out.println("\nDealer's total was "+b.calculateHand(b.compHand)+"\nYour total was " + b.calculateHand(b.userHand)+"\n"+"\nYou guys draw!\n");//if you and the dealer have the same amount you tie
           }
           System.out.println("\n---------------------" +"Play again?\n1. Yes\n2. No"); //choice to quit/continue to play
                Scanner input = new Scanner(System.in);
                String c2 = input.next(); //if chooses no, then break from the while loop and end the program
                 if (c2.equals("2")){
                   break;
                 }

            }
         }

        }
