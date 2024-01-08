package ex03.nonDI;

public class IRecordImpl implements IRecord{    // DTO

    private int kor,eng,math,com;

    public IRecordImpl(){
        this(0,0,0,0);
    }

    public IRecordImpl(int kor, int eng, int math, int com) {
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.com = com;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getCom() {
        return com;
    }

    public void setCom(int com) {
        this.com = com;
    }

    @Override
    public int total() {
        return this.kor + this.eng + this.com + this.math;
    }

    @Override
    public float avg() {
        return total() / 4.0f;
    }
}
