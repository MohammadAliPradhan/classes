import java.util.Scanner;

public class recursionlargest {
    public static int  dosomething(int []arr, int n, int i) {

        if (i == n - 1) {
            return arr[i];
        }
        int max = dosomething(arr, n, i + 1);
        if (arr[i] > max) {
            return arr[i];
        } else {
            return max;
        }
    }




    public static void main(String[] args) {
        Scanner sc= new Scanner((System.in));

        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0; i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        int i=0;
        System.out.print(dosomething(arr, n, i));



    }
}
