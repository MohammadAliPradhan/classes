import java.util.Arrays;
import java.util.Scanner;

public class leftmostbest {
    static final int CHAR=256;
    public static int leftMost(String str)
    {
        int[] findex= new int[CHAR];
        Arrays.fill(findex,-1);
        int res= Integer.MAX_VALUE;
        for(int i=0; i<str.length();i++)
        {
            int fi=findex[str.charAt(i)];
            if(fi==-1)
                findex[str.charAt(i)]=i;
            else
                res=Math.min(res, fi);
        }
        return(res==Integer.MAX_VALUE)?-1:res;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        System.out.print(leftMost(str));

    }
}
