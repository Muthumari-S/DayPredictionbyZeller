import java.util.Scanner;
public class DayPrediction
{
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter Birth Date: ");
            int date = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Birth Month: ");
            String month = sc.nextLine();

            System.out.print("Enter Birth Year: ");
            int year = sc.nextInt();

            get_day(date, month, year);

        }

        static int get_day(int date, String month, int year)
        {
            String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

            int[] monthValues = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};

            int lastTwoDigitsOfYear = year % 100;
            int leapYearAdjustment = lastTwoDigitsOfYear / 4;
            int yearAdjustment = 0;
            if (year >= 1600 && year < 1700)
            {
                yearAdjustment = 6;
            }
            else if (year >= 1700 && year < 1800)
            {
                yearAdjustment = 4;
            }
            else if (year >= 1800 && year < 1900)
            {
                yearAdjustment = 2;
            }
            else if (year >= 1900 && year < 2000)
            {
                yearAdjustment = 0;
            }
            else if (year >= 2000 && year < 2100)
            {
                yearAdjustment = 6;
            }
            else
            {
               // return "Year out of range";
            }


            month = month.toLowerCase();

            int monthValue = 0;
            switch (month) {
                case "january":
                    monthValue = monthValues[0];
                    break;
                case "february":
                    monthValue = monthValues[1];
                    break;
                case "march":
                    monthValue = monthValues[2];
                    break;
                case "april":
                    monthValue = monthValues[3];
                    break;
                case "may":
                    monthValue = monthValues[4];
                    break;
                case "june":
                    monthValue = monthValues[5];
                    break;
                case "july":
                    monthValue = monthValues[6];
                    break;
                case "august":
                    monthValue = monthValues[7];
                    break;
                case "september":
                    monthValue = monthValues[8];
                    break;
                case "october":
                    monthValue = monthValues[9];
                    break;
                case "november":
                    monthValue = monthValues[10];
                    break;
                case "december":
                    monthValue = monthValues[11];
                    break;
                default:
                    //return "Invalid month name entered.";
            }

            // Calculate the sum of the various components
            int sum = date + monthValue + yearAdjustment + lastTwoDigitsOfYear + leapYearAdjustment;

            // Calculate the day of the week
            int dayNumber = sum % 7;

            // Return the corresponding weekday name
            //return weekdays[dayNumber];
            System.out.println("The day of the week is: " + weekdays[dayNumber]);
            return dayNumber;
        }
    }


