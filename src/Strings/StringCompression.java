package Strings;

public class StringCompression {
    public static void main(String[] args) {
        String str = "aaabbcccdde";

        StringBuffer sb = new StringBuffer("");
        char ch = str.charAt(0);
        sb.append(ch);
        int count = 1;
        for (int i = 1;i<str.length();i++){
            if(str.charAt(i-1) == str.charAt(i)){
                count++;
            }else{
                sb.append(count);
                count = 1;
                sb.append(str.charAt(i));
            }
        }
        sb.append(count);


        System.out.println(sb);
    }
}