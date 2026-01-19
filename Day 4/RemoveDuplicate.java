public class RemoveDuplicate {
  
   static   int remove(int[] arr ){
    int i = 0;

    for(int j = 1; j < arr.length; j++){
        if(arr[j] != arr[i]){   //this is check if both element is unique or not 
            i++;
            arr[i] = arr[j];     // this is change the duplicate value with other uniuqe value 
        }
    }
      
    
    return i+1 ;   // this is give new length of array upto uniques values 
}

  public static void main(String[] args) {
    int[] arr = {1,2,3,3,3,4,5} ;
     int count = remove(arr) ;  // without object use , if you use directly use value in loop , it will give length of full array  
     System.out.println(count);
    
  

     for (int i = 0; i < count; i++) {
      System.out.println(arr[i]);  
     }


  }
}