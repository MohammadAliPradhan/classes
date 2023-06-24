import java.util.Scanner;

public class repeatingadjacent {
    public static String repeaingcopy(String str)
    {
        if(str.length()<2)
        {
            return str;
        }
        if(str.charAt(0)==str.charAt(1))
        {
            return repeaingcopy(str.substring(1));
        }
        else
        {
            return str.charAt(0)+repeaingcopy(str.substring(1));
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println(repeaingcopy(str));
    }
}
