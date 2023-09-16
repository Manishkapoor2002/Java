package Array_2D;

public class stairSearch {
    public static boolean stairSearchAlgo(int[][] arr,int key){
        int n = arr.length;

            int i = 0;
            int j = n-1;


//starts from top right:
            while (i<n && j>=0){
                if (arr[i][j] == key){
                    return true;
                }else if(key>arr[i][j]){
                    i++;
                }else if(key<arr[i][j]){
                    j--;
                }
            }
            return false;
    }
    public static void main(String[] args) {
        int[][] arr =  {
                {10, 20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}
        };
        int key =15;
        boolean ans = stairSearchAlgo(arr,key);
        System.out.println(ans);
    }
}