package Exp_11;
import java.util.*; 
public class Second{
    public static void main(String args[]) { 
        PriorityQueue<String> q1 = new PriorityQueue<>(); 
        PriorityQueue<String> q2 = new PriorityQueue<>();
        q1.addAll(Arrays.asList("George","Jim","Blake","Kevin","Micheal"));
        q2.addAll(Arrays.asList("George","Katie","Kevin","Michelle","Ryan"));
    
        System.out.println("Queue 1 : "+q1); 
        System.out.println("Queue 2 : "+q2);
        
        PriorityQueue<String> union = new PriorityQueue<>(q1); 
        union.addAll(q2);
        System.out.println("Union : "+union);
        
        PriorityQueue<String> difference = new PriorityQueue<>(q1); 
        difference.removeAll(q2);
        System.out.println("Difference : "+difference);
        
        PriorityQueue<String> intersection = new PriorityQueue<>(q1); 
        intersection.retainAll(q2);
        System.out.println("Intersection : "+intersection);
    }
}
    