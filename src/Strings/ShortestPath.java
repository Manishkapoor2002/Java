package Strings;

public class ShortestPath {
    public static void main(String[] args) {

        String str = "WNEENESENNN";

        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;

        for (int i = 0;i<str.length();i++){
            char c = str.charAt(i);

        if(c == 'W'){
            x2 += -1;
        } else if (c== 'N') {
                y2 += 1;            
        } else if (c == 'E') {
            x2 += 1;
        }else if(c == 'S'){
            y2 += -1;
        }

        }

//        System.out.println("Path = " +x2 +" , " +y2);


        int x = x2 - x1;
        int y = y2-y1;

        double shortestPath = Math.sqrt((Math.pow(x,2)) + (Math.pow(y,2)));
        int path = (int) shortestPath;
        System.out.println(path);
    }
}