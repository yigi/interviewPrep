import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] age = {12, 4, 5, 2, 5, -1};
        System.out.println(median_of_elements(age));
    }

    public static int median_of_elements(int[] arr)
    {
        Arrays.sort(arr);
        return arr.length % 2 == 0 ? arr[arr.length / 2] : arr[arr.length / 2] + arr[arr.length / 2 - 1] / 2;
    }
   }