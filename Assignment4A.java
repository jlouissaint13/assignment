/**
 * Assignment4A
 */
import java.util.Scanner;
public class Assignment4A {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What loop do you want to use? ");
        System.out.println("1) A loop that might run zero or more times");
        System.out.println("2) A loop that will always run at least once");
        System.out.println("3) A loop with a predetermined start and end");
       int choice = scan.nextInt();
       
        switch (choice) {
        
            case 1:
           System.out.print("What's your start number? ");
int start = scan.nextInt();
 System.out.print("Counting: ");
for (int i = 0; i <= start; start--) {
    System.out.print(+ start + ",");
}
            break;
       case 2:
System.out.print("What's your start number? ");
 start = scan.nextInt();

 do {
    System.out.println(start +",");
 } while (start>start);
       break;
       case 3:
       System.out.print("What's your start number? ");
        start = scan.nextInt();
      System.out.print("What's your end number?");
      int end = scan.nextInt();
System.out.print("Counting: ");
      while (start>=end) { 
        
    System.out.print(start+ ", ");
    --start;
}
        break;

        default:
            break;
       }
    }
}