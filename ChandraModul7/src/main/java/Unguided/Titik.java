package Unguided;

public class Titik {
    protected double x, y;

    public Titik(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void tampil() {
        System.out.println("Point\t\t\t: [" + x + "," + y + "]");
    }

    public double hitungJarak(Titik t2) {
        return Math.sqrt(Math.pow(t2.x - x, 2) + Math.pow(t2.y - y, 2));
    }
}

