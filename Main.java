public class Main {
    public static void main(String[] args) {
        Kue[] kueArray = new Kue[20];

        // Mengisi array dengan berbagai jenis kue
        for (int i = 0; i < kueArray.length; i++) {
            if (i % 2 == 0) {
                kueArray[i] = new KuePesanan("Kue Lapis " + (i+1), 20000 + i * 1000, 0.5 + i * 0.1);
            } else {
                kueArray[i] = new KueJadi("Kue Nastar " + (i+1), 10000 + i * 500, 10 + i);
            }
        }

        double totalHargaSemua = 0;
        double totalHargaPesanan = 0;
        double totalBeratPesanan = 0;
        double totalHargaJadi = 0;
        double totalJumlahJadi = 0;
        Kue kueTermahal = kueArray[0];

        for (Kue kue : kueArray) {
            System.out.println(kue);
            double hargaAkhir = kue.hitungHarga();
            totalHargaSemua += hargaAkhir;

            if (kue instanceof KuePesanan) {
                totalHargaPesanan += hargaAkhir;
                totalBeratPesanan += ((KuePesanan) kue).getBerat();
            } else if (kue instanceof KueJadi) {
                totalHargaJadi += hargaAkhir;
                totalJumlahJadi += ((KueJadi) kue).getJumlah();
            }

            if (hargaAkhir > kueTermahal.hitungHarga()) {
                kueTermahal = kue;
            }
        }

        System.out.println("\n--- Ringkasan ---");
        System.out.printf("Total harga semua kue: %.2f\n", totalHargaSemua);
        System.out.printf("Total harga KuePesanan: %.2f, Total berat: %.2f\n", totalHargaPesanan, totalBeratPesanan);
        System.out.printf("Total harga KueJadi: %.2f, Total jumlah: %.2f\n", totalHargaJadi, totalJumlahJadi);
        System.out.println("Kue dengan harga akhir terbesar:");
        System.out.println(kueTermahal);
    }
}
