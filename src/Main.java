import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double salary = 0;
        String name = ""; // string is a sequence of characters - cannot use numbers at ALL
        int age = 0;
        int favNum = 0;
        String trash = "";

        System.out.print("Enter your name: ");
        name = in.nextLine();

        System.out.println("You said your name is: " + name);

        // this is an unprotected read of a number value which will fail if it is not a valid number
        /* System.out.print("\nEnter your age: ");
        age = in.nextInt();

        System.out.println("You said your age is: " + age);
*/
        System.out.print("\nEnter your age: ");
        if(in.hasNextInt())
        {
            age = in.nextInt();
            in.nextLine(); // have to clear the buffer after reading a number
            System.out.println("You said your age is: " + age);
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid number");
        }

        System.out.print("Enter your Salary: ");
        if(in.hasNextDouble())
        {
            salary = in.nextDouble();
            in.nextLine(); // have to clear the buffer after reading a number
            System.out.println("\nYou said your salary is: " + salary);
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is bad input!");
        }

        // favorite number 1-10
        System.out.print("Enter Your fav num [1-10]: ");
        if(in.hasNextInt())
        {
            favNum = in.nextInt();
            in.nextLine();
            if(favNum >= 1 && favNum <= 10)
            {
                System.out.println("\nYou said your fav num is: " + favNum);
            }
            else
            {
                System.out.println("You said your fav num is " + favNum + " but that is out of range");
            }
        }




    }
}