public class findingdigit {
    public static int digitaddition(int n){
        if(n==0){
            return 0;
        }
        return n%10+digitaddition(n/10);
    }
    public static void main(String[] args) {
        int n=525;
        digitaddition(n);
        int answer= digitaddition(n);
        System.out.print(answer);
    }
}
