package chapter6.array;

public class BookArrayTest {
    public static void main(String[] args) {
        
        Book[] library = new Book[5]; //객체배열은 이것만으로는 생성이 되지 않고, 각 인스턴스를 생성해서 각 요소에 넣어줘야 함.

        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");
        library[3] = new Book("태백산맥4", "조정래");
        library[4] = new Book("태백산맥5", "조정래"); //실질적으로 책을 만드려면 값을 하나하나 다 넣어줘야함.

        for(int i = 0; i < library.length; i++)
        {
            System.out.println(library[i]);
            //Book[] library = new Book[5]; 
            //이상태에서는 모두 null만 들어가 있다.
            //이후 생성한 객체의 주소를 담음.

            library[i].showBookInfo(); //실제로 정보를 보려면 showBookInfo().
        }                                   
    }                                       
}
