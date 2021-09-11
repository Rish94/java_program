//print even odd elements of an array
import java.util.Scanner;

public class q14 
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ar[] = new int[10];
        System.out.println("enter the elements of an array");
        for(int i=0;i<10;i++)
        {
            ar[i]=s.nextInt();
        }
        System.out.println("your negative elements");
        int n=0;
        for(int i=0;i<10;i++)
        {
            if(ar[i]<0)
            {
                n = n + 1;
                System.out.println(ar[i]);
            }
        }
        System.out.println("your -ve elements :- " + n);
        System.out.println("your positive elements");
        int p=0;
        for(int i=0;i<10;i++)
        {
            if(ar[i]>0)
            {
                p = p + 1;
                System.out.println(ar[i]);
            }
        }
        System.out.println("your +ve elements :- " + p);
    }
    
}
