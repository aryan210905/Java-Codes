package Exp_2;
import java.util.Scanner;
public class EliminateDuplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] brr = new int[n];
        int a = 0;
        for(int i=0;i<n;i++){
            
            int count = 0;
            for(int j=i+1;j<n;j++){
                if(arr[j]==arr[i]){
                    count+=1;
                }
            }
            if(count == 0){
                brr[a] = arr[i];
                a+=1;
            }
        }
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }
        sc.close();
    }
}
