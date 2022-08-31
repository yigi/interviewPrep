package leetcode;


class Main {
    public static void main(String[] args) {
     
        System.out.println(isArmstrong(153));
}

    private static boolean isArmstrong(int a) {

        int total = 0;
        int temp = a;
        int power =  Integer.toString(temp).length();

        while(temp > 0)
        {
            total += Math.pow((temp % 10) , power);
            temp /= 10;
           
        }

        return total == a;
    }

}