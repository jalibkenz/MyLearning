import java.util.HashMap;
import java.util.Map;

class MainClass{

    public static void main(String[] args){

        String str="aabbbcddeeffff";
        int[] strIntArr= new int[127];

        //store frequency
        for (int i = 0; i < str.length(); i++) {
            System.out.println("storing at index->"+(int)str.charAt(i));
            strIntArr[(int)str.charAt(i)]++;
        }

        //print frequency
        for (int i = 0; i < strIntArr.length; i++) {
            if(strIntArr[i]>0) {
                System.out.print((char) i + "" + strIntArr[i]);
            }
        }

    }


}