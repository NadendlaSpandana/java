package Day1;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int[] arr=new int[5];

       for(int i=0;i<arr.length;i++){
        arr[i]=sn.nextInt();
        
       }
       int sum=0;
       for(int i=0;i<arr.length;i++){
        
        System.out.println(arr[i]+" \n");
        sum=sum+arr[i];
       }
       System.out.print(sum);

    }
   
    
}
