import java.util.*;   
class PalindromeExample2  
{  
   public static void main(String args[])  
   {  
      String o, r=""; 
      Scanner s = new Scanner(System.in);   
      System.out.println("Enter a string/number to check if it is a palindrome");  
      o= s.nextLine();   
      int l = o.length();   
      for ( int i = l- 1; i >= 0; i-- )  
         r = r + o.charAt(i);  
      if (o.equals(r))  
         System.out.println("Entered string/number is a palindrome.");  
      else  
         System.out.println("Entered string/number isn't a palindrome.");   
   }  
}  
