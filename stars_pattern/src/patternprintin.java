import java.util.Scanner;

public class patternprintin {
    public static void printRevTriangle(int n){
        //equi triangle upar ka part
        for(int i=1;i<n ;i++){

            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                if(k==1 || k==2*i-1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    // equi triangle niche ka part
        for(int i=n;i>=1;i--){

            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                if(k==1 || k==2*i-1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printRevTriangle(n);
    }
}
