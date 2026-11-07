package PBO_Responsi_RumahSakit;


public class PasienRawatInap extends Pasien
        implements DapatDiperiksa, DapatDibayar {

    private String nomorKamar;
    private int lamaMenginap;
    private double biayaPerHari;

    public PasienRawatInap(String idPasien, String nama,
            int umur, String nomorKamar,
            int lamaMenginap, double biayaPerHari) {

        super(idPasien, nama, umur);

        this.nomorKamar = nomorKamar;
        this.lamaMenginap = lamaMenginap;
        this.biayaPerHari = biayaPerHari;
    }

    public String getNomorKamar() {
        return nomorKamar;
    }

    public void setNomorKamar(String nomorKamar) {
        this.nomorKamar = nomorKamar;
    }

    public int getLamaMenginap() {
        return lamaMenginap;
    }

    public void setLamaMenginap(int lamaMenginap) {
        this.lamaMenginap = lamaMenginap;
    }

    public double getBiayaPerHari() {
        return biayaPerHari;
    }

    public void setBiayaPerHari(double biayaPerHari) {
        this.biayaPerHari = biayaPerHari;
    }

    @Override
    public void layaniPasien() {

        super.tampilkanInfo();

        if (getStatus().equals("Terdaftar")) {
            System.out.println("Pasien rawat inap mendapatkan kamar "
                    + nomorKamar);
            ubahStatus("Sedang Dirawat");
        } else {
            System.out.println("Pasien tidak dapat dirawat karena statusnya: "
                    + getStatus());
        }
    }

    @Override
    public void lakukanPemeriksaan() {
        System.out.println("Pemeriksaan pasien rawat inap sedang dilakukan.");
        ubahStatus("Selesai Diperiksa");
    }

    @Override
    public double hitungBiaya() {
        return (lamaMenginap * biayaPerHari) + BIAYA_ADMIN;
    }
}

