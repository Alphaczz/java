import java.util.Scanner;
public class checkvowel 
{
    public static void main(String[] args)
{
    char alphabet;
    System.out.println("Enter the alphabet:");
    Scanner sc=new Scanner(System.in);
    alphabet=sc.next().charAt(0);
    if (alphabet=='a'||alphabet=='e'||alphabet=='i'||alphabet=='o'||alphabet=='u') {
        System.out.println("the alphabet is vowel");
        
    }
    else{
        System.out.println("the alphabet is not a vowel");
    }
    sc.close();
        
    
}
    
}
