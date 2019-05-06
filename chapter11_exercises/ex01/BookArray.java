package ex01;

public class BookArray{
    public static void main(String[] args){
        Book[] books = new Book[10];
        books[0] = new Fiction("First book");
        books[1] = new NonFiction("Second book");
        books[2] = new Fiction("Third book");
        books[3] = new Fiction("Fourth book");
        books[4] = new NonFiction("Fifth book");
        books[5] = new NonFiction("Sixth book");
        books[6] = new Fiction("Seventh book");
        books[7] = new Fiction("Eighth book");
        books[8] = new Fiction("Ninth book");
        books[9] = new NonFiction("Tenth book");
        for (int x=0; x<books.length; ++x){
            System.out.println("Title is "+books[x].getTitle() +
                    "\nPrice is "+books[x].getPrice());
        }
    }

}
