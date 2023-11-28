package Unguided;

public class Persegi extends Titik{
    private double sisiPSG;
    public Persegi(double x1, double y1, double x2, double y2) {
        super(x1,y1);
        Titik dot = new Titik(x2,y2);
        this.sisiPSG = super.hitungJarak(dot);
    }
    public double hitungLuas(){
        return sisiPSG * sisiPSG;
    }

    @Override
    public void tampil() {
        System.out.println("====================================");
        System.out.println("---------- Data Persegi ------------");
        super.tampil();
        System.out.println("Sisi Persegi\t: " + sisiPSG);
        System.out.println("Luas Persegi\t: " + hitungLuas());
    }
}
