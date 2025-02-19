import java.util.Scanner;  
public class MirrorUpperStarTriangle {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter the number of rows: ");  
        int n = scanner.nextInt();  
        printMirrorUpperStarTriangle(n);  
        scanner.close();  
    }  
    public static void printMirrorUpperStarTriangle(int n) {  
        for (int i = 1; i <= n; i++) {  
            // Print leading spaces  
            for (int j = 1; j <= n - i; j++) {  
                System.out.print(" ");  
            }  
            // Print stars  
            for (int k = 1; k <= i; k++) {  
                System.out.print("*");  
            }  
            // Move to the next line after printing each row  
            System.out.println();  
        }  
    }  
}  