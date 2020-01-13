package array;

public class ObjectCopy2 {

    //깊은 복사!!!!! --> 객체를 일일이 하나씩 만들어서 넣어주어야함.
    public static void main(String[] args) {

        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("안농","가희");
        library[1] = new Book("안농","가희");
        library[2] = new Book("안농","가희");
        library[3] = new Book("안농","가희");
        library[4] = new Book("안농","가희");

        copyLibrary[0] = new Book();
        copyLibrary[1] = new Book();
        copyLibrary[2] = new Book();
        copyLibrary[3] = new Book();
        copyLibrary[4] = new Book();

        for(int i=0; i<library.length; i++) {
            copyLibrary[i].setTitle(library[i].getTitle());
            copyLibrary[i].setAuthor(library[i].getAuthor());
        }


  /*      for(Book book : library) {
            book.showBookInfo();
        }*/

        library[0].setTitle("hi_everyone");
        library[0].setAuthor("gahi");

        for(Book book : library) {
            book.showBookInfo();
        }

        System.out.println("============");

        for(Book book : copyLibrary) {
            book.showBookInfo();
        }
    }


}
