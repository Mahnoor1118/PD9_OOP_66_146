/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

import java.util.Scanner;

/**
 *
 * @author MAHNOOR SHAD
 */
public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static String ridMultipleBlank(String s)
    {
      s = s.replaceAll("( )+", " ");
        return s;
    }
    
    public static String removeInteger(String s)
    {
        
        String remove = "";
        for (int i= 0; i < s.length(); i++)
    {
        char y = s.charAt(i);
        if (!(y >= '0' && y <= '9'))
        {
            remove = remove + y;
        }
    }
        return remove;
    }
    
    public static String stringEncryption(String s)
    {
               int number;
               String e = "";
               number = 4;
               char[] ch = s.toCharArray();
               for(int i = 0; i < ch.length;i++)
               {
                  ch[i] = (char) (ch[i] + number);
                  e = e+  Character.toString(ch[i]);
               }
               return e;
    }
    
            
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner x= new Scanner(System.in);
        System.out.println("Input String");
        String s;
        s = x.nextLine();
        System.out.println(ridMultipleBlank(s));
        
        System.out.println("Input String");
        s = x.nextLine();
        System.out.println(removeInteger(s));
        
        System.out.println("Input String");
        s = x.nextLine();
        System.out.println(stringEncryption(s));
        
    }

  
    }
    

