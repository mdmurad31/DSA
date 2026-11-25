package array;

public class productofarray {
    public static void main(String[] args) {
        int []arr= {20,34,30,40,50};
        for (int i = 0; i < arr.length; i++) {
            if(i%1 == 0){
                  arr[i] = arr[i]*arr[i];
            }
            System.out.print(arr[i]+"");
        }
    }
}
