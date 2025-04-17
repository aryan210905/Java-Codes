package Exp_12;
class Count{
    private int sum = 0;
    synchronized void increment(){
        sum+=1;
    }
    int getSum(){
        return sum;
    }
}
class NewThread extends Thread{
    Count c = new Count();
    NewThread(Count c){
        this.c = c;
    }
    public void run(){
        for(int i=1;i<=100;i++)    c.increment();
    }
}
public class ThirdWithSync{
    public static void main(String[] args) {
        Count c = new Count();
        Thread[] threadArray = new Thread[10];
        for(int i=0;i<10;i++){
            threadArray[i] = new NewThread(c);
        }

        for(Thread thread: threadArray){
            thread.start();
        }
        
        for(Thread thread: threadArray){
            try{
                thread.join();
            }
            catch(InterruptedException e){
                System.out.println("Error while joining");
            }
        }

        System.out.println(c.getSum());

    }
}
