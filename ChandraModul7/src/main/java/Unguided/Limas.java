package Unguided;
//NAMA  : GEDE CHANDRA ARYA PRAGUSTA
//NIM   : 2211103113
//KELAS : S1SI06B
public class Limas {
    SgtSamaSisi tiga;
    Persegi empat;
    public Limas(double Sx1, double Sy1, double Sx2, double Sy2, double Px1, double Py1, double Px2, double Py2){
        tiga = new SgtSamaSisi(Sx1,Sy1,Sx2,Sy2);
        empat = new Persegi(Px1,Py1,Px2,Py2);
    }
    public double hitungLuas(){
        return (4 * tiga.hitungLuas()) + empat.hitungLuas();
    }
    public void tampil(){
        System.out.println("====================================");
        System.out.println("Luas Limas\t\t: " + hitungLuas());
        System.out.println("====================================");
    }
}
