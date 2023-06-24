import java.util.Scanner;
public class Assignment4B {
    public static void main(String[] args) {
        int square,border,squareC,borderC;
        Scanner scan = new Scanner(System.in);
      
   do{

   
         System.out.print("Enter the size of the square: ");
        square = scan.nextInt();
     if (square<=0) {
        System.out.println("Invalid input!");
    }
}while(square<=0);
do{
        System.out.print("Enter the size of the border: ");
        border = scan.nextInt();

        if (border<0) {
    System.out.println("Invalid input!");
}
    }while (border<0);
        
    do{
        System.out.print("Enter the color of the square: ");
        squareC = scan.nextInt();
        if (squareC != 1 && squareC != 0) {
            System.out.println("Inavlid input!");
        }
    }while(squareC != 1 && squareC != 0);
do{
        System.out.print("Enter the color of the border: ");
        borderC = scan.nextInt();
if (borderC!= 1 && borderC != 0) {
    System.out.println("Invalid input!");
}
}while(borderC != 1 && borderC != 0);
      
   String pbm = "";
   int squareW = (2 * border) + square;
   int squareH = (2 * border) + square;
   pbm += squareH + " " + squareW +"\n";
        for (int i = 0; i < squareH; i++) {
            String pbmT = "";
           
            for (int j = 0; j < squareW; j++) {
                if (j<border || j>= squareW - border || i < border || i >= squareH - border ) {
                    pbmT += borderC + "";
                
                }
                else{
                      pbmT += squareC + "";
                }
            }
            pbm += pbmT.trim()+"\n";
            
        }
System.out.println("PBM File Contents: ");
  System.out.println("P1");
        System.out.println(pbm);

    }
}
