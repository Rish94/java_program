public class even_odd_series 
{
    public static void main(String[] args) {
         int l = 10,i;
         System.out.println("even no series");
         for(i=0;i<=l;i++)
         {
             if(i%2==0)
             System.out.println(i);
         }
         System.out.println("odd no series");
         for(i=0;i<=l;i++)
         {
             if(i%2!=0)
             System.out.println(i);
         }

    }
    
}
