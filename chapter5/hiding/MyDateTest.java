package chapter5.hiding;

public class MyDateTest {
    public static void main(String[] args) {
        
        MyDate date = new MyDate();

        date.setYear(2020);
        date.setMonth(10);
        date.setDay(26);

        date.showDate();
    }
}
