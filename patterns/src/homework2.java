public class homework2 {
    public static void main(String[] args)
    {
        int n=5;
        for(int i=1; i<=n; i++)
        {
            for(int s=1; s<=n-i; s++)
            {
                System.out.print(" ");
            }
            for(int samenumber=1;samenumber<=2*i-1; samenumber++ )
            {
                System.out.print(i);
            }

            System.out.println();

        }
    }
}
