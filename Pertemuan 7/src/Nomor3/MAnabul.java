package Nomor3;

/* NIM  : 24060124130053
   Nama : Anintya Abhi Wiryateja
   Tanggal  : 30 April 2026
*/

public class MAnabul {
    public static void main(String[] args) {

        Anabul[] daftarAnabul = {
                new Anjing("Dawg"),
                new Kucing("Fatcat"),
                new Burung("Goonmaster")
        };

        for (Anabul hewan : daftarAnabul) {
            System.out.println(hewan.getNama());
            hewan.suara();
            hewan.gerak();
        }
    }
}