import java.util.Scanner;

public class inputAndOuptinLoop {

    public static void main(String[] args) {
        Scanner sv = new Scanner(System.in);
        
         int[] arr = new int[8];
         for (int i = 0; i < arr.length; i++) {
            arr[i]= sv.nextInt();
            
         }

         for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
         }
    }
}