package praktic.geometry.shapes; // Menentukan bahwa file ini berada dalam package shapes

// Class untuk membentuk suatu lingkaran
public class Circle {
    
    // Field
    private int ID; // ID dari lingkaran
    private double Radius;  // Jari-jari dari lingkaran
    private final int Pembilang = 22;   // Nilai pembilang untuk membuat nilai Phi
    private final int Penyebut = 7;     // Nilai penyebut untuk membuat nilai Phi

    // Konstruktor tanpa parameter untuk membuat lingkaran
    public Circle() {
    }

    // Method setter untuk mengatur nilai field ID
    public void setID(int ID) {
        this.ID = ID;
    }

    // Method setter untuk mengatur nilai field Radius
    public void setRadius(double Radius) {
        this.Radius = Radius;
    }

    // Method getter untuk menghitung keliling lingkaran
    // Mengembalikan nilai Keliling dengan rumus keliling lingkaran
    public double getKeliling(double Keliling) {
        return Keliling = (2.0 * Pembilang * Radius) / Penyebut;
    }

    // Method getter untuk menghitung luas lingkaran
    // Mengembalikan nilai Luas dengan rumus luas lingkaran
    public double getLuas(double Luas) {
        return Luas = (Pembilang * Radius * Radius) / Penyebut;
    }

    // Method untuk menampilkan informasi circle
    public void infoCircle() {
        System.out.println("ID : " + ID); // Menampilkan ID dengan memanggil nilai ID
        System.out.println("Radius : " + Radius); // Menampilkan Radius dengan memanggil nilai Radius
        System.out.println("Keliling : " + getKeliling(Radius)); // Menampilkan Keliling dengan memanggil nilai Keliling
        System.out.println("Luas : " + getLuas(Radius)); // Menampilkan Luas dengan memanggil nilai Luas
    }
}
