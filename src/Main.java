public class Main {
    public static void main(String[] args) {
        Author firstBooksAuthor = new Author("Lev", "Tolstoi");
        Book firstBook = new Book("Anna Karenina", 1878, firstBooksAuthor);
        Author secondBooksAuthor = new Author("Lev", "Tolstoi");
        Book secondBook = new Book("Voina i Mir", 2020, secondBooksAuthor);

        if (firstBook.equals(secondBook)) {
            System.out.println("Объекты равны. ");
        } else {
            System.out.println("Объекты не равны. ");
        }
        if (firstBook.hashCode() == secondBook.hashCode()) {
            System.out.println("Хешкоды равны. ");
        } else {
            System.out.println("Хешкоды не равны. ");
        }


        if (firstBooksAuthor.equals(secondBooksAuthor)) {
            System.out.println("Объекты равны. ");
        } else {
            System.out.println("Объекты не равны. ");
        }
        if (firstBooksAuthor.hashCode() == secondBooksAuthor.hashCode()) {
            System.out.println("Хешкоды равны. ");
        } else {
            System.out.println("Хешкоды не равны. ");
        }

        System.out.println(secondBook.toString());
        System.out.println("Book: " + firstBook.getBookName());
        System.out.println("Year: " + firstBook.getPublishingYear());
        System.out.println(firstBooksAuthor.toString());
        System.out.println(firstBook.toString());

    }
}