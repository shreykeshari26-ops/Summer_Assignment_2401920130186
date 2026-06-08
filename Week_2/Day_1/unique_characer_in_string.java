package Day_1;
import java.util.*;
public class unique_characer_in_string{

    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character , Integer > mp = new HashMap<>();
        for (char ch : s.toCharArray()){
            if(!mp.containsKey(ch)){
                mp.put(ch, 1);
            }
            else{
                mp.put(ch,mp.get(ch)+1);

            }
        }
        for(char ch : t.toCharArray()){
            if(!mp.containsKey(ch)) return false;
            if(mp.containsKey(ch) ){
                mp.put(ch, mp.get(ch)-1);

            }
            if (mp.get(ch) < 0) return false;
        }

        return true;
    }
}

