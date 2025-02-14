// here if we are passing n in the constructor in m then 
// why value of m = 0 when printing m

// next doubt -> why float and double are not allowed in switch case
public class MyFirst {  
   public static void main(String[] args) {  
      MyFirst obj = new MyFirst(n);  
   }  
   static int a = 10;  
   static int n;  
   int b = 5;  
   int c;  
   public MyFirst(int m) {  
      System.out.println(a + ", " + b + ", " + c + ", " + n + ", " + m);  
   }  
   // Instance Block  
   {  
      b = 30;  
      MyFirst.n = 20;  
   }   
   // Static Block  
   static   
   {  
      a = 60;  
   }   
}