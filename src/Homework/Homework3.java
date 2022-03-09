package Class3;

public class Homework3 {
    public static void main(String[] args) {

        /**
         *
         * Due date: Mar 8 2022
         *
         * Refer for formula: https://www.rapidtables.com/convert/temperature/celsius-to-fahrenheit.html
         *
         * C -> F
         * C -> K
         *
         * F -> C
         * F -> K
         *
         * K -> C
         * K -> F
         *
         */

        /**
         * Convert degree-Celsius into deg-Fahrenheit
         *
         * fT = cT × 9/5 + 32
         *
         */
        double cTemp = 25.3;
        double fTemp = cTemp * 9/5 + 32;
        System.out.println("\n" + cTemp + "˚C is equal to " + fTemp + "˚F");

        /**
         * Convert degree-Celsius into deg-Kelvin
         *
         * kT = cT + 273
         *
         */
        double cTemp2 = 25.3;
        double kTemp = cTemp2 + 273;
        System.out.println("\n" + cTemp2 + "˚C is equal to " + kTemp + "˚K");

        /**
         * Convert degree-Fahrenheit into deg-Celsius
         *
         * fT = cT - 32 × 5/9
         *
         */
        double cTemp3 = 25.3;
        double fTemp3 = (cTemp - 32) * 5/9;

        System.out.println("\n" + cTemp3 + "˚F is equal to " + fTemp3 + "˚C");
        System.out.println("25.3˚C = " + String.format("%.1f", fTemp3)+"˚F"); // 33.3
        /**
         * Convert degree-Fahrenheit into deg-Kelvin
         *
         * kT = (fT + 459.67) * 5/9
         *
         */
        double fTemp4 = 25.3;
        double kTemp2 = (fTemp4 + 459.67) * 5/9;

        System.out.println("\n" + kTemp2 + "˚F is equal to " + fTemp3 + "˚K");
        System.out.println("25.3˚C = " + String.format("%.1f", fTemp3)+"˚K"); // 33.3

        /**
         * Convert degree-Kelvin into deg-Celsius
         *
         * kT = cT - 273.15
         *
         */
        double cTemp4 = 25.3;
        double kTemp3 = (cTemp4-273.15);

        System.out.println("\n" + cTemp4 + "˚C is equal to " + kTemp3 + "˚K");
        System.out.println("25.3˚C = " + String.format("%.1f", kTemp3)+"˚K"); // 33.3

        /**
         * Convert degree-Kelvin into deg-Fahrenheit
         *
         * kF = kT * 9/5 - 459.67
         *
         */
        double kTemp5 = 25.3;
        double fTemp5 = (kTemp5 * 9/5) - 459.67;

        System.out.println("\n" + kTemp5 + "˚K is equal to " + fTemp5 + "˚F");
        System.out.println("25.3˚C = " + String.format("%.1f", fTemp5)+"˚F"); // 33.3

    }
}