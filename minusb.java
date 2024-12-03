public class minusb {
    public static void main(String[]args){
        //setting the variables a, b and c
        double a = 1;
        System.out.println("A is "+ a);
        double b = 5;
        System.out.println("B is "+ b);
        double c = 6;
        System.out.println("C is "+ c);

        //Initialising x1 and x2
        double x1 = 0;
        double x2 = 0;


        //Showing the steps to solve the formula
        System.out.println("");
        System.out.println("B squared is " + (b*b));
        System.out.println("-4 multiplied by A and C is " + (-4*a*c));
        System.out.println("2 mulitplied by A is " + (2*a));
        System.out.println("");

        //Getting output number 1
        x1 = -b+Math.sqrt(b*b-4*a*c)/2*a;
        System.out.println("-B + the square root of Bsquared plus 4ac is " + ( -b+Math.sqrt(b*b-4*a*c)) );
        System.out.println( -b+Math.sqrt(b*b-4*a*c) + " divided by 2A is " + x1);

        //Getting output number 2
        x2 = -b-Math.sqrt(b*b-4*a*c)/2*a;
        System.out.println("");
        System.out.println("-B - the square root of Bsquared plus 4ac is " + ( -b-Math.sqrt(b*b-4*a*c)) );
        System.out.println( -b- Math.sqrt(b*b-4*a*c) + " divided by 2A is " + x2);

    }
}
