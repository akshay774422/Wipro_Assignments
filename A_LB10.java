import java.util.Arrays;

public class A_LB10 {
    public static void main(String[] args){
        int arr[] = {1,0,1,0,0,1,1};
        int arr1[] = new int[arr.length];
        int j =0;
        for (int i = 0; i < arr.length; i++) {
            if((arr[i] % 2) == 0){
                arr1[j] = arr[i];
                j++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if((arr[i] % 2) != 0){
                arr1[j] = arr[i];
                j++;
            }
        }
        System.out.println("O/P -->"+Arrays.toString(arr1));
    }
    
}
