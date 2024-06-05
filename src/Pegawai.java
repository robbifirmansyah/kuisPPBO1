import java.util.ArrayList;

public abstract class Pegawai {
    protected String nama;
    protected String NIP;
    protected int gajiPokok;
    protected String daerahKekuasaan;

    public Pegawai(String nama, String NIP, int gajiPokok, String daerahKekuasaan) {
        this.nama = nama;
        this.NIP = NIP;
        this.gajiPokok = gajiPokok;
        this.daerahKekuasaan = daerahKekuasaan;
    }

    public abstract int getTunjangan();
    public abstract void bayarPajak();
}
