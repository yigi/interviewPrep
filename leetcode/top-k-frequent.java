package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Main {
    public static void main(String[] args) {
     
        int[] age = {12, 4, 3, 2, 5, 4, 4, 2, 5};
        System.out.println(topKFrequent(age, 2));
}

    public static int[] topKFrequent(int[] nums, int k) {
        int [] topK = new int[k];

        Map<Integer,Integer> map = new HashMap<>();
        for( int n : nums)
        {
            if(map.containsKey(n))
            {
                int value = map.get(n);
                map.put(n, value + 1);
            }
            else
            {
                map.put(n, 1);
            }
        }

       
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, Collections.reverseOrder());
    

        for (int i = 0; i < k; i++) 
            topK[i] = list.get(i);

        return topK;
    }
}   
        
