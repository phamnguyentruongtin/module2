package projectmodule2.ss6.bai1.bai2;

public class Point3d extends Point2d {
    private float z;

    public Point3d() {

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3d(float z) {
        this.z = z;
    }

    public void setXYZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arr = new float[3];
        arr[0] = getX();
        arr[1] = getY();
        arr[2] = getZ();

        return arr;
    }


    @Override
    public String toString() {
        return "Point3d{" +
                "x = " + getX() + " " +
                "y = " + getY() + " " + " " +
                "z = " + z +
                '}';
    }
}
