import java.util.Scanner;



public class BinarySearchPratice {
public static void main(String[] args) {
    int[] arr = {10 ,23,42,45,65,66} ;
    Scanner sc = new Scanner(System.in) ; 
    int l = 0  , h = arr.length -1 ;
    System.out.print("enter the target : ");
    int target = sc.nextInt() ; 
 
    boolean a = false ;  

    while (l <= h ){
        int mid =  l + (h-l) /2 ; 
        
         if( target == arr[mid] ){
            System.out.println("element found at : " + mid ) ;
            a = true ; 
            break ; 
         }
         else if( target > arr[mid ]){
            l = mid +1 ; 
         }
         else{
            h = mid -1 ; 
         }
    }
    if(a != true){
        System.out.println( "element not found ");
    } 

    sc.close(); 
  }
}
