/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.util.Scanner;

/**
 *
 * @author MAHNOOR SHAD
 */

public class Task2 {

    /**
     * @param args the command line arguments
     */
    public static String displayVertical(String s)
    {
     String vertical = new String();
        for(int i = 0; i < s.length(); i++)
        {
           vertical = vertical + s.charAt(i)+"\n";
        }
        return vertical;
    }
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner x= new Scanner(System.in);
        System.out.println("Please Enter a sentence: ");
        String s;
        s = x.nextLine();
        System.out.println("Your sentence printed vertically is: ");
        System.out.println(displayVertical(s));
    }
    
}
