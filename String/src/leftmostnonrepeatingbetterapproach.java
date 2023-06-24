import java.util.*;
import java.lang.*;
public class leftmostnonrepeatingbetterapproach {
    static final int CHAR=256;
    public static int norep(String str)
    {
        int[] fi= new int[CHAR];
        Arrays.fill(fi,-1);

        for(int i=0; i<str.length();i++)
        {
            if(fi[str.charAt(i)]==-1)
                fi[str.charAt(i)]=i;
            else
                fi[str.charAt(i)]=-2;
        }
        int res= Integer.MAX_VALUE;
        for(int i=0; i<CHAR; i++) {
            if (fi[i] > 0)
                res = Math.min(res, fi[i]);
        }
        return (res==Integer.MAX_VALUE)?-1: res;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println(norep(str));

    }
}
