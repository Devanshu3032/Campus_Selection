public class MostWaterContain {
    static int Water(int[] height ){
        int left = 0 , right = height.length -1 ; 
        int maxx = 0 ; 
        while(left < right){
            int currMax = Math.min(height[left], height[right]) * (right -left ) ; 

            maxx = Math.max(maxx, currMax) ; 

            if(height[left] < height[right]){
                left ++ ; 
            }
            else{
                right -- ; 
            }
        }

        return maxx ; 
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,434,52,534,3} ; 
        Water(arr) ;
        System.out.println(Water(arr));

    }
}
