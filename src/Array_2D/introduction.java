package Array_2D;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class introduction {

    public static int[] minNmax(int[][] arr){
        int[] ans = new int[2];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i =0;i< arr.length;i++){
            for (int j = 0;j< arr[0].length;j++){
                min = Math.min(min,arr[i][j]);
                max = Math.max(max,arr[i][j]);
            }
        }
        ans[0] = min;
        ans[1] = max;
        return ans;
    }

//    public static boolean Search(int[][] arr,int k){
//
//        for (int i =0;i< arr.length;i++){
//            for (int j = 0;j< arr[0].length;j++){
//               if (arr[i][j]==k){
//                   return true;
//               }
//            }
//        }
//        return false;
//    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = scn.nextInt();
        System.out.println("Enter the value of m : ");
        int m = scn.nextInt();
        int[][] arr2D = new int[n][m];
        for (int i =0;i<n;i++){
            for (int j = 0;j<m;j++){
                arr2D[i][j] = scn.nextInt();
            }
        }
//        System.out.print("Enter the value of key : ");
//        int key = scn.nextInt();
//        boolean ans = Search(arr2D,key);
//        System.out.println(ans);

       int[] ans = minNmax(arr2D);

        System.out.println("Minimum and Maximum Values are : ");
        for(int i =0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}