package sba;


import java.util.Scanner;
public class Fuel {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter litter of fuel to fill up");
        float q=sc.nextInt();
    System.out.println("Enter distance coverd");
    float d=sc.nextInt();
    if(q<1)
    {
        System.out.println(q+"is invalid output");
        System.exit(0);
    }
    if(d<1)
{
System.out.println(d+"is invalid output");
System.exit(0);
}
System.out.println("liters/100km");
System.out.println(String.format("%.2f",(q/d)*100));
System.out.println("miles/gallon");
System.out.println( String.format("%.2f",(d*0.6214/(q*0.2642))));


}

}    