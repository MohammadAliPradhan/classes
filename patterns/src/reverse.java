import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        int num = sc.nextInt();

        int firstTwoDigits = num / (int) Math.pow(10, Math.ceil(Math.log10(num)) - 2);

        int lastdigit=0;
        int reverse_ofa_number=0;

        for(int i=firstTwoDigits; i>0; i/=10)
        {
            lastdigit=i%10;
            reverse_ofa_number=reverse_ofa_number*10+lastdigit;
        }
        System.out.print(reverse_ofa_number);
    }
}