package makingchange;
import java.util.Scanner;
/**
 *
 * Max Mok P.3
 * I'm making a project to simulate a cash register
 */
public class MakingChange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x;
        double y;
        double dif;
        double totalTen;
        double totalFive;
        double totalOne;
        double totalQuarter;
        double totalDime;
        double totalNickel;
        double totalPenny;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter item price: ");
        x = scanner.nextDouble();
        while (x<0){
            System.out.println("The value cannot be a negative. Please try again");
            System.out.println("Enter your item price: ");
            x = scanner.nextDouble();
        }
        System.out.println("Enter amount you are giving to the register");
        y = scanner.nextDouble();
        while (y<0) {
            System.out.println("The value cannot be a negative. Please try again");
            System.out.println("Enter amount you are giving to the register");
            y = scanner.nextDouble();
        }
        if (x>y){
            System.out.println("You need to have more money");
        }
        else if (x==y){
            System.out.println("Thanks, have a nice day!");
        }
        else {
            dif = y-x;
            totalTen = dif/10;
            dif%=10;
            totalFive = dif/5;
            dif%=5;
            totalOne = dif/1;
            dif%=1;
            totalQuarter = dif/.25;
            dif%=.25;
            totalDime = dif/.1;
            dif%=.1;
            totalNickel = dif/.05;
            dif%=.05;
            totalPenny = dif/.01;
            dif%=.01;
            System.out.println("Your change is");
            System.out.printf("%d ten(s)\n",(int)totalTen);
            System.out.printf("%d five(s)\n",(int)totalFive);
            System.out.printf("%d dollar(s)\n",(int)totalOne);
            System.out.printf("%d quarter(s)\n",(int)totalQuarter);
            System.out.printf("%d dime(s)\n",(int)totalDime);
            System.out.printf("%d nickel(s)\n",(int)totalNickel);
            System.out.printf("%d penny(ies)\n",(int)totalPenny);
        }
    }
}
    
    

