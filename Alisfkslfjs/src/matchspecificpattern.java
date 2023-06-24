import java.util.ArrayList;
import java.util.Scanner;

public class matchspecificpattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner((System.in));
        int n= sc.nextInt();
        ArrayList<String> s= new ArrayList<>();
        for(int i=0; i< n; i++){
            s.add(sc.next());
        }

        for(int i=0; i<n; i++){
            System.out.print(s.get(i));
        }
    }
}
