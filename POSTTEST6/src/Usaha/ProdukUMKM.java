package Usaha;

public class ProdukUMKM extends UMKM implements UMKMInterface {
    private String jenisProduk;
    private String namaPengelola;
    private int kontak;
    private String email;
    private int pendapatan; // tambahkan variabel pendapatan
    private int modalAwal; // tambahkan variabel modalAwal

    public ProdukUMKM(String IdUMKM, String NamaUMKM, String JenisUsaha, String LokasiUMKM, int JumlahKaryawan, String jenisProduk, String namaPengelola, int kontak, String email, int pendapatan, int modalAwal) {
        super(IdUMKM, NamaUMKM, JenisUsaha, LokasiUMKM, JumlahKaryawan);
        this.jenisProduk = jenisProduk;
        this.namaPengelola = namaPengelola;
        this.kontak = kontak;
        this.email = email;
        this.pendapatan = pendapatan; // inisialisasi variabel pendapatan
        this.modalAwal = modalAwal; // inisialisasi variabel modalAwal
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

    // Implementasi metode abstrak getPendapatan() dan getModalAwal()
    @Override
    public int getPendapatan() {
        // Implementasi untuk mendapatkan pendapatan
        return pendapatan;
    }

    @Override
    public int getModalAwal() {
        // Implementasi untuk mendapatkan modal awal
        return modalAwal;
    }

    // Implementing the abstract method
    @Override
    public String getSumberModal() {
        return "Sumber Modal UMKM";
    }
    
    @Override
    public void hitungPendapatanBersih() {
        // Implementasi perhitungan pendapatan bersih
        double pendapatanBersih = getPendapatan() - getModalAwal();
        System.out.println("Pendapatan bersih UMKM dengan ID " + getIdUMKM() + " setelah dikurangi modal awal adalah: " + pendapatanBersih);
    }
    

}
