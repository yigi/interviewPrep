import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
     
        ArrayList<Integer> age = new ArrayList<>();
        age.add(5);
        age.add(4);
        age.add(5);
        age.add(3);
        age.add(2);
        System.out.println(largest_element(age));
}
  
   public static int largest_element(ArrayList<Integer> arr)
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