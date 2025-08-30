/**
 * 
Student ID: 22159296
Name: Aaron Doan
Campus: Parramatta South
Tutor Name: Tad Bak
Class Day: Wednesday
Class Time: 3pm - 5pm
 */
import java.util.Scanner;

public class Temperatures {

    public static boolean isValid(double temp) {
        return temp >= -10 && temp <= 50;
    }

    public static void printSummary(String label, short count, float sum) {
        if (count == 0) {
            System.out.println(label + ": " + count + " day(s), average temperature: N/A");
        } else {
            System.out.println(label + ": " + count + " day(s), average temperature: " + (sum / count));
        }
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        short freezingCount = 0, coldCount = 0, mildCount = 0, warmCount = 0, hotCount = 0, extremeCount = 0;
        float freezingSum = 0, coldSum = 0, mildSum = 0, warmSum = 0, hotSum = 0, extremeSum = 0;

        System.out.println("Welcome to the Sydney Daily Maximum Temperature Analyser!!");
        System.out.println("Enter the daily maximum temperatures for Sydney. Enter -999 to finish.");

        int day = 1;
        boolean programExit = true;
        
        while(programExit) {
            System.out.print("Enter temperature for day " + day + ": ");
            double t = keyboard.nextDouble();
            if (t == -999) break;

            if (!isValid(t)) {
                System.out.println("  -> Ignored (must be between -10 and 50).");
                continue;
            }

            if (t < 0) {
                freezingCount++; freezingSum += t;
            } else if (t < 10) {
                coldCount++; coldSum += t;
            } else if (t < 20) {
                mildCount++; mildSum += t;
            } else if (t < 30) {
                warmCount++; warmSum += t;
            } else if (t < 40) {
                hotCount++; hotSum += t;
            } else {
                extremeCount++; extremeSum += t;
            }
            day++;
        }

        System.out.println("\n===== Temperature Analysis =====");
        printSummary("Freezing", freezingCount, freezingSum);
        printSummary("Cold", coldCount, coldSum);
        printSummary("Mild", mildCount, mildSum);
        printSummary("Warm", warmCount, warmSum);
        printSummary("Hot", hotCount, hotSum);
        printSummary("Extreme", extremeCount, extremeSum);

    }
}
