package Exp_11;
import java.util.Map; 
import java.util.HashMap; 
import java.util.Scanner; 
public class Third {
    public static void main(String args[])
    {
        Map<String,String> stateCapital = new HashMap<>(); 
        stateCapital.put("Gujarat","Gandhinagar");	 
        stateCapital.put("Maharashtra", "Mumbai"); 
        stateCapital.put("Rajasthan", "Jaipur");	
        
        stateCapital.put("Karnataka", "Bengaluru"); 
        stateCapital.put("Tamil Nadu", "Chennai");	 
        stateCapital.put("Uttar Pradesh", "Lucknow"); 
        stateCapital.put("Bihar", "Patna");	 
        stateCapital.put("Punjab", "Chandigarh"); 
        stateCapital.put("West Bengal", "Kolkata");		
        stateCapital.put("Madhya Pradesh", "Bhopal");
        
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the name of state : "); 
        String state = sc.nextLine();
        String capital = stateCapital.get(state); 
        if(capital != null){
            System.out.println("The capital of state "+state+" is "+capital);     
        }
        else {
            System.out.println("The state is not found in the list");
        }
    }
}
    