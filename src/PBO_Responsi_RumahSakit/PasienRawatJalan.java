package PBO_Responsi_RumahSakit;


public class PasienRawatJalan extends Pasien
        implements DapatDiperiksa, DapatDibayar {

    private String namaDokter;
    private double biayaPemeriksaan;

    public PasienRawatJalan(String idPasien, String nama,
            int umur, String namaDokter, double biayaPemeriksaan) {

        super(idPasien, nama, umur);

        this.namaDokter = namaDokter;
        this.biayaPemeriksaan = biayaPemeriksaan;
    }

    public String getNamaDokter() {
        return namaDokter;
    }

    public void setNamaDokter(String namaDokter) {
        this.namaDokter = namaDokter;
    }

    public double getBiayaPemeriksaan() {
        return biayaPemeriksaan;
    }

    public void setBiayaPemeriksaan(double biayaPemeriksaan) {
        this.biayaPemeriksaan = biayaPemeriksaan;
    }

    @Override
    public void layaniPasien() {

        super.tampilkanInfo();

        if (getStatus().equals("Terdaftar")) {
            System.out.println("Pasien rawat jalan siap diperiksa.");
            ubahStatus("Sedang Diperiksa");
        } else {
            System.out.println("Pasien tidak dapat diperiksa karena statusnya: "
                    + getStatus());
        }
    }

    @Override
    public void lakukanPemeriksaan() {
        System.out.println("Pemeriksaan dilakukan oleh dr. "
                + namaDokter);
        ubahStatus("Selesai Diperiksa");
    }

    @Override
    public double hitungBiaya() {
        return biayaPemeriksaan + BIAYA_ADMIN;
    }
}
