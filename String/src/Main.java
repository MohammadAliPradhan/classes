import java.util.Scanner;

public class Main {
    public static boolean isPal(String str)
    {
        int begin=0;
        int end= str.length()-1;
        while(begin<end)
        {
            if(str.charAt(begin)!=str.charAt(end))
                return false;
            begin++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.next();

        if(isPal(str))
        {
            System.out.print("Palindrome");

        }
        else
        {
            System.out.print("Not Palindrome");
        }

    }
}