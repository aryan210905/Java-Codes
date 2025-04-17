package Threads;
class Thread_1 implements Runnable{
    public void run(){
        for(int i=1;i<=50;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
class Thread_2 implements Runnable{
    public void run(){
        for(int i=51;i<=100;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
public class ThreadDemoUsingRunnable {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread_1());
        Thread t2 = new Thread(new Thread_2());

        t1.start();
        try{
            t1.join();
        }
        catch(InterruptedException e){
            System.out.println("Error while join");
        }
        t2.start();
    }
}


