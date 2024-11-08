package Models;

public class Point3D extends Point2D {
    private double z;

    public Point3D() {}

    public Point3D(double z, double x, double y) {
        super(x, y);
        this.z = z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void setXYZ(double[] temp) {
        double[] d = {temp[0], temp[1]};
        super.setXY(d);
        this.z = temp[2];
    }

    public double getZ() {
        return z;
    }

    public double[] getXYZ() {
        return new double[]{super.getX(), super.getY(), this.z};
    }

    // Corrected method with parameter syntax
    public double distance(double _x, double _y, double _z) {
        return Math.sqrt(
            Math.pow(_x - super.getX(), 2.0) +
            Math.pow(_y - super.getY(), 2.0) +
            Math.pow(_z - z, 2.0)
        );
    }

    public double distance(Point3D temp) {
        return Math.sqrt(
            Math.pow(temp.getX() - super.getX(), 2.0) +
            Math.pow(temp.getY() - super.getY(), 2.0) +
            Math.pow(temp.z - z, 2.0)
        );
    }

    @Override
    public String toString() {
        return "(" + super.getX() + "," + super.getY() + "," + this.z + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
     
        Point3D temp = (Point3D) obj;
        return ( super.getX() == temp.getX() && 
               super.getY() == temp.getY() && 
               this.z == temp.z)?true :
          false;
    }
}
