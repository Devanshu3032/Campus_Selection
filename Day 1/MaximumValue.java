import java.util.Scanner;

public class MaximumValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        int max =Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max= arr[i];
            }
        }
        System.out.println(max);
    }
}
