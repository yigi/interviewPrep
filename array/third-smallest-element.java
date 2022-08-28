class Main {
    public static void main(String[] args) {
        int[] age = {12, 4, 5, 1, 4, 3, 2, 5};
        System.out.println(third_smallest_element(age));
    }

    public static int third_smallest_element(int[] arr)
    {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i]<first)
            {
                third = second;
                second = first;
                first = arr[i];
            }
            else if(arr[i] < second)
            {
                third = second;
                second = arr[i];
            }
            else if(arr[i] < third)
            {
                third = arr[i];
            }
        }
        return third;
    }
   }