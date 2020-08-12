public class Main {

    public static void main(String[] args) {
	    Book book = new Book ("Harry Potter", 2000, new String[] {"Boris Strugatskiy", "Arkadiy Strugatskiy"});

        book.showTitleAndYear();

        String title = book.getTitle();
	    book.setTitle("Obitayemiy ostrov");

        book.showTitleAndYear();

    }
}
