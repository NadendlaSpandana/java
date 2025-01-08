package Day1;

import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.print("Enter the radius value: ");
        float radius = sn.nextFloat();
        float area= (3.14159f)*(radius*radius);
        System.out.println("The area of circle is: " + area);
     }
}
