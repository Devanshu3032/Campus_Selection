public class SelectionSort {
     static void sort(int[] arr) {
        for (int i = 0; i < arr.length -1; i++) {
            int minEle = i ; 

            for (int j = i+1 ; j < arr.length; j++) {
                if(arr[j] < arr[minEle]){
                    minEle = j ; 
                }

            }

            int temp = arr[i] ; 
            arr[i] = arr[minEle] ; 
            arr[minEle] = temp ; 
        }
     }
     

     public static void main(String[] args) {
        int[] arr = {3,2,4,56,6,3,7} ; 
        sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
     }
}
