/*
compare to another it's easy to understand
*/
public class LongestPalindromicSubstring  
 {  
    public static boolean isPalindrome(String s)   
      {  
        int i = 0;  
        int j = s.length() - 1;  
        while (i < j) {  
            if (s.charAt(i) != s.charAt(j))   
            {  
                return false;  
            }  
            i++;  
            j--;  
        }  
        return true;  
    }  
    public static String longestPalindromeNaive(String s)   
       {  
        int n = s.length();  
        String longestPalindrome = "";  
  
        // Generate all possible substrings and check if they are palindromes  
        for (int i = 0; i < n; i++)   
        {  
            for (int j = i; j < n; j++)  
            {  
                String substring = s.substring(i, j + 1);  
                if (isPalindrome(substring) && substring.length() > longestPalindrome.length())   
              {  
                    longestPalindrome = substring;  
                }  
            }  
        }  
        return longestPalindrome;  
    }  
    public static void main(String[] args)   
      {  
        String inputStr = "babad";  
        System.out.println(longestPalindromeNaive(inputStr));   
    }  
}
