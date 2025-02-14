// here by using dynamic method dispatch, shouldn't 
// Derived::show() called be printed? Output is 
// Base::show() called

// next doubt -> 100 >> -2 = 0 why

class Base {
    public  void show() {
       System.out.println("Base::show() called");
    }
}
 
class Derived extends Base {
    public  void show() {
       System.out.println("Derived::show() called");
    }
}
 
class Main {
    public static void main(String[] args) {
        Base b = new Derived();
        b.show();
    }
}