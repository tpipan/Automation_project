package homework03;

public class Book {

    String name;
    Integer year;
    Author author;
    Double price;

    public Book(String name, Integer year, Author author, Double price) {
        this.name = name;
        this.year = year;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getYear() {
        return year;
    }
}