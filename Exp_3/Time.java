
import java.util.Scanner;
// exp-5
public class Time {
    Scanner sc = new Scanner(System.in);
    int hours;
    int minutes;
    public void getTime(){
        System.out.print("Enter time (hours,minutes): ");
        this.hours = sc.nextInt();
        this.minutes = sc.nextInt();
        System.out.println("Successfully added data!");
    }
    public void printTime(){
        System.out.print("Time is: " + this.hours + ":" + this.minutes);
    }
    public Time addTime(Time T1, Time T2){
        Time T3 = new Time();
        T3.hours = T1.hours + T2.hours;
        T3.minutes = T1.minutes + T2.minutes;
        if(T3.minutes>60){
            T3.hours += T3.minutes/60;
            T3.minutes %= 60;
        }
        return T3;
    }

    public static void main(String[] args) {
        Time T1 = new Time();
        Time T2 = new Time();
        T1.getTime();
        T1.printTime();
        System.out.println("\n");
        T2.getTime();
        T2.printTime();
        System.out.println("\n");

        Time T3 = new Time();
        T3 = T3.addTime(T1, T2);
        System.out.print("After adding times, ");
        T3.printTime();
    }
}
