import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Peserta peserta = null;

        System.out.println("Pilih Kategori :");
        System.out.println("1. Beasiswa Pelajar");
        System.out.println("2. Beasiswa Mahasiswa");
        System.out.println("Pilih beasiswa : ");
        int category = scanner.nextInt();


        System.out.println("Form Pendaftaran");
        System.out.print("Masukkan Nama Lengkap : ");
        String name = scanner.next();
        System.out.print("Masukkan Usia : ");
        int age = scanner.nextInt();

        if (category == 2) {
            peserta = new PesertaMahasiswa(name, age);
        } else if (category == 1) {
            peserta = new PesertaPelajar(name, age);
        }

        // isi nilai peserta
        peserta.setAllNilai();

        int choice;
        while (true) {
            System.out.println("Menu : ");
            System.out.println("1. Tampilkan Hasil Akhir");
            System.out.println("2. Ubah Nilai");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            choice = scanner.nextInt();

            if (choice == 1) {
                double nilai = peserta.calculateNilai();
                if (nilai > 87.5) {
                    System.out.println("Nilai Akhir : "+peserta.calculateNilai()+"\n" +
                            "Keterangan : Diterima\n" +
                            "Selamat! "+name+" ("+age+" Tahun) dinyatakan diterima pada program BEASISWA PELAJAR\n" +
                            "Karena berhasil mencapai nilai yang diharapkan pada tahap seleksi.");
                } else {
                    System.out.println("Nilai Akhir : "+peserta.calculateNilai()+"\n" +
                            "Keterangan : Tidak Diterima\n" +
                            "Mohon maaf, "+name+" ("+age+" Tahun) dinyatakan tidak diterima pada program BEASISWA PELAJAR\n" +
                            "Karena belum mencapai nilai yang diharapkan pada tahap seleksi.");
                }
            } else if (choice == 2) {
                System.out.println("Ubah Nilai Peserta : ");
                peserta.setAllNilai();
            } else if (choice == 3) {
                break;
            }
        }


    }
}