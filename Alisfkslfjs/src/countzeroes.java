public class countzeroes {
    public static void main(String[] args) {

    }
    static int count(int n){
        return helper(n,0);
    }

    private static int helper(int n, int c){
        if(n==0){
            return c;
        }
        int remainder= n%10;
        if(remainder==0){
            return helper(n/10,c+1);
        }
    }
}
