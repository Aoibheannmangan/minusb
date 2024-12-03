import java.util.Scanner;

public class samplecalculation {
    public static void main(String[]args){
        double a = 1;
        double b = 3;
        double c = 2;
        double x1 = 0;
        double x2 = 0;

        double bsquared = b * b;
        double fourac = 4 * a * c;
        double stepthree = bsquared - fourac;
        if(stepthree >= 0){
            double squareroot = Math.pow(stepthree, 0.5);

            double twoa = 2 * a;
            double minus = b;

            double minusb = minus - squareroot;
            x1 = minusb / twoa;
            System.out.println("X1 is " +x1);

            double plusb = minus + squareroot;
             x2 = plusb / twoa;
            System.out.println("X2 is "+x2);
        } else {
            System.out.println("No solution yet");
        }


    }
}
