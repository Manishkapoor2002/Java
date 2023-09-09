package Array_2D;

public class spiralMatrix {
    public static void Spiral(int[][] arr){

        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length-1;
        int endCol = arr[0].length-1;

        while ((startRow<=endRow)&&(startCol<=endCol)){
//            top:
            for(int i = startCol;i<=endCol;i++){
                System.out.print(arr[startRow][i] +", ");
            }
//            Right:
            for(int i = startRow+1;i<=endRow;i++){
                System.out.print(arr[i][endCol] +", ");
            }
            bottom:
            for(int i = endCol-1;i>=startCol;i--){
                if(startRow ==endRow){
                    return;
                }
                System.out.print(arr[endRow][i] +", ");
            }
//            Right:
            for(int i = endRow-1;i>=startRow;i--){
                if(startCol==endCol){
                    return;
                }
                System.out.print(arr[i][startCol] +", ");
            }
            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
        }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        for (int i =0;i< arr.length;i++){
            for (int j = 0;j< arr[0].length;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
        Spiral(arr);

    }
}