import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pegawai {

    protected String nama;
    protected String nip;
    protected LocalDate tanggalLahir;
    protected LocalDate TMT;
    protected double gajiPokok;

    public Pegawai(String nama, String nip, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok) {
        this.nama = nama;
        this.nip = nip;
        this.tanggalLahir = tanggalLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }
}