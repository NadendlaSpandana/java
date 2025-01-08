package Day1;

import java.util.Scanner;

public class operation {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sn.nextInt();
        System.out.print("Enter the Second number: ");
        int num2 = sn.nextInt();
        int sum= num1 + num2;
        int diff= num1 - num2;
        int mul= num1 * num2;
        int div= num1 / num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        System.out.println("The diff of " + num1 + " and " + num2 + " is: " + diff);
        System.out.println("The mul of " + num1 + " and " + num2 + " is: " + mul);
        System.out.println("The div of " + num1 + " and " + num2 + " is: " + div);
    }
}
