package Day1;

import java.util.Scanner;

public class interest {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.print("Enter the Principle value: ");
        float Principle = sn.nextFloat();
        System.out.print("Enter the Rate value: ");
        float Rate = sn.nextFloat();
        System.out.print("Enter the Time value: ");
        float Time = sn.nextFloat();
        double Interest= ((Principle*Rate*Time)/100);
        System.out.println("The circumference of circle is: " + Interest);
     }
}
