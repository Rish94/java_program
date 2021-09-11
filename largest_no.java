// 1. Write a Java program to find largest among three numbers.
// Input Data:
// Input first integer: 25
// Input second integer: 39
// Input second integer: 20
// Output : - 39


import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class largest_no {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("INPUT FIRST NO :-");
        int a =s.nextInt();
        System.out.println("INPUT SECOND NO :-");
        int b =s.nextInt();
        System.out.println("INPUT THIRD NO :-");
        int c =s.nextInt();
        if(a>b && a>c)
        System.out.println(a + " this no is greater among three ");
        else if(b>a && b>c)
        System.out.println(b + " this no is greater among three ");
        else if(c>a && c>b)
        System.out.println(c + " this no is greater among three ");
        else 
        System.out.println("All three are Equal " + a + " = " + b + " = " + c);
        


    }
    
}
