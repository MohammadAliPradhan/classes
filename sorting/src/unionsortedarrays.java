import java.util.Scanner;

public class unionsortedarrays {
    public static void dosomething(int a[], int b[], int n, int m)
    {
        int i=0, j=0;
        while(i<m && j<n){
            if(a[i]<b[j]){System.out.print(a[i]+" ");i++;}
            else if(a[i]>b[j]){System.out.print(b[j]+" ");j++;}
            else{System.out.print(a[i]+" ");i++; j++;
        }
            while(i<m){if(i==0||a[i]!=a[i-1])System.out.print(a[i]+" ");i++;}
            while(j<n){if(j==0||b[j]!=b[j-1])System.out.print(b[j]+" ");j++;}
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int m=sc.nextInt();

        int a[]= new int[n];
        int b[]= new int[m];
        for(int i=0; i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        for(int j=0; j<m; j++)
        {
            b[j]= sc.nextInt();
        }
        dosomething(a, b, m, n);
    }
}
