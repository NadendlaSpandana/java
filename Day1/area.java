package Day1;

import java.util.Scanner;

public class area {
     public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.print("Enter the base value: ");
        float base = sn.nextFloat();
        System.out.print("Enter the height value: ");
        float height = sn.nextFloat();
        float area= (1/2f)*(base*height);
        System.out.println("The area of triangle is: " + area);
     }
}
 