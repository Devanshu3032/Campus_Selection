public class EvenOddSorting {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,32,4,2} ; 

         for(int i = 0 ; i < arr.length -1 ; i++  ){
           int minEle = i ; 

            for(int j = i + 1 ; j < arr.length  ; j++){
                if(arr[j] < arr[minEle] && arr[j] %2 == 0){
                    minEle = j ; 
                }
            }

            int temp = arr[i] ; 
            arr[i] = arr[minEle] ; 
            arr[minEle] = temp ; 
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
