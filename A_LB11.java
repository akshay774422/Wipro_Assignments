public class A_LB11 {
    public static void main(String[] args){
        
        int arr[] = {1,4,5,1,4};
        System.out.println(only14(arr));
    }
    public static boolean only14(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1 || arr[i] == 4){
            }
            else
            return false;
        }
    return true;
    }
    

}
