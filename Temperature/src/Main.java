import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println();
        System.out.print("Temperature in Degree Celsius: ");
        Double D = sc.nextDouble();
        System.out.println();
        Double Fah = (1.8 * D) + 32;
        System.out.println("Fahrenheit Temperature is " + Fah);


    }
}