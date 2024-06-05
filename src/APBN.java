public class APBN {
    private static int totalPajak;

    public static void tambahPajak(int jumlah) {
        totalPajak += jumlah;
    }

    public static int getTotalPajak() {
        return totalPajak;
    }
}
