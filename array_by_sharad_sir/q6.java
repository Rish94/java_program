public class q6 {
    public static void main(String[] args) {
        int a = args.length;
        System.out.println("your input elements , lenth of array " + a);
        for(int i=0;i<a;i++)
        {
            System.out.println(args[i]+" ");
        }
        int b = 0;
        for(int j=0;j<a;j++)
        {
            int c = Integer.parseInt(args[j]);
            b = b + c;
        }
        System.out.println("sum of array " + b);
    }
    
}
