public class product {
    public static void main(String[] args) {
        int[] arr = {4,5,12,45,5,7};
         int sum =1;
         for (int i = 0; i < arr.length; i++) {
              sum *=arr[i];
         }
         System.out.println(sum);
    }
}
