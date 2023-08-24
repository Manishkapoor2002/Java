import java.util.Scanner;

public class Arrays {


//    Updating Array:
    public static void Update(int marks[]){
    for(int i = 0;i<=marks.length-1;i++){
        marks[i] = marks[i] + 1;
    }
    }
    public static void main(String args[]){
//        creating Array:
//        DataType ArrayName[] = new DataType[Size of Array]
        int numbers[] = new int[5];
        Scanner scn = new Scanner(System.in);

        for (int i = 0;i<=numbers.length-1;i++){
            numbers[i] = scn.nextInt();
        }
        for (int i = 0;i<=numbers.length-1;i++){
            System.out.println("Number on Array index at " +i +" = " +numbers[i]);
        }

//        Updating Value using Functions
//        Array uses Call by Reference
        int marks[] = {97,98,99};
        Update(marks);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
    }
}