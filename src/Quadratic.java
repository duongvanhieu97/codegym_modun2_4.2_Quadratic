public class Quadratic {
    double a,b,c;
    public Quadratic() {

    }
    public Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant () {
        return  ((b*b)-4*a*c);
    }
    public double getRoot() {
        return (-b/(2*a));
    }
    public double getRoot1() {
        return (-b + Math.sqrt(getDiscriminant()))/(2*a);
    }

    public double getRoot2() {
        return (-b - Math.sqrt(getDiscriminant()))/(2*a);
    }
    public String display() {
        return "Rectangle{" + "a = " +a+ ", b" + b + ", c" + c + "}";
    }
}
