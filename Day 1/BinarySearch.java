import java.util.Scanner;

public class BinarySearch {
   public static void main(String[] args) {
    System.out.println("Enter the Target : ");
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
     int[] arr = new int[4];
     for (int i = 0; i < arr.length; i++) {
        arr[i]= sc.nextInt();
        
     }
     for (int i = 0; i < arr.length; i++) {
        if(x==arr[i]){
            System.out.println("element found");
            break;
        }
        else{
            System.out.println("Not found");
             break;
        }
    }

        
   } 
}
