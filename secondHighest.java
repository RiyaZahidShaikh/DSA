import java.util.*;

public class secondHighest {
    public static void main(String[] args) {
        int[] arr = {9,5,25,53,1,-5};
        Arrays.sort(arr);
        System.out.print("Second Highest :"+ arr[arr.length-2]);
    }
}