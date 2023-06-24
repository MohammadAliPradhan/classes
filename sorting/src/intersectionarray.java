import java.util.Scanner;

public class intersectionarray {

    public  static void intersection(int[] arr, int[] brr, int m, int n)
    {
        int i=0, j=0;
        while(i<m && j<n)
        {
            if(i>0  && arr[i]==arr[i-1]){i++;continue;}
            if(arr[i]<brr[j]){i++;}
            else if(arr[i]>brr[j]){j++;}
            else{
                System.out.print(arr[i]+" ");
                i++;j++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();
        int[] arr = new int[m];
        int[] brr = new int[n];
        for(int i=0; i<m; i++)
        {
            arr[i]= sc.nextInt();

        }
        for(int i=0; i<n; i++)
        {
            brr[i]= sc.nextInt();
        }
        intersection(arr, brr,m,n);
    }

}
