import java.util.Objects;

public class Book {
    private final String name;
    private int yearPublishing;
    private final Author authorName;

    public Book(String name, int yearPublishing, Author authorName) {
        this.name = name;
        this.yearPublishing = yearPublishing;
        this.authorName = authorName;
    }
    public String getName() {
        return this.name;
    }
    public int getYearPublishing() {
        return  this.yearPublishing;
    }
    public Author getAuthorName() {
        return this.authorName;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public String toString() {
        return this.name + " by " + this.authorName + " published in " + this.yearPublishing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublishing == book.yearPublishing && Objects.equals(name, book.name) && Objects.equals(authorName, book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearPublishing, authorName);
    }
}
