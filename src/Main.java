public class Main {
    public static void main(String[] args) {
        // Contoh inisialisasi objek
        RakyatJelata rakyat1 = new RakyatJelata("Arga", "Jogja", 50000000);
        RakyatJelata rakyat2 = new RakyatJelata("Gattha", "Jogja", 150000000);

        PNS pns1 = new PNS("Affriza", "123", 5000000, "Jogja", 3);
        pns1.dataRakyat(rakyat1);
        pns1.dataRakyat(rakyat2);
        pns1.menyalurkanBantuan();
        pns1.getDaftarRakyat();

        DPRD dprd1 = new DPRD("Tegar", "456", 7000000, "Jogja", 5);
        dprd1.tampungAspirasi("Perbaikan jalan");
        dprd1.kunjunganKerja();
        System.out.println("Tunjangan DPRD: " + dprd1.getTunjangan());

        Gubernur gubernur1 = new Gubernur("Aziz", "789", 10000000, "Jogja");
        gubernur1.catatPegawai(pns1);
        gubernur1.tambahAnggaran(500000000);
        System.out.println("Tunjangan Gubernur: " + gubernur1.getTunjangan());

        rakyat1.bayarPajak();
        pns1.bayarPajak();
        dprd1.bayarPajak();
        gubernur1.bayarPajak();

        System.out.println("Total pajak di APBN: " + APBN.getTotalPajak());
    }
}
