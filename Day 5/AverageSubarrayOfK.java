public class AverageSubarrayOfK {
    public static void main(String[] args) {
        int[] arr  = {2,1,5,1,3} ; 
        int CurrSum = 0 ; 
        int MaxSum = 0 ; 
        int k = 3 ; 
        for (int i = 0; i < k; i++) {
            CurrSum += arr[i] ; 
        }

        MaxSum = CurrSum ; 

        for (int i = k; i < arr.length; i++) {
            CurrSum += arr[i] ; 
            CurrSum -= arr[i-k] ; 
            MaxSum = Math.max(MaxSum, CurrSum) ;
        }
        MaxSum = MaxSum /k  ;
        

        System.out.println(MaxSum);
    } 
}
