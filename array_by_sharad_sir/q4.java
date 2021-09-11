//swap two no by command line argument

public class q4 
{
    public static void main(String[] args) 
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("no without swapping ");
        System.out.println("var 1 = " + a);
        System.out.println("var 2 = " + b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("no after swapping ");
        System.out.println("var 1 = " + a);
        System.out.println("var 2 = " + b);

        
    }
    
}
