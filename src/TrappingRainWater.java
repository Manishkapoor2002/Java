public class TrappingRainWater {

    //    Trapping RainWater:s
    public static void trappingRainWater(int[] Array){
        int trapwater = 0;
        int maxAtLeft = Integer.MIN_VALUE;
        int maxAtRight = Integer.MIN_VALUE;
        int min;
        int[] B = new int[Array.length];

        if (Array.length == 1 || Array.length == 2){
            System.out.println("Cannot trap water!!");
            return;
        }

//Building are in Ascending order or not
        int flag = 0;

        for (int i = Array.length;i>1;i--){
            if (Array[i-1]<= Array[i-2]){
                flag = 0;
            }else{
                flag = 1;
                break;
            }
        }

//Building are in Descending order or not
        int flagRev = 0;

        for (int i = Array.length;i>=1;i--){
            if (Array[i-1]>= Array[i-2]){
                flagRev = 0;
            }else{
                flagRev = 1;
                break;
            }
        }
        if (flag == 0){
            System.out.println("Cannot Trap water because Building is in Ascending order!");
        } else if (flagRev == 0) {
            System.out.println("Cannot Trap water because Building is in Descending order!");
        } else{
            System.out.println("Welcome to the problem!!");

            for (int i = 0;i<= Array.length-1;i++){
                if (i == 0 || i == Array.length-1){
                    trapwater += 0;
                    B[i] = 0;
                }else{
//             find max in the left:
                    for (int j = i-1;j>=0;j--){
                        maxAtLeft = Math.max(Array[j],maxAtLeft);
                    }
//                 System.out.println(maxAtLeft +" at i : " +i + " ");

                    //            find max in the right:
                    for (int j = i+1;j<= Array.length-1;j++){
                        maxAtRight = Math.max(Array[j],maxAtRight);
                    }
//                    System.out.println(maxAtRight +" at i : " +i + " ");


//              finding minimum from maxatleft and maxatright:
                    min = Math.min(maxAtLeft,maxAtRight);
//                    System.out.println(min +"  min at i :"+i);


                    trapwater = (min - Array[i]);
                    if(trapwater<0){
                        trapwater  = 0;
                    }
                    B[i] = trapwater;
//                    System.out.println(trapwater +" = " +min +" -" +Array[i]);
                    maxAtLeft = 0;
                    maxAtRight = 0;


                }
            }

//            System.out.println(trapwater);
            int TotalRainWater = 0;
            for (int i = 0;i<=B.length-1;i++){
                TotalRainWater += B[i];
            }
            System.out.println(TotalRainWater);

        }
    }
    public static void main(String[] args) {
//        Trapping Rainwater Problem:
        int[] Array ={4,2,0,6,3,2,5};
        trappingRainWater(Array);
    }
}