import java.util.Scanner;

public class binaryrecursion {
    public static int search(int []arr, int target, int s, int e ){
        if (s > e) {
            return -1;
        }
        int m= s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(target<arr[m]){
            return search(arr, target, s, m-1);
        }
        return search(arr, target, m+1,e);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int []arr= new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int start=0;
        int target= sc.nextInt();


        System.out.println(search(arr, target, start,n ));

    }
}
