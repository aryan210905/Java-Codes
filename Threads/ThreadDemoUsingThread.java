package Threads;
class Thread1 extends Thread{
    Thread1(String name){
        super(name);
    }
    public void run(){        
        for(int i=1;i<=20;i++){
            if(i%2!=0)
                System.out.println(Thread.currentThread().getName() + "->" + i);
                try{Thread.sleep(500);}
                catch(InterruptedException e){System.out.println("Error in  Thread 1");}
        }
    }
}
class Thread2 extends Thread{
    Thread2(String name){
        super(name);
    }
    public void run(){
        for(int i=1;i<=20;i++){
            if(i%2==0)
                System.out.println(Thread.currentThread().getName() + "->"+i);
                try{Thread.sleep(500);}
                catch(InterruptedException e){System.out.println("Error in  Thread 2");}
        }
    }
}
public class ThreadDemoUsingThread{
    public static void main(String[] args) {
        Thread1 t1 = new Thread1("First");
        t1.start();
        Thread2 t2 = new Thread2("Second");
        try{
            t1.join();
        }
        catch(InterruptedException e){
            System.out.println("Error!!");
        }
        t2.start();
    }
}
