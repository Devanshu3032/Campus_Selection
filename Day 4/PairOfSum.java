public class PairOfSum {
    static void Sum (int[] arr){
        int i = 0 , j = arr.length -1 ;
        int target = 66  ; 
        while(i < j) {
            if(arr[i] + arr[j ] == target) {
                System.out.println("Target matched at  index " + i + " "+ j);
                break ; 
            }
            else {
                i++; 
                j-- ; 
            }

        } 

        System.out.println("Not possible in this array " );
    }

    public static void main(String[] args) {
        int[] arr = {1,3,34,52,63,73} ;  /// this approach is only work in two sum if array is sorted 
        Sum(arr);
    }
}
