package chapter10.object;

class Book implements Cloneable {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() { // 오버라이딩.
        return author + ',' + title;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ToStringTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        Book book = new Book("토지", "박경리");
        System.out.println(book); // chaper10.object.Book@2ff4acd0

        String str = new String("토지");
        System.out.println(str); // System.out.println(str.toString());

        Book book2 = (Book) book.clone();
        System.out.println(book2);
    }
}
