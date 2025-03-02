package Exp_2;
import java.util.Scanner;

public class EliminateDuplicateElements {
    
    public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int a = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < a; j++) {
                if (temp[j] == arr[i]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[a] = arr[i];
                a++;
            }
        }
        int[] result = new int[a];
        for (int i = 0; i < a; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int[] uniqueArr = removeDuplicates(arr);
        
        System.out.println("Array after removing duplicates: ");
        for (int num : uniqueArr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
