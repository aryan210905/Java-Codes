
import java.util.Scanner;
class Volume {
    double a,l,b,h,r;

    Volume(){}
    Volume(double a){
        this.a = a;
    }
    Volume(double l,double b, double h){
        this.l = l;
        this.b = b;
        this.h = h;
    }
    Volume(double r, boolean isSphere){
        if (isSphere) {
            this.r = r;
        }
    }
}
class Cube extends Volume{
    Cube(double a){
        super(a);
    }
    double volume(){
        return a*a*a;
    }
}
class Cuboid extends Volume{
    Cuboid(double l,double b,double h){
        super(l,b,h);
    }
    double volume(){
        return l*b*h;
    }
}
class Sphere extends Volume{
    Sphere(double r, boolean isSphere){
        super(r,isSphere);
    }
    double volume(){
        return (4/3)*3.14*r*r*r;
    }
}
class Shapes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dimensions of cube: ");
        Cube cube = new Cube(sc.nextDouble());
        System.out.println("Enter dimensions of cuboid: ");
        Cuboid cuboid = new Cuboid(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        System.out.println("Enter radius of sphere: ");
        Sphere sphere = new Sphere(sc.nextDouble(),true);

        System.out.println("Volume of cube: "+cube.volume());
        System.out.println("Volume of cube: "+cuboid.volume());
        System.out.println("Volume of cube: "+sphere.volume());
        sc.close();

    }

}