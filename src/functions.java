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
//        public static int sum(int a, int b){
//            return a + b;
//        }
//
//        public static int sum(int a, int b, int c){
//            return a + b + c;
//        }
//    Function overloading using Parameters
//        Function overloading using Data Types

//    public static int multiply(int a, int b){
//        return a*b;
//    }
//    public static float multiply(float a, float b){
//        return a*b;
//    }


//    Function to check Prime or not:
//    public static String CheckPrimeorNot(int num){
//        int count = 2;
//
//        if (num == 2){
//            return "Prime Number!";
//        }
//
//        while(count<Math.sqrt(num)){
//            if (num%count==0){
//                return "Not a Prime";
//            }
//            count++;
//        }
//        return "Prime Number!";
//
//    }


//    Function to generate all prime number from 2 to nth term

//    public static void Primelist(int num){
//        for(int i = 2;i<=num;i++){
//          boolean ans = checkPrime(i);
//          if(ans==true){
//              System.out.println(i);
//          }
//        }
//    }
//
//    public static boolean checkPrime(int number) {
//        if (number==2){
//            return true;
//        }
//
//        for(int i = 2;i<=(Math.sqrt(number));i++){
//                if (number % i == 0) {
//                    return false;
//                }
//        }
//        return true;
//    }


//    Binary to Decimal:
    public static int BinaryToDecimal(int num){
    int decimal = 0;
        int i = 0;
        while(num>0){
            if(num%10==1){
            decimal = decimal + (int)(1*Math.pow(2,i));
            }
            i++;
            num = num/10;
        }

        return decimal;
    }

    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        int r = scn.nextInt();
//        long EndAnswer = Coefficient(n, r);
//        System.out.println("Factorial of : " + n + " and " + r + " = " + EndAnswer);
//          System.out.println(sum(2,5));
//          System.out.println(sum(2,5,7));
//          System.out.println(multiply(1,2));
//          System.out.println(multiply(20.1f,14.1f));
//        int num = 12;
//        System.out.println( num +" Number is " +CheckPrimeorNot(num));
//        Primelist(100);

        int Ans = BinaryToDecimal(1010101);
        System.out.println(Ans);
    }

}