
import java.util.HashMap;
class Solution {
    public static  int lengthOfLongestSubstring(String s) {
     HashMap<Character, Integer> hs = new HashMap<>();
     System.out.println(hs.get('a'));
     System.out.println(hs);
     int max_len=Integer.MIN_VALUE;   
     int low=0;
     int high=0;

     while(high<s.length())
     {
        char c=s.charAt(high);
        if(hs.containsKey(c))
        {
            hs.put(c,hs.get(c)+1);
        }
        else
        {
            hs.put(c,1);
        }
        
       while(hs.get(s.charAt(high))>1 && low<=high)
       {
         char lc=s.charAt(low);
         System.out.println("while -->hs : "+hs+" -->len : "+max_len );
         hs.put(lc,hs.get(lc)-1);
         low++;
       }
       int len=(high-low)+1;
       if(max_len<len)
       {
        max_len=len;
       }

       System.out.println("-->hs : "+hs+" -->len : "+max_len );
        high++;
     }
     


        return max_len;
    }

    public static void main(String args[])
    {
        String s="tmmzuxt";
        System.out.println(lengthOfLongestSubstring(s));
    }

    
}