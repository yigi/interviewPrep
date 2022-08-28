class Main {
    public static void main(String[] args) {
        int[] age = {12, 4, 3, 7, 1, 4, 5, 2, 5};
        System.out.println(second_smallest_element(age));
    }

    public static int second_smallest_element(int[] arr)
    {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i]<first)
            {
                second = first;
                first = arr[i];
            }

            else if(arr[i]<second)
            {
                second = arr[i];
            }
        }
        return second;
    }
   }