import java.util.LinkedList;

class Main {
    public static void main(String[] args) {
        LinkedList<Integer> age = new LinkedList<>();
        age.add(5);
        age.add(4);
        age.add(5);
        age.add(3);
        age.add(2);
        System.out.println(odd_numbers(age));
    }

    public static long odd_numbers(LinkedList<Integer> arr)
    {
        return arr.stream()
        .filter(n -> n > 0)
        .filter(n -> n % 2  == 1).count();
    }
   }