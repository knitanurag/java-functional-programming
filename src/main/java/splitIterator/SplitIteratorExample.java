package splitIterator;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class SplitIteratorExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/main/resources/Books.txt");
        Stream<String> lines = Files.lines(path);
        Spliterator<String> spliterator = lines.spliterator();
        Spliterator<Book> bookSpliterator = new BookSplitIterator(spliterator, new Book());
        bookSpliterator.forEachRemaining(System.out::println);


    }


}

class BookSplitIterator implements Spliterator<Book> {
    private  Book book;
    private final Spliterator<String> spliterator;

    public BookSplitIterator(Spliterator<String> spliterator, Book book) {
        this.spliterator = spliterator;
        this.book = book;
    }

    @Override
    public boolean tryAdvance(Consumer<? super Book> action) {
        if(spliterator.tryAdvance(name->this.book.setName(name))
        && spliterator.tryAdvance(author->this.book.setAuthor(author))
        && spliterator.tryAdvance(genre-> this.book.setGenre(genre))
        && spliterator.tryAdvance(rating -> this.book.setRating(Double.valueOf(rating)))){
            action.accept(book);
            return true;
        }

        return false;
    }

    @Override
    public Spliterator<Book> trySplit() {
        return null;
    }

    @Override
    public long estimateSize() {
        return spliterator.estimateSize()/4;
    }

    @Override
    public int characteristics() {
        return spliterator.characteristics();
    }
}

class Book{
    private String name;
    private String author;
    private String genre;
    private Double rating;

    public Book() {
    }

    public Book(String name, String author, String genre, Double rating) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                '}';
    }
}
