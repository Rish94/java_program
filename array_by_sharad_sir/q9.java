public class q9 
{
    public static void main(String[] args) {
        int ar[] ={10,20,30,20,40,50,5,0,1,45,4,2154,151,5};
        System.out.print("array elements are \n");
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i] + " ");
        }
        System.out.print("array even elements are \n");
        for(int j=0;j<ar.length;j++)
        {
            if(ar[j]%2==0)
            {
                System.out.print(ar[j] + " ");  
            }
            
        }
        System.out.print("array odd elements are \n");
        for(int k=0;k<ar.length;k++)
        {
            if(ar[k]%2!=0)
            {
                System.out.print(ar[k] + " ");  
            }
            
        }
    }
    
}
