import java.util.LinkedList;
import java.util.Queue;

public class string {


    public static boolean check_rotation(String s, String goal){
        if(s.length()!=goal.length()){
            return false;
        }
        Queue<Character>q1= new LinkedList<>();
        for(int i=0; i<s.length(); i++){
            q1.add(s.charAt(i));
        }
        Queue<Character>q2= new LinkedList<>();
        for(int i=0; i<goal.length();i++){
            q2.add(goal.charAt(i));
        }

        int k= goal.length();
        while(k>0){
            k--;
            char ch= q2.peek();
            q2.remove();
            q2.add(ch);
            if(q2.equals(q1)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str1= "AACD";
        String str2= "ACDA";

        if(check_rotation(str1,str2)){
            System.out.println("Strings are rotated");
        }
        else
            System.out.printf("Strings are not rotatable");
    }
}
