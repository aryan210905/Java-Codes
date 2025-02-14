class CartesianPoint{
    int x;
    int y;
    public CartesianPoint(){}
    public CartesianPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    public CartesianPoint(int a){
        this.x = a;
        this.y = a;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getX(){
        return x;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getY(){
        return y;
    }
    public void move(int x,int y){
        this.x = x;
        this.y = y;
    }
    public void display(){
        System.out.println("Coordinates: ("+x+","+y+")");
    }
    public void move(int a){
        this.x = a;
        this.y = a;
    }
}
class TestCartesianPoint{
    public static void main(String[] args) {
        CartesianPoint obj1 = new CartesianPoint(5);
        CartesianPoint obj2 = new CartesianPoint(10,15);
        CartesianPoint obj3 = new CartesianPoint();
        obj1.display();
        obj2.display();
        obj1.move(25);
        obj1.display();
        obj1.move(30,50);
        obj1.display();
        obj3.setX(100);
        obj3.setY(400);
        obj3.display();
    }
}