public class TotalOccurance {
    public static void main(String[] args) {
        int[] a = {10 ,23,34,34,34,34,45,67} ; 
        int target = 34 ;
        int Fa = 0 , La = 0 ;  
        int l = 0 , h = a.length -1 ; 
        while (l<= h ) {
            int mid = l + (h-l) / 2 ; 

            if(target == a[mid]){
                Fa = mid ; 
                h = mid -1 ; 
            }
            else if (target > a[mid ]) {
                l = mid +1 ; 

            }
            else {
                h = mid -1 ; 
            }

            
        }
        int l2 = 0 , h2 = a.length -1;
            while (l2 <= h2) {
                int mid = l2 + (h2-l2) / 2 ; 

            if(target == a[mid]){
                La = mid ; 
                l2 = mid + 1 ; 
            }
            else if (target > a[mid ]) {
                l2 = mid +1 ; 

            }
            else {
                h2 = mid -1 ; 
            }
            }
            int total = La - Fa +1  ; 
            System.out.println(total);
    }
}
