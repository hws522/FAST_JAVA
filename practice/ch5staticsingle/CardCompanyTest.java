package practice.ch5staticsingle;

public class CardCompanyTest {
    public static void main(String[] args) {
        CardCompany company = CardCompany.getInstance(); // 싱글톤패턴

        Card myCard = company.createCard(); //메서드에서 Car 생성.
        Card yourCard = company.createCard();

        System.out.println(myCard.getCardNumber()); //10001
        System.out.println(yourCard.getCardNumber()); //10002
    }
}
