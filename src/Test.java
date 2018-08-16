import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dostępne prędkości:");
        Speed[] values = Speed.values(); //pobranie wszystkich wartosci enuma
        for (Speed speed : values) {
            System.out.println(speed + "(" + speed.translation + ")" );
        }
        System.out.println("Wybierz predkość:");
        String x = scan.nextLine();
        Speed speed = Speed.valueOf(x); //pobranie enuma za pomoca scannera

        System.out.println("Wybrana wartość: " + speed);
        System.out.println(speed.speedValue + "kmh");

    }
}
