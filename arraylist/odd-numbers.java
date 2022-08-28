import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> age = new ArrayList<>();
        age.add(5);
        age.add(4);
        age.add(5);
        age.add(3);
        age.add(2);
        System.out.println(odd_numbers(age));
    }

    public static long odd_numbers(ArrayList<Integer> arr)
    {
        return arr.stream()
        .filter(n -> n > 0)
        .filter(n -> n % 2  == 1).count();
    }
   }