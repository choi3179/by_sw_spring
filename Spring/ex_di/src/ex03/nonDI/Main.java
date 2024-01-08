package ex03.nonDI;

/**
 * 자바 기반으로 만드는 Has-A 관계의 의존성 주입
 */
public class Main {
    public static void main(String[] args) {
        IRecordImpl record = new IRecordImpl();
        IRecordViewImpl view = new IRecordViewImpl();

        view.setRecord(record);
        view.input();
        view.print();
    }
}
