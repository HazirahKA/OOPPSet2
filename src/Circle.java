public class Circle extends Point{

    private double radius;

    public Circle() {
        setRadius(0);
    }

    public Circle(double r, int a, int b) {
        super(a,b);
        setRadius(r);
    }

    public void setRadius(double r){
        if (r>0)
            radius = r;
        else
            radius = 0;
    }

    public double getRadius(){
        return radius;
    }

    public String toString(){
        return "Center of circle is at " + super.toString() + "; Radius is " + radius;
    }

    public double area(){
        return Math.PI*radius*radius;
    }

    public String getName(){
        return "Circle";
    }
}