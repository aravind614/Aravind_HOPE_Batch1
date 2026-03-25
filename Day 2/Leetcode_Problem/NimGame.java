import java.util.*;
class NimGame {
    public static boolean canWinNim(int n) {
        if(n%4==0){
            return false;
        }
        else{
            return true;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(canWinNim(n));

    }
}