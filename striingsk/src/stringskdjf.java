public class stringskdjf {
    public static void main(String[] args) {
        int n= 3;
        String str[]= {"life", "life", "lifesgood"};
        for(int i=0; i<3; i++){
            if(str[i]== str[i+1]){
                System.out.print(1);
                return;
            }
            else break;
        }
        System.out.print(-1);
    }
}
