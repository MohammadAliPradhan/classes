import java.io.*;
import java.util.*;
public class subarrayswithsum {
    public static long numberOfSaWithoddSum1(int arr[], int n)
    {
        long even=1;
        long odd=0;

        long[]ps= new long[n];
        ps[0]= arr[0];
        if(ps[0]%2==0){
            even++;
        }
        else{
            odd++;
        }
        for(int i=1;i<n;i++){
            ps[i] = ps[i-1]+arr[i];
            if(ps[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        return even*odd;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println(numberOfSaWithoddSum1(arr, n));
    }
}
