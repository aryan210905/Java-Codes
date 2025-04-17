package Exp_5;
interface Exam{
    boolean Pass(int marks);    
}
interface Classify{
    String Divide(int average);
}
class Result implements Exam,Classify{
    public boolean Pass(int marks){
        if(marks>40) return true;
        else return false;
    }
    public String Divide(int average){
        if(average>60) return "First";
        else if (average>50 && average<60 ) return "Second";
        else return "No division";
    }
}
public class Third {
    public static void main(String[] args) {
        Result r = new Result();
        System.out.println(r.Pass(50));
        System.out.println(r.Divide(90));
    }
}
