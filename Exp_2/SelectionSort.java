package Exp_2;
import java.util.Scanner;

public class SelectionSort {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<9;i++){ // taken 9 as no need to sort last element
            int minIdx = i;
            for(int j=i+1;j<10;j++){
                if (arr[j] < arr[minIdx]) {  
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;            
        }
        System.out.println("Sorted Array:");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }

}
