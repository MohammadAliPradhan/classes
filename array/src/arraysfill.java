import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int testcases= sc.nextInt();


        while(testcases>0)
        {
            int N=sc.nextInt();
            int count=0;
            int sount=0;


            for(int i=N-1; i>=2; i--)
            {
                for(int j=2; j<=i; j++ )
                {
                    if(i%j==0)
                    {
                        count++;
                    }
                    else
                    {
                        sount++;
                    }
                }
            }
            System.out.println(sount);
            testcases--;
        }

    }
}