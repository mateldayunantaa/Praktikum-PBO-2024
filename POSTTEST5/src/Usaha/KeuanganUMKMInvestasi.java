package Usaha;

public class KeuanganUMKMInvestasi extends KeuanganUMKM {
    private String jenisInvestasi;
    private double nilaiInvestasi;

    public KeuanganUMKMInvestasi(String idUMKM, int pendapatan, int modalAwal, String sumberModal, String jenisInvestasi, double nilaiInvestasi) {
        super(idUMKM, pendapatan, modalAwal, sumberModal);
        this.jenisInvestasi = jenisInvestasi;
        this.nilaiInvestasi = nilaiInvestasi;
    }

    public String getJenisInvestasi() {
        return jenisInvestasi;
    }

    public void setJenisInvestasi(String jenisInvestasi) {
        this.jenisInvestasi = jenisInvestasi;
    }

    public double getNilaiInvestasi() {
        return nilaiInvestasi;
    }

    public void setNilaiInvestasi(double nilaiInvestasi) {
        this.nilaiInvestasi = nilaiInvestasi;
    }

    // Overriding
    @Override
    public void hitungPendapatan() {
        double pendapatanBersih = getPendapatan() - getModalAwal();
        System.out.println("Pendapatan bersih UMKM dengan ID " + getIdUMKM() + " setelah dikurangi modal awal adalah: " + pendapatanBersih);
    }

    // Abstract method implementation
    @Override
    public void hitungPendapatanBersih() {
        double pendapatanBersih = getPendapatan() - getModalAwal() - nilaiInvestasi;
        System.out.println("Pendapatan bersih UMKM dengan ID " + getIdUMKM() + " setelah dikurangi modal awal dan investasi adalah: " + pendapatanBersih);
    }
}
