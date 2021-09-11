public class q10 
{
    public static void main(String[] args) {
        int ar[] ={10,20,30,20,40,50,5,0,1,45,4,2154,151,5};
        System.out.print("array elements are \n");
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i] + " ");
        }
        int e = 0;
        for(int j=0;j<ar.length;j++)
        {
            if(ar[j]%2==0)
            {
                e = e + 1;  
            }
            
        }
        int o =0;
        for(int k=0;k<ar.length;k++)
        {
            if(ar[k]%2!=0)
            {
               o = o + 1; 
            }
            
        }
        System.out.println("length of even and odd elements in array " + e + " " + o);
    }
    
}
