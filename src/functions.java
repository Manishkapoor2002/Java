import java.util.Scanner;

public class functions {

    public static int Factorial(int a) {
        int fact = 1;
        for (int i = a; i >= 1; i--) {
            fact = fact * i;
        }
        return fact;
    }

    public static int Coefficient(int n, int r) {

        int factOfn = Factorial(n);
        int factOfr = Factorial(r);
        int factOfnminr = Factorial((n - r));

        return (factOfn) / (factOfr * factOfnminr);
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        long EndAnswer = Coefficient(n, r);
        System.out.println("Factorial of : " + n + " and " + r + " = " + EndAnswer);
//
    }

}