import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
//        Pattern 1
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
//        for(int i = 1;i<=n;i++){
//            for(int j = 1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        Pattern 2
//        for(int i = n;i>=1;i--){
//            for(int j = i;j>=1;j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        Patter 3

//        for(int i = 1;i<=n;i++){
//            for(int j = 1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

//        Pattern 4
//        char ch = 'A';
//      for (int i = 1;i<=n;i++){
//        for (int j = 1;j<=i;j++){
//            System.out.print(ch);
//            ch++;
//        }
//          System.out.println();
//      }

//        Patter 5

//        for(int i = 1;i<=4;i++){
//            for(int j = 1;j<=5;j++){
////                if(i == 1 || i == 4){
////                    System.out.print("*");
////                }
////
////                if((i == 2 ||i == 3 )&& (j == 1 || j==5)){
////                    System.out.print("*");
////                }
////
////                if((i == 2 ||i == 3 )&& (j == 2 || j==3 || j == 4)){
////                    System.out.print(" ");
////                }
//
//                if(i == 1|| j == 1|| j == 5 || i == 4){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println();
//        }

//        Patter 6

//        for(int i = 1;i<=n;i++){
////            print spaces: || space = n-i
//            for(int j = 1; j<=(n -i); j++){
//                System.out.print(" ");
//            }
//            for(int k = 1;k<=i;k++){
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }

//        Patter 7
//        for(int i = n;i>=1;i--){
//            for(int j = 1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }


//        Pattern 8

//       int num = 1;
//       for(int i = 1;i<=n;i++){
//           for(int j = 1;j<=i;j++){
//               System.out.print(num +" ");
//               num++;
//           }
//           System.out.println();
//       }

//        Pattern 9

//        for(int i = 1;i<=n;i++){
//            for(int j = 1;j<=i;j++){
//                if((i+j)%2==0){
//                    System.out.print("1");
//                }else{
//                    System.out.print("0");
//                }
//            }
//            System.out.println();
//        }

//        Pattern 10

//        int space1 = n-2;
////        first part of butterfly
//
//      for(int i = 1;i<=(n/2);i++){
////          print initial star
//          for(int j = 1;j<=i;j++){
//              System.out.print("*");
//          }
//
////          print space btw stars:
//          for(int k = 0;k<space1;k++){
//              System.out.print(" ");
//          }
//
////          print last stars
//          for(int l = 1;l<=i;l++){
//              System.out.print("*");
//          }
//          System.out.println();
//          space1 = space1 - 2;
//
//      }
//
//        int space2 = 0;
//
//      for(int i = (n/2);i<n;i++){
//          for(int j = i;j<n;j++){
//              System.out.print("*");
//          }
//        if (space2 != 0){
//            for(int k = 0;k<space2;k++){
//                System.out.print(" ");
//            }
//        }
//
//          for(int k = i;k<n;k++){
//              System.out.print("*");
//          }
//          System.out.println();
//          space2 = space2 +2;
//      }


//        Pattern 11

//        for(int i = 1;i<=n;i++){
////            print space
//            for(int j = i;j<=(n-1);j++){
//                System.out.print(" ");
//            }
//
////            print stars
//            for (int k=1;k<=n;k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        Pattern 12:
//        for(int i = 1;i<=n;i++){
////            printing spaces
//            for(int j = i;j<=n;j++){
//                System.out.print(" ");
//            }
////            print HOLLOW RHOMBUS
//            for(int k = 1;k<=n;k++){
//                if(i==1||k==1||i==n||k==n){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        Pattern 13
//       Kapoor


//
//        long start21 = System.currentTimeMillis();
//        for(int i = 1; i<=n;i++){
////            print spaces
//            for(int j = (n-i);j>=1;j--){
//                System.out.print(" ");
//            }
//
////            print star
//            for(int k = 1;k<=(2*i-1);k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i = n;i>=1;i--){
////            print spaces
//            for(int j = 0;j<(n-i);j++){
//                System.out.print(" ");
//            }
////            print stars
//            for(int k = (2*i-1);k>=1;k--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        long end22 =System.currentTimeMillis();
//        System.out.println("Elapsed Time in mili seconds: "+ (end22-start21));
//
//
//
//
//
////        jaiswal
//
//
//        long start1 = System.currentTimeMillis();
//        for(int i = 1;i<=(2*n-1);i++){
//
//            if(i<=n){
//                //    print space
//
//                for(int j = 1;j<=(n-i);j++){
//                    System.out.print(" ");
//                }
////    print stars
//                for(int j = 1;j<=(i*2 -1);j++){
//                    System.out.print("*");
//                }
//
//            }else{
//                //    print space
//                for(int j = 1;j<=(i-n);j++) {
//                    System.out.print(" ");
//                }
//
////    print stars
//                for(int j = 1;j<=(4*n-2*i-1);j++){
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }
//        long end1 = System.currentTimeMillis();
//        System.out.println("Elapsed Time in mili seconds: "+ (end1-start1));
//Pattern 14

//for(int i = 1;i<=n;i++){
//    for(int j = 1;j<=(n-i);j++){
//        System.out.print(" ");
//    }
//    for(int k =1;k<=i;k++){
//        System.out.print(i + " ");
//    }
//    System.out.println();
//}

//        Pattern 15

        for(int i = 1;i<=5;i++){
//            print space
            for(int j = 1;j<=(n-i);j++){
                System.out.print(" ");
            }
//            print num:
            for(int k = i;k>=1;k--){
                System.out.print(k);
            }
            if(i >1){
                for (int l = 2;l<=i;l++){
                    System.out.print(l);
                }
            }
            System.out.println();
        }

//int val = 98;
//char ch = (char)val;
//        System.out.println(ch);

    }
}