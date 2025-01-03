package Day1;

import java.util.Scanner;

public class leapYear {
    
    public static void main(String[] args) {
        Scanner sn =new Scanner(System.in);
        System.out.print("Enter any year ");
        int year=sn.nextInt();
        if(((year%4)==0) && ((year%100) != 0) &&((year%400) == 0)) {
            System.out.println("Given year is a leap year");
        }
        else{
            System.out.println("Given year is not a leap year");
        }
    }
}
