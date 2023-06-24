import java.util.Scanner;

public class goodpairs {
    public static int countgoodpairs(String str)
    {
        if(str.length()<3)
        {
            return 0;
        }
        if(str.charAt(0)==str.charAt(2)) {
            return 1 + countgoodpairs(str.substring(1));
        }
        else {
            return countgoodpairs(str.substring(1));
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        System.out.println(countgoodpairs(str));
    }
}
