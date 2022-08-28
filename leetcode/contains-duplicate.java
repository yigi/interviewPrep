package leetcode;

import java.util.HashSet;
import java.util.Set;

class Main {
    public static void main(String[] args) {
     
        int[] age = {12, 4, 3, 2, 5};
        System.out.println(contains_duplicate(age));
}

    private static boolean contains_duplicate(int[] age) {
        Set<Integer> ageSet = new HashSet<>();
        for(Integer i : age)
        {
            if(ageSet.contains(i))
            {
                return true;
            }
            ageSet.add(i);
        }
        return false;
    }
  

}