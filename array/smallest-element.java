class Main {
    public static void main(String[] args) {
        int[] age = {12, 4, 5, 2, 5};
        System.out.println(smallest_element(age));
    }

    public static int smallest_element(int[] arr)
    {
        int smallest = arr[0];
        for( int element : arr )
        {
            if(element < smallest)
            {
                smallest = element;
            }
        }
        return smallest;
    }
   }