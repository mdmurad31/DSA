package array;

public class hwshort {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        for (int i = 0; i < arr.length; i++) {
            if(i%2 !=0){ 
                arr[i] =arr[i]*2;
            }else{
                 arr[i]= arr[i]*10;
            }
            System.out.println(arr[i]+" ");
            
        }
    }
}
