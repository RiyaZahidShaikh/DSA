import java.util.*;
class patternBoorder {
    public static void main(String[] args) {
        System.out.print("Enter n :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 || i == (n-1)){
                    System.out.print("*");
                }
                else{
                    if(j == 0 || j == (n-1)){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}