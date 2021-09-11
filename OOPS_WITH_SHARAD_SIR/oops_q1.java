//function overloading = same names of object.

public class oops_q1 
{
    void btech()
    {
        System.out.println("bachlor from cs");
    }
    void btech(int account)
    {
        System.out.println("bachleor from ec");
    }
    void btech(int a,int b)
    {
        System.out.println("btech from mech");
    }
    public static void main(String[] args) {
        oops_q1 a=new oops_q1();
        a.btech(1000);
    }
}
