import java.util.Scanner;

public class recursionbinarysearch {
    public static int dorecursion(int n){
        if(n<2){
            return n;
        }

        return dorecursion(n-1)+ dorecursion(n-2);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(dorecursion( n));
    }

}
