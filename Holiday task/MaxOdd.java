import java.util.*;
class MaxOdd {
    public static  String maximumOddBinaryNumber(String s) {
        char [] c=s.toCharArray();
        Arrays.sort(c);
        
        int left = 0, right = c.length - 1;
        while (left < right) {
            char temp = c[left];
            c[left] = c[right];
            c[right] = temp;
            left++;
            right--;
        }

        for(int i=c.length-1;i>=0;i--){
            if(c[i]=='1'){
                char temp=c[i];
                c[i]=c[c.length-1];
                c[c.length-1]=temp;
                break;
            }
        }
        return new String(c);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("Answer is:  "+ maximumOddBinaryNumber(s));
        sc.close();
    }
}