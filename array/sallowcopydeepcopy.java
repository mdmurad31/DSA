package array;

public class sallowcopydeepcopy {
    public static void main(String[] args) {
        
    
    int[] arr = {10,34,234,21,32};
    int[]x = arr;   //x is shallow copy of arr

    x[0] = 100;
    System.out.println(arr[0]);

    

}
}
