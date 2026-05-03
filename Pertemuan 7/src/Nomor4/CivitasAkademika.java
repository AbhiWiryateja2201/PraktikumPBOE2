package Nomor4;

/* NIM  : 24060124130053
   Nama : Anintya Abhi Wiryateja
   Tanggal  : 30 April 2026
*/

public abstract class CivitasAkademika {
    private String nama;

    public CivitasAkademika(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public abstract String getNomor();
}