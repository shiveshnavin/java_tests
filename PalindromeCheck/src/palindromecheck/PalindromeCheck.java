/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromecheck;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author shivesh
 */
public class PalindromeCheck {

    private boolean checkPalindrome(String str)
    {
        boolean isPalindrome=true;
        
        char x []=str.toCharArray();
        int len=str.length();
        for(int i=0;i<len;i++)
        {
            isPalindrome=isPalindrome&&(x[i]==x[len-1-i]);
        }
        
        
        
        return isPalindrome;
    }
    private ArrayList<String> getPalindromes(ArrayList<String> list)
    {
        ArrayList<String> listOfPalindromes=new ArrayList<>();
        
        for(String str:list)
        {
            //System.out.println(str+" Palindrome Check : "+checkPalindrome(str));
            if(checkPalindrome(str))
            {
                listOfPalindromes.add(str);
            }
        }
        
        
        return listOfPalindromes;
    }
    
    private ArrayList<String> getSubStrings(String str)
    {
        ArrayList<String> list=new ArrayList<>();
        
        for(int len=3;len<=str.length();len++)
        {
            for(int index=0;index<=(str.length()-len);index++)
            {
                
                
                String subStr=str.substring(index, index+len);
                //System.out.println("Substring : "+subStr);
                list.add(subStr);
                
                
            }
            
        }
        
        return list;
    }
    
    public PalindromeCheck(String toCheck )
    { 
         
       ArrayList<String> listOfPalindromes=getPalindromes(getSubStrings(toCheck));
       String largestPalindrome=""; 
       for(String palindrome:listOfPalindromes)
        {
           //System.out.println("Found Palindrome : "+palindrome);
           if(palindrome.length()>largestPalindrome.length())
           {
               largestPalindrome=palindrome;
           }
          
        }
       
       System.out.println("Largest Palindrome : "+largestPalindrome);
       
       
    }
   
    
    public static void main(String[] args) {
        // TODO code application logic here
       
       System.out.println("Start");
       Scanner scan=new Scanner(System.in);
       String toCheck=scan.nextLine();
         
       
       PalindromeCheck palCheck=new PalindromeCheck(toCheck);
      
        
    }
    
}
