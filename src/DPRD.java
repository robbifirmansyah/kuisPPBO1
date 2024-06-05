import java.util.ArrayList;

public class DPRD extends Pegawai {
    private int jumlahKunjungan;
    private ArrayList<String> daftarAspirasi;

    public DPRD(String nama, String NIP, int gajiPokok, String daerahKekuasaan, int jumlahKunjungan) {
        super(nama, NIP, gajiPokok, daerahKekuasaan);
        this.jumlahKunjungan = jumlahKunjungan;
        this.daftarAspirasi = new ArrayList<>();
    }

    public void tampungAspirasi(String aspirasi) {
        this.daftarAspirasi.add(aspirasi);
        System.out.println("Aspirasi telah ditampung: " + aspirasi);
    }

    public void kunjunganKerja() {
        this.jumlahKunjungan++;
        System.out.println("Kunjungan kerja telah dilakukan");
    }

    @Override
    public int getTunjangan() {
        return gajiPokok + (jumlahKunjungan * 1000000);
    }

    @Override
    public void bayarPajak() {
        int pajak = (gajiPokok + getTunjangan()) * 10 / 100;
        APBN.tambahPajak(pajak);
        System.out.println("Pajak yang harus dibayar: " + pajak);
    }
}
