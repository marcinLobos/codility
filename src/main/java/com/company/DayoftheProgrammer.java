package com.company;

public class DayoftheProgrammer {

    static String dayOfProgrammer(int year) {

        /**
         * Marie invented a Time Machine and wants to test it by time-traveling to visit Russia on the Day of the Programmer (the  day of the year) during a year in the inclusive range from  to .
         *
         * From 1700 to 1917 , Russia's official calendar was the Julian calendar; since 1919 they used the Gregorian calendar system.
         * The transition from the Julian to Gregorian calendar system occurred in 1918 , when the next day after January 31  was February 14.
         * This means that in 1918, February 14 was the 32 day of the year in Russia.
         *
         * In both calendar systems, February is the only month with a variable amount of days; it has 29 days during a leap year, and 28 days during all other years.
         * In the Julian calendar, leap years are divisible by 4; in the Gregorian calendar, leap years are either of the following:
         *
         * Divisible by 400.
         * Divisible by 4 and not divisible by 100.
         * Given a year, y, find the date of the 256 day of that year according to the official Russian calendar during that year.
         * Then print it in the format dd.mm.yyyy, where dd is the two-digit day, mm is the two-digit month, and yyyy is .
         *
         * For example, the given 1984.  is divisible by 4, so it is a leap year.
         * The 256 day of a leap year after 1918 is September 12, so the answer is 12.09.1984 .
         *
         * From https://www.hackerrank.com
         */


        final int programersDay = 256;
        int[] normal =  {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] leap =    {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] y1918 =   {31, 15, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


        int month, day;
        if (year == 1918) {

            month = monthDayOfYear(y1918, programersDay)[0];

            if (month == 2)
                day = monthDayOfYear(y1918, programersDay)[1] + 13;
            else
                day = monthDayOfYear(y1918, programersDay)[1];

        } else if (isLeap(isJulian(year), year)) {

            month = monthDayOfYear(leap, programersDay)[0];
            day = monthDayOfYear(leap, programersDay)[1];

        } else {

            month = monthDayOfYear(normal, programersDay)[0];
            day = monthDayOfYear(normal, programersDay)[1];
        }

        return String.format("%02d.%02d.%02d", day, month, year);

    }


    static boolean isLeap(boolean isJulian, int year) {

        if (year % 4 == 0) {

            if (!isJulian) {
                if (year % 100 == 0 && year % 400 != 0)
                    return false;
                else
                    return true;
            } else {
                return true;
            }

        } else {
            return false;
        }
    }

    static boolean isJulian(int year) {
        return year < 1918;
    }

    static int[] monthDayOfYear(int[] months, int dayOfYear) {

        int sum = 0;
        int monthDay[] = new int[2];

        for (int i = 0; i < months.length; i++) {
            sum += months[i];
            if (sum > dayOfYear) {
                monthDay[0] = i + 1;
                break;
            }

        }

        monthDay[1] = months[monthDay[0] - 1] - (sum - dayOfYear);
        return monthDay;
    }


}
