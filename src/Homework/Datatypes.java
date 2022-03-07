package Homework;

public class Datatypes {
    private String sSN;

    public static void main (String[] args) {

        //1. Number of hours in a day
        byte hoursInDay = 24;
        System.out.println("The number of hours in a day = " +hoursInDay+ " hours");
        //2. max no. days in a year
        int maxDaysInYear=365;
        System.out.println("The Max number of days in a year = " +maxDaysInYear+ " days");

        //3. Total number of employees in an organisation
        int maxEmployees=1000;
        System.out.println("The Max number of Employees = " +maxEmployees+ " employees");

        //4. Population in a country
        int populationCountry=332403650;
        System.out.println("The Current population in this country is = " +populationCountry+ " people");

        //5. Mortgage Rate
        double mortgageRate = 2.99;
        System.out.println("The current mortgage rate is = " +mortgageRate+ "%");

        //6. Balance in a bank account
        int bankBalance=34570;
        System.out.println("The current bank balance is = $" +bankBalance+ " in the checking account");
        //7. does the sun rise from the west
        boolean sunRiseWest = false;
        System.out.println("The answer to Does the sun rise from west is = " +sunRiseWest+ " as it rises from East");

        //8. My Initials
        char myInitial1 = 'R', myInitial2='N', myInitial3='D';
        System.out.println("My Initials are " +myInitial1+myInitial2+myInitial3);
    }
}
