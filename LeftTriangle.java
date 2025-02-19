import java.util.Scanner;
public class LeftTriangle{
   public static void main(String args[]){
      int i, j, my_input;
      System.out.println("Required packages have been imported");
      Scanner my_scanner = new Scanner(System.in);
      System.out.println("A reader object has been defined ");
      System.out.print("Enter the number of rows : ");
      my_input = my_scanner.nextInt();
      System.out.println("The left triangle star pattern : ");
      for(i=0; i<my_input; i++){
         for(j=0; j<=i; j++){
            System.out.print("* ");
         }
         System.out.println();
      }
   }
}