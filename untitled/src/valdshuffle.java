import java.util.Scanner;



public class valdshuffle {
    public  static boolean shuffled(String str1, String pattern){
        final int sizee=1000;
        if(str1.length()!=pattern.length()){
            return false;
        }
        int count[]= new int[sizee];

        for(int i=0; i<str1.length(); i++){
            count[str1.charAt(i)]++;
        }
        for(int k=0; k<pattern.length(); k++) {
           if(count[pattern.charAt(k)]>0){
               count[pattern.charAt(k)]--;
           }
           else return false;
        }

        return true;


    }
    public static void main(String[] args) {
        Scanner sc= new Scanner((System.in));
        String str1= sc.next();
        String pattern=sc.next();

        if(shuffled(str1, pattern)){
            System.out.printf("Yes");
        }
        else {
            System.out.printf("No");
        }
    }
}
