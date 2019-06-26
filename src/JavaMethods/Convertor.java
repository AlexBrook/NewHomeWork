package JavaMethods;

public class Convertor {
    public final static double DEFAULT_KELVIN_VALUE = 273.16;
    public final static double DEFAULT_FAHRENHEIT_VALUE = 32;


    public static double CelsiusToKalvin(double celsius) {
        return celsius + DEFAULT_KELVIN_VALUE;
    }

    public static double KalvinToCelsius(double kalvin) {
        return kalvin - 273.15;
    }

    public static double CelsiusToFahrenheit(double celsius) {
        return (celsius + 9 / 5) + 32;
    }

    public static double FahreinhaitToCelsius(double fahrenheit) {
        return (fahrenheit - DEFAULT_FAHRENHEIT_VALUE) * 5 / 9;
    }

    public static double MetersToInches(double meter) {
        return meter * 39.37;
    }

    public static double InchesToMeters(double inches) {
        return inches / 39.37;
    }

    public static double MilesToKilometers(double mile) {
        return mile * 1.60934;
    }

    public static double KilometersToMiles(double kilometers) {
        return kilometers / 1.60934;
    }

    public static double PoundsToKilograms(double pounds) {
        return pounds / 2.205;
    }

    public static double KilogramsToPounds(double kilogram) {
        return kilogram * 2.205;
    }

    public static int DecToBin(int dec) {
        int t = 0;
        while (dec > 0) {
            dec = dec / 2;
            t = dec % 2;
        }
        return t;
    }

    public static int BinToDec(int bin){
        int decimal = 0;
        int n = 0;
        while(true){
            if(bin == 0){
                break;
            } else {
                int temp = bin%10;
                decimal += temp*Math.pow(2, n);
                bin = bin/10;
                n++;
            }
        }
        return decimal;
    }

    public static int DecToHex(int dec){
      String conve = Integer.toHexString(dec);
       return Integer.parseInt(conve);
    }

    public static String HexToDec(String hex){
        int decimal = Integer.parseInt(hex,16);
        return Integer.toString(decimal);
    }

    public static void main(String[]args){
        System.out.println(DecToBin(434));
        System.out.println(BinToDec(101));
        System.out.println(DecToHex(155));
        System.out.println(HexToDec("a"));
    }
}