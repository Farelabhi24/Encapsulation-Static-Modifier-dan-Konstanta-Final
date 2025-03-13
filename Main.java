package praktic.geometry.mains;     // Menentukan bahwa file ini berada dalam package mains
import java.util.Scanner;           // Mengimport class Scanner untuk membaca input dari user
import praktic.geometry.shapes.*;   // Mengimport semua class yang ada di package shapes

public class Main { // Kelas utama yang digunakan untuk menjalankan program
    
    // Variabel warna digunakan untuk memberikan warna pada teks yang dicetak di terminal menggunakan ANSI escape codes
    static String BLUE = "\u001B[94m";      // Warna Biru
    static String WHITE = "\u001B[0m";      // Warna Putih
    static String YELLOW = "\u001B[33m";    // Warna Kuning
    
    static void garisPembatas() {
        System.out.println("===========================");
    } // Method yang digunakan untuk menampilkan garis pembatas

    // Method yang pertama kali (utama) diekisekusi ketika program dijalankan
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat objek Scanner untuk membaca input dari user
        Circle circle = new Circle(); // Membuat objek circle baru dari class Circle
        Rectangle rectangle = new Rectangle(3, 4, 5); // Membuat objek rectangle baru dari class Rectangle dengan parameter panjang sisi 4, lebar 5, dan Id 3

        garisPembatas(); // Menampilkan garis pembatas
        System.out.print(WHITE + "Nama : " ); // Menampilkan teks "Nama : " dengan warna putih
        String nama = input.nextLine(); // Membaca input dari user dan menyimpannya ke dalam variabel nama

        System.out.print("NIM : " ); // Menampilkan teks "NIM : "
        long NIM = input.nextLong(); // Membaca input dari user dan menyimpannya ke dalam variabel NIM

        garisPembatas(); // Menampilkan garis pembatas
        System.out.println(BLUE + "Circle"); // Menampilkan teks "Circle" dan seterusnya dengan warna biru

        garisPembatas(); // Menampilkan garis pembatas
        System.out.print("Isikan ID : "); // Menampilkan teks "Isikan ID : " untuk circle
        int ID = input.nextInt(); // Membaca input dari user dan menyimpannya ke dalam variabel ID

        System.out.print("Isikan Radius : " ); // Menampilkan teks "Isikan Radius : "
        double radius = input.nextDouble(); // Membaca input dari user dan menyimpannya ke dalam variabel radius
        
        circle.setID(ID); // Mengatur nilai ID dari objek circle 
        circle.setRadius(radius); // Mengatur nilai radius dari objek circle

        garisPembatas(); // Menampilkan garis pembatas
        circle.infoCircle(); // Menampilkan informasi dari objek circle berupa ID, Radius, Keliling, dan, Luas
        
        garisPembatas(); // Menampilkan garis pembatas
        System.out.println(YELLOW + "Rectangle"); // Menampilkan teks "Rectangle" dan seterusnya dengan warna kuning

        garisPembatas(); // Menampilkan garis pembatas
        System.out.print("Isikan ID : "); // Menampilkan teks "Isikan ID : " untuk rectangle
        int Id = input.nextInt(); // Membaca input dari user dan menyimpannya ke dalam variabel Id

        System.out.print("Isikan Panjang : "); // Menampilkan teks "Isikan Panjang : "
        double panjang = input.nextDouble(); // Membaca input dari user dan menyimpannya ke dalam variabel panjang

        System.out.print("Isikan Lebar : "); // Menampilkan teks "Isikan Lebar : "
        double lebar = input.nextDouble(); // Membaca input dari user dan menyimpannya ke dalam variabel lebar

        rectangle.getID(Id); // Mengatur nilai ID dari objek rectangle
        rectangle.getPanjang(panjang); // Mengatur nilai panjang dari objek rectangle
        rectangle.getLebar(lebar); // Mengatur nilai lebar dari objek rectangle

        garisPembatas(); // Menampilkan garis pembatas
        rectangle.infoRectangle(); // Menampilkan informasi dari objek rectangle berupa ID, Panjang, Lebar, Keliling, dan Luas
        garisPembatas(); // Menampilkan garis pembatas
    }
}
