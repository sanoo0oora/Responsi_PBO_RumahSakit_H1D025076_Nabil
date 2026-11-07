
package PBO_Responsi_RumahSakit;

public class Main {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("       SISTEM INFORMASI RUMAH SAKIT");
        System.out.println("==========================================");

        PasienRawatJalan pasien1 = new PasienRawatJalan(
            "RJ001", "Andi", 20, "Dr. Budi", 150000
        );

        PasienRawatInap pasien2 = new PasienRawatInap(
            "RI001", "Budi", 25, "A101", 3, 300000
        );


        System.out.println("\n==========================================");
        System.out.println("          PASIEN RAWAT JALAN");
        System.out.println("==========================================");

        pasien1.tampilkanInfo();

        System.out.println("Dokter            : " + pasien1.getNamaDokter());

        System.out.println("\n--- Pelayanan Pasien ---");
        pasien1.layaniPasien();

        System.out.println("\n--- Pemeriksaan Pasien ---");
        DapatDiperiksa pemeriksaanJalan = pasien1;
        pemeriksaanJalan.lakukanPemeriksaan();

        System.out.println("\n--- Pembayaran Pasien ---");
        DapatDibayar pembayaranJalan = pasien1;
        double biayaJalan = pembayaranJalan.hitungBiaya();

        System.out.println("Biaya Pemeriksaan : Rp" + pasien1.getBiayaPemeriksaan());
        System.out.println("Biaya Administrasi: Rp" + Pasien.BIAYA_ADMIN);
        System.out.println("Total Biaya       : Rp" + biayaJalan);

        System.out.println("Status Akhir      : " + pasien1.getStatus());


        System.out.println("\n==========================================");
        System.out.println("           PASIEN RAWAT INAP");
        System.out.println("==========================================");

        pasien2.tampilkanInfo();

        System.out.println("Nomor Kamar       : " + pasien2.getNomorKamar());
        System.out.println("Lama Menginap     : " + pasien2.getLamaMenginap() + " hari");

        System.out.println("\n--- Pelayanan Pasien ---");
        pasien2.layaniPasien();

        System.out.println("\n--- Pemeriksaan Pasien ---");
        DapatDiperiksa pemeriksaanInap = pasien2;
        pemeriksaanInap.lakukanPemeriksaan();

        System.out.println("\n--- Pembayaran Pasien ---");
        DapatDibayar pembayaranInap = pasien2;
        double biayaInap = pembayaranInap.hitungBiaya();

        System.out.println("Biaya Per Hari    : Rp" + pasien2.getBiayaPerHari());
        System.out.println("Biaya Administrasi: Rp" + Pasien.BIAYA_ADMIN);
        System.out.println("Total Biaya       : Rp" + biayaInap);

        System.out.println("Status Akhir      : " + pasien2.getStatus());

        System.out.println("\n==========================================");
        System.out.println("             RINGKASAN BIAYA");
        System.out.println("==========================================");

        System.out.println("Pasien Rawat Jalan: Rp" + biayaJalan);
        System.out.println("Pasien Rawat Inap : Rp" + biayaInap);
        System.out.println("------------------------------------------");
        System.out.println("Total Pendapatan  : Rp" + (biayaJalan + biayaInap));

        System.out.println("==========================================");
        System.out.println("       TERIMA KASIH TELAH BERKUNJUNG");
        System.out.println("==========================================");
    }
}
