import java.util.Scanner;


class percal {
    public static void main(String[] args) 
    {
        float sub1,sub2,sub3,sub4,sub5;
        int total1;
        System.out.println("enter the marks of five subject:");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks of subject ");     
         sub1=sc.nextFloat();
        System.out.println("enter marks of subject 2");
         sub2=sc.nextFloat();
        System.out.println("enter marks of subject 3 ");
         sub3=sc.nextFloat();
        System.out.println("enter marks of subject 4");
        sub4=sc.nextFloat();
        System.out.println("enter marks of subject 5");
        sub5=sc.nextFloat();
        System.out.println("enter total marks:");
        total1=sc.nextInt();


       float totalmarks=sub1+sub2+sub3+sub4+sub5;
       System.out.print("the percentage is:");
        float percent=(totalmarks/total1)*100;
        System.out.println(percent);
        System.out.print("%");
        sc.close();
    }
}