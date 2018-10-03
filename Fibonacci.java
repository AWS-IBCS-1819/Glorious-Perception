//Maggie Zhang
//Fibonacci.java

public class Fibonacci{
  public static int Fib(int n) {
    if(n == 1){
      return 1;
    }
    else if(n == 2){
      return 1;
    }
    else{
      return Fib(n-1) + Fib(n-2);
    }
  }
  public static void main(String[] args) {
    int num = 7;
    int tot = Fib(num);
    System.out.println(tot);

  }
}
