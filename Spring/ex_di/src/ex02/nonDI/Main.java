package ex02.nonDI;

public class Main {

    // 객체의 생성이 서로 독립적으로 만든다.
    // 필요시 객체의 주소만 주입한다.
    public static void main(String[] args) {
        NewRecordView nrv = new NewRecordView();
        NewRecord record = new NewRecord(1,2,3,4);

        nrv.setRecord(record);
        nrv.print();
    }
}
