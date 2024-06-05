import java.util.ArrayList;

public class PNS extends Pegawai {
    private int golongan;
    private ArrayList<RakyatJelata> daftarRakyat;

    public PNS(String nama, String NIP, int gajiPokok, String daerahKekuasaan, int golongan) {
        super(nama, NIP, gajiPokok, daerahKekuasaan);
        this.golongan = golongan;
        this.daftarRakyat = new ArrayList<>();
    }

    public void dataRakyat(RakyatJelata rakyat) {
        if (!rakyat.getAlamat().equals(this.daerahKekuasaan)) {
            System.out.println("Alamat rakyat tidak sesuai dengan daerah kekuasaan");
            return;
        }
        for (RakyatJelata existingRakyat : daftarRakyat) {
            if (existingRakyat.getNama().equals(rakyat.getNama())) {
                System.out.println("Rakyat dengan nama ini sudah ada");
                return;
            }
        }
        this.daftarRakyat.add(rakyat);
    }

    public void menyalurkanBantuan() {
        for (RakyatJelata rakyat : daftarRakyat) {
            if (rakyat.getJumlahKekayaan() < 100000000) {
                rakyat.setJumlahKekayaan(rakyat.getJumlahKekayaan() + 1000000);
                System.out.println("Bantuan diberikan kepada " + rakyat.getNama());
            } else {
                System.out.println(rakyat.getNama() + " tidak memenuhi syarat untuk bantuan");
            }
        }
    }

    @Override
    public int getTunjangan() {
        return gajiPokok + (golongan * 100000);
    }

    public int getGaji() {
        return gajiPokok + getTunjangan();
    }

    public void getDaftarRakyat() {
        for (RakyatJelata rakyat : daftarRakyat) {
            System.out.println("Nama: " + rakyat.getNama());
            System.out.println("Alamat: " + rakyat.getAlamat());
            System.out.println("Jumlah Kekayaan: " + rakyat.getJumlahKekayaan());
        }
    }

    @Override
    public void bayarPajak() {
        int pajak = gajiPokok * 10 / 100;
        APBN.tambahPajak(pajak);
        System.out.println("Pajak yang harus dibayar: " + pajak);
    }
}
