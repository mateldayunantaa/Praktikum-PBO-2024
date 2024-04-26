import Usaha.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        ArrayList<UMKM> ush = new ArrayList<>();
        ArrayList<KeuanganUMKM> keuanganList = new ArrayList<>();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        while(true){
            System.out.println("-MANAJEMEN DATA UMKM-");
            System.out.println("====================");
            System.out.println("1. Lihat Data UMKM");
            System.out.println("2. Tambah Data UMKM");
            System.out.println("3. Ubah Data UMKM");
            System.out.println("4. Hapus Data UMKM");
            System.out.println("5. Keluar");
            System.out.println("==================="); 
            System.out.print("Menu : ");  
            int menu = Integer.parseInt(br.readLine());
            switch (menu) {
                case 1:
                    // Menampilkan daftar UMKM
                    System.out.println("======================================");
                    System.out.println("========== Daftar Data UMKM ==========");
                    System.out.println("======================================");
                    for (int i = 0; i < ush.size(); i++) {
                        UMKM usaha = ush.get(i);
                        String IdUMKM = usaha.getIdUMKM();
                        String NamaUMKM = usaha.getNamaUMKM();
                        String JenisUsaha = usaha.getJenisUsaha();
                        String LokasiUMKM = usaha.getLokasiUMKM();
                        int JumlahKaryawan = usaha.getJumlahKaryawan();
                        System.out.println("Id : " + IdUMKM);
                        System.out.println("Nama UMKM : " + NamaUMKM);
                        System.out.println("Jenis Usaha : " + JenisUsaha);
                        System.out.println("Lokasi UMKM : " + LokasiUMKM);
                        System.out.println("Jumlah Karyawan : " + JumlahKaryawan);
                        for (KeuanganUMKM keuangan : keuanganList) {
                            if (keuangan.getIdUMKM().equals(IdUMKM)) {
                                System.out.println("Pendapatan : " + keuangan.getPendapatan());
                                System.out.println("Modal Awal : " + keuangan.getModalAwal());
                                System.out.println("Sumber Modal : " + keuangan.getSumberModal());
                            }
                        }
                        System.out.println("======================================");
                    }
                    break;
                case 2 :
                    // Menambahkan data UMKM
                    String idUMKM = "ush 0" + (ush.size() + 1);
                    System.out.println("Masukkan Nama UMKM");
                    String namaUMKM = br.readLine();
                    System.out.println("Jenis Usaha");
                    String jenisUsaha = br.readLine();
                    System.out.println("Lokasi UMKM");
                    String lokasiUMKM = br.readLine();
                    System.out.println("Jumlah Karyawan");
                    int jumlahKaryawan = Integer.parseInt(br.readLine());
                    System.out.println("Pendapatan");
                    int pendapatan = Integer.parseInt(br.readLine());
                    System.out.println("Modal Awal");
                    int modalAwal = Integer.parseInt(br.readLine());
                    System.out.println("Sumber Modal");
                    String sumberModal = br.readLine();
                    ProdukUMKM usaha = new ProdukUMKM(idUMKM, namaUMKM, jenisUsaha, lokasiUMKM, jumlahKaryawan, "jenis produk", "nama pengelola", 123456, "email@example.com");
                    KeuanganUMKMInvestasi keuangan = new KeuanganUMKMInvestasi(idUMKM, pendapatan, modalAwal, sumberModal, "jenis investasi", 50000.0);
                    ush.add(usaha);
                    keuanganList.add(keuangan);
                    break;
                case 3:
                    // Mengubah data UMKM
                    System.out.println("Ubah UMKM");
                    System.out.println("Masukkan ID UMKM yang akan diubah: ");
                    String idToModify = br.readLine();
                    for (int i = 0; i < ush.size(); i++) {
                        UMKM umkm = ush.get(i);
                        if (umkm.getIdUMKM().equals(idToModify)) {
                            System.out.println("Masukkan Nama UMKM");
                            String newNama = br.readLine();
                            System.out.println("Masukkan Jenis Usaha");
                            String newJenisUsaha = br.readLine();
                            System.out.println("Masukkan Lokasi UMKM");
                            String newLokasiUMKM = br.readLine();
                            System.out.println("Masukkan Jumlah Karyawan");
                            int newJumlahKaryawan = Integer.parseInt(br.readLine());
                            umkm.setNamaUMKM(newNama);
                            umkm.setJenisUsaha(newJenisUsaha);
                            umkm.setLokasiUMKM(newLokasiUMKM);
                            umkm.setJumlahKaryawan(newJumlahKaryawan);
                            for (KeuanganUMKM keuanganUMKM : keuanganList) {
                                if (keuanganUMKM.getIdUMKM().equals(idToModify)) {
                                    System.out.println("Masukkan Pendapatan");
                                    int newPendapatan = Integer.parseInt(br.readLine());
                                    System.out.println("Masukkan Modal Awal");
                                    int newModalAwal = Integer.parseInt(br.readLine());
                                    System.out.println("Masukkan Sumber Modal");
                                    String newSumberModal = br.readLine();
                                    keuanganUMKM.setPendapatan(newPendapatan);
                                    keuanganUMKM.setModalAwal(newModalAwal);
                                    keuanganUMKM.setSumberModal(newSumberModal);
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    break;                
                case 4:
                    // Menghapus data UMKM
                    System.out.println("Hapus UMKM");
                    System.out.println("Masukkan ID UMKM yang akan dihapus: ");
                    String idToDelete = br.readLine();
                    boolean found = false; 
                    for (int i = 0; i < ush.size(); i++) {
                        if (ush.get(i).getIdUMKM().equals(idToDelete)) {
                            ush.remove(i);
                            for (int j = 0; j < keuanganList.size(); j++) {
                                if (keuanganList.get(j).getIdUMKM().equals(idToDelete)) {
                                    keuanganList.remove(j);
                                    break;
                                }
                            }
                            found = true; 
                            System.out.println("Data berhasil dihapus.");
                            break;
                        }
                    }
                    if (!found) { // Jika ID tidak ditemukan
                        System.out.println("ID yang Anda masukkan tidak ada dalam daftar.");
                    }
                    break;                                
                case 5:
                System.out.println("Anda Telah Keluar Dari Program");
                return;
            default:
                System.out.println("Input tidak valid. Silakan masukkan nomor menu yang valid.");
        }

    }
}
}
