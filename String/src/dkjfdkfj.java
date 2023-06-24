public class dkjfdkfj {
    public static int repeatedCharacter(String S)
    {
        int[] frequency = new int[256];

        // Iterate through the string and count the frequency of each character
        for (int i = 0; i < S.length(); i++)
        {
            char currentChar = S.charAt(i);
            frequency[currentChar]++;
        }

        // Iterate through the string again and find the leftmost repeated character
        for (int i = 0; i < S.length(); i++)
        {
            char currentChar = S.charAt(i);
            if (frequency[currentChar] > 1)
            {
                return i;
            }
        }

        // If no character is repeated, return -1
        return -1;
    }

    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        int index1 = repeatedCharacter(s1);
        if (index1 == -1) {
            System.out.println("No character is repeated in the string.");
        } else {
            System.out.println("The leftmost repeated character in the string is " + s1.charAt(index1) + " at index " + index1);
        }

        String s2 = "abcd";
        int index2 = repeatedCharacter(s2);
        if (index2 == -1) {
            System.out.println("No character is repeated in the string.");
        } else {
            System.out.println("The leftmost repeated character in the string is " + s2.charAt(index2) + " at index " + index2);
        }
    }

}
