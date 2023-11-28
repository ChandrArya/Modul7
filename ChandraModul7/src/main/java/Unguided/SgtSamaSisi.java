package Unguided;

public class SgtSamaSisi extends Titik{
    private double sisiSGT;

    public SgtSamaSisi(double x1, double y1, double x2, double y2) {
        super(x1,y1);
        Titik dot = new Titik(x2,y2);
        this.sisiSGT = super.hitungJarak(dot);
    }

    public double hitungLuas(){
        return 0.5 * sisiSGT * Math.sqrt(3);
    }

    @Override
    public void tampil() {
        System.out.println("====================================");
        System.out.println("---------- Data Segitiga -----------");
        super.tampil();
        System.out.println("Sisi Segitiga\t: " + sisiSGT);
        System.out.println("Luas Segitiga\t: " + hitungLuas());
    }
}
