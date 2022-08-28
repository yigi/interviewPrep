class Main {
    public static void main(String[] args) {
        int[] age = {12, 4, 5, 2, 5};
        System.out.println(largest_element(age));
    }

    public static int largest_element(int[] arr)
    {
        int largest = Integer.MIN_VALUE;

        for( int element : arr )
        {
            if(element > largest)
            {
                largest = element;
            }
        }
        return largest;
    }
   }