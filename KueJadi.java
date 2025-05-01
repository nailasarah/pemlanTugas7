public class KueJadi extends Kue {
    private double jumlah;

    public KueJadi(String nama, double harga, double jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    @Override
    public double hitungHarga() {
        return harga * jumlah * 2;
    }

    public double getJumlah() {
        return jumlah;
    }

    @Override
    public String toString() {
        return String.format("KueJadi - Nama: %s, Harga: %.2f, Jumlah: %.2f, Harga Akhir: %.2f", nama, harga, jumlah, hitungHarga());
    }
}
