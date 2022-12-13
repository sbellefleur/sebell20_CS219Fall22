package Interface_Example;

public class Point implements Distance{
    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public double distance(Point p) {
        return Math.sqrt(Math.pow((this.x-p.x),2)+Math.pow((this.y-p.y),2));
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
