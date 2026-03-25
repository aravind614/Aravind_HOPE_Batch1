
public class _344 {
    public void reverseString(char[] s) {
        char[]ans=new char[s.length];
        int k=0;
        for(int i=s.length-1;i>=0;i--){
            ans[k++]=s[i];
        }
        for(int i=0;i<s.length;i++){
            s[i]=ans[i];
        }
       // return s;
    }
}

