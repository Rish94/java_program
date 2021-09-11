public class q8 {
    public static void main(String[] args) {
        int ar[] ={10,20,30,20,40,50};
        System.out.println("array elements are ");
        for(int i=0;i<ar.length;i++)
        {
            System.out.println(ar[i]);
        }
        int s = 0;
        for(int j=0;j<ar.length;j++)
        {
            //int c = Integer.parseInt(ar[j]);
            s = s + ar[j];
        }
        System.out.println("sum of elements :- " + s);
    }
}
