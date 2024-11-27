import java.util.Arrays;

public class MedianOfArray {
    public static void main(String[] args) {
        int arr[] = { 8, 6, 9, 2, 4, 3, 5, 1 };
        Arrays.sort(arr);
        if (arr.length % 2 != 0) {
            int index = arr.length / 2;
            System.out.println("Median is " + arr[index]);
        } else {
            int index1 = (arr.length / 2) - 1;
            int index2 = arr.length / 2;
            double index = (arr[index1] + arr[index2]) / 2.0;
            System.out.println("Median is " + index);
        }
    }
}
