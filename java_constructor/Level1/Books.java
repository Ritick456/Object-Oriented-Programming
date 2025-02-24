
package Level1;

public class Books {

    String title;
    String author;
    int price;
    boolean availability;

    Books(String title, String author, int price, boolean availability){
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    void borrow(){
        if(availability){
            System.out.println("You can borrow a book");
            availability = false;
        }
        else{
            System.out.println("You cannot borrow a book");
        }
    }
    public static void main(String[] args) {
        Books b1 = new Books("rk" , "hello" , 400 , true);
        b1.borrow();
        b1.borrow();
    }
}
