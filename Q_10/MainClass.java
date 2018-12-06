package Q_10;
import java.util.Scanner;
import Q_10.ISE.ISE_department;
import Q_10.Faculty;
public class MainClass{

    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
        Faculty f[] = new Faculty[10]; //Array of faculty objects.
        int counter = 0;
        ISE_department ise = new ISE_department();
        boolean parameter1 = false;
        boolean parameter2 = false;
        while(true){
        System.out.println("1. Enter the record of a new faculty");
        System.out.println("2. Read the details of a particular faculty");
        System.out.println("3. Know the details of the faculty with experience greater than 20 years");
        System.out.println("4. Exit!");


            System.out.println("Enter your choice");
            int ch = sc.nextInt();

            switch(ch){
                case 1:
                        f[counter] = new Faculty();
                        ise.readData(f[counter]);
                        counter++;
                        break;
                
                case 2:
                        System.out.println("Enter the name of the faculty whose details you wanna print");
                        String name = sc.next();
                        for(int i=0;i<counter;i++){
                            if(name.equals(f[i].name)){
                                ise.printData(f[i]);
                                parameter1 = true;
                              	break;
                            }
                        }
                        if(parameter1 == false){
                            System.out.println("Faculty not found!");
                        }
                        break;
                case 3:
                        System.out.println("The faculty with experience greater than 20 years are:");
                        for(int i=0;i<counter;i++){
                            if(f[i].years_of_experience >= 20){
                                System.out.println(f[i].name);
                                parameter2 = true;
                            }
                        }

                        if(parameter2 == false){
                            System.out.println("Record not found!");
                        }
                        break;
              case 4:
                		System.exit(0);
                		break;
              default:
                		System.out.println("INVALID CHOICE!");
            }
        }
    }
}