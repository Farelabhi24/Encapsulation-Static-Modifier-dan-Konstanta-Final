package praktic.geometry.shapes; // Menentukan bahwa file ini berada dalam package shapes

// Class untuk membentuk suatu persegi panjang
public class Rectangle {

    // Field
    private int Id; // ID dari persegi panjang
    private double Panjang; // Panjang persegi panjang
    private double Lebar; // Lebar persegi panjang

    // Konstruktor untuk membuat suatu persegi panjang dengan parameter Id, Panjang, dan Lebar
    public Rectangle(int Id, double Panjang, double Lebar) {
        this.Id = Id; // Mengatur nilai field Id
        this.Panjang = Panjang; // Mengatur nilai field Panjang
        this.Lebar = Lebar; // Mengatur nilai field Lebar
    }

    // Method getter untuk mengambil nilai field Id
    public int getID(int Id) {
        return Id = Id; // Mengembalikan nilai field Id
    }

    // Method getter untuk mengambil nilai field Panjang
    public double getPanjang(double Panjang) {
        return Panjang = Panjang; // Mengembalikan nilai field Panjang
    }

    // Method getter untuk mengambil nilai field Lebar
    public double getLebar(double Lebar) {
        return Lebar = Lebar; // Mengembalikan nilai field Lebar
    }

    // Method getter untuk menghitung keliling persegi panjang
    public double getKeliling() {
        return (2 * (Panjang + Lebar)); // Mengembalikan nilai Keliling dengan rumus keliling persegi panjang
    }

    // Method getter untuk menghitung luas persegi panjang
    public double getLuas() {
        return (Panjang * Lebar); // Mengembalikan nilai Luas dengan rumus luas persegi panjang
    }

    // Method untuk menampilkan informasi persegi panjang
    public void infoRectangle() {
        System.out.println("ID : " + Id); // Menampilkan ID dengan memanggil nilai Id
        System.out.println("Panjang : " + Panjang); // Menampilkan Panjang dengan memanggil nilai Panjang
        System.out.println("Lebar : " + Lebar); // Menampilkan Lebar dengan memanggil nilai Lebar
        System.out.println("Keliling : " + getKeliling()); // Menampilkan Keliling dengan memanggil nilai Keliling
        System.out.println("Luas : " + getLuas()); // Menampilkan Luas dengan memanggil nilai Luas
    }
}
