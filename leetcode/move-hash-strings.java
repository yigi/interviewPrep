package leetcode;


class Main {
    public static void main(String[] args) {
     
        String s1 = "XBOX#GAME#PASS";
        System.out.println(moveHash(s1));
}

    private static String moveHash(String s1) {
        
        StringBuilder sb = new StringBuilder("");
        String splitted [] = s1.split("\\#");
        String hash = "#";
        int hashCount = splitted.length - 1;

        sb.append(hash.repeat(hashCount));
        sb.append(s1.replaceAll("\\#", " "));
        
        return sb.toString();
    }

}