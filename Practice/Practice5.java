// reverse an array, add and delete an element from array
import java.util.Scanner;
public class Practice5 {
    final static int MAX = 100;
    public static int[] reverseArray(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array(1-100): ");
        int n = sc.nextInt();
        if(n>MAX){
            System.out.println("Invalid index! Exiting program.");
            sc.close();
            return;
        }
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        // reverse array
        int[] reversedArray = reverseArray(arr);
        for(int val:reversedArray){
            System.out.print(val+" ");
        }
        sc.close();
    }   
}
