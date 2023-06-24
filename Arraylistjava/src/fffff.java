import java.io.*;

import java.util.*;

class Main {

    public static void main (String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String str = br.readLine();

        int p = Integer.parseInt(br.readLine());

        System.out.print(getCount(n, str, p));

    }

    static int getCount(int n, String str, int p){

        int count = 0;

        int[] arr = new int[p];

        arr[0] = 1;

        int curr = 0;

        int mul = 1;

        int num = 0;

        if(p == 2 || p == 5){

            for(int i=n-1; i>=0; i--){

                if(Character.getNumericValue(str.charAt(i))%p == 0){

                    count+=i+1;

                }

            }

            return count;

        }

        for(int i=n-1; i>=0; i--){

            int dig = str.charAt(i)-'0';

            dig*=mul;

            dig%=p;

            curr += dig;

            curr %= p;

            count += arr[curr];

            arr[curr]++;

            mul *= 10;

            mul %= p;

        }

        return count;

    }

}