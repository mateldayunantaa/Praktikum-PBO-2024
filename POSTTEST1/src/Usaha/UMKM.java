package Usaha;

public class UMKM {
    String IdUMKM;
    String NamaUMKM;
    String JenisUsaha;
    String LokasiUMKM;
    int JumlahKaryawan;

    public UMKM(String IdUMKM,String NamaUMKM,String JenisUsaha,String LokasiUMKM,int JumlahKaryawan){
        this.IdUMKM = IdUMKM;
        this.NamaUMKM = NamaUMKM;
        this.JenisUsaha = JenisUsaha;
        this.LokasiUMKM = LokasiUMKM;
        this.JumlahKaryawan = JumlahKaryawan;
        }
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
        public void setIdUMKM(String idUMKM) {
            IdUMKM = idUMKM;
        }
        public void setNamaUMKM(String namaUMKM) {
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
}


