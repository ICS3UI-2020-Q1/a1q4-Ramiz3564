import java.util.Scanner;

/**
 *
 * @author Zach
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create the scanner for user input 
    Scanner input = new Scanner(System.in);
    
    System.out.println("please enter first x coordinate"); 
    int X1 = input.nextInt();
    System.out.println("please enter first y coordinate");
    int Y1 = input.nextInt();
    System.out.println("please enter second x coordinate");
    int X2 = input.nextInt();
    System.out.println("please enter second y coordinate");
    int Y2 = input.nextInt();

    final double total = (Y2 - Y1) / (X2 - X1);     

   System.out.println("your total is:" + total ); 


  }
}
