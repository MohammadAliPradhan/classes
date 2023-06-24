import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.lang.*;

public class leftmostoccurance {
    public static int lost(String str)
    {
        for(int i=0; i<str.length();i++)
        {
            for(int j=i+1; j<str.length();j++) {
                if (str.charAt(i) == str.charAt(j))
                    return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.next();
        System.out.print(lost(str));

    }
}
