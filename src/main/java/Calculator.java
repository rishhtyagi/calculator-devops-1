import java.io.IOException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public static void  printAns(double ans) throws IOException {
        System.out.println("************************************************");
        System.out.println("Your answer is " + ans);
        System.out.println("************************************************");
        logger.info("Your answer is " + ans);
        System.in.read();
    }



    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int choice,num;


        do {

            System.out.println("Welcome to Mini Calculator... \nChoose one of the Following operation.");
            System.out.println("Press 1 for Square Root");
            System.out.println("Press 2 for Factorial");
            System.out.println("Press 3 for Natural logarithm");
            System.out.println("Press 4 for Power function");
            System.out.println("Press 0 to Exit");

            choice = sc.nextInt();

            switch (choice) {
                case 1:

                    logger.info("Sqare Root operation");
                    System.out.println("Enter the Number");
                    num = sc.nextInt();
                    logger.info("number entered for square root operations: "+num);
                    printAns(squareRoot(num));
                    break;

                case 2:
                    logger.info("Factorial operation");
                    System.out.println("Enter the Number");
                    num = sc.nextInt();
                    logger.info("number entered for factorial operations: "+num);
                    printAns(factorial(num));
                    break;

                case 3:
                    logger.info("Natual Logarithmic operation");
                    System.out.println("Enter the Number");
                    num = sc.nextInt();
                    logger.info("number entered for logrithmic operations: "+num);
                    printAns(naturalLog(num));
                    break;

                case 4:
                    logger.info("Power operation");
                    System.out.println("Enter the base number");
                    num = sc.nextInt();
                    System.out.println("Enter the power number");
                    double power = sc.nextInt();
                    logger.info("number entered for square root operations: "+num +"and"+power);
                    if (num==0||power==0)
                    {
                        System.out.println("Error: cannot take power");
                        logger.info("Cannot calculate 0 to the power 0");
                        break;
                    }

                    printAns(pow(num,power));
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Please choose correct option");
                    logger.info("Wrong operation selected");
                    break;
            }

        }while(choice != 0);

    }
    public static double squareRoot(int num)
    {
        double ans;
        try{
            ans = Math.sqrt(num);
            return ans;
        }catch (Exception e){
            System.out.println(e);
            return 0;
        }
    }
    public static double factorial(int num)
    {
        if (num<1)
        {
            System.out.println("illegal factorial operation");
            logger.info("illegal factorial operation");
            return -1;
        }
        long sum = 1;
        for(int i=2; i<=num; i++) {
            sum = sum * i;
        }
        return sum;
    }
    public static double naturalLog(int num)
    {
        double ans;
        try{
            ans = Math.log(num);
            return ans;
        }catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }
    public static double pow(double num,double power)
    {
        double ans;
        try{
            ans = Math.pow(num, power);
            return ans;
        }catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }
}

