//print array elememts enetred by user.

import java.util.Scanner;



public class q13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ar[] = new int[5];
        System.out.println("enter the elements of an array");
        for(int i=0;i<5;i++)
        {
            ar[i]=s.nextInt();
        }
        System.out.println("your entered elements");
        for(int i=0;i<5;i++)
        {
            System.out.println(ar[i]);
        }

    }
    
}
