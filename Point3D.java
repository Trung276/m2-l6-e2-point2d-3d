public class Point3D extends Point2D{
    private float x, y, z;
    public Point3D() {

    }
    public Point3D(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        float [] arr = new float[3];
        arr[0] = x;
        arr[1] = y;
        arr[2] = z;
        return arr;
    }

    @Override
    public String toString() {
        return "Point3D(" + x + "," + y + "," + z + ")";
    }
}
