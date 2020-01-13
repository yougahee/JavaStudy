package array;

public class BookArrayTest {
    public static void main(String[] args){
        Book[] library = new Book[5];

        library[0] = new Book("안농","가희");
        library[1] = new Book("안농","가희");
        library[2] = new Book("안농","가희");
        library[3] = new Book("안농","가희");
        library[4] = new Book("안농","가희");

        for(int i=0; i<library.length; i++) {
            System.out.println(library[i]);
            library[i].showBookInfo();
        }
    }
}
