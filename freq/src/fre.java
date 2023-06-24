import java.util.Scanner;

public class fre {
    public static void dosomething(int arr[], int n){
        final int freq=10;

        int count []= new int[freq];
        for(int i=0; i<n; i++){
            count[arr[i]]++;
        }
        for(int i=0; i<n;i++){
            if(count[arr[i]]%2!=0)
            {
                System.out.print(arr[i]);   //jahape element nikalna hai waha apan ye use kar
                return;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        dosomething(arr, n);
    }
}
