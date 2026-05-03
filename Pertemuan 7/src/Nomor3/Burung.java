package Nomor3;

/* NIM  : 24060124130053
   Nama : Anintya Abhi Wiryateja
   Tanggal  : 30 April 2026
*/

public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("terbang");
    }

    @Override
    public void suara() {
        System.out.println("cuit");
    }

}