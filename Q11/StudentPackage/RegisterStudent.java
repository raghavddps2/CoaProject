package StudentPackage;
import java.util.Scanner;
public class RegisterStudent implements Student
{
    static float sgpa=0;
    static int credits=0,n=0,cr=0;
    static int marks[]=new int[15];
    static int cre[]=new int[15];
    static String grade[];
    static String name="",branch="";
    static Scanner sc=new Scanner(System.in);
    
    public void getDetails()
    {
        System.out.println("Enter name:");
        name=sc.next();
        System.out.println("Enter your branch:");
        branch=sc.next();
    }
    
    public void getOtherDetails()
    {
        try
        {
           System.out.println("Enter the number of credits registered for in this sem:");
           credits=sc.nextInt();
           if(credits>30)
           throw new CreditLimit();
            System.out.println("Enter the number of subjects registered for:");
            n=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter marks obtained in subject["+(i+1)+"] and credits alloted for it:");
            marks[i]=sc.nextInt();
            cre[i]=sc.nextInt();
        }
   }
        catch(CreditLimit e)
        {
            e.disp();
        }
    }

    
    public void printDetails()
    {
        System.out.println("CREDITS registered for: "+credits);
        for(int i=0;i<n;i++)
        {
            System.out.println("Subject["+(i+1)+"]-  CREDITS OBTAINED: "+cre[i]+"  GRADE: "+grade[i]);
        }
    }
    
    public float sgpa_cal()
    {
        grade=new String[n];
        for(int i=0;i<n;i++)
        {
            if(marks[i]>=90)
            {
                sgpa+=cre[i]*10;
                grade[i]="S+";
            }
            else if(marks[i]>=80)
            {
                sgpa+=cre[i]*9;
                grade[i]="S";
            }
            else if(marks[i]>70)
            {
                sgpa+=cre[i]*8;
                grade[i]="A";
            }
            else if(marks[i]>60)
            {
                sgpa+=cre[i]*7;
                grade[i]="B";
            }
            else if(marks[i]>50)
            {
                sgpa+=cre[i]*6;
                grade[i]="C";
            }
            else if(marks[i]>45)
            {
                sgpa+=cre[i]*5;
                grade[i]="D";
            }
            else if(marks[i]>40)
            {
                sgpa+=cre[i]*4;
                grade[i]="E";
            }
            else
            {
                sgpa+=0;
                cre[i]=0;
                grade[i]="F";
            }
            cr+=cre[i];
        }
   return sgpa/=cr;
    }
}