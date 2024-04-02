package Usaha;

public class KeuanganUMKM {
    // Access Modifier 
    protected String idUMKM;
    private int pendapatan;
    protected int modalAwal;
    private String sumberModal;

    public KeuanganUMKM(String idUMKM, int pendapatan, int modalAwal, String sumberModal) {
        this.idUMKM = idUMKM;
        this.pendapatan = pendapatan;
        this.modalAwal = modalAwal;
        this.sumberModal = sumberModal;
    }

    // Setter 
    public void setIdUMKM(String idUMKM) {
        this.idUMKM = idUMKM;
    }

    public void setPendapatan(int pendapatan) {
        this.pendapatan = pendapatan;
    }

    public void setModalAwal(int modalAwal) {
        this.modalAwal = modalAwal;
    }

    public void setSumberModal(String sumberModal) {
        this.sumberModal = sumberModal;
    }

    // Getter 
    public String getIdUMKM() {
        return idUMKM;
    }

    public int getPendapatan() {
        return pendapatan;
    }

    public int getModalAwal() {
        return modalAwal;
    }

    public String getSumberModal() {
        return sumberModal;
    }
    // Overloading
    public void hitungPendapatan() {
        System.out.println("Pendapatan UMKM dengan ID " + idUMKM + " adalah: " + pendapatan);
    }
}

