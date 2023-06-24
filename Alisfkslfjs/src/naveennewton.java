

import java.util.HashMap;
import java.util.Scanner;

public class naveennewton {
    public static long countSum(long arr[], long n, long k){
        HashMap<Long, Long>hm = new HashMap<>();
        long count=0;
        long sum=0;
        hm.put(0L,1L);
        for(int i=0; i<n; i++){
            sum=sum+arr[i];
            if(!hm.containsKey(sum-k)){
                count=count+hm.get(sum-k);
            }
            if(!hm.containsKey(sum)){
                hm.put(sum,1L);
            }
            else{
                hm.put(sum, (hm.get(sum)+1));
            }
        }
        return count;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        long k=sc.nextLong();
        long arr[]=new long[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextLong();
        }
        System.out.println(countSum(arr, n, k));
    }
}