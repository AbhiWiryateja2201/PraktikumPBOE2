/* NIM  : 24060124130053
   Nama : Anintya Abhi Wiryateja
   Tanggal  : 27 April 2026
*/


package Piaraan;
public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("terbang");
    }

    @Override
    public void bersuara() {
        System.out.println("cuit");
    }
}