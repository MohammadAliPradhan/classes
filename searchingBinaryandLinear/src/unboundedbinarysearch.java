import java.util.*;
import java.io.*;
import java.lang.*;


public class unboundedbinarysearch {
    public static int search(int arr[], int x)
    {
        int i=0;

        while(true){
            if(arr[i]==x)
            {return i;}
            if(arr[i]>x)
            {return -1;}
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int arr[]= {1,2,3,4,5};
        int x=sc.nextInt();
        System.out.println(search(arr,x));
    }
}
