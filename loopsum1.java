public class loopsum1 
{
    public static void main(String args[]) {
        int s = 0,i=0;
        int b = args.length;
        while(i<b)
        {
            System.out.println(args[i]);
            int a = Integer.parseInt(args[i]);
            s = s + a;
            i++;
        }
        System.out.println("sum :-" + s);
        
    }
    
}
