import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        int[] age = {12, 4, 5, 2, 5, -1};
        System.out.println(sum_of_elements(age));
    }

    public static long sum_of_elements(int[] arr)
    {
        return IntStream.of(arr).sum();
    }
   }