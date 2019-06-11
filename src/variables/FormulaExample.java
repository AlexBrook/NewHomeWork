package variables;
import static java.lang.Math.*;
public class FormulaExample {
    public static void main(String[] args) {

        double celsius = 24.4;
        double fahrenheit = 100;
        double kalvin = 19;
        double CelsiusToFar = (celsius * 9 / 5) - 32;
        double FahrenheitToCelsius = (fahrenheit - 32) * 5/9;
        double CelsiusToKalvin = celsius + 273.15;
        System.out.println( "Celsius to Fahrenheit: " + CelsiusToFar);
        System.out.println("Fahrenheit to Celsius: " + FahrenheitToCelsius);
        System.out.println("Celsius to Kalvin: " + CelsiusToKalvin);


        double meter = 4.43;
        double MeterToInches = meter * 39.37;
        double InchesToMeter = MeterToInches/meter;
        System.out.println("Meter in inches: " + MeterToInches);
        System.out.println("Inches to meter: " + InchesToMeter);

        double miles = 41.5;
        double MilesToKilometers = miles * 1.609;
        double KilometerToMiles = MilesToKilometers/1.609;
        System.out.println("Miles to kilometer " + MilesToKilometers);
        System.out.println("Kilometer to miles " + KilometerToMiles);

        double kilograms = 89.7;
        double KilogramsToPunds = kilograms*2.2046;
        double PoundsToKilograms = KilogramsToPunds/2.2046;
        System.out.println("Kilograms to punds " + KilogramsToPunds);
        System.out.println("pounds to kilograms " + PoundsToKilograms);

        double KmPerHour = 100;
        double KmToMi = KmPerHour/0.6214;
        double MiToKm = KmToMi * 0.6214;
        System.out.println("Km To Mi " + KmToMi);
        System.out.println("Miles to kilometer " + MiToKm);

        double Seconds = 24423453;
        double SecondsToDays = Seconds/86400;
        System.out.println("Seconds to days " + SecondsToDays);
        double SecondsToHours = Seconds/3600;
        System.out.println("Seconds to Hours " + SecondsToHours);
        double SecondsToMin = Seconds*60;
        System.out.println("Seconds to minutes " + SecondsToMin);

        double years = 24;
        double weeks = years*52.143;
        double days = weeks*7;
        double hours = days * 24;
        double minutes = hours * 60;
        double seconds = minutes * 60;
        System.out.printf("You live %f years, %f weeks, %f days, %f hours, %f minutes, %f seconds",years,weeks,days,hours,minutes,seconds);

        








    }
}