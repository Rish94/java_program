

//sample program

// import java.util.Scanner;

// class exp_hand 
// {
//     void func1()
//     {
//         Scanner scan = new Scanner(System.in);

//         System.out.println("enter first no");
//         int a = scan.nextInt();

//         System.out.println("enter second no");
//         int b = scan.nextInt();

//         System.out.println(a/b);

//     }

//     void func2()
//     {
//         System.out.println("second function");
//     }
//     public static void main(String[] args) {
//         exp_hand e = new exp_hand();
//         e.func1();
//         e.func2();
//     }
// }





// import java.util.Scanner;

// class exp_hand 
// {
//     void func1()
//     {
//         try
//         {
//         Scanner scan = new Scanner(System.in);

//         System.out.println("enter first no");
//         int a = scan.nextInt();

//         System.out.println("enter second no");
//         int b = scan.nextInt();

//         System.out.println(a/b);
//         }
//         catch(Exception e)
//         {
//             System.out.println("problem occur");
//         }
//     }

//     void func2()
//     {
//         System.out.println("second function");
//     }
//     public static void main(String[] args) {
//         exp_hand e = new exp_hand();
//         e.func1();
//         e.func2();
//     }
// }



//getmessage




// import java.util.Scanner;

// class exp_hand 
// {
//     void func1()
//     {
//         try
//         {
//         Scanner scan = new Scanner(System.in);

//         System.out.println("enter first no");
//         int a = scan.nextInt();

//         System.out.println("enter second no");
//         int b = scan.nextInt();

//         System.out.println(a/b);
//         }
//         catch(Exception e)
//         {
//             //System.out.println("problem occur");
//             System.out.println(e);
//             System.out.println(e.getMessage());
//         }
//     }

//     void func2()
//     {
//         System.out.println("second function");
//     }
//     public static void main(String[] args) {
//         exp_hand e = new exp_hand();
//         e.func1();
//         e.func2();
//     }
// }






//NumberFormatException:



// import java.util.Scanner;

// class exp_hand 
// {
//     void func1()
//     {
//         try
//         {
//         Scanner scan = new Scanner(System.in);

//         System.out.println("enter no");
//         String a = scan.next();

//         System.out.println("string value :");
//         System.out.println(a+5);

//         System.out.println("==================================================");

//         int z = Integer.parseInt(a);

//         System.out.println("numeric value :");
//         System.out.println(z+5);



        
//         }
//         catch(Exception e)
//         {
//             //System.out.println("problem occur");
//             System.out.println(e);
//             System.out.println(e.getMessage());
//         }
//         finally
//         {
//             System.out.println("no impact here......finally block");
//         }
//     }

//     void func2()
//     {
//         System.out.println("second function");
//     }
//     public static void main(String[] args) {
//         exp_hand e = new exp_hand();
//         e.func1();
//         e.func2();
//     }
// }























// import java.util.Scanner;

// import javax.swing.plaf.synth.SynthSplitPaneUI;

// class exp_hand 
// {
//     void func1()
//     {
//         try
//         {
//         Scanner scan = new Scanner(System.in);
//             int a[] = new int[5];
//         System.out.println("enter array elements ");
//         for(int i=0;i<5;i++)
//         {
//             a[i] = scan.nextInt();
//         }
//         for(int j=0;j<5;j++)
//         {
//             System.out.println("out " + a[j]/2);
//         }


        
//         }

//         catch(ArrayIndexOutOfBoundsException e)
//         {
//             //System.out.println("problem occur");
//             System.out.println("array problem " + e);
//         }

//         catch(ArithmeticException me)
//         {
//             //System.out.println("problem occur");
//             System.out.println("division problem " + me);
//         }
    
//     }

//     void func2()
//     {
//         System.out.println("second function");
//     }
//     public static void main(String[] args) {
//         exp_hand e = new exp_hand();
//         e.func1();
//         e.func2();
//     }





//userdefined exception 

import java.util.Scanner;

class ageexception extends Exception
{
    ageexception()
    {
    System.out.println("under 18 age");
    }
}



class exp_hand
{
  
    void func1()
  {
      try
      {
          Scanner sc = new Scanner(System.in);
          System.out.println("enter your age");
          int age = sc.nextInt();
          if(age>=18)
          {
              System.out.println("vote done");
          }
          else
          {
              throw new ageexception();
          }
      }
      catch(ageexception e)
      {
          System.out.println(e);
      }
      finally 
      {
          System.out.println("next voter come");
      }
  }

  public static void main(String[] args) 
  {
      exp_hand a = new exp_hand();
      a.func1();
  }

}























//q1 - discribe the concept of exception handling
//q2 - diff compile time and run time exception
//          check            unchecked

//q3 - how to handle the exception
//discribe try , catch , finally
//diff b/w throw and throws
//didd b/w final(override vala) & finally 