import java.util.Scanner;

public class PesertaMahasiswa extends Peserta implements BeasiswaPelajar {
    double struktur = 0;
    double relevansiData = 0;
    double problemSolving = 0;
    Scanner scanner = new Scanner(System.in);

    public PesertaMahasiswa(String name, int age) {
        super(name, age);
    }

    @Override
    public double calculateNilai() {
        return  (struktur * 0.6) + (relevansiData * 0.25) + (problemSolving * 0.15);
    }

    public void setAllNilai() {
        this.setStruktur();
        this.setRelevansiData();
        this.setProblemSolving();
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

    public void setRelevansiData() {
        int relevansiData = setNilai("Nilai relevansiData : ");

        this.relevansiData = relevansiData;
    }

    public void setProblemSolving() {
        int problemSolving = setNilai("Nilai problemSolving : ");

        this.problemSolving = problemSolving;
    }
}
