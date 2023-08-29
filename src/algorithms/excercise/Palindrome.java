package algorithms.excercise;

public class Palindrome {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if(s.isEmpty()){
            return true;
        }
        char[] chars = s.toCharArray();
        for (int i = 0; i <= chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - (i + 1)])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        System.out.println(p.isPalindrome("A man, a plan, a canal: Panama"));
    }

}
