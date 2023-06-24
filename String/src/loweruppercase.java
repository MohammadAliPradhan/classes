import java.util.*;

public class loweruppercase {
    public static String caseSort(String str, int n) {
        int[] lower = new int[26];
        int[] upper = new int[26];

        // Count the frequency of lowercase and uppercase letters
        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                lower[c - 'a']++;
            } else {
                upper[c - 'A']++;
            }
        }

        // Build sorted string with same case
        char[] sorted = new char[n];
        int i = 0, j = 0;
        for (int k = 0; k < n; k++) {
            char c = str.charAt(k);
            if (c >= 'a' && c <= 'z') {
                while (lower[i] == 0) {
                    i++;
                }
                lower[i]--;
                sorted[k] = (char) ('a' + i);
            } else {
                while (upper[j] == 0) {
                    j++;
                }
                upper[j]--;
                sorted[k] = (char) ('A' + j);
            }
        }

        return new String(sorted);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        int n=sc.nextInt();
        System.out.print(caseSort(str,n));
    }
}
