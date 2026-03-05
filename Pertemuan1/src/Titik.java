/* Nama File    : Titik.java
 * Deskripsi    : Berisi atribut dan method dalam class Titik
 * Pembuat      : Anintya Abhi Wiryateja
 * Tanggal      : 20 Februari 2026
 */

public class Titik {
    /****** ATRIBUT ******/
    double absis;
    double ordinat;

    /****** METHOD ******/
    
    // Konstruktor untuk membuat titik (0,0)
    Titik() {
        absis = 0;
        ordinat = 0;
    }

    // Konstruktor untuk membuat titik dengan koordinat (x, y)
    Titik(double x, double y) {
        absis = x;
        ordinat = y;
    }

    // Mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    // Mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    // Mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    // Mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y) {
        ordinat = y;
    }

    // Menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // Mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    // Mengembalikan jarak titik dari pusat koordinat
    public double getJarakPusat(){
        return Math.sqrt((absis * absis) + (ordinat * ordinat));
    }

    // Mengembalikan jarak titik dari titik t
    public double getJarak(Titik t) {
        return Math.sqrt(((this.absis - this.getAbsis()) * (this.absis - this.getAbsis())) + ((this.ordinat - this.getOrdinat()) * (this.ordinat - this.getOrdinat())));
    }

    // Mengembalikan titik hasil refleksi terhadap sumbu X
    public void refleksiX (){
        ordinat = -1;
    }

    // Mengembalikan titik hasil refleksi terhadap sumbu Y
    public void refleksiY (){
        absis = -1;
    }

    // Mengembalikan titik hasil refleksi terhadap titik pusat (0,0)
    public Titik getRefleksiX (){
        return new Titik(absis, this.ordinat * -1);
    }

    // Mengembalikan titik hasil refleksi terhadap titik pusat (0,0)
    public Titik getRefleksiY (){
        return new Titik(this.absis * -1, ordinat);
    }

    // Mengembalikan titik hasil refleksi terhadap titik pusat
    public int getKuadran() {
        if (this.absis > 0 && this.ordinat > 0) {
            return 1;
        } else if (this.absis < 0 && this.ordinat > 0) {
            return 2;
        } else if (this.absis < 0 && this.ordinat < 0) {
            return 3;
        } else if (this.absis > 0 && this.ordinat < 0) {
            return 4;
        } else {
            return 0; 
        }
    }
}