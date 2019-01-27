package ResultPackage;
import StudentPackage.RegisterStudent;
class Result
{
    public static void main(String[] args)
    {
        int cgpa=0;
        RegisterStudent obj[]=new RegisterStudent[4];
        (new RegisterStudent()).getDetails();
        for(int i=0;i<4;i++)
        {
        obj[i]=new RegisterStudent();
            try
            {
                obj[i].getOtherDetails();
               if(obj[i].sgpa_cal()>10)
                throw new InvalidSGPA();
            }
            catch(InvalidSGPA e)
            {
                e.disp();
            }
            cgpa+=obj[i].sgpa_cal();
            obj[i].printDetails();
        }
            System.out.println("CGPA="+cgpa/4);
    }
}