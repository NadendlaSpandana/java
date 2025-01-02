// Source code is decompiled from a .class file using FernFlower decompiler.
package Day1;

import java.util.Scanner;

public class interest {
   public interest() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter the Principle value: ");
      float var2 = var1.nextFloat();
      System.out.print("Enter the Rate value: ");
      float var3 = var1.nextFloat();
      System.out.print("Enter the Time value: ");
      float var4 = var1.nextFloat();
      double var5 = (double)(var2 * var3 * var4 / 100.0F);
      System.out.println("The circumference of circle is: " + var5);
   }
}
