package Day1;

import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        System.out.println("Temperature Conversion:");
        System.out.println("For Celsius to Fahrenheit: Choose 1");
        System.out.println("For Fahrenheit to Celsius: Choose 2");
        Scanner sn=new Scanner(System.in);

        System.out.print("Choose option(1 or 2): ");
        int Choose = sn.nextInt();

        if (Choose == 1)
         {
            System.out.print("Enter the celsius value : ");
            int Celsius = sn.nextInt();
            int Fahrenheit =Celsius*(9/5)+32;
            System.out.println("The temperature in Fahrenheit is: " + Fahrenheit);
         }
         else if (Choose == 2)
         {
            System.out.print("Enter the Fahrenheit value : ");
            int Fahrenheit = sn.nextInt();
            float Celsius = (Fahrenheit - 32) *(5.0f/9);
            System.out.println("The temperature in Celsius is: " + Celsius);
         }
        else
        {
            System.out.println("invalid option");
        }
        
    }
}
