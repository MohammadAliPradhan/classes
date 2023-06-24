import java.util.Scanner;

public class leftmostbest2 {
    static final int CHAR=256;
    public static int leftMost1(String str)
    {
        boolean [] visited= new boolean[CHAR];
        int res=-1;
        for(int i=str.length()-1; i>=0; i--)
        {
            if(visited[str.charAt(i)])
            {
                res=i;
            }
            else{
                visited[str.charAt(i)]=true;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        System.out.print(leftMost1(str));

    }
}
