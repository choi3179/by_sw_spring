package ex03.nonDI;

import java.util.Scanner;

public class IRecordViewImpl implements IRecordView{

    private IRecordImpl record;

    public void setRecord(IRecordImpl record){
        this.record = record;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("kor : ");     record.setKor(sc.nextInt());
        System.out.print("eng : ");     record.setEng(sc.nextInt());
        System.out.print("math : ");     record.setMath(sc.nextInt());
        System.out.print("com : ");     record.setCom(sc.nextInt());
    }

    @Override
    public void print() {
        System.out.println("\n\nKor : " + record.getKor());
        System.out.println("Eng : " + record.getEng());
        System.out.println("Math : " + record.getMath());
        System.out.println("Com : " + record.getCom());

        System.out.println("total : " + record.total() + " / avg : " + record.avg());
    }
}
