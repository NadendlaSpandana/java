package Day1;

import java.util.Scanner;

public class traffic {
    public static void main(String[] args) {
        Scanner sn =new Scanner(System.in);
        System.out.print("Do you have obstacle?");
        String obstacle=sn.nextLine().toLowerCase();
        if(obstacle.equalsIgnoreCase("No")){
            System.out.print("Enter the traffic light color (Green, Yellow, Red): ");
            String lightColor = sn.nextLine().trim().toLowerCase();
            switch (lightColor) {
                case "green":
                  System.out.print("Go ");
                    break;
                case "yellow":
                  System.out.print("Slow Down ");
                    break;
                case "red":
                    System.out.print("Stop ");
                      break;
                default:
                    System.out.print("Invalid Colour ");
                    break;
            }
        }
        else{
            System.out.println("u cant move");
        }
    }
}
