import java.util.Scanner;

class countOdds {
    public static  int count(int low, int high) {
        return ((high-low)/2+((low%2!=0 || high%2!=0)?1:0));
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int low=sc.nextInt();
        int high=sc.nextInt();
        System.out.println("Answer is:  "+count(low,high));
        sc.close();
    }
}
