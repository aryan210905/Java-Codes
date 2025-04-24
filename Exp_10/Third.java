package Exp_10;
import java.util.Arrays;
public class Third {
    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (key == list[mid]) {
                return mid; 
            } else if (key < list[mid]) {
                high = mid - 1; 
            } else {
                low = mid + 1; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10, 12, 14, 16};
        System.out.println("Array: " + Arrays.toString(array));
        
        int key1 = 8;
        int result1 = binarySearch(array, key1);
        System.out.println("Searching for " + key1 + ": Index = " + result1);
        
        int key2 = 9;
        int result2 = binarySearch(array, key2);
        System.out.println("Searching for " + key2 + ": Index = " + result2);
        
        int key3 = 2;
        int result3 = binarySearch(array, key3);
        System.out.println("Searching for " + key3 + ": Index = " + result3);
        
        int key4 = 16;
        int result4 = binarySearch(array, key4);
        System.out.println("Searching for " + key4 + ": Index = " + result4);
    }
}