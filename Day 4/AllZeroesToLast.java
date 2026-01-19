public class AllZeroesToLast {
    static void zero(int[] arr ){
        int i = 0 ; 
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != 0 ){             // this will check it value is zero or not  if yes then swap with non-zero number 
                int temp = arr[i] ;                    
                arr[i] = arr[j] ; 
                arr[j] = temp ; 
                i++ ;                     // one done that index is done , move to next index 
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,0,0,3,2} ; 
        zero(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]  );
        }
    }
}
