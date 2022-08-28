import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> age = new ArrayList<>();
        age.add(5);
        age.add(4);
        age.add(5);
        age.add(3);
        age.add(2);
        System.out.println(second_smallest_element(age));
    }

    public static int second_smallest_element(ArrayList<Integer> arr)
    {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int i = 0; i < arr.size(); i++)
        {
            if(arr.get(i)<first)
            {
                second = first;
                first = arr.get(i);
            }
            else if(arr.get(i)<second)
            {
                second = arr.get(i);
            }
        }
        return second;
    }
   }