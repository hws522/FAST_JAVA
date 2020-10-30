package practice.ch6arraylist;

import java.util.ArrayList;

public class Student {
    
    int studentID;
    String studentName;
    ArrayList<Book> bookList;

    public Student(int studentID, String studentName)
    {
        this.studentID = studentID;
        this.studentName = studentName;

        bookList = new ArrayList<Book>();
    }

    public void addBook(String name)
    {
        Book book = new Book(name);

        bookList.add(book);
    }

    public void showInfo()
    {
        System.out.print(studentName + " 학생이 읽은 책은 : ");
        for(Book book : bookList)
        {
            System.out.print(book.getName() + " ");
        }
        System.out.println(" 입니다.");
    }
}
