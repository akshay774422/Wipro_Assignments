public class A_LB8 {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,6,4,3,7,8,9};
        int sum = 0;
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 6){
                do{
                num += arr[i];
                i++;
                if(arr[i] == 7){
                    num += arr[i];
                    break;
                } 
                // else sum += 6;
                }while(true);
            }
        }
        // int res = sum - num;
        System.out.print("The SUM of elements is:"+(sum-num));
    }
    
}
