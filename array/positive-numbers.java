import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        int[] age = {12, 4, 5, 2, 5, -1};
        System.out.println(positive_numbers(age));
        System.out.println(positive_numbers_stream(age));
    }

    public static int positive_numbers(int[] arr)
    {
        int count = 0;
        for( int element : arr )
        {
            if(element>0)
            {
                count++;
            }
        }
        return count;
    }

    public static long positive_numbers_stream(int[] arr)
    {
        return IntStream.of(arr)
        .filter(n -> n > 0).count();
    }
   }