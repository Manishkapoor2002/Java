public class SelectionSort {

    public static void Selectionsort(int[] arr){
        for (int i = 0;i<=arr.length-1;i++){
            int minPos = i;
            for (int j = i+1;j<= arr.length-1;j++){
                if(arr[minPos]>arr[j]){
                    minPos = j;
                }
            }
//            swap :
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void PrintArray(int[] arr){
        for (int i = 0;i<= arr.length-1;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2};
        Selectionsort(arr);
        PrintArray(arr);

    }
}