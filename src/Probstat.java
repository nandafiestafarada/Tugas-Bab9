package GUI;

public class Probstat extends Nilai {

    public Probstat() {
    }

    public Probstat(int tugas, int kuis, int uts, int uas) {
        super(tugas, kuis, uts, uas);
    }

    @Override
    public int getTugas() {
        return super.getTugas();
    }

    @Override
    public int getKuis() {
        return super.getKuis();
    }

    @Override
    public int getUTS() {
        return super.getUTS();
    }

    @Override
    public int getUAS() {
        return super.getUAS();
    }

    @Override
    public double getResult() {
        return super.getResult();
    }

    @Override
    public double nilaiakhir() {
        double tugas = getTugas() * 0.1;
        double kuis = getKuis() * 0.1;
        double uts = getUTS() * 0.4;
        double uas = getUAS() * 0.4;
        return (tugas + kuis + uts + uas);
    }
}
