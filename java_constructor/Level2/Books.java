package Level2;

class Book {

    String ISBN;
    protected String title;
    private String author;

    public String getName(){
        return author;
    }

    public void setName(String author){
        this.author = author;
    }

    Book(String ISBN, String title){
        this.ISBN = ISBN;
        this.title = title;
    }

}

class EBook extends Book{
    
    EBook(String ISBN , String author){
        super(ISBN , author);
    }

    void display(){
        System.out.println("ISBN" + ISBN);
        System.out.println("Author : " + getName());
        System.out.println("Title : " + title);
    }


}

public class Books{

    public static void main(String[] args) {
        Book b1 = new Book("12" , "hello");

        b1.setName("rk");

        EBook e1 = new EBook("23e3", "world");

        e1.setName("dp");

    }
    
}
