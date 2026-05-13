// Nama File    : Anabul.java
// NIM          : 24060124130053
// Nama         : Anintya Abhi Wiryateja
// Tanggal      : 2 Mei 2026

package Piaraan;

public abstract class Anabul {
    private String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public abstract void gerak();

    public abstract void bersuara();
}