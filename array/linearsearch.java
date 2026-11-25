package array;

public class linearsearch {
    public static void main(String[] args) {
        int[]  arr= {34,44,2,3,45,243,56};
        int target = 56;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                found = true;
                break;
            }
        }
        if(found)
            System.out.println("target exist");
        else
            System.out.println("dont exist");
    }
}
