import java.util.Scanner;

public class Arrays {


//    Updating Array:
//    public static void Update(int marks[]){
//    for(int i = 0;i<=marks.length-1;i++){
//        marks[i] = marks[i] + 1;
//    }
//    }

//    Linear Search:

    public static int FindNum(int Num[], int key) {
        for (int i = 0; i <= Num.length - 1; i++) {
            if (Num[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
//        creating Array:
//        DataType ArrayName[] = new DataType[Size of Array]
//        int numbers[] = new int[5];
//        Scanner scn = new Scanner(System.in);
//
//        for (int i = 0;i<=numbers.length-1;i++){
//            numbers[i] = scn.nextInt();
//        }
//        for (int i = 0;i<=numbers.length-1;i++){
//            System.out.println("Number on Array index at " +i +" = " +numbers[i]);
//        }

//        Updating Value using Functions
//        Array uses Call by Reference
//        int marks[] = {97,98,99};
//        Update(marks);
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);

//        Linear Search:
        int key = 5;
        int Number[] = {1,2,3,4,5,6,7,8,9,10};
        int index = FindNum(Number,key);

        if(index == -1){
            System.out.println("Key not Found");
        }else{
            System.out.println("key found at " +index);
        }
        }
    }
