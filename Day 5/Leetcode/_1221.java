public class _1221 {
    public int balancedStringSplit(String s) {
        int count=0;
        int res=0;
        for(char sr:s.toCharArray()){
            if(sr=='R'){
                count++;
            }else{
                count--;
            }
            if(count==0){
                res++;
            }
        }
        return res;
    }
}

