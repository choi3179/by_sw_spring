package ex02.nonDI;

public class NewRecordView {

    private NewRecord record;

    // 필요한 객체를 setter 메소드로 주입 받아 적용
    // 객체 생성이 서로 독립적이고 필요시 객체에 직접 주입한다.
    public void setRecord(NewRecord record){
        this.record = record;
    }

    public void print() {
        System.out.println("KOR : " + record.getKor());
        System.out.println(record.total() + " / " + record.avg());
    }
}
