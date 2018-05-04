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

    
    private ArrayList<String> getSubStrings(String str)
    {
        ArrayList<String> list=new ArrayList<>();
        
        for(int len=3;len<=str.length();len++)
        {
            for(int index=0;index<=(str.length()-len);index++)
            {
                
                
                String subStr=str.substring(index, index+len);
                System.out.println("Substring : "+subStr);
                
                
            }
            
        }
        
        return list;
    }
    
    public PalindromeCheck()
    {
         Scanner scan=new Scanner(System.in);
         String toCheck=scan.nextLine();
        
        getSubStrings(toCheck);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
       
       System.out.println("Start");
       PalindromeCheck palCheck=new PalindromeCheck();
        
    }
    
}
