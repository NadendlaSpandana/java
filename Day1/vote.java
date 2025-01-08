package Day1;

import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner sn =new Scanner(System.in);
        System.out.print("Do you have citizenship? ");
        boolean citizen=sn.nextBoolean();
        System.out.println("Enter age");
        int age=sn.nextInt();
        if(age>=18 && citizen==true){
            System.out.println("u can vote");
        }
        else{
            System.out.println("u cant vote");
        }
        // System.out.print("Enter Y or N  ");
        // String Choose = sn.nextLine();
        // if (Choose.equalsIgnoreCase("Y")) {
        //     System.out.print("What is your age? ");
        //     int Age = sn.nextInt();
        //     if (Age>=18) {
        //         System.out.print("You are eligible to vote ");
        //     }
        //     else
        //     {
        //         System.out.print("You are not eligible to vote ");
        //     }
        // }
        // else
        // {
        //     System.out.print("You are not a citizen to vote "); 
        // }

    }
}
 