public class Book {
    public String title;
    public String author;
    public int pages;
    public boolean isRead;

    public Book(String title, String author, int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isRead = false;
    }

    public void getTitle() {
        System.out.println("Title: " + title);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void getAuthor() {
        System.out.println("Author: " + author);
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void getPages() {
        System.out.println("Pages: " + pages);
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public boolean isRead() {
        return isRead;
    }

    public void markAsRead() {
        this.isRead = true;
        System.out.println("Readed book? : " + isRead);
    }
}


class Reader{
    public static void main(String[] args) {
        System.out.println("====== BOOK 1 ======");
        Book book1 = new Book("Java", "Mark Joe", 220);
        book1.getTitle();
        book1.getAuthor();
        book1.getPages();
        book1.markAsRead();

        System.out.println("====== BOOK 2 ======");
        Book book2 = new Book("The Famouse Unknown", "G.Zuckeburg", 175);

        book2.getTitle();
        book2.getAuthor();
        book2.getPages();
    }
}
