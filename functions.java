import java.util.Scanner;
public class functions {
    public static double CalculateEmploySalary(int numh,
                                               int numHO,
                                               int numBHO
                                               ){
        double Hours = (numh*365)-(8*numHO)+(8*numBHO);
        double salary = Hours*50;
        return salary;

    }
    public static void main(String[] args){
        Scanner Scanner=new Scanner(System.in);
        System.out.println("Enter number of hours");
        int hours= Scanner.nextInt();
        System.out.println("Enter number of holidays");
        int holidays = Scanner.nextInt();
        System.out.println("Enter number of Bonus holidays");
        int BonusHolidays = Scanner.nextInt();
        double PersonGrand=CalculateEmploySalary(hours,holidays,BonusHolidays);
        System.out.println(PersonGrand);

    }
}
