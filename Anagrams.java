import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length()!=b.length()){
            return false;
        }
        char[] array = a.toLowerCase().toCharArray();
        char[] array1 = b.toLowerCase().toCharArray();
        java.util.Arrays.sort(array);
        java.util.Arrays.sort(array1);
        return java.util.Arrays.equals(array, array1);
    }



    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
