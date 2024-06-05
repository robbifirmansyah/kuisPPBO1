import java.util.ArrayList;

public class Gubernur extends Pegawai {
    private ArrayList<PNS> daftarPegawai;
    private int anggaranNegara;

    public Gubernur(String nama, String NIP, int gajiPokok, String daerahKekuasaan) {
        super(nama, NIP, gajiPokok, daerahKekuasaan);
        this.daftarPegawai = new ArrayList<>();
    }

    public void catatPegawai(PNS pns) {
        if (pns.daerahKekuasaan.equals(this.daerahKekuasaan)) {
            this.daftarPegawai.add(pns);
        } else {
            System.out.println("Alamat pegawai tidak sesuai dengan daerah kekuasaan");
        }
    }

    public void tambahAnggaran(int jumlah) {
        this.anggaranNegara += jumlah;
    }

    @Override
    public int getTunjangan() {
        return gajiPokok + (daftarPegawai.size() * 100000);
    }

    @Override
    public void bayarPajak() {
        int pajak = gajiPokok * 10 / 100;
        APBN.tambahPajak(pajak);
        System.out.println("Pajak yang harus dibayar: " + pajak);
    }
}
