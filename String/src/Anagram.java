public class Anagram {
    public static boolean isAnagram(String a,String b)
    {
        final int CHAR=256;
        if(a.length()!=b.length())
        {
            return false;
        }
        int[] count= new int[CHAR];
        for(int i=0; i<a.length(); i++)
        {
            count[a.charAt(i)]++;
            count[b.charAt(i)]--;
        }
        for(int i=0; i<CHAR; i++)
        {
            if(count[i]!=0)
                return false;
        }
        return true;
    }
}

