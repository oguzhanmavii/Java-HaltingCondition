import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        while (true)
        {
            Scanner procesSc= new Scanner(System.in);
            System.out.println("1->Continue Process\n2->Exit Process");
            int process = procesSc.nextInt();
            if(process ==1)
            {
                Scanner startSc=new Scanner(System.in);
                System.out.println("Start Variable:");
                int start=startSc.nextInt();
                System.out.println("End Variable:");
                int end=startSc.nextInt();
                int result=HaltingCondition(start,end);
                System.out.println("Result:"+result);
            }
            else if (process== 2)
            {
                System.out.println("Exit Process...");
                break;
            }
        }
    }
    public  static  int HaltingCondition(int start,int end)
    {
        if(end>start)
        {
            return  end + HaltingCondition(start,end -1);
        }
        else
        {
            return end;
        }
    }
}