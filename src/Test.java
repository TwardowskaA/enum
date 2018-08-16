import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dostępne prędkości:");
        Speed[] values = Speed.values(); //pobranie wszystkich wartosci enuma
        for (Speed speed : values) {
            System.out.println(speed + "(" + speed.translation + ")");
        }
        System.out.println("Wybierz predkość:");
        String x = scan.nextLine();
        x  = x.toUpperCase();

        Speed speed = null;

        try {
            speed = Speed.valueOf(x); //pobranie enuma za pomoca scannera

        } catch (IllegalArgumentException e) {
            //szukanie enuma po nazwie
            Speed[] all = Speed.values();
            speed = null;
            for (Speed speed1 : all) { //wybranie opcji angielskiej lub polskiej
                if (speed1.translation.equalsIgnoreCase(x)) {
                    speed = speed1;
                    break;
                }
            }

        }

        if (speed != null) {
            System.out.println("Wybrana wartość: " + speed);
            System.out.println(speed.speedValue + "kmh");
        } else {
            System.out.println("Podana wartość jest nieprawidlowa");
        }
    }
}
