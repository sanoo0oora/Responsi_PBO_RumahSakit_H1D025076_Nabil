package PBO_Responsi_RumahSakit;


public abstract class Pasien {

    public static final double BIAYA_ADMIN = 10000;

    private final String idPasien;
    private String nama;
    private int umur;
    private String status;

    public Pasien(String idPasien, String nama, int umur) {
        this.idPasien = idPasien;
        this.nama = nama;
        this.umur = umur;
        this.status = "Terdaftar";
    }

    public Pasien(String idPasien, String nama, int umur, String status) {
        this.idPasien = idPasien;
        this.nama = nama;
        this.umur = umur;
        this.status = status;
    }

    public String getIdPasien() {
        return idPasien;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void tampilkanInfo() {
        System.out.println("ID Pasien  : " + this.idPasien);
        System.out.println("Nama       : " + this.nama);
        System.out.println("Umur       : " + this.umur);
        System.out.println("Status     : " + this.status);
    }

    public void ubahStatus(String status) {
        this.status = status;
    }

    public abstract void layaniPasien();
}
