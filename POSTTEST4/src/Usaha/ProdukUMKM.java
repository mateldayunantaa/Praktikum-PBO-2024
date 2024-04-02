package Usaha;

public class ProdukUMKM extends UMKM {
    private String jenisProduk;
    private String namaPengelola;
    private int kontak;
    private String email;

    public ProdukUMKM(String IdUMKM, String NamaUMKM, String JenisUsaha, String LokasiUMKM, int JumlahKaryawan, String jenisProduk, String namaPengelola, int kontak, String email) {
        super(IdUMKM, NamaUMKM, JenisUsaha, LokasiUMKM, JumlahKaryawan);
        this.jenisProduk = jenisProduk;
        this.namaPengelola = namaPengelola;
        this.kontak = kontak;
        this.email = email;
    }

    public String getJenisProduk() {
        return jenisProduk;
    }
    public void setNamaPengelola(String namaPengelola) {
        this.namaPengelola = namaPengelola;
    }
    public void setKontak(int kontak) {
        this.kontak = kontak;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setJenisProduk(String jenisProduk) {
        this.jenisProduk = jenisProduk;
    }
    public String getNamaPengelola() {
        return namaPengelola;
    }
    public int getKontak() {
        return kontak;
    }
    public String getEmail() {
        return email;
    }

    // Overriding 
    @Override
    public String getNamaUMKM() {
        return "Nama Produk UMKM: " + super.getNamaUMKM(); // Menambahkan prefix "Nama Produk UMKM: " sebelum nama
    }

    // Overloading 
    public void setNamaPengelola(String namaPengelola, String jabatan) {
        this.namaPengelola = namaPengelola + ", " + jabatan; // Menambahkan jabatan pada nama pengelola
    }

    // Overloading 
    public void setKontak(String kontak) {
        this.kontak = Integer.parseInt(kontak); // Mengkonversi kontak ke tipe int
    }
}

