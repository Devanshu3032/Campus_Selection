import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int[] arr = new int[3];
         for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
         }
         System.out.println("Roll no of Failed Student is :");
         for (int i = 0; i < arr.length; i++) {
            if(arr[i]<35){
                
                System.out.print(i + " ,");
            }
            
         }
    }
    
}
