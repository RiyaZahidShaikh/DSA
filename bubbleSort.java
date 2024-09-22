import java.util.*;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {9,5,25,53,1,-5};
        for(int i=0; i<arr.length; i++)
        {
            int left = 0;
            int right = 1;
            while(right < arr.length){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right++;
            }
        }
        System.out.print("Sorted array :"+ Arrays.toString(arr));
    }
}