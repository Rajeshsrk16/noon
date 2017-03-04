
package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("enter the string ");
        String c=scr.nextLine();
        System.out.println("the originalstring is "+""+c);
        String ss=c.replaceAll("[aeiouAEIOU]", "");
       System.out.println("the removed vowels string is"+ ""+ss);
        String h=ss+"";
       System.out.println(""+h);
        char[] arr = h.toCharArray();
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(""+arr[i]);
        }
       
    }
    
}
