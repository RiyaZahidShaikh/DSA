import java.util.*;
class reverse {
    public static void main(String[] args) {
        int[] arr = {123, 34, 554, 22243, 5};
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.print("Reversed array :"+ Arrays.toString(arr));
    }
}