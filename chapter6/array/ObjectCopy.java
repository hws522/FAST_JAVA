package chapter6.array;

public class ObjectCopy {
    
    public static void main(String[] args) {
        
        Book[] library = new Book[5]; 
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");
        library[3] = new Book("태백산맥4", "조정래");
        library[4] = new Book("태백산맥5", "조정래");

        System.arraycopy(library, 0, copyLibrary, 0, 5);

        //향상된 for문. for(타입을 선언하고 타입에 대한 변수 선언. : 배열)
        //배열을 하나하나 꺼내서 선언한 변수에 넣는다는 뜻.
        /*for(Book book : copyLibrary) //향상된 for문. copyLibrary의 전체를 반복한다. 
        {
            book.showBookInfo();
        }*/

        library[0].setTitle("나목");
        library[0].setAuthor("박완서"); //복사후에 원본을 수정해봄.

        for(Book book : library)
        {
            book.showBookInfo();
        }

        System.out.println("============================");

        for(Book book : copyLibrary)
        {
            book.showBookInfo();
        }
        //얕은 복사가 되서 같이 변경 됨. 실제 인스턴스가 복사 되는 것이 아니라, 주소만 복사되서 두 배열이 같은 것을 가리킴. 
    }
}
