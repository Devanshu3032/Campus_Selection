public class SortChecking {
    static void sort(int[] arr , boolean a) {
        for(int i = 1 ; i < arr.length ; i++){
            int key = arr[i] ; 
            int j = i -1 ; 
            a = false ; 

            while (j >= 0 && key < arr[j]) {
                arr[j +1 ] = arr[j] ; 
                j-- ; 
                a = true ; 
            }

            arr[j+1] = key ; 
        }

        if(!a) System.out.println("Sorting not used");
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6} ; 
        sort(arr, false);
        
    }
}
