import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        int[] age = {12, 4, 5, 2, 5, -1};
        System.out.println(odd_numbers(age));
    }

    public static long odd_numbers(int[] arr)
    {
        return IntStream.of(arr)
        .filter(n -> n > 0)
        .filter(n -> n % 2  == 1).count();
    }
   }