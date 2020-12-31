package chapter11.generic;

public class GenericPrinterTest {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();

        Powder powder = new Powder();
        powderPrinter.setMaterial(powder);

        System.out.println(powderPrinter);

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();

        Plastic plastic = new Plastic();
        plasticPrinter.setMaterial(plastic);

        System.out.println(plasticPrinter);

        // GenericPrinter<Water> waterPrinter = new GenericPrinter<water>();
        // Meterial 에 들어 있지 않으므로 water는 사용 불가.

        powderPrinter.printing();
        plasticPrinter.printing();
    }
}
