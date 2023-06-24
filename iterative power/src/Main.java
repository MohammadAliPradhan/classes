import java.util.Scanner;

public class Main {


    public static int power(int x, int y)
    {
        int res=1;   // Result is assigned with 1

        while(y>0)   // y is the exponent until it reaches zero while loop will work
        {
            if (y%2!=0)  /

                res= res*x; //res is 1 in 1st iteration it will be 1*5;
                x=x*x;      //if  x is 5 so it will be 5*5;
                y/=2;       //y can be anything like exponent whihch will update everytime by dividiing it by 2

        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();

        System.out.println("Power is "+power(x,y));
    }
}