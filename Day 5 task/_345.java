import java.util.*;
public class _345 {
    public String reverseVowels(String s){
        List<Character>vowel=new ArrayList<>();
        for(char c:s.toCharArray()){
            if("AEIOUaeiou".indexOf(c)!=-1){
                vowel.add(c);
            }
        }
        int i=0;
        Collections.reverse(vowel);
        StringBuilder res=new StringBuilder();
        for(char c:s.toCharArray()){
            if("AEIOUaeiou".indexOf(c)!=-1){
                res.append(vowel.get(i++));
            }
            else{
                res.append(c);
            }
           // return res.toString();
    }
    return res.toString();
    }
}

