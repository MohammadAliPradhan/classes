import java.util.Arrays;

class Solution {
    // Function to count the number of anagram groups
    public static int anagramgroups(String[] arr, int n) {
        final int CHAR = 256;
        int[] countArray = new int[CHAR];
        int anagramGroups = 0;

        for (int i = 0; i < n; i++) {
            String word = arr[i];
            int[] wordCount = helping(word);
            String wordSignature = Arrays.toString(wordCount);

            // Increase the count of anagram groups if the same signature already exists
            if (countArray[wordSignature.hashCode()] > 0) {
                anagramGroups += countArray[wordSignature.hashCode()];
            }

            // Increment the count for the current word signature
            countArray[wordSignature.hashCode()]++;
        }

        return anagramGroups;
    }

    // Function to calculate the frequency count of characters in a string
    public static int[] helping(String str) {
        int freq = 256;
        int[] count = new int[freq];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        return count;
    }

    // Main method for testing
    public static void main(String[] args) {
        int n = 5;
        String[] arr = {"act", "god", "cat", "dog", "tac"};
        int anagramGroups = anagramgroups(arr, n);
        System.out.println("Number of anagram groups: " + anagramGroups);
    }
}
