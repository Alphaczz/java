import java.util.Scanner;
public class integercheck {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number:");
    if (sc.hasNextInt()) 
    {
        System.out.println(sc.nextInt()+" is a valid integer.");
    }
    else {
        System.out.println("Not a valid integer.");
    }
    sc.close();
}    
}
