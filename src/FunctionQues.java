import java.util.Scanner;

public class FunctionQues {

//    Average of Three Numbers:
//    public static int AVG(int num1,int num2,int num3){
//        return (num1+num2+num3)/3;
//    }

//    Even or not
    public static boolean isEven(int num){
        if(num%2==0){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
//        Scanner scn = new Scanner(System.in);
//        System.out.print("Enter First Number: ");
//        int a = scn.nextInt();
//        System.out.print("Enter Second Number: ");
//        int b = scn.nextInt();
//        System.out.print("Enter Third Number: ");
//        int c = scn.nextInt();
//
//        float ans = AVG(a,b,c);
//        System.out.println(ans);

        System.out.println(isEven(55));

    }
}