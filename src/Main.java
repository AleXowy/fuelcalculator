
import javax.swing.*;
import java.math.BigDecimal;


import java.util.Locale;
import java.util.Scanner;

import static java.util.Locale.ENGLISH;

public class Main {
    public static void main(String[] args) {




        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        System.out.println("Podaj czas wyścigu");

        double raceTime = scanner.nextDouble();

        double raceTimesec = raceTime * 60;


        System.out.println("Podaj czas okrążenia MM.SS.MM");
        String imputlaptime = scanner.next();

        String[] timeParts = imputlaptime.split("[. :,]");







        double lapTimeMin = Double.parseDouble(timeParts[0]);
        double lapTimeSec = Double.parseDouble(timeParts[1]);
        double lapTimeMm;


        if (timeParts.length != 3) {
            lapTimeMm = 0;

        }else {
            lapTimeMin = Double.parseDouble(timeParts[0]);
            lapTimeSec = Double.parseDouble(timeParts[1]);
            lapTimeMm = Double.parseDouble(timeParts[2]);


        }

        double lapTimeSecTotal = (lapTimeMin * 60 + lapTimeSec) + (lapTimeMm / 10);

        double raceLaps = raceTimesec / lapTimeSecTotal;

        System.out.println("Podaj spalanie");
        double fuelPerLap = scanner.nextDouble();

        double raceFuel = (raceLaps * fuelPerLap);

        double raceLapsPlus1 = (raceTimesec / lapTimeSecTotal);

        double raceFuelPlus1 = (raceLapsPlus1 * fuelPerLap)+fuelPerLap;




        int decimalPlaces = 0;
        BigDecimal raceLapsPlus1rounded = BigDecimal.valueOf(raceFuelPlus1).setScale(decimalPlaces,BigDecimal.ROUND_UP);
        BigDecimal raceFuelRounded = BigDecimal.valueOf(raceFuel).setScale(decimalPlaces,BigDecimal.ROUND_UP);
        BigDecimal racelapsRounded = BigDecimal.valueOf(raceLaps).setScale(decimalPlaces,BigDecimal.ROUND_UP);





        System.out.println("Minimalna Ilość paliwa to: " + raceFuelRounded);
        System.out.println("Ilość Lapów: " + racelapsRounded);
        System.out.println("Ilość paliwa +1 lap: " + raceLapsPlus1rounded);






    }

}
