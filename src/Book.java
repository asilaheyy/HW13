import java.util.Objects;

public class Book {
    private String bookName;
    private int publishingYear;
    private Author booksAuthor;

    public Book(String bookName, int publishingYear, Author booksAuthor) {
        this.bookName = bookName;
        this.publishingYear = publishingYear;
        this.booksAuthor = booksAuthor;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public String toString() {
        return "Books name: " + this.bookName + " Publishing year: " + this.publishingYear + " Books author: " + this.booksAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(bookName, book.bookName) && Objects.equals(booksAuthor, book.booksAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, publishingYear, booksAuthor);
    }
}

