/*Күн системасындагы планеталарга enum түзүңүз (Earth, Mars, Saturn ...)
Консолдон бир планетаны белгилеңиз. Эгер Mars болсо - анда "Марс жер планетасына окшош" же Jupiter болсо -
        анда "Юпитер күн системасындагы эң чоң планета" деп планетага жараша маалыматты консолго чыгарыңыз.
        Планета тууралуу маалыматты кыргыз тилинде көрсөтүңүз.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1-Меркурий, 2-Венера, 3-Земля, 4-Марс, 5-Юпитер, 6-Сатурн, 7-Уран, 8-Нептун");
        Scanner scan = new Scanner(System.in);

        int systems = scan.nextInt();
        switch (systems) {
            case 1:
                Mercury mercury = Mercury.MERCURY;
                System.out.println(mercury + " - " + mercury.getInformation());
                break;
            case 2:
                Venus venus = Venus.VENUS;
                System.out.println(venus + " - " + venus.getInformation());
                break;
            case 3:
                Earth earth = Earth.EARTH;
                System.out.println(earth + " - " + earth.getInformation());
                break;
            case 4:
                Mars mars = Mars.MARS;
                System.out.println(mars + " - " + mars.getInformation());
                break;
            case 5:
                Jupiter jupiter = Jupiter.JUPITER;
                System.out.println(jupiter + " - " + jupiter.getInformation());
                break;
            case 6:
                Saturn saturn = Saturn.SATURN;
                System.out.println(saturn + " - " + saturn.getInformation());
                break;
            case 7:
                Uranus uranus = Uranus.URANUS;
                System.out.println(uranus + " - " + uranus.getInformation());
                break;
            case 8:
                Neptune neptune = Neptune.NEPTUNE;
                System.out.println(neptune + " - " + neptune.getInformation());
                break;
            default:
                System.out.println("Андай планета кун системасында жок.");

        }
    }
}