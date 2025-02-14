
// exp_2
public class Rectangle {
    double width;
    double height;
    Rectangle(){
        width = 1;
        height = 1;
    }
    Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.height * this.width;
    }
    public double getPerimeter(){
        return 2 * (this.height + this.width);
    }
    public static void main(String[] args){
        Rectangle rec1 = new Rectangle(4,40);
        Rectangle rec2 = new Rectangle(3.5,35.9);

        System.out.println("Rectangle 1:-");
        System.out.println("Width: " + rec1.width);
        System.out.println("Height: " + rec1.height);
        System.out.println("Perimeter: " + rec1.getPerimeter());
        System.out.println("Area: " + rec1.getArea());
        System.out.println("\n");
        System.out.println("Rectangle 2:-");
        System.out.println("Width: " + rec2.width);
        System.out.println("Height: " + rec2.height);
        System.out.println("Perimeter: " + rec2.getPerimeter());
        System.out.println("Area: " + rec2.getArea());
    }
}
