public class A_LB13 {
    public static void main(String[] args){
        int [][]arr = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = Integer.parseInt(args[(2*i)+j]);
            }
        }
        System.out.println("The Given Array is:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("The reverse of the Array is:");
        for (int i = 1; i >= 0; i--) {
            for (int j = 1; j >= 0; j--) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
    
}
