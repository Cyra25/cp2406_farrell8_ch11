package ex01;

import ex01.Book;

public class NonFiction extends Book {
    public NonFiction(String title){
        super(title);
        setPrice();
    }

    @Override
    public void setPrice() {
        price = 37.99;
    }
}
