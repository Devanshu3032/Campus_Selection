public class LastOccurance {
    public static void main(String[] args) {
        int[] arr = {10,23,23,23,45,566} ; 
        int target = 23 ; 
        int Locc = -1 ; 
        int l = 0 , h = arr.length -1 ; 
        while (l<= h) {
            int mid = l + (h-l) / 2 ; 

            if(target == arr[mid]){
                Locc = mid ; 
                l = mid + 1 ; 
            }
            else if( target > arr[mid]){
                l = mid +1 ; 

            }
            else {
                h = mid -1 ; 
            }
        }

        System.out.println(Locc);
    }
}
