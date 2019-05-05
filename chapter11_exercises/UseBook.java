public class UseBook {
    public static void main(String[] args){
        Fiction fiction = new Fiction("Harry Potter");
        NonFiction nonFiction = new NonFiction("Potter Harry");
        display(fiction);
        display(nonFiction);

    }
    public static void display(Book p){
        System.out.println("Title is " +p.getTitle()+"\nPrice is "+p.getPrice());

    }
}
