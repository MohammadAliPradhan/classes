import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{

    public static void main(String args[]) {
        int N=5;

      for(int i=N; i>=1;i--)
      {
          for(int j=1; j<i-1;j++)
          {
              System.out.print(" ");
          }
          System.out.println();
          for(int j= 1; j<i; j++)
          {
              System.out.print("*");
          }

      }



    }
}