import java.util.*;

public class Pokerhand {

  public Deck shuffle(Deck d){
    return d;
  }

  public static void main(String[] args) {

    Random r = new Random();

    int[] ar = r.ints(50, 0, 100).distinct().toArray();
    for (int i = 0; i < ar.length; i++) {
      System.out.println(ar[i]);
    }

    Deck d =new Deck();
  

  }
}
