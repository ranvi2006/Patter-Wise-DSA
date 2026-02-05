import java.util.HashMap;
class Solution {
    public static int totalFruit(int[] fruits) {
        HashMap<Integer,Integer>hs=new HashMap<>();
        int tree=0;
        int low=0;
        int high=0;
        while(high<fruits.length)
        { //1,2,2}
            if(!hs.containsKey(fruits[high]))
            {
                hs.put(fruits[high],1);
            }
            else
            {
               hs.put(fruits[high],hs.get(fruits[high])+1); 
            }

            while(hs.size()>2 && low<=high)
            {
                hs.put(fruits[low],hs.get(fruits[low])-1);
                if(hs.get(fruits[low])==0)
                {
                    hs.remove(fruits[low]);
                }
                low++;
            }

            int dif=(high-low)+1;
            if(tree<dif)
            {
                tree=dif;
            }
            // System.out.println("tree : "+tree +" hs :"+hs);
            high++;
        }
        return tree;
    }

    public static void main(String args[])
    {
        int fruit[]={0,1,2,2,1,1,2,2,1};
        System.out.println("you can pic from "+totalFruit(fruit)+" tree");
    }
}