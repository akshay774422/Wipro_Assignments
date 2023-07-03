import java.util.Arrays;

class A_LB9{
    public static void main(String[] args){
        int arr[] = {1,99,10};
        int arr1[] = {0,0,0};
        int j = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == 10){
            }
            else{
            arr1[j] = arr[i];
            j++;
            }
        }
        System.out.println("O/P -->"+Arrays.toString(arr1));
    }
    }