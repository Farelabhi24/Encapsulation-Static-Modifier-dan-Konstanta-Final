package praktic.geometry.shapes;
import praktic.geometry.shapes.Circle;

public class Circle {
    private int ID;
    private double Radius;
    private final int Pembilang = 22;
    private final int Penyebut = 7;

    public Circle() {
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setRadius(double Radius) {
        this.Radius = Radius;
    }

    public double getKeliling(double Keliling) {
        return Keliling = (2.0 * Pembilang * Radius) / Penyebut;
    }

    public double getLuas(double Luas) {
        return Luas = (Pembilang * Radius * Radius) / Penyebut;
    }

    public void infoCircle() {
        System.out.println("ID : " + ID);
        System.out.println("Radius : " + Radius);
        System.out.println("Keliling : " + getKeliling(Radius));
        System.out.println("Luas : " + getLuas(Radius));
    }
}