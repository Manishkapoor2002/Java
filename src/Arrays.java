import javax.swing.*;
import java.util.Scanner;

public class Arrays {


//    Updating Array:
//    public static void Update(int marks[]){
//    for(int i = 0;i<=marks.length-1;i++){
//        marks[i] = marks[i] + 1;
//    }
//    }

//    Linear Search:
//-> Finding a number
//    public static int FindNum(int Num[], int key) {
//        for (int i = 0; i <= Num.length - 1; i++) {
//            if (Num[i] == key) {
//                return i;
//            }
//        }
//        return -1;
//    }

//    -> Finding Largest value in Array:
//    public static int LargestVal(int[] Rank){
//        int maxRank = Integer.MIN_VALUE;//- infinity
//
//        for (int i = 0;i<= Rank.length-1;i++){
//            if(Rank[i]>maxRank){
//                maxRank = Rank[i];
//            }
//        }
//        return maxRank;
//    }
//
//    public static int SmallestVal(int[] Rank){
//        int minRank = Integer.MAX_VALUE;//- infinity
//
//        for (int i = 0;i<= Rank.length-1;i++){
//            if(Rank[i]<minRank){
//                minRank = Rank[i];
//            }
//        }
//        return minRank;
//    }


//    Binary Search:

//    public static int binarySearch(int number[], int key) {
//        int start = 0, end = number.length - 1;
//
//
//        while (start <= end) {
//            int mid = (start + end) / 2;
//            System.out.println(mid);
//
//            if (number[mid] == key) {
//                return mid;
//            }
//            if (number[mid] < key) {
//                start = mid + 1;
//            }else{
//                end = mid - 1;
//            }
//
//        }
//        return -1;
//    }


//    Reverse an Array:

//    public static void ReversedArray(int OrignalArray[]){
//        int ReversedArray[] = new int[(OrignalArray.length)];
//        int count  = 0;
//        for (int i = OrignalArray.length-1;i>=0;i--){
//            ReversedArray[count] = OrignalArray[i];
//            count++;
//        }
////        Print Original Array:
//        System.out.print("Original Array :");
//        for (int i = 0;i<= OrignalArray.length-1;i++){
//            System.out.print(OrignalArray[i] +" ,");
//
//        }
//
//        System.out.println();
////        Print Reversed Array:
//
//        System.out.print("Reversed Array :");
//       for (int i = 0;i<= ReversedArray.length-1;i++){
//           System.out.print(" "+ReversedArray[i] +",");
//       }
//
//    }

//    public static void  ReversedArray(int[] OriginalArray){
//        int start = 0,last = OriginalArray.length-1;
//
//        while (start<last){
//            int temp = OriginalArray[last];
//            OriginalArray[last] = OriginalArray[start];
//            OriginalArray[start] = temp;
//            start++;
//            last--;
//        }
//        System.out.println("Reversed Array");
//        for (int i = 0;i<=OriginalArray.length-1;i++){
//            System.out.print(OriginalArray[i] +" ");
//        }
//    }

//    Pair in an Array:
    public static void pairInArray(int[] Original){
        for (int i = 0;i<= Original.length-1;i++){

            for (int j = i+1;j<= Original.length-1;j++){
                System.out.print("("+Original[i] +","+Original[j]+") ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
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
//        int key = 5;
//        int Number[] = {1,2,3,4,5,6,7,8,9,10};
//        int index = FindNum(Number,key);
//
//        if(index == -1){
//            System.out.println("Key not Found");
//        }else{
//            System.out.println("key found at " +index);
//        }

//        Finding Maximum and Smallest Value of an Array
//        int[] Rank = {99,54,105,64,78,254,11};
//
//        System.out.println("Maximum Rank among all :" +LargestVal(Rank));
//        System.out.println("Smallest Rank among all :" +SmallestVal(Rank));

//        Binary Search:
//        int number[] = {2,4,6,8,10,12,14,16,18,20};
//        int key = 12;
//        System.out.println("Key found at" +binarySearch(number, key));

//        int[] OriginalArray = {0,1,2,3,4,5};
//        System.out.println(OriginalArray[5]);
//        ReversedArray(OriginalArray);

//        Pair of an Array:
        int[] OriginalArray = {2,4,6,8,10};

        pairInArray(OriginalArray);





    }
}
