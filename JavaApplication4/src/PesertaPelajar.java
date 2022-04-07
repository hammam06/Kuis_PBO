import java.util.Scanner;

public class PesertaPelajar extends Peserta implements BeasiswaMahasiswa {
    double struktur = 0;
    double teknikVisualisasi = 0;
    double designThinking = 0;
    Scanner scanner = new Scanner(System.in);

    public PesertaPelajar(String name, int age) {
        super(name, age);
    }

    @Override
    public double calculateNilai() {
        return  (struktur * 0.5) + (teknikVisualisasi * 0.2) + (designThinking * 0.3) ;
    }

    public void setAllNilai() {
        this.setStruktur();
        this.setDesignThinking();
        this.setTeknikVisualisasi();
    }

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

    public void setStruktur() {
        int struktur = setNilai("Nilai Struktur : ");

        this.struktur = struktur;
    }

    public void setTeknikVisualisasi() {
        int teknikVisualisasi = setNilai("Nilai teknikVisualisasi : ");

        this.teknikVisualisasi = teknikVisualisasi;
    }

    public void setDesignThinking() {
        int designThinking = setNilai("Nilai designThinking : ");

        this.designThinking = designThinking;
    }

}
