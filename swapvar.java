import java.util.Scanner;
public class swapvar {
    public static void main(String[] args) {
        int a ,b,temp;
        Scanner dc=new Scanner(System.in);
        System.out.println("Enter the Number for a:");
        a= dc.nextInt();
        System.out.println("Enter another Number for b:");
        b=dc.nextInt();
        temp=a;
        a=b;
        b=temp;
        System.out.println("THe value of a after swap is:-\t "+a);
        System.out.println("The value of b  after swap is:-\t "+b);
        dc.close();
    }
    
}
