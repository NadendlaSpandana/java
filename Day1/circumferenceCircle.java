package Day1;
import java.util.Scanner;


public class circumferenceCircle {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.print("Enter the radius value: ");
        float radius = sn.nextFloat();
        double circumference= (3.14159f)*(2*radius);
        System.out.println("The circumference of circle is: " + circumference);
     }
    
}
