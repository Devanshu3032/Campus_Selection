public class LeftRotationBy1 {
    public static void main(String[] args) {
        int[] arr = {2,3,45,67,4,67,23,3} ;
       int temp = arr[0] ; 
       for (int i = 0; i < arr.length - 1 ; i++) {
         arr[i] = arr[i+1 ] ; 
       }
       arr[arr.length -1 ] = temp ; 
    }
}
