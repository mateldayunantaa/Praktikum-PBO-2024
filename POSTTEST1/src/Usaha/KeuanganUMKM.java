package Usaha;

public class KeuanganUMKM {
    String IdUMKM;
    int Pendapatan;
    int ModalAwal;
    String SumberModal;

    public KeuanganUMKM(String IdUMKM,int Pendapatan,int ModalAwal,String SumberModal) {
        this.IdUMKM = IdUMKM;
        this.Pendapatan = Pendapatan;
        this.ModalAwal = ModalAwal;
        this.SumberModal = SumberModal;
    }
    public String getIdUMKM() {
        return IdUMKM;
    }
    public int getPendapatan() {
        return Pendapatan;
    }
    public int getModalAwal() {
        return ModalAwal;
    }
    public String getSumberModal() {
        return SumberModal;
    }
    public void setIdUMKM(String idUMKM) {
        IdUMKM = idUMKM;
    }
    public void setPendapatan(int pendapatan) {
        Pendapatan = pendapatan;
    }
    public void setModalAwal(int modalAwal) {
        ModalAwal = modalAwal;
    }
    public void setSumberModal(String sumberModal) {
        SumberModal = sumberModal;
    }
}

