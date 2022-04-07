import java.util.Scanner;

public abstract class Peserta {
    private String nama;
    private int age;
    Scanner scanner = new Scanner(System.in);

    public Peserta(String name, int age) {
        this.nama = name;
        this.age = age;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }


    public void checkNilai(int nilai){
        if (nilai < 0  || nilai > 100){
            throw new IllegalArgumentException("Nilai tidak sesuai.");
        }
    }

    public abstract double calculateNilai();
    public abstract void setAllNilai() ;

    private int setNilai(String message) {
        int nilai;
        while (true) {
            try {
                System.out.print(message);
                nilai = scanner.nextInt();
                checkNilai(nilai);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return nilai;
    }
}
