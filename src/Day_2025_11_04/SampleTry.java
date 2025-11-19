package Day_2025_11_04;

public class SampleTry {


    public static void display(int[] xArr){
        System.out.println(xArr[0]);
        xArr[0]=9;
        System.out.println(xArr[0]);

    }
    public static void main(String[] args) {
        int[] intArr = {1,2,3};



        display(intArr);

        System.out.println(intArr[0]);


    }


}
