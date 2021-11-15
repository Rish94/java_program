import java.lang.*;

class thread_example extends Thread
{
    public void run()
    {
        try
        {
            for(int i = 1;i<=10;i++)
            {
                System.out.println(i);
                sleep(1000);
                if(i==5)
                {
                    stop();
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        thread_example scan = new thread_example();
        scan.start();
    }
}