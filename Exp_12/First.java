package Exp_12;
class Thread1 extends Thread{
    public void run(){
        for(int i=1;i<=50;i++){
            System.out.println(i+" -> "+Thread.currentThread().getName());
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("Error while sleepig");
            }
        }
    }
}
public class First {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread1 t2 = new Thread1();
        t1.start();
        try{
            t1.join();
        }
        catch(InterruptedException e){
            System.out.println("Error while joining");
        }
        t2.start();
    }
}
