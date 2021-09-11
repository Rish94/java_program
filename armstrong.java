import java.util.Scanner;
import java.lang.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int temp=a;
        int num=a;
        int c = 0;
        while(a!=0)
        {
            a = a/10;
            c = c + 1;
        }
        System.out.println("length of digit : " + c);
        int s=0;
        while(temp>0)
        {
            int b = temp%10;
            s = s + (int)Math.pow(b,c);
            temp = temp/10;
        }
        System.out.println("your intput no : " + s);
        if (s==num)
        {
            System.out.println("no is armstrong");
        }
        else
        {
            System.out.println("no is not armstrong");
        }
    }
    
}
