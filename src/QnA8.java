import javax.swing.plaf.TextUI;
import java.util.Scanner;

public class QnA8 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
//Sum of first n natural numbers
//        int num = scn.nextInt();
//        int sum = 0;
//
//        while(num>=1){
//            sum += num;
//            num--;
//        }
//        System.out.println(sum);

//        Patterns:
//        int n = scn.nextInt();
//        for (int i = 1; i<=n;i++){
//            for (int j = 1;j<=n;j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }

//        Reserve the variable: 110098 to 890011
//        int number = scn.nextInt();
//        while(number >0){
//            int rem = number %10;
//            System.out.print(rem);
//            number = number/10;
//        }

//        int dig = 0;
//
//        while(number >0){
//           int rem =  number % 10;
//           dig = (dig * 10) + rem;
//           number = number/10;
//        }
//        System.out.print(dig);


//        Do-while loop
//        int i = 10;
//        do{
//            System.out.println("Manish kapoor");
//            i--;
//        }while(i>=1);
//check the multiple of 10 and exit && Example of Break

//        do{
//            System.out.print("Enter Your number: ");
//            int checknum = scn.nextInt();
//            if (checknum % 10 == 0){
//                break;
//            }
//            System.out.println(checknum);
//        }while(true);

//check the multiple of 10 and exit && Example of continue

//        do{
//            int num = scn.nextInt();
//            if(num % 10 == 0){
//               continue;
//            };
//            System.out.println(num);
//        }while(true);

//        Prime or not

        int num = scn.nextInt();
        boolean flag = true;
        for(int i = 2;i<= num/2;i++){
            if (num % i == 0) {
                flag = false;
                break;

            }
        }
        if(flag){
            System.out.println("prime");
        }else {
            System.out.println("Not a prime");

        }





    }
}