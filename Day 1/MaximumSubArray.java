public class MaximumSubArray {
    public static void main(String[] args) {
         int[] arr = {1,2,3,-4,2,4} ; 
         int maxSum = Integer.MIN_VALUE ; 
         int currSum = 0 ; 

         for (int i = 0; i < arr.length; i++) 
          {

            for (int j = i+1; j < arr.length; j++) {
                currSum += arr[i] ; 
            if(currSum > maxSum ){
                maxSum = currSum ; 
            }
            }
            
         }
         System.out.println(maxSum);
    }
}
