package codingQuestions.strings;

import java.util.HashMap;

// 1-jan-1970 -- thur

public class DateProblem {
    public static void main(String[] args) {
        String date="16:07:2023";
        String pastdate="16:07:1880";

        String day=dayOfGivenDate(date);
        System.out.println(day);

    }

    private static String dayOfGivenDate(String date) {

        String [] str=date.split(":");
        int date_=Integer.parseInt(str[0]);
        int givenYear=Integer.parseInt(str[2]);
        int numberOfYears=givenYear-1970-1;
        int givenMonth=Integer.parseInt(str[1]);;
        System.out.println("givenMonth =  "+ givenMonth);
        int leapYearCount=0;
        for(int i=1970;i<givenYear;i++)
        {
            if (i%4==0 & i%100!=0)
                    leapYearCount++;
            else if(i%400==0)
                leapYearCount++;
        }
        System.out.println("leapYearCount = " + leapYearCount);
        System.out.println("NOn leapYearCount = " + (numberOfYears-leapYearCount));
        HashMap<Integer,Integer> months=new HashMap<>();
        months.put(1,31);
        months.put(2,28);
        months.put(3,31);
        months.put(4,30);
        months.put(5,31);
        months.put(6,30);
        months.put(7,31);
        months.put(8,31);
        months.put(9,30);
        months.put(10,31);
        months.put(11,30);
        months.put(12,31);
        HashMap<Integer,String> days=new HashMap<>();
        days.put(0,"Thursday");
        days.put(1,"Friday");
        days.put(2,"Saturday");
        days.put(3,"Sunday");
        days.put(4,"Monday");
        days.put(5,"Tuesday");
        days.put(6,"Wednesday");
        int numberOfRemainingDays=0;
        for(int i=1;i<givenMonth;i++)
        {
            System.out.println("months.get(i) = "+months.get(i));
            numberOfRemainingDays+=months.get(i);
        }
        numberOfRemainingDays=numberOfRemainingDays+date_;
        int numberOfDays=(numberOfYears-leapYearCount)*365+(leapYearCount)*366+numberOfRemainingDays;
        int day_=numberOfDays%7;
        System.out.println("day_ = " + day_ );
        return days.get(day_);

    }
    private static String dayOfGivenDate_(String date) {

        String [] str=date.split(":");
        int date_=Integer.parseInt(str[0]);
        int givenYear=Integer.parseInt(str[2]);
        int numberOfYears=1970-givenYear-1;
        int givenMonth=Integer.parseInt(str[1]);;
        System.out.println("givenMonth =  "+ givenMonth);
        int leapYearCount=0;
        for(int i=1970;i<givenYear;i++)
        {
            if (i%4==0 & i%100!=0)
                leapYearCount++;
            else if(i%400==0)
                leapYearCount++;
        }
        System.out.println("leapYearCount = " + leapYearCount);
        System.out.println("NOn leapYearCount = " + (numberOfYears-leapYearCount));
        HashMap<Integer,Integer> months=new HashMap<>();
        months.put(1,31);
        months.put(2,28);
        months.put(3,31);
        months.put(4,30);
        months.put(5,31);
        months.put(6,30);
        months.put(7,31);
        months.put(8,31);
        months.put(9,30);
        months.put(10,31);
        months.put(11,30);
        months.put(12,31);
        HashMap<Integer,String> days=new HashMap<>();
        days.put(0,"Thursday");
        days.put(1,"Friday");
        days.put(2,"Saturday");
        days.put(3,"Sunday");
        days.put(4,"Monday");
        days.put(5,"Tuesday");
        days.put(6,"Wednesday");
        int numberOfRemainingDays=0;
        for(int i=givenMonth;i<=12;i++)
        {
            System.out.println("months.get(i) = "+months.get(i));
            numberOfRemainingDays+=months.get(i);
        }
        numberOfRemainingDays=numberOfRemainingDays+date_;
        int numberOfDays=(numberOfYears-leapYearCount)*365+(leapYearCount)*366+numberOfRemainingDays;
        int day_=numberOfDays%7;
        System.out.println("day_ = " + day_ );
        return days.get(day_);

    }
}
//1. any day of year
//all possible test  cases --
//siva@fincent.com
