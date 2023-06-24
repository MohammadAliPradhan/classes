import java.util.Scanner;

public class insertionsortarra {
    public static void printArray(int arr[], int n)
    {
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void dosometing(int arr[], int n){
        for(int i=1; i<n; i++)
        {
            int j= i-1;
            while ((j>=0) && (arr[j]<arr[j+1]))
            {
                int temp=arr[j]; // swap
                arr[j]=arr[j+1];
                arr[j+1]=temp;

                j--;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int []brr= new int[n];
        for(int i=0; i<n; i++)
        {
            brr[i]= sc.nextInt();
        }
        dosometing(brr, n);
        printArray(brr, n);
    }
}
