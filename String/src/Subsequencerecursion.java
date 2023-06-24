import java.util.Scanner;

public class Subsequencerecursion {
    public static boolean subqr(String str1, String str2, int n, int m )
    {
        if(m==0)
            return true;
        if(n==0)
            return false;
        if(str1.charAt(n-1)==str2.charAt(m-1))
            return subqr(str1, str2, n-1, m-1);
        else
            return subqr(str1, str2, n-1, m);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n,m;
        n=sc.nextInt();
        m=sc.nextInt();

        String s1, s2;
        s1=sc.next();
        s2=sc.next();

        System.out.println(subqr(s1, s2, n, m));
    }
}
