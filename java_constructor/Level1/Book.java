package Level1;

public class Book {

    String title;
    String author;
    int price;

    Book(){
        title = "Hero";
        author = "Ritick";
        price = 500;
    }

    Book(String title , String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public static void main(String[] args) {
    
        Book b1 = new Book();
        Book b2 = new Book("Demo" , "Deepak" , 400);

    }

}