import java.util.Arrays;

public class BubbleSortUsing1ForLoop {
    public static void main(String[] args) {
        //Bubble sort Using one for loop
        int[] a = {16, 9, 5, 4, 7, 12, 3, 20, 15};
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length - 1; i++) { //a.length-1 as at last the second last index element
            if (a[i] > a[i + 1]) {               //is checked with last index element.
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
                i = -1;
            }
        }
        System.out.println(Arrays.toString(a));

    }
}

