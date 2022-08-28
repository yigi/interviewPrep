import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
     
        int[] ageInteger = {1,3,3,5};
        String[] ageString = {"a","b","c"};
        
        /**
         * HOW TO convert int ARRAY to SET
        */
        Set<Integer> intSet = Arrays.stream(ageInteger).boxed().collect(Collectors.toSet());
        

        /**
         * HOW TO convert String ARRAY to SET
        */
        Set<String> stringSetSet = new HashSet<String>();
        Collections.addAll(stringSetSet, ageString);


        /**
         * HOW TO convert Integer ARRAY to MAP
        */
        Map<Integer, Integer> intMap =
              IntStream.range(0, ageInteger.length)
             .boxed()
             .collect(Collectors.toMap(i -> ageInteger[i], i -> i + 1, Integer::sum));
        
        intMap.entrySet().stream().forEach(e-> System.out.println(e));

        
        /**
         * HOW TO convert String ARRAY to MAP
        */
        Map<String, Integer> stringMap =
              IntStream.range(0, ageString.length)
             .boxed()
             .collect(Collectors.toMap(i -> ageString[i], i -> i + 1, Integer::sum));
        
        stringMap.entrySet().stream().forEach(e-> System.out.println(e));

        

    }
}