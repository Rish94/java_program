


import java.util.*;

public class print_odd_no_series {
    public static void main(String[] args) 
    {
        Scanner s =new Scanner(System.in);
        System.out.println("INPUT start NO :- ");
        int a =s.nextInt();
        System.out.println("INPUT end NO :-");
        int b =s.nextInt();
        int i;
        for(i=a;i<=b;i++)
        {
            if(i%2!=0)
            System.out.print(i + " ");
         }
    }
    
}
