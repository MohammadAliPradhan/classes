import java.util.*;
import java.lang.*;

public class leftmostnonrepeatingcharacter {
    static final int CHAR=256;
    public static int nonrep(String str)
    {
        int[]count= new int[CHAR];
        for( int i=0; i<str.length();i++)
        {
            count[str.charAt(i)]++;
        }
        for(int i=0; i<str.length(); i++)
        {
            if(count[str.charAt(i)]==1)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.next();
        System.out.println(nonrep(str));
    }
}
