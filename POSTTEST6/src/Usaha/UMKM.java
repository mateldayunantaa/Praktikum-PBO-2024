package Usaha;

public abstract class UMKM {
    // Access Modifier private
    private final String IdUMKM;
    private String NamaUMKM;
    protected String JenisUsaha;
    protected String LokasiUMKM;
    public int JumlahKaryawan;

    public UMKM(String IdUMKM, String NamaUMKM, String JenisUsaha, String LokasiUMKM, int JumlahKaryawan) {
        this.IdUMKM = IdUMKM;
        this.NamaUMKM = NamaUMKM;
        this.JenisUsaha = JenisUsaha;
        this.LokasiUMKM = LokasiUMKM;
        this.JumlahKaryawan = JumlahKaryawan;
    }

    // Getter
    public String getIdUMKM() {
        return IdUMKM;
    }

    public String getNamaUMKM() {
        return NamaUMKM;
    }

    public String getJenisUsaha() {
        return JenisUsaha;
    }

    public String getLokasiUMKM() {
        return LokasiUMKM;
    }

    public int getJumlahKaryawan() {
        return JumlahKaryawan;
    }

    // Setter
    public final void setNamaUMKM(String namaUMKM) {
        NamaUMKM = namaUMKM;
    }

    public void setJenisUsaha(String jenisUsaha) {
        JenisUsaha = jenisUsaha;
    }

    public void setLokasiUMKM(String lokasiUMKM) {
        LokasiUMKM = lokasiUMKM;
    }

    public void setJumlahKaryawan(int jumlahKaryawan) {
        JumlahKaryawan = jumlahKaryawan;
    }

    // Abstract method
    public abstract String getSumberModal();

    // Overloading 
    public final void setPendapatan(double pendapatan) {
        System.out.println("Set Pendapatan dari UMKM");
    }
    // Metode abstrak untuk mendapatkan pendapatan
    public abstract int getPendapatan();

    // Metode abstrak untuk mendapatkan modal awal
    public abstract int getModalAwal();
}
