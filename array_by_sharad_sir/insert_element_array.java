
import java.util.*;


public class insert_element_array 
{
    public static void main(String[] args) 
    {
        Scanner scan =new Scanner(System.in);
        System.out.print("enter the size of array :- ");
        int a = scan.nextInt();
        int ar[] = new int[a];
        System.out.println("enter the " + a + " elements");
        for(int i=0;i<a;i++)
        {
            ar[i] = scan.nextInt();
        }
        System.out.print("enter the index for element insert :-");
        int b = scan.nextInt();
        System.out.print("enter the element for given index :-");
        int c = scan.nextInt();
        for(int j=a-1;j>=b;j--)
        {
            ar[j] = ar[j - 1];
            ar[b - 1] = c;
        }
        for(int k : ar)
        {
            System.out.print(k + " ");
        }
    }
    
}
