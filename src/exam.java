import java.util.Scanner;

public class exam {

    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("================================");
//        for(int i=0;i<3;i++){
//            String s1=sc.next();
//            int x=sc.nextInt();
//
//            String numbString = String.valueOf(x);
//
//           if(numbString.length()==2){
//               numbString = "0"+numbString;
//           } else if (numbString.length()==1) {
//               numbString = "00" + numbString;
//           }
//           String space = "";
//           for(int j =1;j<=(15-s1.length());j++){
//               space = space + " ";
//           }
//            System.out.println(s1 +space +numbString);
//
//
//        }
//        System.out.println("================================");


        Scanner scn = new Scanner(System.in);
        int total = 0;
        for(int i = 1;i<=25;i++){
            int num = scn.nextInt();
            total = total + num;
            if(i == 25){
                int avg = total/25;
                System.out.println(avg);
            }

        }
    }
}



