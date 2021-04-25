/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;

/**
 *
 * @author Ayesha Shabbir
 */
public class Task4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String a = "groupwork";
        String b = "  OOP";
        // CharAt function
        System.out.println("Character at position 5: " + a.charAt(5));
        //compare function
        System.out.println("Compare To 'groupwork': " + a.compareTo("Groupwork"));
        //endwith function
        System.out.println("EndsWith character 'k': " + a.endsWith("k"));
        //concatination
        System.out.println(a + b);
        //replace function
        System.out.println("Replace 'group' with 'individual': " + a.replace("group", "individual"));
        //indexof function
        System.out.println("Character at position 5: " + a.charAt(5));
        System.out.println("Index of character 'u': " + a.indexOf('u'));
        //lenght function
        System.out.println("Length of String: " + a.length());

    }

}
