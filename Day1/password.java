package Day1;
import java.util.*;
import java.util.regex.Pattern;

public class password {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter your password");
        String password = sn.nextLine();
    
    String regex = "[A-Za-z\\d]{8,}";
    if (Pattern.matches(regex,password))
    {
    System.out.println("Your password is valid");
    }
    else
    {
    System.out.println("Your password is invalid");
    }
}
}