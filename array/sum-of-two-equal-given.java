import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
     
        int[] age = {1,3,3,5};
        System.out.println(sum_of_two_equal_given(age,5));
}

    public static boolean sum_of_two_equal_given(int[] age, int given)
    {
        Set<Integer> arraySet = Arrays.stream(age).boxed().collect(Collectors.toSet());
        for( int i : arraySet )
        {
            return arraySet.contains(given - i);
        }
        return false;
    }
   }