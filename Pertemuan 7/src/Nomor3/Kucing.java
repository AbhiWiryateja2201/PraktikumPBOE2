package Nomor3;

/* NIM  : 24060124130053
   Nama : Anintya Abhi Wiryateja
   Tanggal  : 30 April 2026
*/

public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("melata");
    }

    @Override
    public void suara() {
        System.out.println("meong");
    }

}