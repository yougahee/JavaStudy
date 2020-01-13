package array;

//얕은 복사!!
public class ObjectCopy {

    public static void main(String[] args) {

        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("안농","가희");
        library[1] = new Book("안농","가희");
        library[2] = new Book("안농","가희");
        library[3] = new Book("안농","가희");
        library[4] = new Book("안농","가희");

        //얕은 복사 --> 인스턴스 하나의 주소를 공유
        System.arraycopy(library, 0, copyLibrary, 0, 5);

        /*for(Book book : library) {
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
