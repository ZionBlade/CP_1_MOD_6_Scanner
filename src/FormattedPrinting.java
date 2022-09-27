public class FormattedPrinting
{
    public static void main(String[] args)
    {
        double salary = 455678.12345;
        int age = 64;
        String name = "Callie";
        for(int x = 0; x < 15; x++)
        {
            System.out.printf("\n%-20s%5d%12.2f",name, age, salary); //d stands for digit, f stands for floating point
        }
    }
}
