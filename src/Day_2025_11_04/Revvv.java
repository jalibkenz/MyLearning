package Day_2025_11_04;

public class Revvv {

    public static void main(String[] args) {
        String str = "i love programming";
        int end = str.length()-1;

        for (int i = str.length() - 1; i >= 0; i--) {
            //System.out.println("i"+"->"+i);
            if (str.charAt(i) == ' ') {
                // print word between i+1 and end
                System.out.print(str.substring(i + 1, end+1) + " ");
                //System.out.println("i+1"+"->"+(i+1)+"| end ->"+end);
                end = i-1; // move end to current space
            }
        }
        // print the first word
        System.out.print(str.substring(0, end+1));
    }
}


