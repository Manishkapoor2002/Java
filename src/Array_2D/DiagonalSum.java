package Array_2D;
public class DiagonalSum {
    public static void sumDiagonals(int[][]arr){
        int n = arr.length;
        int sum1 = 0;
        int sum2 = 0;
//        for (int i =0;i<n;i++){
//            for (int j = 0;j<n;j++){
//             if(i==j){
//                 sum1 += arr[i][j];
//             }
//             if(i+j==(n-1)){
//                 sum2 +=arr[i][j];
//             }
//            }
//        }
        for (int i =0;i<n;i++){
//            left to right diagonal
            sum1 += arr[i][i];
//            right to left diagonal
            sum2 += arr[i][n-i-1];

        }

        int totalSum = 0;
        int overlap = arr[n/2][n/2];

        if(n%2==0){
            totalSum = sum1+sum2;
        }else {
            totalSum = sum1+sum2-overlap;
        }
        System.out.println(totalSum);
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4},{6,7,8,9},{11,12,13,14},{16,17,18,19}};
        for (int i =0;i< arr.length;i++){
            for (int j = 0;j< arr[0].length;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
        sumDiagonals(arr);
    }
}