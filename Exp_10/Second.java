package Exp_10;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Second {
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        return new ArrayList<>(new LinkedHashSet<>(list));
    }

    public static void main(String[] args) {
        
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(2);
        intList.add(3);
        intList.add(1);
        intList.add(4);
        
        System.out.println("Original Integer List: " + intList);
        ArrayList<Integer> noDupIntList = removeDuplicates(intList);
        System.out.println("List without duplicates: " + noDupIntList);
    }
}