public class reverse_digit 
{
    public static void main(String[] args) {
        int a,s,r;
        a = 123;
        s = 0;
        while(a>0)
        {
            r = a%10;
            s = s * 10 + r;
            a = a/10;
        }
        System.out.println("after rev : " + s);
    }
    
}
