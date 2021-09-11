import java.util.*;

public class fabonaci_series 
{
    public static void main(String[] args) 
    {
        int a,b,c,d;
        Scanner s=new Scanner(System.in);
        c = s.nextInt();
        a = 0;
        b = 1;
        System.out.println(a +"\n"+b);
        d = 0;
        while(c-2>0)
        {
           d = a+b;
           System.out.println(d);
           a = b;
           b = d;
           c = c - 1;
        }
        
        
    }
    
}
