package com.nighthawk.spring_portfolio.mvc.calendar;

// Prototype Implementation

public class APCalendar {

    /** Returns true if year is a leap year and false otherwise.
     * isLeapYear(2019) returns False
     * isLeapYear(2016) returns True
     */          
    public static boolean isLeapYear(int year) {

        if ( (year % 4 == 0) && (year % 100 != 0)){
            return true;
        }
        else if ( year % 400 == 0 ){
            return true;
        }
        else {
            return false;
        }

        }

        /** Returns the number of leap years between year1 and year2, inclusive.
     * Precondition: 0 <= year1 <= year2
    */ 
    
    public static int numberOfLeapYears(int year1, int year2) {
       
        int numOfLeapYears = 0; // initialize final count variable
        for(int i = year1; i <= year2; i++){ // for loop that starts at the year1 number and goes until year 2 including it
            if(isLeapYear(i)){  // if the year is a leap year, add 1 to the count
                numOfLeapYears += 1;
            }
        }
        return numOfLeapYears; // return the count

        }
        
    /** Returns the value representing the day of the week 
     * 0 denotes Sunday, 
     * 1 denotes Monday, ..., 
     * 6 denotes Saturday. 
     * firstDayOfYear(2019) returns 2 for Tuesday.
    */
    public static int firstDayOfYear(int year) {

        return year = (int) Math.floor( Math.random() * 7 );

        }


    /** Returns n, where month, day, and year specify the nth day of the year.
     * This method accounts for whether year is a leap year. 
     * dayOfYear(1, 1, 2019) return 1
     * dayOfYear(3, 1, 2017) returns 60, since 2017 is not a leap year
     * dayOfYear(3, 1, 2016) returns 61, since 2016 is a leap year. 
    */ 
    public static int dayOfYear(int month, int day, int year) {
        // implementation not shown
        
        return (int) (Math.random() * (366 - 1)) + 1;
    
        }

    

    /** Returns the value representing the day of the week for the given date
     * Precondition: The date represented by month, day, year is a valid date.
    */
    public static int dayOfWeek(int month, int day, int year) { 
      
        int startDay = firstDayOfYear(year);
        int selectedDay = dayOfYear(month, day, year);
        int returnDay = (startDay + selectedDay - 1) % 7;
        return returnDay;
        
        }

    /** Tester method */
    public static void main(String[] args) {
       
        // Private access modifiers
        System.out.println("\n \n firstDayOfYear: " + APCalendar.firstDayOfYear(2022));

        System.out.println("\n dayOfYear: " + APCalendar.dayOfYear(1, 1, 2022));

        // Public access modifiers
        System.out.println("\n Testing isLeapYear:");

        System.out.println("\n isLeapYear 2022: " + APCalendar.isLeapYear(2022));
        System.out.println("\n isLeapYear 2000: " + APCalendar.isLeapYear(2000));
        System.out.println("\n isLeapYear 3000: " + APCalendar.isLeapYear(3000));


        System.out.println("\n numberOfLeapYears: " + APCalendar.numberOfLeapYears(2000, 2022));

        System.out.println("\n dayOfWeek: " + APCalendar.dayOfWeek(1, 1, 2022));
    }

}
