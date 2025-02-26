
public class Book {
    private String title;
    private String author;
    private double price;
    // non-parematrized constructor
    Book() {
        this.title = "";
        this.author = "";
        this.price = 0;
    }
    // parematrized constructor
    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

   
    public double getPrice() {
        return price;
    }

  

    public static void main(String[] args) {
        Book b1 = new Book();
        System.out.println(b1.getPrice());

        Book b2 = new Book("abc", "ritick", 200);
        System.out.println(b2.price);
    }

}