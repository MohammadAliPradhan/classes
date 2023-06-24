import java.util.Scanner;

public class bubbleanimatoin {
    public static void printArray(int arr[], int n)
    {
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void dosomething(int arr[], int n)
    {
        for(int i=n; i>=1; i--)
        {
            for(int j=0; j<i-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp=arr[j]; // swap
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr= new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i]= sc.nextInt();
        }
        dosomething( arr,  n);
        printArray(arr,n);

    }

}
