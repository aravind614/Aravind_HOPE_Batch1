public class _557 {
    public String reverse(String str){
        char[] c=str.toCharArray();
        int st=0;
        int end=str.length()-1;
        while(st<end){
            char temp=c[st];
            c[st]=c[end];
            c[end]=temp;
            st++;
            end--;
        }
        return new String(c);
    }
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        String[] sarr=s.split(" ");
        for(String strr:sarr){
            sb.append(reverse(strr)).append(" ");
        }
        return sb.toString().trim();
        
    }
}    

