package Exp_5;
interface I1{}
interface I2{}
interface I3 extends I1,I2{}
class X implements I3{

}
interface I4{}
class W extends X implements I4{}

public class Second {
    public static void main(String[] args) {
        W w = new W();
        System.out.println(w instanceof W); 
        System.out.println(w instanceof X); 
        System.out.println(w instanceof I1); 
        System.out.println(w instanceof I2); 
        System.out.println(w instanceof I3); 
        System.out.println(w instanceof I4); 
    }
}
