import java.util.Scanner;
 class kilotomile
{public static void main(String[] args) {
    float kilo,mile;
    System.out.print("ENTER THE VALUE:");
    Scanner kil=new Scanner(System.in);
     kilo=kil.nextFloat();
    mile=0.621371f*kilo;
    System.out.print("THe values in Miles is:");
    System.out.println(mile);
    kil.close();

}

    
}
