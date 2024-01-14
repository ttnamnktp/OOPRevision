package w3.bai2;

public class Vector {
    private double x;
    private double y;
    private double z;

    // --------------- CONSTRUCTOR GETTER SETTER ---------------

    public Vector() {
    }

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    //------------- METHOD ----------------

    public Vector cong (Vector v){
        return new Vector(this.x + v.x, this.y + v.y, this.z + v.z);
    }

    public Vector tru (Vector v){
        return new Vector(this.x - v.x, this.y - v.y, this.z - v.z);
    }

    public Vector nhanHeSo (double heSo){
        return new Vector(this.x * heSo, this.y * heSo, this.z * heSo);
    }

    public double nhanVoHuong (Vector v){
        return this.x * v.x + this.y * v.y + this.z * v.z;
    }

    @Override
    public String toString () {
        return "(" + this.x + ", " + this.y + ", " + this.z + ")";
    }

    public static void main(String[] args) {
        Vector vector1 = new Vector(1,2,3);
        Vector vector2 = new Vector(-6,-1,-9);
        double heSo1 = 0.5;
        System.out.println(vector1.cong(vector2));
        System.out.println(vector1.tru(vector2));
        System.out.println(vector2.tru(vector1));
        System.out.println(vector1.cong(vector2).tru(vector1));
        System.out.println(vector1.nhanHeSo(0.5).cong(vector1).nhanVoHuong(vector1));
    }
}
