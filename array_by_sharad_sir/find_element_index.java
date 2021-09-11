import java.util.Scanner;

public class find_element_index 
{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("enter the size of array :- ");
        int a = scan.nextInt();
        int ar[] = new int[a];
        System.out.println("enter the " + a + " elements");
        for(int i=0;i<a;i++)
        {
            ar[i] = scan.nextInt();
        }
        System.out.print("enter the element for find its position");
        int b = scan.nextInt();
        for(int j=0;j<a;j++)
        {
            if(ar[j]==b)
            {
                System.out.print("your element position is:- " + (j+1));
            }
        }
    }
    
}
