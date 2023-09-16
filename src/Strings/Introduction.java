package Strings;

import java.util.Scanner;

public class Introduction {
    public static void main(String[] args) {
////        Strings are Immutable(not changeable)
//
//        char[] ch = {'a','b','c'};
//        String string = "Manish kapoor";
//
//        for (int i = 0;i<ch.length;i++){
//            System.out.println(ch[i]);
//        }
//        System.out.println(string);
//
////Input in String and length() Function :
//        System.out.print("Your Name is : ");
//        Scanner scn = new Scanner(System.in);
//        String name = scn.nextLine();
//        System.out.println("Your Name is : "+name +" the length of the name is : " +name.length());
//
////        concatenation:
//        String firstName = "Manish ";
//        String lastName = "Kapoor";
//        String fullName = firstName + lastName;
//
//        System.out.println(fullName);
//
////        charAt function
//
//        for (int i =0;i<fullName.length();i++){
//            System.out.print(fullName.charAt(i) + " , ");
//        }

//        Compression operator for string
        String s1 = "Manish";
        String s3 = new String("Manish");


//        by using compression operator
        if (s1.equals(s3)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
//        by using ==
        if (s1 == s3){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}