import java.util.Scanner;
import java.lang.*;

public class flow{
    public static void main(String args[])
    {
        // Initiate a new scanner
        Scanner userInputScanner = new Scanner(System.in);

        int option;

        // asks users for an input to determine what they want to do
        System.out.println("Please how may we be of service to you today?\n");
        System.out.println("kindly press 1 to check your grade\n");
        System.out.println("Or press 2 to check if you were promoted\n");
        System.out.println("Else press 3 to quit:\n");

        option  = userInputScanner.nextInt();

        if (option == 3)
        {
            System.out.println("Goodbye!!!");
            return;
        }

        directUser(option);

        userInputScanner.close();
    }

    public static void directUser(int userOption)
    {
        // Initiate a new scanner
        Scanner userInputScanner = new Scanner(System.in);
        int newOption;
        int newOption2;
        int testscore;
        char grade;

        //flow control to direct user to their destination
        switch (userOption)
        {
        case 1:
            System.out.println("Please what is your testscore: "); 
            testscore = userInputScanner.nextInt();
            getGrade(testscore);
            break;
        case 2:
            System.out.println("Please what is your grade: ");
            break;
        case 3:
            System.out.println("Goodbye!!!");
            return;
        default :
            do
            {
                System.out.println("Invalid Entry, Retry: ");
                newOption = userInputScanner.nextInt();
                directUser(newOption);
            }
            while((newOption < 1) && (newOption > 3));
            break;
            
        }

        do{
            System.out.println("kindly press 1 to check your grade\n");
            System.out.println("Or press 2 to check if you were promoted:\n");
            System.out.println("Else press 3 to quit:\n");
            
            newOption2 = userInputScanner.nextInt();

            directUser(newOption2);
        }
        while((newOption2 < 1) && (newOption2 > 3));

        userInputScanner.close();
    }

    public static void getGrade(int score)
    {
        char grade;
        if (score >= 90)
        {
            grade = 'A';
        }
        else if (score >= 80)
        {
            grade = 'B';
        }
        else if (score >= 70)
        {
            grade = 'C';
        }
        else if (score >= 60)
        {
            grade = 'D';
        }
        else
        {
            grade = 'F';
        }

        System.out.println("YOUR GRADE IS " + grade);
    }

    public static void getPromotionStatus(char userGrade)
    {
        if (userGrade >= 'A' && userGrade <= 'Z')
        {
            userGrade = Character.toUpperCase(userGrade);
        }
        switch (userGrade)
        {
            case 'A':
            case 'B':
            case 'C': System.out.println("CONGRATULATION YOU HAVE BEEN PROMOTED!!!"); 
            break;
            case 'D':
            case 'F': System.out.println("SORRY, YOU WERE NOT PROMOTED"); 
            break;
            default: System.out.println("Invalid entry"); break;
        }
    }
}