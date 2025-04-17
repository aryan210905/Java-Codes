package Exp_12;
class MyThread implements Runnable{
    int start;
    int end;
    MyThread(int start,int end){
        this.start = start;
        this.end = end;
    }
    public void run(){
        for(int i=start;i<=end;i++){
            System.out.println(i+"->"+Thread.currentThread().getName());
        }
    }
}
public class Second {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread(1,100));
        Thread t2 = new Thread(new MyThread(101,200));
        t1.start();
        try{
            t1.join();
        }
        catch(InterruptedException e){
            System.out.println("Error while joining!");
        }
        t2.start();
    }
}
