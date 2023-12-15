package ex02.nonDI;

// VO 역할, 데이터 클래스
public class NewRecord {
    private int kor, eng, math, com;

    public NewRecord() {}

    public NewRecord(int kor, int eng, int math, int com){
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.com = com;
    }

    public int total() {
        return this.kor + this.eng + this.math + this.com;
    }

    public float avg() {
        return total() / 4.0f;
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
}
