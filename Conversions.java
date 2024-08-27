import java.util.Scanner;
/**
 * This application converts between various units of measurement.
 *
 * @author Tim Gesell
 * @version 8/21/2022
 */
public class Conversions
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Feet to Meters");
        System.out.println("4. Meters to Feet");
        System.out.println("5. Ounces to Milliliters");
        System.out.println("6. Milliliters to Ounces");
        System.out.println("7. Joules to Kilocalorie");
        System.out.println("8. Kilocalorie to Joules");
        //Add 2 more conversions, each both ways, to add choices 7, 8, 9, and 10.
        //You can add even more if you would like.

        int selection = keyboard.nextInt();
        keyboard.nextLine();  //go past the end-line and be ready for more input

        if (selection == 1)
        {
            System.out.println("Enter Celsius: ");
            double celsius = keyboard.nextDouble();
            keyboard.nextLine();
            double fahrenheit = celsius * (9.0 / 5.0) + 32;
            System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit");
        }
        if (selection == 2)
        {
            System.out.println("Enter Fahrenheit");
            double fahrenheit = keyboard.nextDouble();
            keyboard.nextLine();
            double celsius = (fahrenheit - 32)*(5/9);
            System.out.println(fahrenheit + " degrees fahrenheit is " + celsius + " degrees celsius");

            //add the code to ask the user to enter Fahrenheit and then convert to Celsius
        }
        if (selection == 3)
        {
            System.out.println("Enter Feet: ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double meters = feet/3.281;
            System.out.println(feet + " feet is " + meters + " Meters");
        }
        if (selection == 4)
        {
            System.out.println("Enter Meters: ");
            double meters = keyboard.nextDouble();
            keyboard.nextLine();
            double feet = meters*3.281;
            System.out.println(meters + " meter is " + feet + " feet");
        }
        if (selection == 5)
        {
            System.out.println("Enter Ounces: ");
            double ounces = keyboard.nextDouble();
            keyboard.nextLine();
            double milliliters = ounces*29.574;
            System.out.println(ounces + " ounces is " + milliliters + " milliliters");
        }
        if (selection == 6)
        {
            System.out.println("Enter Milliliters: ");
            double milliliters = keyboard.nextDouble();
            keyboard.nextLine();
            double ounces = milliliters/29.574;
            System.out.println(milliliters + " milliliters is " + ounces + " ounces");
        }
        if (selection == 7)
        {
            System.out.println("Enter Joules: ");
            double joules = keyboard.nextDouble();
            keyboard.nextLine();
            double kilocalorie = joules/4184;
            System.out.println(joules + " joules is " + kilocalorie + " kilocalorie");
        }
        if (selection == 8)
        {
            System.out.println("Enter Kilocalorie: ");
            double kilocalorie = keyboard.nextDouble();
            keyboard.nextLine();
            double joules = kilocalorie*4184;
            System.out.println(kilocalorie + " kilocalorie is " + joules + " joules");
        }
        if (selection == 9)
        {
            System.out.println("Enter Pound: ");
            double pound = keyboard.nextDouble();
            keyboard.nextLine();
            double gram = pound/453.7;
            System.out.println(pound + " Pound is " + gram + " Gram");
        }
         if (selection == 10)
        {
            System.out.println("Enter Gram: ");
            double gram = keyboard.nextDouble();
            keyboard.nextLine();
            double pound = gram*453.7;
            System.out.println(gram + " Gram is " + pound + " Pound");
        }
        //add more if statements here.
    }
}
