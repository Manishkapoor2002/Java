import java.util.Scanner;

public class QnA7 {
    public static void main(String[] args){
//        odd or even

        Scanner scn = new Scanner(System.in);

//        for(int i = 0;i<=5;i++){
//            int num = scn.nextInt();
//            if (num % 2 == 0) {
//                System.out.println("Given Number is Even.");
//            } else {
//                System.out.println("Given Number is Odd");
//            }
//        }


//        Basic Income tax calculator

//        int income = scn.nextInt();
//
//        if(income<500000){
//            System.out.println("Your Income tax amount is null.");
//        } else if ((income>=500000) && (income<1000000)) {
//            System.out.println("Your Income tax amount is " +(income * 20)/100);
//        } else if (income>=1000000) {
//            System.out.println("Your Income tax amount is " +(income * 30)/100);
//        }else{
//            System.out.println("Something went wrong!!, Please try again later.");
//        }


//        Largest of three
//        int num1 = scn.nextInt();//1
//        int num2 = scn.nextInt();//3
//        int num3 = scn.nextInt();//6
//
//        int max = num1;

//     if(max<num2){
//         if(num3>num2){
//             max = num3;
//         }else {
//             max = num2;
//         }
//     }else if (max<num3){
//         max = num3;
//        }

//        if(num1>=num2 && num1>=num3){
//            System.out.println(num1);
//        }else if(num2>=num3){
//            System.out.println(num2);
//        }else {
//            System.out.println(num3);
//        }
//
//        System.out.println(max);

//      Ternary Operator

//        String variable = (5>12)?"True":"False";
//
//        System.out.println(variable);


//        Calculator using switch statments
//        System.out.print("Enter your First number: ");
//        int num1 = scn.nextInt();
//        System.out.print("Choose one Experssion : + - * / ");
//        String math = scn.next();
//        System.out.print("Enter your Second number: ");
//        int num2 = scn.nextInt();
//        int cal = 0;
//
//        switch(math){
//            case "+" : cal = num1 + num2;
//                System.out.println(num1 +math +num2 +" = " +cal);
//            break;
//            case "-" : cal = num1 - num2;
//                System.out.println(num1 +math +num2 +" = " +cal);
//            break;
//            case "*" : cal = num1 * num2;
//                System.out.println(num1 +math +num2 +" = " +cal);
//            break;
//            case "/" : cal = num1 / num2;
//                System.out.println(num1 +math +num2 +" = " +cal);
//            break;
//            default:
//                System.out.println("Please Select Any of the given operator!!");
//        }


//        Leap year or normal year

        int year = scn.nextInt();

        if(year%4 == 0){
            if(year%100 == 0){
               if(year%400 == 0){
                   System.out.println(year +" is a Leap year");
               }else{
                   System.out.println(year +" is Not a Leap year");
               }
            }else{
                System.out.println(year +" is a Leap year");
            }
        }else{
            System.out.println(year +" is Not a Leap year");
        }


    }
}