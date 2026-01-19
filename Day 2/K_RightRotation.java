import java.util.Scanner ;
public class K_RightRotation {

    static void rev(int[] arr , int l , int h ) {
        while (l< h) {
            int temp = arr[l] ;
            arr[l] = arr[h] ;
            arr[h] = temp ;
            l++ ; 
            h-- ; 
        }

        
    }
    
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in) ;
        int[] arr = {1,2,3,4,5} ; 
        int n = arr.length ; 
        int k = sc.nextInt() ; 
        k = k% n ; 

        rev(arr, 0, n-1);
        rev(arr, 0, k-1);
        rev(arr, k, n-1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
