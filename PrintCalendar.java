import java.util.*;
public class PrintCalendar
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Month :");
        String month = sc.nextLine();
        System.out.println("Enter Year :");
        int year = sc. nextInt();
        int date = 1;

        int day = DayPrediction.get_day(date,month,year);
        MonthCalendar(month,year,day);
    }

    static void MonthCalendar(String month ,int year ,int day)
    {
        int end_date =  No_of_days(month,year);
        System.out.println("SUN MON TUE WED THU FRI SAT");
        int date =1;
        for(int row = 0; row <6 ;row++)
        {
            for(int col =0 ; col<7 ;col++)
            {
                if(date <=end_date)
                {
                    if (row == 0 && col < day) {
                        System.out.printf("%4c",' ');
                    }
                    else {
                        System.out.printf("%4d",date);
                        date++;
                    }
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }

    static int No_of_days(String m , int y)
    {
        int end =0;
        switch (m.toLowerCase())
        {
            case "january":
                end = 31;
                break;
            case "february":
                if(isleapYear(y))
                    end = 29;
                else
                    end = 28;
                break;
            case "march":
                end = 31;
                break;
            case "april":
                end = 30;
                break;
            case "may":
                end = 31;
                break;
            case "june":
                end = 30;
                break;
            case "july":
                end = 31;
                break;
            case "august":
                end = 31;
                break;
            case "september":
                end = 30;
                break;
            case "october":
                end = 31;
                break;
            case "november":
                end = 30;
                break;
            case "december":
                end = 31;
                break;
            default:
                System.out.println("Invalid month name entered.");
        }

        return end;

    }
    static boolean isleapYear(int year)
    {
        if( (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            return true;
        return false;
    }
}
