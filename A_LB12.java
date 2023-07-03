import java.util.Arrays;

public class A_LB12 {
    public static void main(String[] args){
        int arr1[] = {1,2,3};
        int arr2[] = {4,5,6};
        middleWay(arr1,arr2);
    }
    public static void middleWay(int [] arr1, int [] arr2){
        int arr[] = new int[2];
        arr[0] = arr1[arr1.length / 2];
        arr[1] = arr2[arr2.length / 2];
        System.out.println("O/P -->"+Arrays.toString(arr));
    }
    
}
