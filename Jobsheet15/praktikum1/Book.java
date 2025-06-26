package praktikum1;

public class Book {
    String id;
    String title;

    public Book(String id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Judul: " + title;
    }
}
