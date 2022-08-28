class Main {
    public static void main(String[] args) {
     
        int[] age = {1,3,4};
        System.out.println(missing_number(age));
}

    public static int missing_number(int[] age)
    {
        int missing_number = 0;
        int actual_sum = ( ( age.length + 1 ) * ( age.length + 2 ) ) / 2;
        for(int i : age)
            missing_number += i;
        return actual_sum - missing_number;
    }
   }