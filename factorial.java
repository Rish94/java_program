public class factorial 
{
    public static void main(String[] args) {
        int a = 4,c;
        c = 1;
        while(a>0)
        {
            c = c * a;
            a = a - 1;
        }
        System.out.println("fact no : " + c);
    }
    
}
