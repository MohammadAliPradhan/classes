
import java.util.Scanner;
public class spcaepattern2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

//Spaces will be n-1 and stars will be 1, 2 ,3 ,4 , 5
        for (int i = n; i >=1; i--) {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j);
            }

            System.out.println();
        }

    }
}