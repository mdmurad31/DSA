import java.util.Scanner;

public class printnegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a array size ");
        int n = sc.nextInt();
        int[] arr= new int[n];
        System.out.print("enter a element");
        for(int i = 0 ;i<n;i++)
            arr[i]= sc.nextInt();

        // printing negative valuee

        for (int i=0; i<n;i++)
            if(arr[i]<0)
                System.out.print(arr[i]+" ");



    }
}
    
