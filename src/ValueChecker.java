import java.util.Scanner;

public class ValueChecker {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("masukan nilai");
    int num = in.nextInt();
    if (num == 7){
      System.out.println("That's Lucky");
    }else if (num == 13){
      System.out.println("That's unlucky");
    }
    else{
      System.out.println("That number is neither lucky nor unlucky!");
    }
    in.close();
  }
}
