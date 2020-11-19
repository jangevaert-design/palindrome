public class Palindrome {

  public static void main(String[] args) {
    System.out.println("is aaa a palindome?: " + isPalindromeString("aaa"));
    System.out.println("is abc a palindome?: " + isPalindromeString("abc"));
    System.out.println("is bbb a palindome?: " + isPalindromeString("bbb"));
    System.out.println("is defg a palindome?: " + isPalindromeString("defg"));
    System.out.println("is aaa a palindome?: " + isPalindrome("aaa"));
    System.out.println("is abc a palindome?: " + isPalindrome("abc"));
    System.out.println("is bbb a palindome?: " + isPalindrome("bbb"));
    System.out.println("is defg a palindome?: " + isPalindrome("defg"));

  }

  //using recursion
  public static boolean isPalindromeString(String text) {
    String reverse = reverse(text);
    if (text.equals(reverse)) {
      return true;
    }
    return false;
  }

  public static String reverse(String input) {
    if (input == null || input.isEmpty()) {
      return input;
    }
    return input.charAt(input.length() - 1) + reverse(input.substring(0, input.length() - 1));
  }


  //using StringBuffer and for loop
  public static boolean isPalindrome(String word) {
    if (word == null || word.isEmpty()) {
      return true;
    }
    char[] array = word.toCharArray();
    StringBuilder sb = new StringBuilder(word.length());
    for (int i = word.length() - 1; i >= 0; i--) {
      sb.append(array[i]);

      String reverseOfString = sb.toString();
      if (word.equals(reverseOfString)) {
        return true;
      }

    }
    return false;
  }

}