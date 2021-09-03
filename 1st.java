import java.util.Scanner;
class VariableDemo{
    public static void main(String args[])
    {
        int num1,num2,res;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        num1=sc.nextInt();
        System.out.print("enter second number:");
        num2=sc.nextInt();
        res=num1+num2;
        System.out.println("result:"+res);
        sc.close();
    }
}