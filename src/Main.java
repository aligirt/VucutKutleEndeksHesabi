import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double kilo, boy, index;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Kilonuzu Giriniz (kg):");
        kilo = input.nextDouble();

        System.out.print("Lütfen Boyunuzu Giriniz (metre):");
        boy = input.nextDouble();

        index = kilo / (boy * boy);

        System.out.println("Vücut Kütle Endeksiniz : " + index + "kg/m^2 dir.");


    }
}