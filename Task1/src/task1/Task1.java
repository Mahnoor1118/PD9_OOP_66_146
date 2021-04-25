/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

import java.util.Scanner;

/**
 *
 * @author MAHNOOR SHAD
 */


public class Task1 {

    /**
     * @param args the command line arguments
     */
public static int wordCounter(String s) 
{
    int x=0;

      for(int i=0 ; i< s.length()-1;i++)
      {
        if(s.charAt(i)==' ')
        {
            x= x+1;
            
        }
          
      }
    return x+1;
    
  
 
 }    
public static int vowelCounter(String s)
{
    int x = 0;
    for (int i= 0; i < s.length(); i++)
    {
        char y = s.charAt(i);
        if(y == 'a' || y =='e' || y == 'i' || y == 'o' || y == 'u' )
        {
            x++;
        }
    }
    return x;
}
public static int puncCount(String s)
{
      int x = 0;
    char y = ' ' ;
    for (int i= 0; i < s.length(); i++)
    {
        y = s.charAt(i);
    if(!((y >= 'A' && y <= 'Z') ||( y >= 'a' && y <= 'z') ||( y >= '0' && y <= '9') || y == ' '))
    {
        x++;
    }
    }
    return x;
}
public static boolean findSubString(String s, String sub)
{
    int x = 0;
    char y = ' ' ;
    for (int i= 0; i < s.length(); i++)
    {
        y = s.charAt(i);
        if(y == sub.charAt(0))
        {
            y = s.charAt(i + 1);
            if(y == sub.charAt(1))
            {
                y = s.charAt(i + 2);
                if(y == sub.charAt(2))
                {
                    return true;
                }
            }
        }
    }
    return false;
}

    public static void main(String[] args) {
    
        // TODO code application logic here
        Scanner x= new Scanner(System.in);
        System.out.println("Enter the String");
        String s;
        String sub;
        s = x.nextLine();
        System.out.println("Number of Words");
        System.out.println(wordCounter(s));
        
      
        System.out.println("Number of Vowels");
        System.out.println(vowelCounter(s));
        
        
        System.out.println("Number of Punctuations");
        System.out.println(puncCount(s));
        
        
       
        boolean check = findSubString(s,"the");
        if(check)
        {
            System.out.println(" \"the\" is a part of this string");
        }
        else
        {
            System.out.println("\"the\" is not part of this string");
        }
        
        
        
        
    }
    
    
}
