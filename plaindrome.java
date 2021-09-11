public class plaindrome 
{
    public static void main(String[] args) {
    
        int a = 121,r,s,rev;
        rev = a;
        s = 0;
        while(a>0)
        {
            r = a%10;
            s = s * 10 + r;
            a = a/10;
        }
        if (s==rev)
        System.out.println("palindrome no");
        else
        System.out.println("no not palindrome");

    }
    
}
