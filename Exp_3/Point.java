
// exp 6
public class Point {
    int x;
    int y;
    Point(){
        x = 5;
        y = 5;
    }
    Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }
    public void display(){
        System.out.println("Point is: (" + this.x + "," + this.y + ")");
    }
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(4,5);
        Point p3 = new Point(p2);

        p1.display();
        p2.display();
        p3.display();
    }
}
