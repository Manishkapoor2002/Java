import java.util.Scanner;

public class functions {

//    public static int Factorial(int a) {
//        int fact = 1;
//        for (int i = a; i >= 1; i--) {
//            fact = fact * i;
//        }
//        return fact;
//    }
//
//    public static int Coefficient(int n, int r) {
//
//        int factOfn = Factorial(n);
//        int factOfr = Factorial(r);
//        int factOfnminr = Factorial((n - r));
//
//        return (factOfn) / (factOfr * factOfnminr);
//    }

//Basic of Function Overloading:
//    Function overloading using Parameters
        public static int sum(int a, int b){
            return a + b;
        }

        public static int sum(int a, int b, int c){
            return a + b + c;
        }
//    Function overloading using Parameters
//        Function overloading using Data Types

    public static int multiply(int a, int b){
        return a*b;
    }
    public static float multiply(float a, float b){
        return a*b;
    }

    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        int r = scn.nextInt();
//        long EndAnswer = Coefficient(n, r);
//        System.out.println("Factorial of : " + n + " and " + r + " = " + EndAnswer);
          System.out.println(sum(2,5));
          System.out.println(sum(2,5,7));
          System.out.println(multiply(1,2));
          System.out.println(multiply(20.1f,14.1f));

    }

}