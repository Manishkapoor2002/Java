public class bubbleSorting {

    public static void BubbleSort(int[] arr){
        int swap = 0;
        for (int i = 0;i<= arr.length-2;i++){
            for (int j =0;j<=arr.length-2-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
        }
        if (swap == 0){
            System.out.println("Array is already sorted,it takes ");
        }else{
            System.out.println("Array is not sorted,it takes " +swap +"times to be sorted.");
        }
        for(int i = 0;i<=arr.length-1;i++){
            System.out.print(arr[i] +" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        BubbleSort(arr);
    }
}