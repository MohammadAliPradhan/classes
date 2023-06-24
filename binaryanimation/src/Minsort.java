import java.util.Scanner;

public class Minsort {
    public static void print(int arr[], int n)
    {
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void dosomething(int arr[], int n)
    {
        int min;
        for(int i=0; i<n; i++)
        {
             min=i;
            for(int j=i+1;j<n; j++)
            {
                if(arr[min]<arr[j])
                {
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0; i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        dosomething(arr,n);
        print(arr, n);
    }
}
