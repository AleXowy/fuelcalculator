
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

import static java.util.Locale.ENGLISH;

public class Main {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        System.out.println("Podaj czas wyścigu");

        double raceTime = scanner.nextInt();


        double raceTimesec = raceTime * 60;


        System.out.println("Podaj czas okrążenia MM.SS");
        String imputlaptime = scanner.next();

        String[] timeParts = imputlaptime.split("[. :]");

        if (timeParts.length != 2) {
            System.out.println("źle");
            return;
        }

        double lapTimeMin = Integer.parseInt(timeParts[0]);
        double lapTimeSec = Integer.parseInt(timeParts[1]);

        double lapTimeSecTotal = lapTimeMin * 60 + lapTimeSec;

        double raceLaps = (double) raceTimesec / lapTimeSecTotal;

        System.out.println("Podaj spalanie");
        double fuelPerLap = scanner.nextDouble();

        double raceFuel = (raceLaps * fuelPerLap);

        System.out.println(raceFuel);







    }

}
