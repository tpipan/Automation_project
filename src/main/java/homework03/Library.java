package homework03;

public class Library {


        public static void main(String[] args) {
            Author author = new Author("Franz Kafka", "franz.kafka@hotmail.com");
            Book book = new Book("Metamorphosis", 1915, author, 120.5D);

            System.out.println("Book " + book.getName() + " (" + book.getPrice() + " RON), by " + author.getName() + ", published in " + book.getYear());
        }

}
