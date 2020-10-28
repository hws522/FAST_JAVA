package chapter6.array;

public class Book {
    
    private String title;
    private String author;

    public Book() {} //defalt 생성자.
    //생성자를 이렇게 두개 만든 특별한 이유는 없음.
    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
    }

    //private 으로 생성한 title, author 를 getter setter 를 만들어 준다. 
    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }
    
    public void showBookInfo() //tostring 메서드를 배우지 않았으므로,
    {
        System.out.println(title + ',' + author);
    }
}
